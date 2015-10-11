/*
 * blanco Framework
 * Copyright (C) 2004-2007 IGA Tosiki
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 */
package blanco.resourcebundle;

import java.io.File;
import java.text.Format;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.transform.dom.DOMResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;

import blanco.commons.util.BlancoJavaSourceUtil;
import blanco.commons.util.BlancoStringUtil;
import blanco.commons.util.BlancoXmlUtil;
import blanco.resourcebundle.message.BlancoResourceBundleMessage;
import blanco.resourcebundle.resourcebundle.BlancoResourceBundleResourceBundle;
import blanco.resourcebundle.valueobject.BlancoResourceBundleBundleStructure;

/**
 * �W���̒���XML�t�@�C���̓��e�Ó����`�F�b�N���s���܂��B
 * 
 * ���̃\�[�X�R�[�h��blancoResourceBundle�̈ꕔ�ł��B<br>
 * 
 * @author IGA Tosiki
 */
public class BlancoResourceBundleXmlValidator {
    /**
     * ���b�Z�[�W�B
     */
    private final BlancoResourceBundleMessage fMsg = new BlancoResourceBundleMessage();

    /**
     * ���\�[�X�o���h���A�N�Z�T�̃C���X�^���X�B
     */
    private final BlancoResourceBundleResourceBundle fBundle = new BlancoResourceBundleResourceBundle();

    /**
     * ���\�[�X�o���h���������MessageFormat�ɂ��p�[�X���s�����ۂɁA��O�����������珈���𒆒f���邩�ǂ����̃t���O�B
     * 
     * true�Ȃ珈�����f���ė�O�𔭐������܂��B<br>
     * false�Ȃ珈�����s���A�u��������͖������̂Ƃ݂Ȃ��܂��B<br>
     * Java�̃\�[�X�R�[�h����������ۂȂǂɁA������ false�ɐݒ肵�Ĕg���ʂ��������Ƃ��ł���悤�ɐ؂�ւ���ꍇ������܂��B<br>
     * �f�t�H���g�l[true]���ݒ肳��Ă��܂��B
     */
    private boolean fIsFailOnMessageFormatError = true;

    /**
     * ���\�[�X�o���h���������MessageFormat�ɂ��p�[�X���s�����ۂɁA��O�����������珈���𒆒f���邩�ǂ����̃t���O��ݒ肵�܂��B
     * 
     * true�Ȃ珈�����f���ė�O�𔭐������܂��B<br>
     * false�Ȃ珈�����s���A�u��������͖������̂Ƃ݂Ȃ��܂��B<br>
     * Java�̃\�[�X�R�[�h����������ۂȂǂɁA������ false�ɐݒ肵�Ĕg���ʂ��������Ƃ��ł���悤�ɐ؂�ւ���ꍇ������܂��B<br>
     * �f�t�H���g�l[true]���ݒ肳��Ă��܂��B
     * 
     * @param argIsFailOnMessageFormatError
     */
    public void setFailOnMessageFormatError(
            final boolean argIsFailOnMessageFormatError) {
        fIsFailOnMessageFormatError = argIsFailOnMessageFormatError;
    }

