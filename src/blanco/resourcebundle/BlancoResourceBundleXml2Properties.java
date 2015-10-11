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

import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import blanco.commons.io.Native2AsciiWriter;
import blanco.commons.util.BlancoFileUtil;
import blanco.commons.util.BlancoStringUtil;
import blanco.resourcebundle.resourcebundle.BlancoResourceBundleResourceBundle;
import blanco.resourcebundle.valueobject.BlancoResourceBundleBundleItemStructure;
import blanco.resourcebundle.valueobject.BlancoResourceBundleBundleStructure;

/**
 * ����XML�t�@�C������ �v���p�e�B�t�@�C���𐶐����܂��B
 * 
 * ���̃\�[�X�R�[�h��blancoResourceBundle�̈ꕔ�ł��B<br>
 * XML����͂��ăv���p�e�B�t�@�C���ɏo�͂��s���܂��B<br>
 * �v���p�e�B�t�@�C���d�l�Ƃ��ĎQ�Ƃ�����񌹂͉��L��Properties�N���X�����ł��B<br>
 * http://java.sun.com/j2se/1.5.0/docs/api/java/util/Properties.html#store(java.
 * io.OutputStream,%20java.lang.String)
 * 
 * @author IGA Tosiki
 */
public class BlancoResourceBundleXml2Properties {
    /**
     * �R�}���h���C���ɏo�͂���ۂ̃v���t�B�b�N�X�B
     */
    private static final String CMDLINE_PREFIX = "rb: ";

    /**
     * ���\�[�X�o���h���A�N�Z�T�̃C���X�^���X�B
     */
    private BlancoResourceBundleResourceBundle fBundle = new BlancoResourceBundleResourceBundle();

    /**
     * �^�C���X�^���v���v���p�e�B�t�@�C���̃R�����g�ɏo�͂��邩�ǂ����B
     */
    private boolean fCommentTimestamp = true;

    /**
     * �v���p�e�B�t�@�C�����f�B���N�g���t���ŏo�͂��邩�ǂ����B
     */
    private boolean fPropertieswithdirectory = true;

    /**
     * �v���p�e�B�t�@�C���ɃR�����g�Ƃ��ď��������𖄂ߍ��ނ��ǂ����̃t���O���Z�b�g���܂��B
     * 
     * @param isCommentTimestamp
     *            ���������𖄂ߍ��ނ��ǂ����Btrue�Ȃ疄�ߍ��݁B
     */
    public void setCommentTimestamp(final boolean isCommentTimestamp) {
        fCommentTimestamp = isCommentTimestamp;
    }

    /**
     * �v���p�e�B�t�@�C�����f�B���N�g���t���ŏo�͂��邩�ǂ����̃t���O���Z�b�g���܂��B
     * 
     * @param isPropertieswithdirectory
     *            �v���p�e�B�t�@�C�����f�B���N�g���t���ŏo�͂��邩�ǂ����B
     */
    public void setPropertieswithdirectory(
            final boolean isPropertieswithdirectory) {
        fPropertieswithdirectory = isPropertieswithdirectory;
    }

    /**
     * ����XML�t�@�C������ �v���p�e�B�t�@�C���𐶐����܂��B
     * 
     * @param fileSource
     *            ����XML�t�@�C���B
     * @param directoryTarget
     *            �o�͐�f�B���N�g���B
     */
    public void process(final File fileSource, final File directoryTarget) {
        if (directoryTarget.exists() == false) {
            // �f�B���N�g���������̂ŐV�K�쐬���܂��B
            directoryTarget.mkdirs();
        }

        final Map<java.lang.String, java.lang.String> mapProcessedBaseName = new HashMap<java.lang.String, java.lang.String>(
                64);
        final BlancoResourceBundleBundleStructure[] structures = new BlancoResourceBundleXmlParser()
                .parse(fileSource);
        for (int index = 0; index < structures.length; index++) {
            if (mapProcessedBaseName.get(structures[index].getName()) == null) {
                // System.out.println("��ꖼ[" + baseName + "]
                // �����߂ēo�ꂵ�܂����B���P�[��["
                // + locale + "]�̓��P�[�����w�肳��Ă��Ȃ��ꍇ�̃��\�[�X�Ƃ��Ă����p����܂��B");
                structure2Properties(structures[index], null, directoryTarget);
                mapProcessedBaseName.put(structures[index].getName(),
                        structures[index].getCurrentLocale());
            }
            structure2Properties(structures[index], structures[index]
                    .getCurrentLocale(), directoryTarget);
        }
    }

