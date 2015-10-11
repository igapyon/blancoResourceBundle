/*
 * blanco Framework
 * Copyright (C) 2004-2009 IGA Tosiki
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 */
package blanco.resourcebundle.message;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 * ���b�Z�[�W��`[BlancoResourceBundle]�������I�ɗ��p���郊�\�[�X�o���h���N���X�B
 *
 * ���\�[�X�o���h����`: [BlancoResourceBundleMessage]�B<BR>
 * ���̃N���X�̓��\�[�X�o���h����`�����玩���������ꂽ���\�[�X�o���h���N���X�ł��B<BR>
 */
class BlancoResourceBundleMessageResourceBundle {
    /**
     * ���\�[�X�o���h���I�u�W�F�N�g�B
     *
     * �����I�Ɏ��ۂɓ��͂��s�����\�[�X�o���h�����L�����܂��B
     */
    private ResourceBundle fResourceBundle;

    /**
     * BlancoResourceBundleMessageResourceBundle�N���X�̃R���X�g���N�^�B
     *
     * ��ꖼ[BlancoResourceBundleMessage]�A�f�t�H���g�̃��P�[���A�Ăяo�����̃N���X���[�_���g�p���āA���\�[�X�o���h�����擾���܂��B
     */
    public BlancoResourceBundleMessageResourceBundle() {
        try {
            fResourceBundle = ResourceBundle.getBundle("blanco/resourcebundle/message/BlancoResourceBundleMessage");
        } catch (MissingResourceException ex) {
        }
    }

    /**
     * BlancoResourceBundleMessageResourceBundle�N���X�̃R���X�g���N�^�B
     *
     * ��ꖼ[BlancoResourceBundleMessage]�A�w�肳�ꂽ���P�[���A�Ăяo�����̃N���X���[�_���g�p���āA���\�[�X�o���h�����擾���܂��B
     *
     * @param locale ���P�[���̎w��
     */
    public BlancoResourceBundleMessageResourceBundle(final Locale locale) {
        try {
            fResourceBundle = ResourceBundle.getBundle("blanco/resourcebundle/message/BlancoResourceBundleMessage", locale);
        } catch (MissingResourceException ex) {
        }
    }

    /**
     * BlancoResourceBundleMessageResourceBundle�N���X�̃R���X�g���N�^�B
     *
     * ��ꖼ[BlancoResourceBundleMessage]�A�w�肳�ꂽ���P�[���A�w�肳�ꂽ�N���X���[�_���g�p���āA���\�[�X�o���h�����擾���܂��B
     *
     * @param locale ���P�[���̎w��
     * @param loader �N���X���[�_�̎w��
     */
    public BlancoResourceBundleMessageResourceBundle(final Locale locale, final ClassLoader loader) {
        try {
            fResourceBundle = ResourceBundle.getBundle("blanco/resourcebundle/message/BlancoResourceBundleMessage", locale, loader);
        } catch (MissingResourceException ex) {
        }
    }

    /**
     * �����I�ɕێ����Ă��郊�\�[�X�o���h���I�u�W�F�N�g���擾���܂��B
     *
     * @return �����I�ɕێ����Ă��郊�\�[�X�o���h���I�u�W�F�N�g�B
     */
    public ResourceBundle getResourceBundle() {
        return fResourceBundle;
    }

    /**
     * bundle[BlancoResourceBundleMessage], key[MBRBI001]
     *
     * [���\�[�X��`[{0}]�̃p�b�P�[�W�̎w�肪������܂���B] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[MBRBI001]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getMbrbi001(final String arg0) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "���\�[�X��`[{0}]�̃p�b�P�[�W�̎w�肪������܂���B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("MBRBI001");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // �^����ꂽ���������ɒu���������u�������܂��B
        messageFormat.format(new Object[] {arg0}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[BlancoResourceBundleMessage], key[MBRBI002]
     *
     * [���\�[�X��`[{0}]�ɈقȂ�p�b�P�[�W�̎w��[{1}]��[{2}]��������܂����B] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg1 �u��������{1}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg2 �u��������{2}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[MBRBI002]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getMbrbi002(final String arg0, final String arg1, final String arg2) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "���\�[�X��`[{0}]�ɈقȂ�p�b�P�[�W�̎w��[{1}]��[{2}]��������܂����B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("MBRBI002");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // �^����ꂽ���������ɒu���������u�������܂��B
        messageFormat.format(new Object[] {arg0, arg1, arg2}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[BlancoResourceBundleMessage], key[MBRBI003]
     *
     * [�قȂ�T�t�B�b�N�X[{0}]��[{1}]������̐ݒ�t�@�C����Ɍ�����܂����B] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg1 �u��������{1}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[MBRBI003]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getMbrbi003(final String arg0, final String arg1) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "�قȂ�T�t�B�b�N�X[{0}]��[{1}]������̐ݒ�t�@�C����Ɍ�����܂����B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("MBRBI003");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // �^����ꂽ���������ɒu���������u�������܂��B
        messageFormat.format(new Object[] {arg0, arg1}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[BlancoResourceBundleMessage], key[MBRBI004]
     *
     * [���\�[�X��`[{0}]�̃��P�[���̎w�肪������܂���B] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[MBRBI004]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getMbrbi004(final String arg0) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "���\�[�X��`[{0}]�̃��P�[���̎w�肪������܂���B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("MBRBI004");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // �^����ꂽ���������ɒu���������u�������܂��B
        messageFormat.format(new Object[] {arg0}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[BlancoResourceBundleMessage], key[MBRBI005]
     *
     * [��ꖼ[{0}] �͊��Ƀ��P�[��[{1}]�ŏ�������Ă��܂��B] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg1 �u��������{1}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[MBRBI005]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getMbrbi005(final String arg0, final String arg1) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "��ꖼ[{0}] �͊��Ƀ��P�[��[{1}]�ŏ�������Ă��܂��B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("MBRBI005");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // �^����ꂽ���������ɒu���������u�������܂��B
        messageFormat.format(new Object[] {arg0, arg1}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[BlancoResourceBundleMessage], key[MBRBI006]
     *
     * [���\�[�X�o���h����`[{0}]�̃��P�[��[{1}]���d�����Ē�`����Ă��܂��B] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg1 �u��������{1}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[MBRBI006]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getMbrbi006(final String arg0, final String arg1) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "���\�[�X�o���h����`[{0}]�̃��P�[��[{1}]���d�����Ē�`����Ă��܂��B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("MBRBI006");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // �^����ꂽ���������ɒu���������u�������܂��B
        messageFormat.format(new Object[] {arg0, arg1}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[BlancoResourceBundleMessage], key[MBRBI007]
     *
     * [���\�[�X�o���h����`[{0}]�̃��P�[��[{1}]�̃��\�[�XID[{2}]���d�����Ē�`����Ă��܂��B] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg1 �u��������{1}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg2 �u��������{2}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[MBRBI007]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getMbrbi007(final String arg0, final String arg1, final String arg2) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "���\�[�X�o���h����`[{0}]�̃��P�[��[{1}]�̃��\�[�XID[{2}]���d�����Ē�`����Ă��܂��B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("MBRBI007");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // �^����ꂽ���������ɒu���������u�������܂��B
        messageFormat.format(new Object[] {arg0, arg1, arg2}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[BlancoResourceBundleMessage], key[MBRBI008]
     *
     * [��ꖼ[{0}] ���P�[��[{1}] �L�[[{2}] ������[{3}]�̉�͂Ɏ��s���܂����B�����񂪕s���ł���\��������܂��B] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg1 �u��������{1}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg2 �u��������{2}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg3 �u��������{3}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[MBRBI008]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getMbrbi008(final String arg0, final String arg1, final String arg2, final String arg3) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "��ꖼ[{0}] ���P�[��[{1}] �L�[[{2}] ������[{3}]�̉�͂Ɏ��s���܂����B�����񂪕s���ł���\��������܂��B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("MBRBI008");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // �^����ꂽ���������ɒu���������u�������܂��B
        messageFormat.format(new Object[] {arg0, arg1, arg2, arg3}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[BlancoResourceBundleMessage], key[MBRBI009]
     *
     * [���\�[�X�o���h����`[{0}]�̃��P�[��[{1}]�̃��\�[�XID[{2}]�̃��b�Z�[�W���ɂ����ăp�����[�^�̎w�肪({3})����܂����A����܂Ō���Ă���������ɂ̓p�����[�^�̎w�肪����܂���ł����B] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg1 �u��������{1}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg2 �u��������{2}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg3 �u��������{3}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[MBRBI009]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getMbrbi009(final String arg0, final String arg1, final String arg2, final String arg3) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "���\�[�X�o���h����`[{0}]�̃��P�[��[{1}]�̃��\�[�XID[{2}]�̃��b�Z�[�W���ɂ����ăp�����[�^�̎w�肪({3})����܂����A����܂Ō���Ă���������ɂ̓p�����[�^�̎w�肪����܂���ł����B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("MBRBI009");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // �^����ꂽ���������ɒu���������u�������܂��B
        messageFormat.format(new Object[] {arg0, arg1, arg2, arg3}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[BlancoResourceBundleMessage], key[MBRBI010]
     *
     * [���\�[�X�o���h����`[{0}]�̃��P�[��[{1}]�̃��\�[�XID[{2}]�̃��b�Z�[�W���ɂ����ăp�����[�^�̎w�肪����܂��񂪁A����܂Ō���Ă���������ɂ�({3})�̃p�����[�^�̎w�肪����܂����B] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg1 �u��������{1}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg2 �u��������{2}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg3 �u��������{3}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[MBRBI010]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getMbrbi010(final String arg0, final String arg1, final String arg2, final String arg3) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "���\�[�X�o���h����`[{0}]�̃��P�[��[{1}]�̃��\�[�XID[{2}]�̃��b�Z�[�W���ɂ����ăp�����[�^�̎w�肪����܂��񂪁A����܂Ō���Ă���������ɂ�({3})�̃p�����[�^�̎w�肪����܂����B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("MBRBI010");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // �^����ꂽ���������ɒu���������u�������܂��B
        messageFormat.format(new Object[] {arg0, arg1, arg2, arg3}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[BlancoResourceBundleMessage], key[MBRBI011]
     *
     * [���\�[�X�o���h����`[{0}]�̃��P�[��[{1}]�̃��\�[�XID[{2}]�̃��b�Z�[�W���ɂ�����p�����[�^�̐�({3})���A����܂Ō���Ă����p�����[�^�̐�({4})�ƈ�v���܂���B] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg1 �u��������{1}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg2 �u��������{2}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg3 �u��������{3}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg4 �u��������{4}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[MBRBI011]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getMbrbi011(final String arg0, final String arg1, final String arg2, final String arg3, final String arg4) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "���\�[�X�o���h����`[{0}]�̃��P�[��[{1}]�̃��\�[�XID[{2}]�̃��b�Z�[�W���ɂ�����p�����[�^�̐�({3})���A����܂Ō���Ă����p�����[�^�̐�({4})�ƈ�v���܂���B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("MBRBI011");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // �^����ꂽ���������ɒu���������u�������܂��B
        messageFormat.format(new Object[] {arg0, arg1, arg2, arg3, arg4}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[BlancoResourceBundleMessage], key[MBRBI012]
     *
     * [���\�[�X�o���h����`[{0}]�̃��P�[��[{1}]�̃��\�[�XID[{2}]�̃��b�Z�[�W���ɂ�����p�����[�^�̌^({3})���A����܂Ō���Ă����p�����[�^�̌^({4})�ƈ�v���܂���B] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg1 �u��������{1}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg2 �u��������{2}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg3 �u��������{3}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg4 �u��������{4}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[MBRBI012]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getMbrbi012(final String arg0, final String arg1, final String arg2, final String arg3, final String arg4) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "���\�[�X�o���h����`[{0}]�̃��P�[��[{1}]�̃��\�[�XID[{2}]�̃��b�Z�[�W���ɂ�����p�����[�^�̌^({3})���A����܂Ō���Ă����p�����[�^�̌^({4})�ƈ�v���܂���B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("MBRBI012");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // �^����ꂽ���������ɒu���������u�������܂��B
        messageFormat.format(new Object[] {arg0, arg1, arg2, arg3, arg4}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[BlancoResourceBundleMessage], key[MBRBA001]
     *
     * [�w���metadir[{0}]��������܂���B] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[MBRBA001]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getMbrba001(final String arg0) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "�w���metadir[{0}]��������܂���B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("MBRBA001");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // �^����ꂽ���������ɒu���������u�������܂��B
        messageFormat.format(new Object[] {arg0}, strbuf, null);
        return strbuf.toString();
    }
}