    /**
     * ����XML�t�@�C������ �v���p�e�B�t�@�C���A�N�Z�X�p��Java�\�[�X�R�[�h�𐶐����܂��B
     * 
     * @param argFileSource
     *            ���͂ƂȂ钆��XML�t�@�C���B
     * @param argDirectoryTarget
     *            �\�[�X�R�[�h���o�͂���ۂ̏o�͐�f�B���N�g���B
     */
    public void process(final File argFileSource, final File argDirectoryTarget) {
        final DOMResult result = BlancoXmlUtil.transformFile2Dom(argFileSource);

        final Node rootNode = result.getNode();
        if (rootNode instanceof Document) {
            // ���ꂪ����n�B�h�L�������g���[�g���擾
            final Document rootDocument = (Document) rootNode;
            final NodeList listSheet = rootDocument
                    .getElementsByTagName("sheet");
            final int sizeListSheet = listSheet.getLength();
            final Map<java.lang.String, java.lang.String> mapProcessedBaseName = new HashMap<java.lang.String, java.lang.String>(
                    64);
            for (int index = 0; index < sizeListSheet; index++) {
                final Element elementSheet = (Element) listSheet.item(index);

                final NodeList listCommon = elementSheet
                        .getElementsByTagName(fBundle
                                .getMeta2xmlElementCommon());
                if (listCommon == null || listCommon.getLength() == 0) {
                    // common�������ꍇ�ɂ̓X�L�b�v���܂��B
                    continue;
                }

                final Element elementCommon = (Element) listCommon.item(0);

                final BlancoResourceBundleBundleStructure structure = new BlancoResourceBundleBundleStructure();

                structure.setName(BlancoXmlUtil.getTextContent(elementCommon,
                        "baseName"));
                if (structure.getName() == null) {
                    continue;
                }

                if (BlancoXmlUtil.getTextContent(elementCommon, "packageName") == null) {
                    // TODO �p�b�P�[�W�����̓G���[�������ׂ�
                    continue;
                }

                final List<java.lang.String> listLocale = new ArrayList<java.lang.String>();
                final NodeList nodeListCommon = elementCommon
                        .getElementsByTagName("locale");
                if (nodeListCommon == null || nodeListCommon.getLength() == 0) {
                    continue;
                }

                final int sizeNodeListCommon = nodeListCommon.getLength();
                for (int indexLocale = 0; indexLocale < sizeNodeListCommon; indexLocale++) {
                    final Node nodeLook = nodeListCommon.item(indexLocale);
                    if (nodeLook instanceof Element == false) {
                        continue;
                    }

                    final Element elementLook = (Element) nodeLook;
                    final NodeList nodeChilds = elementLook.getChildNodes();
                    if (nodeChilds == null) {
                        continue;
                    }

                    final int nodeChildsLength = nodeChilds.getLength();
                    for (int indexChild = 0; indexChild < nodeChildsLength; indexChild++) {
                        final Node nodeChild = nodeChilds.item(indexChild);
                        if (nodeChild instanceof Text) {
                            listLocale.add(((Text) nodeChild).getNodeValue());
                        }
                    }
                }
                if (listLocale.size() == 0) {
                    continue;
                }

                if (mapProcessedBaseName.get(structure.getName()) != null) {
                    throw new IllegalArgumentException(fMsg.getMbrbi005(
                            structure.getName(), (String) mapProcessedBaseName
                                    .get(structure.getName())));
                }

                expandSheet(elementSheet, elementCommon);
                mapProcessedBaseName.put(structure.getName(), "��������܂���");
            }
        }
    }

    /**
     * �W���̒���XML�t�@�C���̓��e�Ó����`�F�b�N���s���܂��B
     * 
     * @param argElementSheet
     *            �V�[�g�̃G�������g�B
     * @param argElementCommon
     *            ���ʏ��̃G�������g�B
     */
    private void expandSheet(final Element argElementSheet,
            final Element argElementCommon) {
        final BlancoResourceBundleBundleStructure structure = new BlancoResourceBundleBundleStructure();

        structure.setName(BlancoXmlUtil.getTextContent(argElementCommon,
                "baseName"));
        structure.setDescription(BlancoXmlUtil.getTextContent(argElementCommon,
                "description"));

        final List<java.lang.String> listKnownLocale = new ArrayList<java.lang.String>();
        final Map<java.lang.String, java.lang.String> mapBundle = new HashMap<java.lang.String, java.lang.String>();
        // �^����ꂽ�p�b�P�[�W�������̂܂ܗ��p���܂��B

        final NodeList listCommonList = argElementSheet
                .getElementsByTagName(fBundle.getMeta2xmlElementCommon());
        if (listCommonList == null || listCommonList.getLength() == 0) {
            // common�������ꍇ�ɂ̓X�L�b�v���܂��B
            return;
        }

        checkLocaleDup(structure.getName(), structure.getDescription(),
                listKnownLocale, listCommonList);

        final NodeList listResourceList = argElementSheet
                .getElementsByTagName(fBundle.getMeta2xmlElementList());
        if (listResourceList == null || listResourceList.getLength() == 0) {
            // �{�̕������������̂ɂ��Ă͏������X�L�b�v���܂��B
            return;
        }

        final NodeList listResource = ((Element) listResourceList.item(0))
                .getElementsByTagName("resource");
        if (listResource == null || listResource.getLength() == 0) {
            return;
        }

        final int sizeListResource = listResource.getLength();
        for (int indexResource = 0; indexResource < sizeListResource; indexResource++) {
            final Element elementResource = (Element) listResource
                    .item(indexResource);

            final String fieldResourceId = BlancoStringUtil
                    .null2Blank(BlancoXmlUtil.getTextContent(elementResource,
                            "resourceKey"));

            final NodeList nodeListResourceString = elementResource
                    .getElementsByTagName("resourceString");
            if (nodeListResourceString == null
                    || nodeListResourceString.getLength() == 0) {
                // �ꌏ�������ꍇ�ɂ̓X�L�b�v���܂��B
                continue;
            }

            checkMessageFormat(structure.getName(), structure.getDescription(),
                    mapBundle, fieldResourceId, nodeListResourceString,
                    fIsFailOnMessageFormatError);
        }
    }