    /**
     * �v���p�e�B�t�@�C����W�J���܂��B
     * 
     * @param resourceBase
     *            �\���B
     * @param locale
     *            ���P�[���B
     * @param directoryTarget
     *            �o�͐�f�B���N�g���B
     */
    public void structure2Properties(
            final BlancoResourceBundleBundleStructure resourceBase,
            final String locale, final File directoryTarget) {
        final String resourceDefinitionId = resourceBase.getName();

        String subDirectory = "";
        if (fPropertieswithdirectory) {
            subDirectory = "/"
                    + BlancoStringUtil.replace(resourceBase.getPackage(), ".",
                            "/", true);
        }

        // �t�@�C�������m�肵�܂��B
        String fileName = null;
        if (locale == null) {
            fileName = directoryTarget.getAbsolutePath() + subDirectory + "/"
                    + resourceDefinitionId + ".properties";
        } else {
            fileName = directoryTarget.getAbsolutePath() + subDirectory + "/"
                    + resourceDefinitionId + "_" + locale + ".properties";
        }

        final File fileTarget = new File(fileName);

        {
            // �o�͐�f�B���N�g���̑��݃`�F�b�N
            final File dirParent = fileTarget.getAbsoluteFile().getParentFile();
            if (dirParent.exists() == false) {
                // ������΍쐬�B
                dirParent.mkdirs();
            }
        }

        final ByteArrayOutputStream outStream = new ByteArrayOutputStream();
        Native2AsciiWriter writer = null;
        try {

            // �v���p�e�B�t�@�C���� 8859_1�ŃG���R�[�h����Ă��܂��B
            writer = new Native2AsciiWriter(new BufferedWriter(
                    new OutputStreamWriter(outStream, "8859_1")));

            writer
                    .writeComment(" blancoResourceBundle properties file for locale ["
                            + (locale == null ? "default" : locale) + "]");

            if (fCommentTimestamp) {
                writer.writeComment(" generated at "
                        + DateFormat.getDateInstance().format(new Date()) + " "
                        + DateFormat.getTimeInstance().format(new Date()));
            }

            final List<BlancoResourceBundleBundleItemStructure> listResource = resourceBase
                    .getItemList();
            // ����w�肪�����ꍇ�ł����Ă��A�t�@�C���͐������܂��B

            final int sizeListRow = listResource.size();
            for (int indexField = 0; indexField < sizeListRow; indexField++) {
                final BlancoResourceBundleBundleItemStructure elementResource = listResource
                        .get(indexField);

                final String fieldResourceId = elementResource.getKey();
                String fieldResourceString = null;
                if (elementResource.getResourceStringList().size() > 0) {
                    fieldResourceString = elementResource
                            .getResourceStringList().get(0).getResourceString();
                }

                if (BlancoStringUtil.null2Blank(fieldResourceId).length() == 0) {
                    // ���\�[�XID��null�̏ꍇ�� �v���p�e�B�ł͂���܂���B
                    if (fieldResourceString != null) {
                        // ���\�[�XID��null�Ȃ̂�����ǂ������񂪎w�肳��Ă���ꍇ�ɂ�
                        // �R�����g�Ƃ��Ĉ����܂��B
                        writer.writeComment(fieldResourceString);
                    }
                } else {
                    writer.writeProperty(fBundle.getKeyPrefix()
                            + fieldResourceId,
                            (fieldResourceString == null ? ""
                                    : fieldResourceString));
                }
            }
            writer.flush();
            outStream.flush();

            // �K�v������ꍇ�ɂ̂݃t�@�C���̍쐬��X�V���s���܂��B
            switch (BlancoFileUtil.bytes2FileIfNecessary(outStream
                    .toByteArray(), fileTarget)) {
            case 0:
                // System.out.println(CMDLINE_PREFIX + "skip : "
                // + fileTarget.getAbsolutePath());
                break;
            case 1:
                System.out.println(CMDLINE_PREFIX + "create: "
                        + fileTarget.getAbsolutePath());
                break;
            case 2:
                System.out.println(CMDLINE_PREFIX + "update: "
                        + fileTarget.getAbsolutePath());
                break;
            }

        } catch (IOException e) {
            throw new IllegalArgumentException("�v���p�e�B�t�@�C��[" + fileName
                    + "]�̏o�͎��ɓ��o�͗�O���������܂����B" + e.toString());
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}