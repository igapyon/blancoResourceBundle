/*
 * blanco Framework
 * Copyright (C) 2004-2009 IGA Tosiki
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 */
package blanco.sample.resourcebundle;

import java.math.BigDecimal;
import java.text.MessageFormat;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.logging.Logger;

/**
 * Sample of blancoResourceBundle. This class is only for sample. It do not affect.
 *
 * ���\�[�X�o���h����`: [Sample]�B<BR>
 * ���̃N���X�̓��\�[�X�o���h����`�����玩���������ꂽ���\�[�X�o���h���N���X�ł��B<BR>
 * ���m�̃��P�[��<BR>
 * <UL>
 * <LI>ja
 * <LI>en
 * </UL>
 */
public class SampleResourceBundle {
    /**
     * ���\�[�X�o���h���I�u�W�F�N�g�B
     *
     * �����I�Ɏ��ۂɓ��͂��s�����\�[�X�o���h�����L�����܂��B
     */
    private ResourceBundle fResourceBundle;

    /**
     * SampleResourceBundle�N���X�̃R���X�g���N�^�B
     *
     * ��ꖼ[Sample]�A�f�t�H���g�̃��P�[���A�Ăяo�����̃N���X���[�_���g�p���āA���\�[�X�o���h�����擾���܂��B
     */
    public SampleResourceBundle() {
        try {
            fResourceBundle = ResourceBundle.getBundle("blanco/sample/resourcebundle/Sample");
        } catch (MissingResourceException ex) {
            final String message = "��ꖼ[Sample]�A�f�t�H���g�̃��P�[���A�Ăяo�����̃N���X���[�_���g�p���āA���\�[�X�o���h���̎擾�����݂܂��������s���܂����B��`���̐ݒ�l�𗘗p���ď������s���܂��B:" + ex.toString();
            Logger.getLogger("blanco.sample.resourcebundle").fine(message);
        }
    }

    /**
     * SampleResourceBundle�N���X�̃R���X�g���N�^�B
     *
     * ��ꖼ[Sample]�A�w�肳�ꂽ���P�[���A�Ăяo�����̃N���X���[�_���g�p���āA���\�[�X�o���h�����擾���܂��B
     *
     * @param locale ���P�[���̎w��
     */
    public SampleResourceBundle(final Locale locale) {
        try {
            fResourceBundle = ResourceBundle.getBundle("blanco/sample/resourcebundle/Sample", locale);
        } catch (MissingResourceException ex) {
            final String message = "��ꖼ[Sample]�A���P�[��[" + locale.toString() + "]�A�Ăяo�����̃N���X���[�_���g�p���āA���\�[�X�o���h���̎擾�����݂܂��������s���܂����B��`���̐ݒ�l�𗘗p���ď������s���܂��B:" + ex.toString();
            Logger.getLogger("blanco.sample.resourcebundle").fine(message);
        }
    }