    /**
     * ���P�[���̏d�������݂��Ȃ����ǂ������`�F�b�N���܂��B
     * 
     * @param argBaseName
     * @param argDescription
     * @param argListKnownLocale
     * @param argListCommonList
     */
    private void checkLocaleDup(final String argBaseName,
            final String argDescription,
            final List<java.lang.String> argListKnownLocale,
            final NodeList argListCommonList) {
        // ���P�[���̏d���`�F�b�N���s���܂��B
        final NodeList listLocale = ((Element) argListCommonList.item(0))
                .getElementsByTagName("locale");
        if (listLocale == null || listLocale.getLength() == 0) {
            return;
        }

        final int sizeListLocale = listLocale.getLength();
        if (sizeListLocale > 0) {
            final Map<java.lang.String, java.lang.String> mapExistLocale = new HashMap<java.lang.String, java.lang.String>();
            for (int indexLocale = 0; indexLocale < sizeListLocale; indexLocale++) {
                final Element elementLocale = (Element) listLocale
                        .item(indexLocale);
                final String locale = BlancoStringUtil.null2Blank(BlancoXmlUtil
                        .getTextContent(elementLocale));
                if (mapExistLocale.get(locale) != null) {
                    // ���P�[���̏d������������܂����B
                    throw new IllegalArgumentException(fMsg.getMbrbi006(
                            argBaseName
                                    + (argDescription == null ? "" : "/"
                                            + argDescription), locale));
                }
                argListKnownLocale.add(locale);
                mapExistLocale.put(locale, locale);
            }
        }
    }

