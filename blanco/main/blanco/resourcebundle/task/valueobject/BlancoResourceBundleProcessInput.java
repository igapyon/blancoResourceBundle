/*
 * blanco Framework
 * Copyright (C) 2004-2009 IGA Tosiki
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 */
package blanco.resourcebundle.task.valueobject;

/**
 * �����N���X [BlancoResourceBundleProcess]�̓��̓o�����[�I�u�W�F�N�g�N���X�ł��B
 */
public class BlancoResourceBundleProcessInput {
    /**
     * verbose���[�h�œ��삳���邩�ǂ����B
     *
     * �t�B�[���h: [verbose]�B
     * �f�t�H���g: [false]�B
     */
    private boolean fVerbose = false;

    /**
     * ���^�f�B���N�g��
     *
     * �t�B�[���h: [metadir]�B
     */
    private String fMetadir;

    /**
     * �o�͐�t�H���_���w�肵�܂��B���w��̏ꍇ�ɂ̓J�����g������blanco��p���܂��B
     *
     * �t�B�[���h: [targetdir]�B
     * �f�t�H���g: [blanco]�B
     */
    private String fTargetdir = "blanco";

    /**
     * �e���|�����t�H���_���w�肵�܂��B���w��̏ꍇ�ɂ́A�J�����g������tmp��p���܂��B
     *
     * �t�B�[���h: [tmpdir]�B
     * �f�t�H���g: [tmp]�B
     */
    private String fTmpdir = "tmp";

    /**
     * ������������\�[�X�t�@�C���̕����G���R�[�f�B���O���w�肵�܂��B
     *
     * �t�B�[���h: [encoding]�B
     */
    private String fEncoding;

    /**
     * �v���p�e�B�t�@�C���̐��������ɂ��āA�v���p�e�B�t�@�C���̃R�����g�ɏo�͂��邩�ǂ����t���O�B
     *
     * �t�B�[���h: [commenttimestamp]�B
     * �f�t�H���g: [true]�B
     */
    private boolean fCommenttimestamp = true;

    /**
     * ���\�[�X�o���h���������MessageFormat�ɂ��p�[�X���s�����ۂɁA��O�����������珈���𒆒f���邩�ǂ����̃t���O�Btrue�Ȃ珈�����f���ė�O�𔭐������܂��Bfalse�Ȃ珈�����s���A�u��������͖������̂Ƃ݂Ȃ��܂��BJava�̃\�[�X�R�[�h����������ۂȂǂɁA������ false�ɐݒ肵�Ĕg���ʂ��������Ƃ��ł���悤�ɐ؂�ւ���ꍇ������܂��B
     *
     * �t�B�[���h: [failonmessageformaterror]�B
     * �f�t�H���g: [true]�B
     */
    private boolean fFailonmessageformaterror = true;

    /**
     * ���O�o�͂��������������\�[�X�R�[�h�Ɋ܂߂邩�ǂ����̃t���O�B�o�͂���ꍇ�ɂ� java.util.logging.Logger�݂̂ɑΉ��B
     *
     * �t�B�[���h: [log]�B
     * �f�t�H���g: [false]�B
     */
    private boolean fLog = false;

    /**
     * �v���p�e�B�t�@�C�����f�B���N�g���t���ŏo�͂��邩�ǂ����̃t���O�B
     *
     * �t�B�[���h: [propertieswithdirectory]�B
     * �f�t�H���g: [true]�B
     */
    private boolean fPropertieswithdirectory = true;

    /**
     * �t�B�[���h [verbose] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [verbose���[�h�œ��삳���邩�ǂ����B]�B
     *
     * @param argVerbose �t�B�[���h[verbose]�ɐݒ肷��l�B
     */
    public void setVerbose(final boolean argVerbose) {
        fVerbose = argVerbose;
    }

    /**
     * �t�B�[���h [verbose] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [verbose���[�h�œ��삳���邩�ǂ����B]�B
     * �f�t�H���g: [false]�B
     *
     * @return �t�B�[���h[verbose]����擾�����l�B
     */
    public boolean getVerbose() {
        return fVerbose;
    }

    /**
     * �t�B�[���h [metadir] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [���^�f�B���N�g��]�B
     *
     * @param argMetadir �t�B�[���h[metadir]�ɐݒ肷��l�B
     */
    public void setMetadir(final String argMetadir) {
        fMetadir = argMetadir;
    }

