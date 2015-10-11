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

import java.io.IOException;

import blanco.resourcebundle.task.valueobject.BlancoResourceBundleProcessInput;

/**
 * �o�b�`�����N���X [BlancoResourceBundleBatchProcess]�B
 *
 * <P>�o�b�`�����̌Ăяo����B</P>
 * <code>
 * java -classpath (�N���X�p�X) blanco.resourcebundle.task.BlancoResourceBundleBatchProcess -help
 * </code>
 */
public class BlancoResourceBundleBatchProcess {
    /**
     * ����I���B
     */
    public static final int END_SUCCESS = 0;

    /**
     * ���ُ͈�I���B�����I��java.lang.IllegalArgumentException�����������ꍇ�B
     */
    public static final int END_ILLEGAL_ARGUMENT_EXCEPTION = 7;

    /**
     * ���o�͗�O�I���B�����I��java.io.IOException�����������ꍇ�B
     */
    public static final int END_IO_EXCEPTION = 8;

    /**
     * �ُ�I���B�o�b�`�̏����J�n�Ɏ��s�����ꍇ�A����ѓ����I��java.lang.Error�܂���java.lang.RuntimeException�����������ꍇ�B
     */
    public static final int END_ERROR = 9;

    /**
     * �R�}���h���C��������s���ꂽ�ۂ̃G���g���|�C���g�ł��B
     *
     * @param args �R���\�[����������p���ꂽ�����B
     */
    public static final void main(final String[] args) {
        final BlancoResourceBundleBatchProcess batchProcess = new BlancoResourceBundleBatchProcess();

        // �o�b�`�����̈����B
        final BlancoResourceBundleProcessInput input = new BlancoResourceBundleProcessInput();

        boolean isNeedUsage = false;
        boolean isFieldMetadirProcessed = false;

        // �R�}���h���C�������̉�͂������Ȃ��܂��B
        for (int index = 0; index < args.length; index++) {
            String arg = args[index];
            if (arg.startsWith("-verbose=")) {
                input.setVerbose(Boolean.valueOf(arg.substring(9)).booleanValue());
            } else if (arg.startsWith("-metadir=")) {
                input.setMetadir(arg.substring(9));
                isFieldMetadirProcessed = true;
            } else if (arg.startsWith("-targetdir=")) {
                input.setTargetdir(arg.substring(11));
            } else if (arg.startsWith("-tmpdir=")) {
                input.setTmpdir(arg.substring(8));
            } else if (arg.startsWith("-encoding=")) {
                input.setEncoding(arg.substring(10));
            } else if (arg.startsWith("-commenttimestamp=")) {
                input.setCommenttimestamp(Boolean.valueOf(arg.substring(18)).booleanValue());
            } else if (arg.startsWith("-failonmessageformaterror=")) {
                input.setFailonmessageformaterror(Boolean.valueOf(arg.substring(26)).booleanValue());
            } else if (arg.startsWith("-log=")) {
                input.setLog(Boolean.valueOf(arg.substring(5)).booleanValue());
            } else if (arg.startsWith("-propertieswithdirectory=")) {
                input.setPropertieswithdirectory(Boolean.valueOf(arg.substring(25)).booleanValue());
            } else if (arg.equals("-?") || arg.equals("-help")) {
                usage();
                System.exit(END_SUCCESS);
            } else {
                System.out.println("BlancoResourceBundleBatchProcess: ���̓p�����[�^[" + arg + "]�͖�������܂����B");
                isNeedUsage = true;
            }
        }

        if (isNeedUsage) {
            usage();
        }

        if( isFieldMetadirProcessed == false) {
            System.out.println("BlancoResourceBundleBatchProcess: �����J�n���s�B���̓p�����[�^[input]�̕K�{�t�B�[���h�l[metadir]�ɒl���ݒ肳��Ă��܂���B");
            System.exit(END_ILLEGAL_ARGUMENT_EXCEPTION);
        }

        int retCode = batchProcess.execute(input);

        // �I���R�[�h��߂��܂��B
        // �����ӁFSystem.exit()���Ăяo���Ă���_�ɒ��ӂ��Ă��������B
        System.exit(retCode);
    }

