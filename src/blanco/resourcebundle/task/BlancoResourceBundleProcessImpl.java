/*
 * blanco Framework
 * Copyright (C) 2004-2009 IGA Tosiki
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 */
package blanco.resourcebundle.task;

import java.io.File;
import java.io.IOException;

import javax.xml.transform.TransformerException;

import org.apache.tools.ant.BuildException;

import blanco.constants.BlancoConstantsXml2JavaClass;
import blanco.resourcebundle.BlancoResourceBundleConstants;
import blanco.resourcebundle.BlancoResourceBundleMeta2Xml;
import blanco.resourcebundle.BlancoResourceBundleXml2CombinedXml;
import blanco.resourcebundle.BlancoResourceBundleXml2ConstantsXml;
import blanco.resourcebundle.BlancoResourceBundleXml2JavaClass;
import blanco.resourcebundle.BlancoResourceBundleXml2Properties;
import blanco.resourcebundle.BlancoResourceBundleXmlValidator;
import blanco.resourcebundle.message.BlancoResourceBundleMessage;
import blanco.resourcebundle.resourcebundle.BlancoResourceBundleResourceBundle;
import blanco.resourcebundle.task.valueobject.BlancoResourceBundleProcessInput;

public class BlancoResourceBundleProcessImpl implements
        BlancoResourceBundleProcess {
    /**
     * ���b�Z�[�W�B
     */
    private final BlancoResourceBundleMessage fMsg = new BlancoResourceBundleMessage();

    /**
     * ���\�[�X�o���h���A�N�Z�T�̃C���X�^���X�B
     */
    private final BlancoResourceBundleResourceBundle fBundle = new BlancoResourceBundleResourceBundle();

    /**
     * {@inheritDoc}
     */
    public int execute(BlancoResourceBundleProcessInput input)
            throws IOException, IllegalArgumentException {
        System.out.println("- " + BlancoResourceBundleConstants.PRODUCT_NAME
                + " (" + BlancoResourceBundleConstants.VERSION + ")");

        try {
            final File blancoTmpResourceBundleDirectory = new File(input
                    .getTmpdir()
                    + BlancoResourceBundleConstants.TARGET_SUBDIRECTORY);
            blancoTmpResourceBundleDirectory.mkdirs();

            final File fileMetadir = new File(input.getMetadir());
            if (fileMetadir.exists() == false) {
                throw new BuildException(fMsg.getMbrba001(input.getMetadir()));
            }

            // xls�t�@�C����xml�t�@�C���ւƕϊ����܂��B
            new BlancoResourceBundleMeta2Xml().processDirectory(fileMetadir,
                    blancoTmpResourceBundleDirectory.getAbsolutePath());

            // �e���|�����t�H���_����XML�t�@�C����g�ݑւ��� combinedxml�t�@�C���𐶐����܂��B
            final File[] fileMeta = blancoTmpResourceBundleDirectory
                    .listFiles();
            for (int index = 0; index < fileMeta.length; index++) {
                if (fileMeta[index].getName().endsWith(".xml") == false) {
                    continue;
                }

                final File fileTmpTargetCombine = new File(
                        blancoTmpResourceBundleDirectory + "/"
                                + fileMeta[index].getName() + ".combinedxml");
                // ��������XML�t�@�C���̑g�ݑւ����s���܂��B
                new BlancoResourceBundleXml2CombinedXml().process(
                        fileMeta[index], fileTmpTargetCombine);
            }

            final File[] fileTmp = blancoTmpResourceBundleDirectory.listFiles();
            for (int index = 0; index < fileTmp.length; index++) {
                if (fileTmp[index].getName().endsWith(".combinedxml")) {
                    final BlancoResourceBundleXmlValidator xmlValidator = new BlancoResourceBundleXmlValidator();
                    xmlValidator.setFailOnMessageFormatError(input
                            .getFailonmessageformaterror());
                    xmlValidator.process(fileTmp[index], new File(input
                            .getTargetdir()));

                    if ("true".equals(fBundle.getGenerateBundleSource())) {
                        final BlancoResourceBundleXml2JavaClass xml2javaclass = new BlancoResourceBundleXml2JavaClass();
                        xml2javaclass.setEncoding(input.getEncoding());
                        // ���\�[�X�o���h���A�N�Z�T�̃\�[�X�R�[�h�𐶐����邩�ǂ����t���O���Z�b�g�B
                        // MessageFormat�p�[�X���ɃG���[�����������ꍇ�ɏ������f���邩�ǂ����t���O���Z�b�g�B
                        xml2javaclass.setFailOnMessageFormatError(input
                                .getFailonmessageformaterror());

                        // ���O�o�͂��\�[�X�R�[�h�Ɏ����������邩�ǂ�����ݒ肵�܂��B
                        xml2javaclass.setLog(input.getLog());

                        // �f�B���N�g���t���Ńv���p�e�B�t�@�C�����o�͂��邩�ǂ����B
                        xml2javaclass.setPropertieswithdirectory(input.getPropertieswithdirectory());
                        
                        // ���ۂ̃\�[�X�R�[�h�������������s�B
                        xml2javaclass.process(fileTmp[index], new File(input
                                .getTargetdir()));
                    }

                    if ("true".equals(fBundle.getGenerateConstantsSource())) {
                        // �萔�N���X�̐������[�h��ON�ł��B
                        // ���\�[�X�o���h������XML�t�@�C������͂ɁA�萔�N���X�̒���XML�t�@�C���𐶐����܂��B
                        new BlancoResourceBundleXml2ConstantsXml().process(
                                fileTmp[index],
                                blancoTmpResourceBundleDirectory);
                    }
                } else if (fileTmp[index].getName().endsWith(".xml")) {
                    final BlancoResourceBundleXml2Properties xml2properties = new BlancoResourceBundleXml2Properties();
                    xml2properties.setCommentTimestamp(input
                            .getCommenttimestamp());

                    // �f�B���N�g���t���Ńv���p�e�B�t�@�C�����o�͂��邩�ǂ����B
                    xml2properties.setPropertieswithdirectory(input.getPropertieswithdirectory());
                    
                    xml2properties.process(fileTmp[index], new File(input
                            .getTargetdir()
                            + "/main"));
                }
            }

            if ("true".equals(fBundle.getGenerateConstantsSource())) {
                // �萔�N���X�̐������[�h��ON�ł��B
                // �萔�N���X�̒���XML�t�@�C������A�萔�N���X�𐶐����܂��B
                final File[] fileTmpConstants = new File(
                        blancoTmpResourceBundleDirectory.getAbsolutePath()
                                + "/constants").listFiles();
                for (int index = 0; index < fileTmpConstants.length; index++) {
                    if (fileTmpConstants[index].getName().endsWith(
                            ".constantsxml")) {
                        new BlancoConstantsXml2JavaClass().process(
                                fileTmpConstants[index], new File(input
                                        .getTargetdir()));
                    }
                }
            }

            
            
            return BlancoResourceBundleBatchProcess.END_SUCCESS;
        } catch (TransformerException ex) {
            throw new IOException("XML�ϊ��̉ߒ��ŗ�O���������܂���: " + ex.toString());
        }
    }

    /**
     * {@inheritDoc}
     */
    public boolean progress(final String argProgressMessage) {
        System.out.println(argProgressMessage);
        return false;
    }
}