    /**
     * �t�B�[���h [metadir] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [���^�f�B���N�g��]�B
     *
     * @return �t�B�[���h[metadir]����擾�����l�B
     */
    public String getMetadir() {
        return fMetadir;
    }

    /**
     * �t�B�[���h [targetdir] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [�o�͐�t�H���_���w�肵�܂��B���w��̏ꍇ�ɂ̓J�����g������blanco��p���܂��B]�B
     *
     * @param argTargetdir �t�B�[���h[targetdir]�ɐݒ肷��l�B
     */
    public void setTargetdir(final String argTargetdir) {
        fTargetdir = argTargetdir;
    }

    /**
     * �t�B�[���h [targetdir] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [�o�͐�t�H���_���w�肵�܂��B���w��̏ꍇ�ɂ̓J�����g������blanco��p���܂��B]�B
     * �f�t�H���g: [blanco]�B
     *
     * @return �t�B�[���h[targetdir]����擾�����l�B
     */
    public String getTargetdir() {
        return fTargetdir;
    }

    /**
     * �t�B�[���h [tmpdir] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [�e���|�����t�H���_���w�肵�܂��B���w��̏ꍇ�ɂ́A�J�����g������tmp��p���܂��B]�B
     *
     * @param argTmpdir �t�B�[���h[tmpdir]�ɐݒ肷��l�B
     */
    public void setTmpdir(final String argTmpdir) {
        fTmpdir = argTmpdir;
    }

    /**
     * �t�B�[���h [tmpdir] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [�e���|�����t�H���_���w�肵�܂��B���w��̏ꍇ�ɂ́A�J�����g������tmp��p���܂��B]�B
     * �f�t�H���g: [tmp]�B
     *
     * @return �t�B�[���h[tmpdir]����擾�����l�B
     */
    public String getTmpdir() {
        return fTmpdir;
    }

    /**
     * �t�B�[���h [encoding] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [������������\�[�X�t�@�C���̕����G���R�[�f�B���O���w�肵�܂��B]�B
     *
     * @param argEncoding �t�B�[���h[encoding]�ɐݒ肷��l�B
     */
    public void setEncoding(final String argEncoding) {
        fEncoding = argEncoding;
    }

    /**
     * �t�B�[���h [encoding] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [������������\�[�X�t�@�C���̕����G���R�[�f�B���O���w�肵�܂��B]�B
     *
     * @return �t�B�[���h[encoding]����擾�����l�B
     */
    public String getEncoding() {
        return fEncoding;
    }

    /**
     * �t�B�[���h [commenttimestamp] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [�v���p�e�B�t�@�C���̐��������ɂ��āA�v���p�e�B�t�@�C���̃R�����g�ɏo�͂��邩�ǂ����t���O�B]�B
     *
     * @param argCommenttimestamp �t�B�[���h[commenttimestamp]�ɐݒ肷��l�B
     */
    public void setCommenttimestamp(final boolean argCommenttimestamp) {
        fCommenttimestamp = argCommenttimestamp;
    }

    /**
     * �t�B�[���h [commenttimestamp] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [�v���p�e�B�t�@�C���̐��������ɂ��āA�v���p�e�B�t�@�C���̃R�����g�ɏo�͂��邩�ǂ����t���O�B]�B
     * �f�t�H���g: [true]�B
     *
     * @return �t�B�[���h[commenttimestamp]����擾�����l�B
     */
    public boolean getCommenttimestamp() {
        return fCommenttimestamp;
    }

    /**
     * �t�B�[���h [failonmessageformaterror] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [���\�[�X�o���h���������MessageFormat�ɂ��p�[�X���s�����ۂɁA��O�����������珈���𒆒f���邩�ǂ����̃t���O�Btrue�Ȃ珈�����f���ė�O�𔭐������܂��Bfalse�Ȃ珈�����s���A�u��������͖������̂Ƃ݂Ȃ��܂��BJava�̃\�[�X�R�[�h����������ۂȂǂɁA������ false�ɐݒ肵�Ĕg���ʂ��������Ƃ��ł���悤�ɐ؂�ւ���ꍇ������܂��B]�B
     *
     * @param argFailonmessageformaterror �t�B�[���h[failonmessageformaterror]�ɐݒ肷��l�B
     */
    public void setFailonmessageformaterror(final boolean argFailonmessageformaterror) {
        fFailonmessageformaterror = argFailonmessageformaterror;
    }