    /**
     * ��̓I�ȃo�b�`�������e���L�q���邽�߂̃��\�b�h�ł��B
     *
     * ���̃��\�b�h�Ɏ��ۂ̏������e���L�q���܂��B
     *
     * @param input �o�b�`�����̓��̓p�����[�^�B
     * @return �o�b�`�����̏I���R�[�h�BEND_SUCCESS, END_ILLEGAL_ARGUMENT_EXCEPTION, END_IO_EXCEPTION, END_ERROR �̂����ꂩ�̒l��߂��܂��B
     * @throws IOException ���o�͗�O�����������ꍇ�B
     * @throws IllegalArgumentException ���͒l�ɕs�������������ꍇ�B
     */
    public int process(final BlancoResourceBundleProcessInput input) throws IOException, IllegalArgumentException {
        // ���̓p�����[�^���`�F�b�N���܂��B
        validateInput(input);

        // ���̉ӏ��ŃR���p�C���G���[����������ꍇ�ABlancoResourceBundleProcess�C���^�t�F�[�X���������� blanco.resourcebundle.task�p�b�P�[�W�� BlancoResourceBundleProcessImpl�N���X���쐬���邱�Ƃɂ������ł���ꍇ������܂��B
        final BlancoResourceBundleProcess process = new BlancoResourceBundleProcessImpl();

        // �����̖{�̂����s���܂��B
        final int retCode = process.execute(input);

        return retCode;
    }

    /**
     * �N���X���C���X�^���X�����ăo�b�`�����s����ۂ̃G���g���|�C���g�ł��B
     *
     * ���̃��\�b�h�͉��L�̎d�l��񋟂��܂��B
     * <ul>
     * <li>���\�b�h�̓��̓p�����[�^�̓��e�`�F�b�N�B
     * <li>IllegalArgumentException, RuntimeException, Error�Ȃǂ̗�O��catch���Ė߂�l�ւƕϊ��B
     * </ul>
     *
     * @param input �o�b�`�����̓��̓p�����[�^�B
     * @return �o�b�`�����̏I���R�[�h�BEND_SUCCESS, END_ILLEGAL_ARGUMENT_EXCEPTION, END_IO_EXCEPTION, END_ERROR �̂����ꂩ�̒l��߂��܂��B
     * @throws IllegalArgumentException ���͒l�ɕs�������������ꍇ�B
     */
    public final int execute(final BlancoResourceBundleProcessInput input) throws IllegalArgumentException {
        try {
            // �o�b�`�����̖{�̂����s���܂��B
            int retCode = process(input);

            return retCode;
        } catch (IllegalArgumentException ex) {
            System.out.println("BlancoResourceBundleBatchProcess: ���͗�O���������܂����B�o�b�`�����𒆒f���܂��B:" + ex.toString());
            // ���ُ͈�I���B
            return END_ILLEGAL_ARGUMENT_EXCEPTION;
        } catch (IOException ex) {
            System.out.println("BlancoResourceBundleBatchProcess: ���o�͗�O���������܂����B�o�b�`�����𒆒f���܂��B:" + ex.toString());
            // ���ُ͈�I���B
            return END_IO_EXCEPTION;
        } catch (RuntimeException ex) {
            System.out.println("BlancoResourceBundleBatchProcess: �����^�C����O���������܂����B�o�b�`�����𒆒f���܂��B:" + ex.toString());
            ex.printStackTrace();
            // �ُ�I���B
            return END_ERROR;
        } catch (Error er) {
            System.out.println("BlancoResourceBundleBatchProcess: �����^�C���G���[���������܂����B�o�b�`�����𒆒f���܂��B:" + er.toString());
            er.printStackTrace();
            // �ُ�I���B
            return END_ERROR;
        }
    }

