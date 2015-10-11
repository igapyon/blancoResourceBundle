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
import java.util.ArrayList;
import java.util.List;

import blanco.commons.util.BlancoStringUtil;
import blanco.resourcebundle.valueobject.BlancoResourceBundleBundleItemStructure;
import blanco.resourcebundle.valueobject.BlancoResourceBundleBundleResourceStringStructure;
import blanco.resourcebundle.valueobject.BlancoResourceBundleBundleStructure;
import blanco.xml.bind.BlancoXmlBindingUtil;
import blanco.xml.bind.BlancoXmlUnmarshaller;
import blanco.xml.bind.valueobject.BlancoXmlDocument;
import blanco.xml.bind.valueobject.BlancoXmlElement;

/**
 * blancoResourceBundle�� ����XML�t�@�C���`�����p�[�X(�ǂݏ���)����N���X�B
 * 
 * ����: 2007.09.19���_�ł́A�v���p�e�B�t�@�C�������݂̂� ���̃N���X�𗘗p���Ă��܂��B
 * �O���̃v���_�N�g�����\�[�X�o���h���̒��ԃt�@�C���ɃA�N�Z�X����ۂɂ��A���̃N���X�𗘗p���邱�Ƃ�z�肵�Ă��܂��B
 * 
 * @author IGA Tosiki
 */
public class BlancoResourceBundleXmlParser {
    /**
     * ����XML�t�@�C����XML�h�L�������g���p�[�X���āA�o�����[�I�u�W�F�N�g���̔z����擾���܂��B
     * 
     * @param argMetaXmlSourceFile
     *            ����XML�t�@�C���B
     * @return �p�[�X�̌��ʓ���ꂽ�o�����[�I�u�W�F�N�g���̔z��B
     */
    public BlancoResourceBundleBundleStructure[] parse(
            final File argMetaXmlSourceFile) {
        final BlancoXmlDocument documentMeta = new BlancoXmlUnmarshaller()
                .unmarshal(argMetaXmlSourceFile);
        if (documentMeta == null) {
            return null;
        }

        return parse(documentMeta);
    }

    /**
     * ����XML�t�@�C���`����XML�h�L�������g���p�[�X���āA�o�����[�I�u�W�F�N�g���̔z����擾���܂��B
     * 
     * @param argXmlDocument
     *            ����XML�t�@�C����XML�h�L�������g�B
     * @return �p�[�X�̌��ʓ���ꂽ�o�����[�I�u�W�F�N�g���̔z��B
     */
    public BlancoResourceBundleBundleStructure[] parse(
            final BlancoXmlDocument argXmlDocument) {
        final List<BlancoResourceBundleBundleStructure> listStructure = new ArrayList<BlancoResourceBundleBundleStructure>();

        // ���[�g�G�������g���擾���܂��B
        final BlancoXmlElement elementRoot = BlancoXmlBindingUtil
                .getDocumentElement(argXmlDocument);
        if (elementRoot == null) {
            // ���[�g�G�������g�������ꍇ�ɂ͏������f���܂��B
            return null;
        }

        // sheet(Excel�V�[�g)�̃��X�g���擾���܂��B
        final List<BlancoXmlElement> listSheet = BlancoXmlBindingUtil
                .getElementsByTagName(elementRoot, "sheet");

        final int sizeListSheet = listSheet.size();
        for (int index = 0; index < sizeListSheet; index++) {
            final BlancoXmlElement elementSheet = listSheet.get(index);

            final BlancoResourceBundleBundleStructure objResourceBaseStructure = parseElementSheet(elementSheet);
            if (objResourceBaseStructure != null) {
                // ����ꂽ�����L�����܂��B
                listStructure.add(objResourceBaseStructure);
            }
        }

        final BlancoResourceBundleBundleStructure[] result = new BlancoResourceBundleBundleStructure[listStructure
                .size()];
        listStructure.toArray(result);
        return result;
    }

