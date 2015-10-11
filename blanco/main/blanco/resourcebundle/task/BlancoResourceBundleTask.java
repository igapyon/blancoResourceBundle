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

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Task;

import blanco.resourcebundle.task.valueobject.BlancoResourceBundleProcessInput;

/**
 * Apache Ant�^�X�N [BlancoResourceBundle]�̃N���X�B
 *
 * BlancoResourceBundle��AntTask�ł��B<br>
 * ���̃N���X�ł́AApache Ant�^�X�N�ň�ʓI�ɕK�v�ȃ`�F�b�N�Ȃǂ̃R�[�f�B���O�������肵�܂��B
 * ���ۂ̏����� �p�b�P�[�W[blanco.resourcebundle.task]��BlancoResourceBundleBatchProcess�N���X���쐬���ċL�q���Ă��������B<br>
 * <br>
 * Ant�^�X�N�ւ̑g�ݍ��ݗ�<br>
 * <pre>
 * &lt;taskdef name=&quot;blancoresourcebundle&quot; classname=&quot;blanco.resourcebundle.task.BlancoResourceBundleTask">
 *     &lt;classpath&gt;
 *         &lt;fileset dir=&quot;lib&quot; includes=&quot;*.jar&quot; /&gt;
 *         &lt;fileset dir=&quot;lib.ant&quot; includes=&quot;*.jar&quot; /&gt;
 *     &lt;/classpath&gt;
 * &lt;/taskdef&gt;
 * </pre>
 */
public class BlancoResourceBundleTask extends Task {
    /**
     * BlancoResourceBundle��AntTask�ł��B
     */
    protected BlancoResourceBundleProcessInput fInput = new BlancoResourceBundleProcessInput();

    /**
     * �t�B�[���h [metadir] �ɒl���Z�b�g���ꂽ���ǂ����B
     */
    protected boolean fIsFieldMetadirProcessed = false;

    /**
     * �t�B�[���h [targetdir] �ɒl���Z�b�g���ꂽ���ǂ����B
     */
    protected boolean fIsFieldTargetdirProcessed = false;

    /**
     * �t�B�[���h [tmpdir] �ɒl���Z�b�g���ꂽ���ǂ����B
     */
    protected boolean fIsFieldTmpdirProcessed = false;

    /**
     * �t�B�[���h [encoding] �ɒl���Z�b�g���ꂽ���ǂ����B
     */
    protected boolean fIsFieldEncodingProcessed = false;

    /**
     * �t�B�[���h [commenttimestamp] �ɒl���Z�b�g���ꂽ���ǂ����B
     */
    protected boolean fIsFieldCommenttimestampProcessed = false;

    /**
     * �t�B�[���h [failonmessageformaterror] �ɒl���Z�b�g���ꂽ���ǂ����B
     */
    protected boolean fIsFieldFailonmessageformaterrorProcessed = false;

    /**
     * �t�B�[���h [log] �ɒl���Z�b�g���ꂽ���ǂ����B
     */
    protected boolean fIsFieldLogProcessed = false;

    /**
     * �t�B�[���h [propertieswithdirectory] �ɒl���Z�b�g���ꂽ���ǂ����B
     */
    protected boolean fIsFieldPropertieswithdirectoryProcessed = false;

    /**
     * verbose���[�h�œ��삳���邩�ǂ����B
     *
     * @param arg verbose���[�h�œ��삳���邩�ǂ����B
     */
    public void setVerbose(final boolean arg) {
        fInput.setVerbose(arg);
    }

    /**
     * verbose���[�h�œ��삳���邩�ǂ����B
     *
     * @return verbose���[�h�œ��삳���邩�ǂ����B
     */
    public boolean getVerbose() {
        return fInput.getVerbose();
    }

    /**
     * Ant�^�X�N��[metadir]�A�g���r���[�g�̃Z�b�^�[���\�b�h�B
     *
     * ���ڔԍ�: 1<br>
     * ���^�f�B���N�g��<br>
     *
     * @param arg �Z�b�g�������l
     */
    public void setMetadir(final String arg) {
        fInput.setMetadir(arg);
        fIsFieldMetadirProcessed = true;
    }