    /**
     * ���̃o�b�`�����N���X�̎g�����̐�����W���o�͂Ɏ������߂̃��\�b�h�ł��B
     */
    public static final void usage() {
        System.out.println("BlancoResourceBundleBatchProcess: Usage:");
        System.out.println("  java blanco.resourcebundle.task.BlancoResourceBundleBatchProcess -verbose=�l1 -metadir=�l2 -targetdir=�l3 -tmpdir=�l4 -encoding=�l5 -commenttimestamp=�l6 -failonmessageformaterror=�l7 -log=�l8 -propertieswithdirectory=�l9");
        System.out.println("    -verbose");
        System.out.println("      ����[verbose���[�h�œ��삳���邩�ǂ����B]");
        System.out.println("      �^[�^�U]");
        System.out.println("      �f�t�H���g�l[false]");
        System.out.println("    -metadir");
        System.out.println("      ����[���^�f�B���N�g��]");
        System.out.println("      �^[������]");
        System.out.println("      �K�{�p�����[�^");
        System.out.println("    -targetdir");
        System.out.println("      ����[�o�͐�t�H���_���w�肵�܂��B���w��̏ꍇ�ɂ̓J�����g������blanco��p���܂��B]");
        System.out.println("      �^[������]");
        System.out.println("      �f�t�H���g�l[blanco]");
        System.out.println("    -tmpdir");
        System.out.println("      ����[�e���|�����t�H���_���w�肵�܂��B���w��̏ꍇ�ɂ́A�J�����g������tmp��p���܂��B]");
        System.out.println("      �^[������]");
        System.out.println("      �f�t�H���g�l[tmp]");
        System.out.println("    -encoding");
        System.out.println("      ����[������������\�[�X�t�@�C���̕����G���R�[�f�B���O���w�肵�܂��B]");
        System.out.println("      �^[������]");
        System.out.println("    -commenttimestamp");
        System.out.println("      ����[�v���p�e�B�t�@�C���̐��������ɂ��āA�v���p�e�B�t�@�C���̃R�����g�ɏo�͂��邩�ǂ����t���O�B]");
        System.out.println("      �^[�^�U]");
        System.out.println("      �f�t�H���g�l[true]");
        System.out.println("    -failonmessageformaterror");
        System.out.println("      ����[���\�[�X�o���h���������MessageFormat�ɂ��p�[�X���s�����ۂɁA��O�����������珈���𒆒f���邩�ǂ����̃t���O�Btrue�Ȃ珈�����f���ė�O�𔭐������܂��Bfalse�Ȃ珈�����s���A�u��������͖������̂Ƃ݂Ȃ��܂��BJava�̃\�[�X�R�[�h����������ۂȂǂɁA������ false�ɐݒ肵�Ĕg���ʂ��������Ƃ��ł���悤�ɐ؂�ւ���ꍇ������܂��B]");
        System.out.println("      �^[�^�U]");
        System.out.println("      �f�t�H���g�l[true]");
        System.out.println("    -log");
        System.out.println("      ����[���O�o�͂��������������\�[�X�R�[�h�Ɋ܂߂邩�ǂ����̃t���O�B�o�͂���ꍇ�ɂ� java.util.logging.Logger�݂̂ɑΉ��B]");
        System.out.println("      �^[�^�U]");
        System.out.println("      �f�t�H���g�l[false]");
        System.out.println("    -propertieswithdirectory");
        System.out.println("      ����[�v���p�e�B�t�@�C�����f�B���N�g���t���ŏo�͂��邩�ǂ����̃t���O�B]");
        System.out.println("      �^[�^�U]");
        System.out.println("      �f�t�H���g�l[true]");
        System.out.println("    -? , -help");
        System.out.println("      ����[�g������\�����܂��B]");
    }

    /**
     * ���̃o�b�`�����N���X�̓��̓p�����[�^�̑Ó����`�F�b�N�����{���邽�߂̃��\�b�h�ł��B
     *
     * @param input �o�b�`�����̓��̓p�����[�^�B
     * @throws IllegalArgumentException ���͒l�ɕs�������������ꍇ�B
     */
    public void validateInput(final BlancoResourceBundleProcessInput input) throws IllegalArgumentException {
        if (input == null) {
            throw new IllegalArgumentException("BlancoBatchProcessBatchProcess: �����J�n���s�B���̓p�����[�^[input]��null���^�����܂����B");
        }
        if (input.getMetadir() == null) {
            throw new IllegalArgumentException("BlancoResourceBundleBatchProcess: �����J�n���s�B���̓p�����[�^[input]�̕K�{�t�B�[���h�l[metadir]�ɒl���ݒ肳��Ă��܂���B");
        }
    }
}