    /**
     * ����XML�t�@�C���`���́usheet�vXML�G�������g���p�[�X���āA�o�����[�I�u�W�F�N�g�����擾���܂��B
     * 
     * @param argElementSheet
     *            ����XML�t�@�C���́usheet�vXML�G�������g�B
     * @return �p�[�X�̌��ʓ���ꂽ�o�����[�I�u�W�F�N�g���B�uname�v��������Ȃ������ꍇ�ɂ� null��߂��܂��B
     */
    public BlancoResourceBundleBundleStructure parseElementSheet(
            final BlancoXmlElement argElementSheet) {
        final BlancoResourceBundleBundleStructure resourceBaseStructure = new BlancoResourceBundleBundleStructure();
        final List<BlancoXmlElement> listCommon = BlancoXmlBindingUtil
                .getElementsByTagName(argElementSheet,
                        "blancoresourcebundle-common");
        if (listCommon == null || listCommon.size() == 0) {
            // common�������ꍇ�ɂ̓X�L�b�v���܂��B
            return null;
        }

        final BlancoXmlElement elementCommon = listCommon.get(0);
        resourceBaseStructure.setName(BlancoXmlBindingUtil.getTextContent(
                elementCommon, "baseName"));

        // �J�����g���P�[�����L�����܂��B
        resourceBaseStructure.setCurrentLocale(BlancoXmlBindingUtil
                .getTextContent(elementCommon, "locale"));

        final List<BlancoXmlElement> localeList = BlancoXmlBindingUtil
                .getElementsByTagName(elementCommon, "locale");
        for (int indexLocale = 0; indexLocale < localeList.size(); indexLocale++) {
            final BlancoXmlElement elementLocale = localeList.get(indexLocale);
            // Combine��̒���XML��ł́Alocale�͕�����o�ꂵ�܂��B
            resourceBaseStructure.getListLocale().add(
                    BlancoXmlBindingUtil.getTextContent(elementLocale));
        }

        resourceBaseStructure.setPackage(BlancoXmlBindingUtil.getTextContent(
                elementCommon, "packageName"));
        resourceBaseStructure.setSuffix(BlancoXmlBindingUtil.getTextContent(
                elementCommon, "suffix"));
        resourceBaseStructure.setDescription(BlancoXmlBindingUtil
                .getTextContent(elementCommon, "description"));

        if (BlancoStringUtil.null2Blank(resourceBaseStructure.getName()).trim()
                .length() == 0) {
            return null;
        }
        if (BlancoStringUtil.null2Blank(resourceBaseStructure.getPackage())
                .trim().length() == 0) {
            return null;
        }
        if (resourceBaseStructure.getListLocale().size() == 0) {
            return null;
        }

        final List<BlancoXmlElement> listList = BlancoXmlBindingUtil
                .getElementsByTagName(argElementSheet,
                        "blancoresourcebundle-resourceList");
        final BlancoXmlElement elementListRoot = listList.get(0);
        final List<BlancoXmlElement> listChildNodes = BlancoXmlBindingUtil
                .getElementsByTagName(elementListRoot, "resource");
        for (int index = 0; index < listChildNodes.size(); index++) {
            final BlancoXmlElement elementList = listChildNodes.get(index);
            final BlancoResourceBundleBundleItemStructure resourceItemStructure = new BlancoResourceBundleBundleItemStructure();

            resourceItemStructure.setNo(BlancoXmlBindingUtil.getTextContent(
                    elementList, "no"));
            resourceItemStructure.setKey(BlancoXmlBindingUtil.getTextContent(
                    elementList, "resourceKey"));

            final List<BlancoXmlElement> listResourceString = BlancoXmlBindingUtil
                    .getElementsByTagName(elementList, "resourceString");
            for (int indexString = 0; indexString < listResourceString.size(); indexString++) {
                final BlancoXmlElement eleResourceString = listResourceString
                        .get(indexString);
                final BlancoResourceBundleBundleResourceStringStructure resourceMessageItem = new BlancoResourceBundleBundleResourceStringStructure();
                resourceMessageItem.setLocale(BlancoXmlBindingUtil
                        .getAttribute(eleResourceString, "locale"));
                resourceMessageItem.setResourceString(BlancoXmlBindingUtil
                        .getTextContent(eleResourceString));

                resourceItemStructure.getResourceStringList().add(
                        resourceMessageItem);
            }

            // ResourceKey ��null�ł����Ă��ǉ����܂��B
            // ����̓R�����g����\��������̂ł��B

            resourceBaseStructure.getItemList().add(resourceItemStructure);
        }

        return resourceBaseStructure;
    }
}
