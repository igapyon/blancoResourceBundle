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

import blanco.resourcebundle.expand.BlancoResourceBundleExpandResourceBundle;
import blanco.resourcebundle.valueobject.BlancoResourceBundleBundleStructure;

/**
 * ����XML�t�@�C������ �v���p�e�B�t�@�C���A�N�Z�X�p��Java�\�[�X�R�[�h�𐶐����܂��B
 * 
 * ���̃\�[�X�R�[�h��blancoResourceBundle�̈ꕔ�ł��B<br>
 * 
 * @author IGA Tosiki
 */
public class BlancoResourceBundleXml2JavaClass {
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
     * ���O�o�͂��������������\�[�X�R�[�h�Ɋ܂߂邩�ǂ����̃t���O�B���݂͕W���o�݂͂̂ɑΉ��B
     */
    private boolean fIsLog = false;

    /**
     * �v���p�e�B�t�@�C�����f�B���N�g���t���ŏo�͂��邩�ǂ����B
     */
    private boolean fPropertieswithdirectory = true;

    /**
     * ������������\�[�X�t�@�C���̕����G���R�[�f�B���O�B
     */
    private String fEncoding = null;

    public void setEncoding(final String argEncoding) {
        fEncoding = argEncoding;
    }

    /**
     * ���\�[�X�o���h���������MessageFormat�ɂ��p�[�X���s�����ۂɁA��O�����������珈���𒆒f���邩�ǂ����̃t���O��ݒ肵�܂��B
     * 
     * true�Ȃ珈�����f���ė�O�𔭐������܂��B<br>
     * false�Ȃ珈�����s���A�u��������͖������̂Ƃ݂Ȃ��܂��B<br>
     * Java�̃\�[�X�R�[�h����������ۂȂǂɁA������ false�ɐݒ肵�Ĕg���ʂ��������Ƃ��ł���悤�ɐ؂�ւ���ꍇ������܂��B<br>
     * �f�t�H���g�l[true]���ݒ肳��Ă��܂��B
     * 
     * @param isFailOnMessageFormatError
     */
    public void setFailOnMessageFormatError(
            final boolean isFailOnMessageFormatError) {
        fIsFailOnMessageFormatError = isFailOnMessageFormatError;
    }

    /**
     * ���O�o�͂��������������\�[�X�R�[�h�Ɋ܂߂邩�ǂ����̃t���O�̃Z�b�g�B
     * 
     * @param argIsLog
     *            ���O�o�͂��������������\�[�X�R�[�h�Ɋ܂߂邩�ǂ����B
     */
    public void setLog(final boolean argIsLog) {
        fIsLog = argIsLog;
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
     * ����XML�t�@�C������ �v���p�e�B�t�@�C���A�N�Z�X�p��Java�\�[�X�R�[�h�𐶐����܂��B
     * 
     * @param argFileSource
     *            ���͂ƂȂ钆��XML�t�@�C���B
     * @param argDirectoryTarget
     *            �\�[�X�R�[�h���o�͂���ۂ̏o�͐�f�B���N�g���B
     */
    public void process(final File argFileSource, final File argDirectoryTarget) {
        final BlancoResourceBundleBundleStructure[] structures = new BlancoResourceBundleXmlParser()
                .parse(argFileSource);
        for (int index = 0; index < structures.length; index++) {
            structure2Source(structures[index], argDirectoryTarget);
        }
    }

    /**
     * �w��̃V�[�g�̋L�q���e��W�J���܂��B
     * 
     * @param argStructure
     *            �^�X�N�̍\���B
     * @param argDirectoryTarget
     *            �o�͐�f�B���N�g��
     */
    public void structure2Source(
            final BlancoResourceBundleBundleStructure argStructure,
            final File argDirectoryTarget) {
        new BlancoResourceBundleExpandResourceBundle().expand(argStructure,
                argDirectoryTarget, fEncoding, fIsFailOnMessageFormatError,
                fIsLog, fPropertieswithdirectory);
    }
}