    /**
     * Ant�^�X�N��[metadir]�A�g���r���[�g�̃Q�b�^�[���\�b�h�B
     *
     * ���ڔԍ�: 1<br>
     * ���^�f�B���N�g��<br>
     * �K�{�A�g���r���[�g�ł��BApache Ant�^�X�N��ŕK���l���w�肳��܂��B<br>
     *
     * @return ���̃t�B�[���h�̒l
     */
    public String getMetadir() {
        return fInput.getMetadir();
    }

    /**
     * Ant�^�X�N��[targetdir]�A�g���r���[�g�̃Z�b�^�[���\�b�h�B
     *
     * ���ڔԍ�: 2<br>
     * �o�͐�t�H���_���w�肵�܂��B���w��̏ꍇ�ɂ̓J�����g������blanco��p���܂��B<br>
     *
     * @param arg �Z�b�g�������l
     */
    public void setTargetdir(final String arg) {
        fInput.setTargetdir(arg);
        fIsFieldTargetdirProcessed = true;
    }

    /**
     * Ant�^�X�N��[targetdir]�A�g���r���[�g�̃Q�b�^�[���\�b�h�B
     *
     * ���ڔԍ�: 2<br>
     * �o�͐�t�H���_���w�肵�܂��B���w��̏ꍇ�ɂ̓J�����g������blanco��p���܂��B<br>
     * �f�t�H���g�l[blanco]���ݒ肳��Ă��܂��BApache Ant�^�X�N��ŃA�g���r���[�g�̎w�肪�����ꍇ�ɂ́A�f�t�H���g�l���ݒ肳��܂��B<br>
     *
     * @return ���̃t�B�[���h�̒l
     */
    public String getTargetdir() {
        return fInput.getTargetdir();
    }

    /**
     * Ant�^�X�N��[tmpdir]�A�g���r���[�g�̃Z�b�^�[���\�b�h�B
     *
     * ���ڔԍ�: 3<br>
     * �e���|�����t�H���_���w�肵�܂��B���w��̏ꍇ�ɂ́A�J�����g������tmp��p���܂��B<br>
     *
     * @param arg �Z�b�g�������l
     */
    public void setTmpdir(final String arg) {
        fInput.setTmpdir(arg);
        fIsFieldTmpdirProcessed = true;
    }

    /**
     * Ant�^�X�N��[tmpdir]�A�g���r���[�g�̃Q�b�^�[���\�b�h�B
     *
     * ���ڔԍ�: 3<br>
     * �e���|�����t�H���_���w�肵�܂��B���w��̏ꍇ�ɂ́A�J�����g������tmp��p���܂��B<br>
     * �f�t�H���g�l[tmp]���ݒ肳��Ă��܂��BApache Ant�^�X�N��ŃA�g���r���[�g�̎w�肪�����ꍇ�ɂ́A�f�t�H���g�l���ݒ肳��܂��B<br>
     *
     * @return ���̃t�B�[���h�̒l
     */
    public String getTmpdir() {
        return fInput.getTmpdir();
    }

    /**
     * Ant�^�X�N��[encoding]�A�g���r���[�g�̃Z�b�^�[���\�b�h�B
     *
     * ���ڔԍ�: 4<br>
     * ������������\�[�X�t�@�C���̕����G���R�[�f�B���O���w�肵�܂��B<br>
     *
     * @param arg �Z�b�g�������l
     */
    public void setEncoding(final String arg) {
        fInput.setEncoding(arg);
        fIsFieldEncodingProcessed = true;
    }

    /**
     * Ant�^�X�N��[encoding]�A�g���r���[�g�̃Q�b�^�[���\�b�h�B
     *
     * ���ڔԍ�: 4<br>
     * ������������\�[�X�t�@�C���̕����G���R�[�f�B���O���w�肵�܂��B<br>
     *
     * @return ���̃t�B�[���h�̒l
     */
    public String getEncoding() {
        return fInput.getEncoding();
    }

    /**
     * Ant�^�X�N��[commenttimestamp]�A�g���r���[�g�̃Z�b�^�[���\�b�h�B
     *
     * ���ڔԍ�: 5<br>
     * �v���p�e�B�t�@�C���̐��������ɂ��āA�v���p�e�B�t�@�C���̃R�����g�ɏo�͂��邩�ǂ����t���O�B<br>
     *
     * @param arg �Z�b�g�������l
     */
    public void setCommenttimestamp(final boolean arg) {
        fInput.setCommenttimestamp(arg);
        fIsFieldCommenttimestampProcessed = true;
    }