    /**
     * ���b�Z�[�W�t�H�[�}�b�g�̃p�[�X���ʂ����P�[���Ԃɂ����đÓ��ȏ�Ԃł��邩�ǂ������`�F�b�N���܂��B
     * 
     * ���P�[���Ԃő��Ⴊ����ꍇ�ɂ͗�O�ŏ������f���܂��B
     * 
     * @param argBaseName
     *            ����B
     * @param argDescription
     *            �����B��O�������ɗ��p����܂��B
     * @param argMapBundle
     * @param argFieldResourceId
     *            ���\�[�XID�B
     * @param argNodeListResourceString
     * @param argIsFailOnMessageFormatError
     *            MessageFormat�ɂ��p�[�X�̌��ʂƂ��ė�O�����������ꍇ�ɏ������f���邩�ǂ����B
     */
    private void checkMessageFormat(final String argBaseName,
            final String argDescription,
            final Map<java.lang.String, java.lang.String> argMapBundle,
            final String argFieldResourceId,
            final NodeList argNodeListResourceString,
            final boolean argIsFailOnMessageFormatError) {
        final Map<java.lang.String, java.lang.String> mapProcessedLocale = new HashMap<java.lang.String, java.lang.String>();
        Format[] previousFormatList = null;

        final int nodeListResourceStringSize = argNodeListResourceString
                .getLength();
        for (int indexResourceString = 0; indexResourceString < nodeListResourceStringSize; indexResourceString++) {
            if (argNodeListResourceString.item(indexResourceString) instanceof Element == false) {
                continue;
            }

            final Element elementResourceString = (Element) argNodeListResourceString
                    .item(indexResourceString);
            final String resourceString = BlancoStringUtil
                    .null2Blank(BlancoXmlUtil
                            .getTextContent(elementResourceString));
            final String locale = BlancoStringUtil
                    .null2Blank(elementResourceString.getAttribute("locale"));
            if (mapProcessedLocale.get(locale) != null) {
                // ���ɏ����ς̃��P�[���ł���΃��\�[�XID���d�����Ă���G���[�ł���Ɣ��f���܂��B
                throw new IllegalArgumentException(fMsg.getMbrbi007(argBaseName
                        + (argDescription == null ? "" : "/" + argDescription),
                        locale, argFieldResourceId));
            }

            // �V���ɏ����ΏۂƂ��郍�P�[���Ƃ��ċL�����܂��B
            mapProcessedLocale.put(locale, locale);
            if (argMapBundle.get(argFieldResourceId) == null) {
                // ���\�[�X�o���h���̃}�b�v�ɋL�����܂��B
                argMapBundle.put(argFieldResourceId, resourceString);
            }

            Format[] formatList = null;
            try {
                formatList = BlancoResourceBundleUtil
                        .getFormatsByArgumentIndex(resourceString,
                                argIsFailOnMessageFormatError);
            } catch (IllegalArgumentException ex) {
                throw new IllegalArgumentException(fMsg.getMbrbi008(
                        argBaseName, locale, argFieldResourceId,
                        BlancoJavaSourceUtil
                                .escapeStringAsJavaSource(resourceString))
                        + ex.toString());
            }

            if (indexResourceString == 0) {
                // ����͔�r���s���܂���B
            } else {
                if (previousFormatList == null && formatList == null) {
                    // ��v���Ă��܂��B��肠��܂���B
                } else if (previousFormatList == null && formatList != null) {
                    throw new IllegalArgumentException(fMsg.getMbrbi009(
                            argBaseName
                                    + (argDescription == null ? "" : "/"
                                            + argDescription), locale,
                            argFieldResourceId, String
                                    .valueOf(formatList.length)));
                } else if (previousFormatList != null && formatList == null) {
                    throw new IllegalArgumentException(fMsg.getMbrbi010(
                            argBaseName
                                    + (argDescription == null ? "" : "/"
                                            + argDescription), locale,
                            argFieldResourceId, String
                                    .valueOf(previousFormatList.length)));
                } else {
                    if (previousFormatList.length != formatList.length) {
                        throw new IllegalArgumentException(fMsg.getMbrbi011(
                                argBaseName
                                        + (argDescription == null ? "" : "/"
                                                + argDescription), locale,
                                argFieldResourceId, String
                                        .valueOf(formatList.length), String
                                        .valueOf(previousFormatList.length)));
                    }
                    for (int indexFormat = 0; indexFormat < formatList.length; indexFormat++) {
                        final String previousFormatClass = (previousFormatList[indexFormat] == null ? fBundle
                                .getExpandresourceSrc051()
                                : previousFormatList[indexFormat].getClass()
                                        .getName());
                        final String formatClass = (formatList[indexFormat] == null ? fBundle
                                .getExpandresourceSrc051()
                                : formatList[indexFormat].getClass().getName());
                        if (formatClass.equals(previousFormatClass) == false) {
                            throw new IllegalArgumentException(fMsg
                                    .getMbrbi012(argBaseName
                                            + (argDescription == null ? ""
                                                    : "/" + argDescription),
                                            locale, argFieldResourceId,
                                            formatClass, previousFormatClass));
                        }
                    }
                }
            }
            // �O��̃��X�g�Ƃ��ċL�����܂��B
            // null���낤�������낤���L������_���|�C���g�ł��B
            previousFormatList = formatList;
        }
    }
}