    /**
     * �t�B�[���h [failonmessageformaterror] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [���\�[�X�o���h���������MessageFormat�ɂ��p�[�X���s�����ۂɁA��O�����������珈���𒆒f���邩�ǂ����̃t���O�Btrue�Ȃ珈�����f���ė�O�𔭐������܂��Bfalse�Ȃ珈�����s���A�u��������͖������̂Ƃ݂Ȃ��܂��BJava�̃\�[�X�R�[�h����������ۂȂǂɁA������ false�ɐݒ肵�Ĕg���ʂ��������Ƃ��ł���悤�ɐ؂�ւ���ꍇ������܂��B]�B
     * �f�t�H���g: [true]�B
     *
     * @return �t�B�[���h[failonmessageformaterror]����擾�����l�B
     */
    public boolean getFailonmessageformaterror() {
        return fFailonmessageformaterror;
    }

    /**
     * �t�B�[���h [log] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [���O�o�͂��������������\�[�X�R�[�h�Ɋ܂߂邩�ǂ����̃t���O�B�o�͂���ꍇ�ɂ� java.util.logging.Logger�݂̂ɑΉ��B]�B
     *
     * @param argLog �t�B�[���h[log]�ɐݒ肷��l�B
     */
    public void setLog(final boolean argLog) {
        fLog = argLog;
    }

    /**
     * �t�B�[���h [log] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [���O�o�͂��������������\�[�X�R�[�h�Ɋ܂߂邩�ǂ����̃t���O�B�o�͂���ꍇ�ɂ� java.util.logging.Logger�݂̂ɑΉ��B]�B
     * �f�t�H���g: [false]�B
     *
     * @return �t�B�[���h[log]����擾�����l�B
     */
    public boolean getLog() {
        return fLog;
    }

    /**
     * �t�B�[���h [propertieswithdirectory] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [�v���p�e�B�t�@�C�����f�B���N�g���t���ŏo�͂��邩�ǂ����̃t���O�B]�B
     *
     * @param argPropertieswithdirectory �t�B�[���h[propertieswithdirectory]�ɐݒ肷��l�B
     */
    public void setPropertieswithdirectory(final boolean argPropertieswithdirectory) {
        fPropertieswithdirectory = argPropertieswithdirectory;
    }

    /**
     * �t�B�[���h [propertieswithdirectory] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [�v���p�e�B�t�@�C�����f�B���N�g���t���ŏo�͂��邩�ǂ����̃t���O�B]�B
     * �f�t�H���g: [true]�B
     *
     * @return �t�B�[���h[propertieswithdirectory]����擾�����l�B
     */
    public boolean getPropertieswithdirectory() {
        return fPropertieswithdirectory;
    }

    /**
     * ���̃o�����[�I�u�W�F�N�g�̕�����\�����擾���܂��B
     *
     * <P>�g�p��̒���</P>
     * <UL>
     * <LI>�I�u�W�F�N�g�̃V�����[�͈͂̂ݕ����񉻂̏����ΏۂƂȂ�܂��B
     * <LI>�I�u�W�F�N�g���z�Q�Ƃ��Ă���ꍇ�ɂ́A���̃��\�b�h�͎g��Ȃ��ł��������B
     * </UL>
     *
     * @return �o�����[�I�u�W�F�N�g�̕�����\���B
     */
    @Override
    public String toString() {
        final StringBuffer buf = new StringBuffer();
        buf.append("blanco.resourcebundle.task.valueobject.BlancoResourceBundleProcessInput[");
        buf.append("verbose=" + fVerbose);
        buf.append(",metadir=" + fMetadir);
        buf.append(",targetdir=" + fTargetdir);
        buf.append(",tmpdir=" + fTmpdir);
        buf.append(",encoding=" + fEncoding);
        buf.append(",commenttimestamp=" + fCommenttimestamp);
        buf.append(",failonmessageformaterror=" + fFailonmessageformaterror);
        buf.append(",log=" + fLog);
        buf.append(",propertieswithdirectory=" + fPropertieswithdirectory);
        buf.append("]");
        return buf.toString();
    }
}