    /**
     * Ant�^�X�N��[commenttimestamp]�A�g���r���[�g�̃Q�b�^�[���\�b�h�B
     *
     * ���ڔԍ�: 5<br>
     * �v���p�e�B�t�@�C���̐��������ɂ��āA�v���p�e�B�t�@�C���̃R�����g�ɏo�͂��邩�ǂ����t���O�B<br>
     * �f�t�H���g�l[true]���ݒ肳��Ă��܂��BApache Ant�^�X�N��ŃA�g���r���[�g�̎w�肪�����ꍇ�ɂ́A�f�t�H���g�l���ݒ肳��܂��B<br>
     *
     * @return ���̃t�B�[���h�̒l
     */
    public boolean getCommenttimestamp() {
        return fInput.getCommenttimestamp();
    }

    /**
     * Ant�^�X�N��[failonmessageformaterror]�A�g���r���[�g�̃Z�b�^�[���\�b�h�B
     *
     * ���ڔԍ�: 6<br>
     * ���\�[�X�o���h���������MessageFormat�ɂ��p�[�X���s�����ۂɁA��O�����������珈���𒆒f���邩�ǂ����̃t���O�Btrue�Ȃ珈�����f���ė�O�𔭐������܂��Bfalse�Ȃ珈�����s���A�u��������͖������̂Ƃ݂Ȃ��܂��BJava�̃\�[�X�R�[�h����������ۂȂǂɁA������ false�ɐݒ肵�Ĕg���ʂ��������Ƃ��ł���悤�ɐ؂�ւ���ꍇ������܂��B<br>
     *
     * @param arg �Z�b�g�������l
     */
    public void setFailonmessageformaterror(final boolean arg) {
        fInput.setFailonmessageformaterror(arg);
        fIsFieldFailonmessageformaterrorProcessed = true;
    }

    /**
     * Ant�^�X�N��[failonmessageformaterror]�A�g���r���[�g�̃Q�b�^�[���\�b�h�B
     *
     * ���ڔԍ�: 6<br>
     * ���\�[�X�o���h���������MessageFormat�ɂ��p�[�X���s�����ۂɁA��O�����������珈���𒆒f���邩�ǂ����̃t���O�Btrue�Ȃ珈�����f���ė�O�𔭐������܂��Bfalse�Ȃ珈�����s���A�u��������͖������̂Ƃ݂Ȃ��܂��BJava�̃\�[�X�R�[�h����������ۂȂǂɁA������ false�ɐݒ肵�Ĕg���ʂ��������Ƃ��ł���悤�ɐ؂�ւ���ꍇ������܂��B<br>
     * �f�t�H���g�l[true]���ݒ肳��Ă��܂��BApache Ant�^�X�N��ŃA�g���r���[�g�̎w�肪�����ꍇ�ɂ́A�f�t�H���g�l���ݒ肳��܂��B<br>
     *
     * @return ���̃t�B�[���h�̒l
     */
    public boolean getFailonmessageformaterror() {
        return fInput.getFailonmessageformaterror();
    }

    /**
     * Ant�^�X�N��[log]�A�g���r���[�g�̃Z�b�^�[���\�b�h�B
     *
     * ���ڔԍ�: 7<br>
     * ���O�o�͂��������������\�[�X�R�[�h�Ɋ܂߂邩�ǂ����̃t���O�B�o�͂���ꍇ�ɂ� java.util.logging.Logger�݂̂ɑΉ��B<br>
     *
     * @param arg �Z�b�g�������l
     */
    public void setLog(final boolean arg) {
        fInput.setLog(arg);
        fIsFieldLogProcessed = true;
    }

    /**
     * Ant�^�X�N��[log]�A�g���r���[�g�̃Q�b�^�[���\�b�h�B
     *
     * ���ڔԍ�: 7<br>
     * ���O�o�͂��������������\�[�X�R�[�h�Ɋ܂߂邩�ǂ����̃t���O�B�o�͂���ꍇ�ɂ� java.util.logging.Logger�݂̂ɑΉ��B<br>
     * �f�t�H���g�l[false]���ݒ肳��Ă��܂��BApache Ant�^�X�N��ŃA�g���r���[�g�̎w�肪�����ꍇ�ɂ́A�f�t�H���g�l���ݒ肳��܂��B<br>
     *
     * @return ���̃t�B�[���h�̒l
     */
    public boolean getLog() {
        return fInput.getLog();
    }