    /**
     * SampleResourceBundle�N���X�̃R���X�g���N�^�B
     *
     * ��ꖼ[Sample]�A�w�肳�ꂽ���P�[���A�w�肳�ꂽ�N���X���[�_���g�p���āA���\�[�X�o���h�����擾���܂��B
     *
     * @param locale ���P�[���̎w��
     * @param loader �N���X���[�_�̎w��
     */
    public SampleResourceBundle(final Locale locale, final ClassLoader loader) {
        try {
            fResourceBundle = ResourceBundle.getBundle("blanco/sample/resourcebundle/Sample", locale, loader);
        } catch (MissingResourceException ex) {
            final String message = "��ꖼ[Sample]�A���P�[��[" + locale.toString() + "]�A�w��̃N���X���[�_���g�p���āA���\�[�X�o���h���̎擾�����݂܂��������s���܂����B��`���̐ݒ�l�𗘗p���ď������s���܂��B:" + ex.toString();
            Logger.getLogger("blanco.sample.resourcebundle").fine(message);
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
     * bundle[Sample], key[MESSAGE001]
     *
     * [���b�Z�[�W�̃T���v���B���̂P�B] (ja)<br>
     * [Sample of message. No1.] (en)<br>
     *
     * @return key[MESSAGE001]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getMessage001() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "���b�Z�[�W�̃T���v���B���̂P�B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("MESSAGE001");
            }
        } catch (MissingResourceException ex) {
            final String message = "��ꖼ[Sample]�A�L�[[MESSAGE001]�̒�`���擾�ł��܂���ł����B��`���̒l�𗘗p���ď������s���܂��B:" + ex.toString();
            Logger.getLogger("blanco.sample.resourcebundle").fine(message);
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[Sample], key[MESSAGE002]
     *
     * [���b�Z�[�W�u������[{0}]���u������܂��B] (ja)<br>
     * [Replace message here [{0}].] (en)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[MESSAGE002]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getMessage002(final String arg0) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "���b�Z�[�W�u������[{0}]���u������܂��B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("MESSAGE002");
            }
        } catch (MissingResourceException ex) {
            final String message = "��ꖼ[Sample]�A�L�[[MESSAGE002]�̒�`���擾�ł��܂���ł����B��`���̒l�𗘗p���ď������s���܂��B:" + ex.toString();
            Logger.getLogger("blanco.sample.resourcebundle").fine(message);
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // �^����ꂽ���������ɒu���������u�������܂��B
        messageFormat.format(new Object[] {arg0}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[Sample], key[MESSAGE003]
     *
     * [���b�Z�[�W�u������[{0}]�ɉ����A�����ЂƂ�[{1}]���u������܂��B] (ja)<br>
     * [Replace message [{0}] and next message[{1}].] (en)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg1 �u��������{1}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[MESSAGE003]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getMessage003(final String arg0, final String arg1) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "���b�Z�[�W�u������[{0}]�ɉ����A�����ЂƂ�[{1}]���u������܂��B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("MESSAGE003");
            }
        } catch (MissingResourceException ex) {
            final String message = "��ꖼ[Sample]�A�L�[[MESSAGE003]�̒�`���擾�ł��܂���ł����B��`���̒l�𗘗p���ď������s���܂��B:" + ex.toString();
            Logger.getLogger("blanco.sample.resourcebundle").fine(message);
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // �^����ꂽ���������ɒu���������u�������܂��B
        messageFormat.format(new Object[] {arg0, arg1}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[Sample], key[MESSAGE004]
     *
     * [{0}�擪����u�������񂪂����B] (ja)<br>
     * [{0}replace message from begin.] (en)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[MESSAGE004]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getMessage004(final String arg0) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "{0}�擪����u�������񂪂����B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("MESSAGE004");
            }
        } catch (MissingResourceException ex) {
            final String message = "��ꖼ[Sample]�A�L�[[MESSAGE004]�̒�`���擾�ł��܂���ł����B��`���̒l�𗘗p���ď������s���܂��B:" + ex.toString();
            Logger.getLogger("blanco.sample.resourcebundle").fine(message);
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // �^����ꂽ���������ɒu���������u�������܂��B
        messageFormat.format(new Object[] {arg0}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[Sample], key[MESSAGE005]
     *
     * [�Ōオ�u��������̗�B{0}] (ja)<br>
     * [Replace message from last.{0}] (en)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[MESSAGE005]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getMessage005(final String arg0) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "�Ōオ�u��������̗�B{0}";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("MESSAGE005");
            }
        } catch (MissingResourceException ex) {
            final String message = "��ꖼ[Sample]�A�L�[[MESSAGE005]�̒�`���擾�ł��܂���ł����B��`���̒l�𗘗p���ď������s���܂��B:" + ex.toString();
            Logger.getLogger("blanco.sample.resourcebundle").fine(message);
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // �^����ꂽ���������ɒu���������u�������܂��B
        messageFormat.format(new Object[] {arg0}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[Sample], key[MESSAGE006]
     *
     * [���x�������u������{0}{1}{0}{1}{2}{1}{0}] (ja)<br>
     * [Many replace messages.{0}{1}{0}{1}{2}{1}{0}] (en)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg1 �u��������{1}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg2 �u��������{2}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[MESSAGE006]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getMessage006(final String arg0, final String arg1, final String arg2) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "���x�������u������{0}{1}{0}{1}{2}{1}{0}";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("MESSAGE006");
            }
        } catch (MissingResourceException ex) {
            final String message = "��ꖼ[Sample]�A�L�[[MESSAGE006]�̒�`���擾�ł��܂���ł����B��`���̒l�𗘗p���ď������s���܂��B:" + ex.toString();
            Logger.getLogger("blanco.sample.resourcebundle").fine(message);
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // �^����ꂽ���������ɒu���������u�������܂��B
        messageFormat.format(new Object[] {arg0, arg1, arg2}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[Sample], key[MESSAGE007]
     *
     * [��������̒u�������B{11}{10}{9}{8}{7}{6}{5}{4}{3}{2}{1}{0}��12�B] (ja)<br>
     * [Many replace messages.{11}{10}{9}{8}{7}{6}{5}{4}{3}{2}{1}{0} up to 12.] (en)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg1 �u��������{1}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg2 �u��������{2}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg3 �u��������{3}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg4 �u��������{4}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg5 �u��������{5}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg6 �u��������{6}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg7 �u��������{7}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg8 �u��������{8}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg9 �u��������{9}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg10 �u��������{10}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg11 �u��������{11}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[MESSAGE007]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getMessage007(final String arg0, final String arg1, final String arg2, final String arg3, final String arg4, final String arg5, final String arg6, final String arg7, final String arg8, final String arg9, final String arg10, final String arg11) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "��������̒u�������B{11}{10}{9}{8}{7}{6}{5}{4}{3}{2}{1}{0}��12�B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("MESSAGE007");
            }
        } catch (MissingResourceException ex) {
            final String message = "��ꖼ[Sample]�A�L�[[MESSAGE007]�̒�`���擾�ł��܂���ł����B��`���̒l�𗘗p���ď������s���܂��B:" + ex.toString();
            Logger.getLogger("blanco.sample.resourcebundle").fine(message);
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // �^����ꂽ���������ɒu���������u�������܂��B
        messageFormat.format(new Object[] {arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[Sample], key[MESSAGE008]
     *
     * [�G�X�P�[�v�����̊m�F�B�_�u���N�I�[�e�[�V����&quot;�A�V���O���N�I�[�e�[�V����'�A�G���}�[�N\�B] (ja)<br>
     * [Check for escape string. Double &quot;, Single ', Yen \�B] (en)<br>
     *
     * @return key[MESSAGE008]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getMessage008() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "�G�X�P�[�v�����̊m�F�B�_�u���N�I�[�e�[�V����\"�A�V���O���N�I�[�e�[�V����'�A�G���}�[�N\\�B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("MESSAGE008");
            }
        } catch (MissingResourceException ex) {
            final String message = "��ꖼ[Sample]�A�L�[[MESSAGE008]�̒�`���擾�ł��܂���ł����B��`���̒l�𗘗p���ď������s���܂��B:" + ex.toString();
            Logger.getLogger("blanco.sample.resourcebundle").fine(message);
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[Sample], key[MESSAGE009]
     *
     * [�~] (ja)<br>
     * [X] (en)<br>
     *
     * @return key[MESSAGE009]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getMessage009() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "�~";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("MESSAGE009");
            }
        } catch (MissingResourceException ex) {
            final String message = "��ꖼ[Sample]�A�L�[[MESSAGE009]�̒�`���擾�ł��܂���ł����B��`���̒l�𗘗p���ď������s���܂��B:" + ex.toString();
            Logger.getLogger("blanco.sample.resourcebundle").fine(message);
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[Sample], key[MESSAGE010]
     *
     * [���l�̃��b�Z�[�W�u������[{0,number}]�̗�B] (ja)<br>
     * [Number replace message[{0,number}] sample.] (en)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.math.BigDecimal�^��^���Ă��������B
     * @return key[MESSAGE010]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getMessage010(final BigDecimal arg0) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "���l�̃��b�Z�[�W�u������[{0,number}]�̗�B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("MESSAGE010");
            }
        } catch (MissingResourceException ex) {
            final String message = "��ꖼ[Sample]�A�L�[[MESSAGE010]�̒�`���擾�ł��܂���ł����B��`���̒l�𗘗p���ď������s���܂��B:" + ex.toString();
            Logger.getLogger("blanco.sample.resourcebundle").fine(message);
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // �^����ꂽ���������ɒu���������u�������܂��B
        messageFormat.format(new Object[] {arg0}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[Sample], key[MESSAGE011]
     *
     * [���{��̂ݒ�`���ꂽ��\�[�X�B] (ja)<br>
     * TODO: ����: ���P�[��(en)�͐ݒ肳��Ă��܂���B
     *
     * @return key[MESSAGE011]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getMessage011() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "���{��̂ݒ�`���ꂽ��\�[�X�B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("MESSAGE011");
            }
        } catch (MissingResourceException ex) {
            final String message = "��ꖼ[Sample]�A�L�[[MESSAGE011]�̒�`���擾�ł��܂���ł����B��`���̒l�𗘗p���ď������s���܂��B:" + ex.toString();
            Logger.getLogger("blanco.sample.resourcebundle").fine(message);
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[Sample], key[MESSAGE013]
     *
     * [] (ja)<br>
     * TODO: ����: ���P�[��(en)�͐ݒ肳��Ă��܂���B
     *
     * @return key[MESSAGE013]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getMessage013() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("MESSAGE013");
            }
        } catch (MissingResourceException ex) {
            final String message = "��ꖼ[Sample]�A�L�[[MESSAGE013]�̒�`���擾�ł��܂���ł����B��`���̒l�𗘗p���ď������s���܂��B:" + ex.toString();
            Logger.getLogger("blanco.sample.resourcebundle").fine(message);
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[Sample], key[MESSAGE012]
     *
     * [Resource for en locale only.] (en)<br>
     * TODO: ����: ���P�[��(ja)�͐ݒ肳��Ă��܂���B
     *
     * @return key[MESSAGE012]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getMessage012() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "Resource for en locale only.";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("MESSAGE012");
            }
        } catch (MissingResourceException ex) {
            final String message = "��ꖼ[Sample]�A�L�[[MESSAGE012]�̒�`���擾�ł��܂���ł����B��`���̒l�𗘗p���ď������s���܂��B:" + ex.toString();
            Logger.getLogger("blanco.sample.resourcebundle").fine(message);
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }
}