    /**
     * Ant�^�X�N��[propertieswithdirectory]�A�g���r���[�g�̃Z�b�^�[���\�b�h�B
     *
     * ���ڔԍ�: 8<br>
     * �v���p�e�B�t�@�C�����f�B���N�g���t���ŏo�͂��邩�ǂ����̃t���O�B<br>
     *
     * @param arg �Z�b�g�������l
     */
    public void setPropertieswithdirectory(final boolean arg) {
        fInput.setPropertieswithdirectory(arg);
        fIsFieldPropertieswithdirectoryProcessed = true;
    }

    /**
     * Ant�^�X�N��[propertieswithdirectory]�A�g���r���[�g�̃Q�b�^�[���\�b�h�B
     *
     * ���ڔԍ�: 8<br>
     * �v���p�e�B�t�@�C�����f�B���N�g���t���ŏo�͂��邩�ǂ����̃t���O�B<br>
     * �f�t�H���g�l[true]���ݒ肳��Ă��܂��BApache Ant�^�X�N��ŃA�g���r���[�g�̎w�肪�����ꍇ�ɂ́A�f�t�H���g�l���ݒ肳��܂��B<br>
     *
     * @return ���̃t�B�[���h�̒l
     */
    public boolean getPropertieswithdirectory() {
        return fInput.getPropertieswithdirectory();
    }

    /**
     * Ant�^�X�N�̃��C�������BApache Ant���� ���̃��\�b�h���Ăяo����܂��B
     *
     * @throws BuildException �^�X�N�Ƃ��Ă̗�O�����������ꍇ�B
     */
    @Override
    public final void execute() throws BuildException {
        System.out.println("BlancoResourceBundleTask begin.");

        // ���ڔԍ�[1]�A�A�g���r���[�g[metadir]�͕K�{���͂ł��B���̓`�F�b�N���s���܂��B
        if (fIsFieldMetadirProcessed == false) {
            throw new BuildException("�K�{�A�g���r���[�g[metadir]���ݒ肳��Ă��܂���B�����𒆒f���܂��B");
        }

        if (getVerbose()) {
            System.out.println("- verbose:[true]");
            System.out.println("- metadir:[" + getMetadir() + "]");
            System.out.println("- targetdir:[" + getTargetdir() + "]");
            System.out.println("- tmpdir:[" + getTmpdir() + "]");
            System.out.println("- encoding:[" + getEncoding() + "]");
            System.out.println("- commenttimestamp:[" + getCommenttimestamp() + "]");
            System.out.println("- failonmessageformaterror:[" + getFailonmessageformaterror() + "]");
            System.out.println("- log:[" + getLog() + "]");
            System.out.println("- propertieswithdirectory:[" + getPropertieswithdirectory() + "]");
        }

        try {
            // ���ۂ�Ant�^�X�N�̎又�������s���܂��B
            // ���̉ӏ��ŃR���p�C���G���[����������ꍇ�ABlancoResourceBundleProcess�C���^�t�F�[�X���������� blanco.resourcebundle.task�p�b�P�[�W�� BlancoResourceBundleProcessImpl�N���X���쐬���邱�Ƃɂ������ł���ꍇ������܂��B
            final BlancoResourceBundleProcess proc = new BlancoResourceBundleProcessImpl();
            if (proc.execute(fInput) != BlancoResourceBundleBatchProcess.END_SUCCESS) {
                throw new BuildException("�^�X�N�ُ͈�I�����܂����B");
            }
        } catch (IllegalArgumentException e) {
            if (getVerbose()) {
                e.printStackTrace();
            }
            throw new BuildException(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
            throw new BuildException("�^�X�N���������ɗ�O���������܂����B�����𒆒f���܂��B" + e.toString());
        } catch (Error e) {
            e.printStackTrace();
            throw new BuildException("�^�X�N���������ɃG���[���������܂����B�����𒆒f���܂��B" + e.toString());
        }
    }
}
