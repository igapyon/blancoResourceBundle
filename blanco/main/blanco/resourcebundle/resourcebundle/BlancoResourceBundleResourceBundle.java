/*
 * blanco Framework
 * Copyright (C) 2004-2009 IGA Tosiki
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 */
package blanco.resourcebundle.resourcebundle;

import java.math.BigDecimal;
import java.text.MessageFormat;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.logging.Logger;

/**
 * BlancoResourceBundle CSP (Collection of Small Programs) �̃��\�[�X�o���h����`�ł��B
 *
 * ���\�[�X�o���h����`: [BlancoResourceBundle]�B<BR>
 * ���̃N���X�̓��\�[�X�o���h����`�����玩���������ꂽ���\�[�X�o���h���N���X�ł��B<BR>
 * ���m�̃��P�[��<BR>
 * <UL>
 * <LI>ja
 * </UL>
 */
public class BlancoResourceBundleResourceBundle {
    /**
     * ���\�[�X�o���h���I�u�W�F�N�g�B
     *
     * �����I�Ɏ��ۂɓ��͂��s�����\�[�X�o���h�����L�����܂��B
     */
    private ResourceBundle fResourceBundle;

    /**
     * BlancoResourceBundleResourceBundle�N���X�̃R���X�g���N�^�B
     *
     * ��ꖼ[BlancoResourceBundle]�A�f�t�H���g�̃��P�[���A�Ăяo�����̃N���X���[�_���g�p���āA���\�[�X�o���h�����擾���܂��B
     */
    public BlancoResourceBundleResourceBundle() {
        try {
            fResourceBundle = ResourceBundle.getBundle("blanco/resourcebundle/resourcebundle/BlancoResourceBundle");
        } catch (MissingResourceException ex) {
            final String message = "��ꖼ[BlancoResourceBundle]�A�f�t�H���g�̃��P�[���A�Ăяo�����̃N���X���[�_���g�p���āA���\�[�X�o���h���̎擾�����݂܂��������s���܂����B��`���̐ݒ�l�𗘗p���ď������s���܂��B:" + ex.toString();
            Logger.getLogger("blanco.resourcebundle.resourcebundle").fine(message);
        }
    }

    /**
     * BlancoResourceBundleResourceBundle�N���X�̃R���X�g���N�^�B
     *
     * ��ꖼ[BlancoResourceBundle]�A�w�肳�ꂽ���P�[���A�Ăяo�����̃N���X���[�_���g�p���āA���\�[�X�o���h�����擾���܂��B
     *
     * @param locale ���P�[���̎w��
     */
    public BlancoResourceBundleResourceBundle(final Locale locale) {
        try {
            fResourceBundle = ResourceBundle.getBundle("blanco/resourcebundle/resourcebundle/BlancoResourceBundle", locale);
        } catch (MissingResourceException ex) {
            final String message = "��ꖼ[BlancoResourceBundle]�A���P�[��[" + locale.toString() + "]�A�Ăяo�����̃N���X���[�_���g�p���āA���\�[�X�o���h���̎擾�����݂܂��������s���܂����B��`���̐ݒ�l�𗘗p���ď������s���܂��B:" + ex.toString();
            Logger.getLogger("blanco.resourcebundle.resourcebundle").fine(message);
        }
    }

    /**
     * BlancoResourceBundleResourceBundle�N���X�̃R���X�g���N�^�B
     *
     * ��ꖼ[BlancoResourceBundle]�A�w�肳�ꂽ���P�[���A�w�肳�ꂽ�N���X���[�_���g�p���āA���\�[�X�o���h�����擾���܂��B
     *
     * @param locale ���P�[���̎w��
     * @param loader �N���X���[�_�̎w��
     */
    public BlancoResourceBundleResourceBundle(final Locale locale, final ClassLoader loader) {
        try {
            fResourceBundle = ResourceBundle.getBundle("blanco/resourcebundle/resourcebundle/BlancoResourceBundle", locale, loader);
        } catch (MissingResourceException ex) {
            final String message = "��ꖼ[BlancoResourceBundle]�A���P�[��[" + locale.toString() + "]�A�w��̃N���X���[�_���g�p���āA���\�[�X�o���h���̎擾�����݂܂��������s���܂����B��`���̐ݒ�l�𗘗p���ď������s���܂��B:" + ex.toString();
            Logger.getLogger("blanco.resourcebundle.resourcebundle").fine(message);
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
     * bundle[BlancoResourceBundle], key[METAFILE_DISPLAYNAME]
     *
     * [���\�[�X�o���h����`��] (ja)<br>
     *
     * @return key[METAFILE_DISPLAYNAME]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getMetafileDisplayname() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "���\�[�X�o���h����`��";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("METAFILE_DISPLAYNAME");
            }
        } catch (MissingResourceException ex) {
            final String message = "��ꖼ[BlancoResourceBundle]�A�L�[[METAFILE_DISPLAYNAME]�̒�`���擾�ł��܂���ł����B��`���̒l�𗘗p���ď������s���܂��B:" + ex.toString();
            Logger.getLogger("blanco.resourcebundle.resourcebundle").fine(message);
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoResourceBundle], key[META2XML.ELEMENT_COMMON]
     *
     * [blancoresourcebundle-common] (ja)<br>
     *
     * @return key[META2XML.ELEMENT_COMMON]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getMeta2xmlElementCommon() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "blancoresourcebundle-common";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("META2XML.ELEMENT_COMMON");
            }
        } catch (MissingResourceException ex) {
            final String message = "��ꖼ[BlancoResourceBundle]�A�L�[[META2XML.ELEMENT_COMMON]�̒�`���擾�ł��܂���ł����B��`���̒l�𗘗p���ď������s���܂��B:" + ex.toString();
            Logger.getLogger("blanco.resourcebundle.resourcebundle").fine(message);
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoResourceBundle], key[META2XML.ELEMENT_LIST]
     *
     * [blancoresourcebundle-resourceList] (ja)<br>
     *
     * @return key[META2XML.ELEMENT_LIST]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getMeta2xmlElementList() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "blancoresourcebundle-resourceList";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("META2XML.ELEMENT_LIST");
            }
        } catch (MissingResourceException ex) {
            final String message = "��ꖼ[BlancoResourceBundle]�A�L�[[META2XML.ELEMENT_LIST]�̒�`���擾�ł��܂���ł����B��`���̒l�𗘗p���ď������s���܂��B:" + ex.toString();
            Logger.getLogger("blanco.resourcebundle.resourcebundle").fine(message);
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoResourceBundle], key[KEY_PREFIX]
     *
     * [] (ja)<br>
     *
     * @return key[KEY_PREFIX]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getKeyPrefix() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("KEY_PREFIX");
            }
        } catch (MissingResourceException ex) {
            final String message = "��ꖼ[BlancoResourceBundle]�A�L�[[KEY_PREFIX]�̒�`���擾�ł��܂���ł����B��`���̒l�𗘗p���ď������s���܂��B:" + ex.toString();
            Logger.getLogger("blanco.resourcebundle.resourcebundle").fine(message);
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoResourceBundle], key[GENERATE_BUNDLE_SOURCE]
     *
     * [true] (ja)<br>
     *
     * @return key[GENERATE_BUNDLE_SOURCE]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getGenerateBundleSource() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "true";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("GENERATE_BUNDLE_SOURCE");
            }
        } catch (MissingResourceException ex) {
            final String message = "��ꖼ[BlancoResourceBundle]�A�L�[[GENERATE_BUNDLE_SOURCE]�̒�`���擾�ł��܂���ł����B��`���̒l�𗘗p���ď������s���܂��B:" + ex.toString();
            Logger.getLogger("blanco.resourcebundle.resourcebundle").fine(message);
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoResourceBundle], key[GENERATE_CONSTANTS_SOURCE]
     *
     * [false] (ja)<br>
     *
     * @return key[GENERATE_CONSTANTS_SOURCE]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getGenerateConstantsSource() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "false";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("GENERATE_CONSTANTS_SOURCE");
            }
        } catch (MissingResourceException ex) {
            final String message = "��ꖼ[BlancoResourceBundle]�A�L�[[GENERATE_CONSTANTS_SOURCE]�̒�`���擾�ł��܂���ł����B��`���̒l�𗘗p���ď������s���܂��B:" + ex.toString();
            Logger.getLogger("blanco.resourcebundle.resourcebundle").fine(message);
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoResourceBundle], key[EXPANDRESOURCE.SRC011]
     *
     * [���\�[�X�o���h����`: [{0}]�B&lt;BR&gt;] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[EXPANDRESOURCE.SRC011]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getExpandresourceSrc011(final String arg0) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "���\�[�X�o���h����`: [{0}]�B<BR>";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("EXPANDRESOURCE.SRC011");
            }
        } catch (MissingResourceException ex) {
            final String message = "��ꖼ[BlancoResourceBundle]�A�L�[[EXPANDRESOURCE.SRC011]�̒�`���擾�ł��܂���ł����B��`���̒l�𗘗p���ď������s���܂��B:" + ex.toString();
            Logger.getLogger("blanco.resourcebundle.resourcebundle").fine(message);
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // �^����ꂽ���������ɒu���������u�������܂��B
        messageFormat.format(new Object[] {arg0}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[BlancoResourceBundle], key[EXPANDRESOURCE.SRC012]
     *
     * [���̃N���X�̓��\�[�X�o���h����`�����玩���������ꂽ���\�[�X�o���h���N���X�ł��B&lt;BR&gt;] (ja)<br>
     *
     * @return key[EXPANDRESOURCE.SRC012]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getExpandresourceSrc012() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "���̃N���X�̓��\�[�X�o���h����`�����玩���������ꂽ���\�[�X�o���h���N���X�ł��B<BR>";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("EXPANDRESOURCE.SRC012");
            }
        } catch (MissingResourceException ex) {
            final String message = "��ꖼ[BlancoResourceBundle]�A�L�[[EXPANDRESOURCE.SRC012]�̒�`���擾�ł��܂���ł����B��`���̒l�𗘗p���ď������s���܂��B:" + ex.toString();
            Logger.getLogger("blanco.resourcebundle.resourcebundle").fine(message);
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoResourceBundle], key[EXPANDRESOURCE.SRC013]
     *
     * [���m�̃��P�[��&lt;BR&gt;] (ja)<br>
     *
     * @return key[EXPANDRESOURCE.SRC013]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getExpandresourceSrc013() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "���m�̃��P�[��<BR>";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("EXPANDRESOURCE.SRC013");
            }
        } catch (MissingResourceException ex) {
            final String message = "��ꖼ[BlancoResourceBundle]�A�L�[[EXPANDRESOURCE.SRC013]�̒�`���擾�ł��܂���ł����B��`���̒l�𗘗p���ď������s���܂��B:" + ex.toString();
            Logger.getLogger("blanco.resourcebundle.resourcebundle").fine(message);
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoResourceBundle], key[EXPANDRESOURCE.SRC014]
     *
     * [���\�[�X�o���h���I�u�W�F�N�g�B] (ja)<br>
     *
     * @return key[EXPANDRESOURCE.SRC014]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getExpandresourceSrc014() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "���\�[�X�o���h���I�u�W�F�N�g�B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("EXPANDRESOURCE.SRC014");
            }
        } catch (MissingResourceException ex) {
            final String message = "��ꖼ[BlancoResourceBundle]�A�L�[[EXPANDRESOURCE.SRC014]�̒�`���擾�ł��܂���ł����B��`���̒l�𗘗p���ď������s���܂��B:" + ex.toString();
            Logger.getLogger("blanco.resourcebundle.resourcebundle").fine(message);
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoResourceBundle], key[EXPANDRESOURCE.SRC015]
     *
     * [�����I�Ɏ��ۂɓ��͂��s�����\�[�X�o���h�����L�����܂��B] (ja)<br>
     *
     * @return key[EXPANDRESOURCE.SRC015]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getExpandresourceSrc015() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "�����I�Ɏ��ۂɓ��͂��s�����\�[�X�o���h�����L�����܂��B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("EXPANDRESOURCE.SRC015");
            }
        } catch (MissingResourceException ex) {
            final String message = "��ꖼ[BlancoResourceBundle]�A�L�[[EXPANDRESOURCE.SRC015]�̒�`���擾�ł��܂���ł����B��`���̒l�𗘗p���ď������s���܂��B:" + ex.toString();
            Logger.getLogger("blanco.resourcebundle.resourcebundle").fine(message);
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoResourceBundle], key[EXPANDRESOURCE.SRC021]
     *
     * [{0}�N���X�̃R���X�g���N�^�B] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[EXPANDRESOURCE.SRC021]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getExpandresourceSrc021(final String arg0) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "{0}�N���X�̃R���X�g���N�^�B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("EXPANDRESOURCE.SRC021");
            }
        } catch (MissingResourceException ex) {
            final String message = "��ꖼ[BlancoResourceBundle]�A�L�[[EXPANDRESOURCE.SRC021]�̒�`���擾�ł��܂���ł����B��`���̒l�𗘗p���ď������s���܂��B:" + ex.toString();
            Logger.getLogger("blanco.resourcebundle.resourcebundle").fine(message);
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // �^����ꂽ���������ɒu���������u�������܂��B
        messageFormat.format(new Object[] {arg0}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[BlancoResourceBundle], key[EXPANDRESOURCE.SRC022]
     *
     * [��ꖼ[{0}]�A�f�t�H���g�̃��P�[���A�Ăяo�����̃N���X���[�_���g�p���āA���\�[�X�o���h�����擾���܂��B] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[EXPANDRESOURCE.SRC022]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getExpandresourceSrc022(final String arg0) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "��ꖼ[{0}]�A�f�t�H���g�̃��P�[���A�Ăяo�����̃N���X���[�_���g�p���āA���\�[�X�o���h�����擾���܂��B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("EXPANDRESOURCE.SRC022");
            }
        } catch (MissingResourceException ex) {
            final String message = "��ꖼ[BlancoResourceBundle]�A�L�[[EXPANDRESOURCE.SRC022]�̒�`���擾�ł��܂���ł����B��`���̒l�𗘗p���ď������s���܂��B:" + ex.toString();
            Logger.getLogger("blanco.resourcebundle.resourcebundle").fine(message);
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // �^����ꂽ���������ɒu���������u�������܂��B
        messageFormat.format(new Object[] {arg0}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[BlancoResourceBundle], key[EXPANDRESOURCE.SRC023]
     *
     * [��ꖼ[{0}]�A�f�t�H���g�̃��P�[���A�Ăяo�����̃N���X���[�_���g�p���āA���\�[�X�o���h���̎擾�����݂܂��������s���܂����B��`���̐ݒ�l�𗘗p���ď������s���܂��B:] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[EXPANDRESOURCE.SRC023]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getExpandresourceSrc023(final String arg0) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "��ꖼ[{0}]�A�f�t�H���g�̃��P�[���A�Ăяo�����̃N���X���[�_���g�p���āA���\�[�X�o���h���̎擾�����݂܂��������s���܂����B��`���̐ݒ�l�𗘗p���ď������s���܂��B:";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("EXPANDRESOURCE.SRC023");
            }
        } catch (MissingResourceException ex) {
            final String message = "��ꖼ[BlancoResourceBundle]�A�L�[[EXPANDRESOURCE.SRC023]�̒�`���擾�ł��܂���ł����B��`���̒l�𗘗p���ď������s���܂��B:" + ex.toString();
            Logger.getLogger("blanco.resourcebundle.resourcebundle").fine(message);
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // �^����ꂽ���������ɒu���������u�������܂��B
        messageFormat.format(new Object[] {arg0}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[BlancoResourceBundle], key[EXPANDRESOURCE.SRC031]
     *
     * [{0}�N���X�̃R���X�g���N�^�B] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[EXPANDRESOURCE.SRC031]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getExpandresourceSrc031(final String arg0) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "{0}�N���X�̃R���X�g���N�^�B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("EXPANDRESOURCE.SRC031");
            }
        } catch (MissingResourceException ex) {
            final String message = "��ꖼ[BlancoResourceBundle]�A�L�[[EXPANDRESOURCE.SRC031]�̒�`���擾�ł��܂���ł����B��`���̒l�𗘗p���ď������s���܂��B:" + ex.toString();
            Logger.getLogger("blanco.resourcebundle.resourcebundle").fine(message);
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // �^����ꂽ���������ɒu���������u�������܂��B
        messageFormat.format(new Object[] {arg0}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[BlancoResourceBundle], key[EXPANDRESOURCE.SRC032]
     *
     * [��ꖼ[{0}]�A�w�肳�ꂽ���P�[���A�Ăяo�����̃N���X���[�_���g�p���āA���\�[�X�o���h�����擾���܂��B] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[EXPANDRESOURCE.SRC032]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getExpandresourceSrc032(final String arg0) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "��ꖼ[{0}]�A�w�肳�ꂽ���P�[���A�Ăяo�����̃N���X���[�_���g�p���āA���\�[�X�o���h�����擾���܂��B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("EXPANDRESOURCE.SRC032");
            }
        } catch (MissingResourceException ex) {
            final String message = "��ꖼ[BlancoResourceBundle]�A�L�[[EXPANDRESOURCE.SRC032]�̒�`���擾�ł��܂���ł����B��`���̒l�𗘗p���ď������s���܂��B:" + ex.toString();
            Logger.getLogger("blanco.resourcebundle.resourcebundle").fine(message);
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // �^����ꂽ���������ɒu���������u�������܂��B
        messageFormat.format(new Object[] {arg0}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[BlancoResourceBundle], key[EXPANDRESOURCE.SRC033]
     *
     * [���P�[���̎w��] (ja)<br>
     *
     * @return key[EXPANDRESOURCE.SRC033]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getExpandresourceSrc033() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "���P�[���̎w��";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("EXPANDRESOURCE.SRC033");
            }
        } catch (MissingResourceException ex) {
            final String message = "��ꖼ[BlancoResourceBundle]�A�L�[[EXPANDRESOURCE.SRC033]�̒�`���擾�ł��܂���ł����B��`���̒l�𗘗p���ď������s���܂��B:" + ex.toString();
            Logger.getLogger("blanco.resourcebundle.resourcebundle").fine(message);
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoResourceBundle], key[EXPANDRESOURCE.SRC034]
     *
     * [��ꖼ[{0}]�A���P�[��[&quot; + locale.toString() + &quot;]�A�Ăяo�����̃N���X���[�_���g�p���āA���\�[�X�o���h���̎擾�����݂܂��������s���܂����B��`���̐ݒ�l�𗘗p���ď������s���܂��B:] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[EXPANDRESOURCE.SRC034]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getExpandresourceSrc034(final String arg0) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "��ꖼ[{0}]�A���P�[��[\" + locale.toString() + \"]�A�Ăяo�����̃N���X���[�_���g�p���āA���\�[�X�o���h���̎擾�����݂܂��������s���܂����B��`���̐ݒ�l�𗘗p���ď������s���܂��B:";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("EXPANDRESOURCE.SRC034");
            }
        } catch (MissingResourceException ex) {
            final String message = "��ꖼ[BlancoResourceBundle]�A�L�[[EXPANDRESOURCE.SRC034]�̒�`���擾�ł��܂���ł����B��`���̒l�𗘗p���ď������s���܂��B:" + ex.toString();
            Logger.getLogger("blanco.resourcebundle.resourcebundle").fine(message);
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // �^����ꂽ���������ɒu���������u�������܂��B
        messageFormat.format(new Object[] {arg0}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[BlancoResourceBundle], key[EXPANDRESOURCE.SRC041]
     *
     * [{0}�N���X�̃R���X�g���N�^�B] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[EXPANDRESOURCE.SRC041]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getExpandresourceSrc041(final String arg0) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "{0}�N���X�̃R���X�g���N�^�B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("EXPANDRESOURCE.SRC041");
            }
        } catch (MissingResourceException ex) {
            final String message = "��ꖼ[BlancoResourceBundle]�A�L�[[EXPANDRESOURCE.SRC041]�̒�`���擾�ł��܂���ł����B��`���̒l�𗘗p���ď������s���܂��B:" + ex.toString();
            Logger.getLogger("blanco.resourcebundle.resourcebundle").fine(message);
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // �^����ꂽ���������ɒu���������u�������܂��B
        messageFormat.format(new Object[] {arg0}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[BlancoResourceBundle], key[EXPANDRESOURCE.SRC042]
     *
     * [��ꖼ[{0}]�A�w�肳�ꂽ���P�[���A�w�肳�ꂽ�N���X���[�_���g�p���āA���\�[�X�o���h�����擾���܂��B] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[EXPANDRESOURCE.SRC042]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getExpandresourceSrc042(final String arg0) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "��ꖼ[{0}]�A�w�肳�ꂽ���P�[���A�w�肳�ꂽ�N���X���[�_���g�p���āA���\�[�X�o���h�����擾���܂��B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("EXPANDRESOURCE.SRC042");
            }
        } catch (MissingResourceException ex) {
            final String message = "��ꖼ[BlancoResourceBundle]�A�L�[[EXPANDRESOURCE.SRC042]�̒�`���擾�ł��܂���ł����B��`���̒l�𗘗p���ď������s���܂��B:" + ex.toString();
            Logger.getLogger("blanco.resourcebundle.resourcebundle").fine(message);
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // �^����ꂽ���������ɒu���������u�������܂��B
        messageFormat.format(new Object[] {arg0}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[BlancoResourceBundle], key[EXPANDRESOURCE.SRC043]
     *
     * [���P�[���̎w��] (ja)<br>
     *
     * @return key[EXPANDRESOURCE.SRC043]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getExpandresourceSrc043() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "���P�[���̎w��";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("EXPANDRESOURCE.SRC043");
            }
        } catch (MissingResourceException ex) {
            final String message = "��ꖼ[BlancoResourceBundle]�A�L�[[EXPANDRESOURCE.SRC043]�̒�`���擾�ł��܂���ł����B��`���̒l�𗘗p���ď������s���܂��B:" + ex.toString();
            Logger.getLogger("blanco.resourcebundle.resourcebundle").fine(message);
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoResourceBundle], key[EXPANDRESOURCE.SRC044]
     *
     * [�N���X���[�_�̎w��] (ja)<br>
     *
     * @return key[EXPANDRESOURCE.SRC044]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getExpandresourceSrc044() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "�N���X���[�_�̎w��";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("EXPANDRESOURCE.SRC044");
            }
        } catch (MissingResourceException ex) {
            final String message = "��ꖼ[BlancoResourceBundle]�A�L�[[EXPANDRESOURCE.SRC044]�̒�`���擾�ł��܂���ł����B��`���̒l�𗘗p���ď������s���܂��B:" + ex.toString();
            Logger.getLogger("blanco.resourcebundle.resourcebundle").fine(message);
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoResourceBundle], key[EXPANDRESOURCE.SRC045]
     *
     * [��ꖼ[{0}]�A���P�[��[&quot; + locale.toString() + &quot;]�A�w��̃N���X���[�_���g�p���āA���\�[�X�o���h���̎擾�����݂܂��������s���܂����B��`���̐ݒ�l�𗘗p���ď������s���܂��B:] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[EXPANDRESOURCE.SRC045]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getExpandresourceSrc045(final String arg0) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "��ꖼ[{0}]�A���P�[��[\" + locale.toString() + \"]�A�w��̃N���X���[�_���g�p���āA���\�[�X�o���h���̎擾�����݂܂��������s���܂����B��`���̐ݒ�l�𗘗p���ď������s���܂��B:";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("EXPANDRESOURCE.SRC045");
            }
        } catch (MissingResourceException ex) {
            final String message = "��ꖼ[BlancoResourceBundle]�A�L�[[EXPANDRESOURCE.SRC045]�̒�`���擾�ł��܂���ł����B��`���̒l�𗘗p���ď������s���܂��B:" + ex.toString();
            Logger.getLogger("blanco.resourcebundle.resourcebundle").fine(message);
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // �^����ꂽ���������ɒu���������u�������܂��B
        messageFormat.format(new Object[] {arg0}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[BlancoResourceBundle], key[EXPANDRESOURCE.SRC051]
     *
     * [�w��Ȃ�] (ja)<br>
     *
     * @return key[EXPANDRESOURCE.SRC051]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getExpandresourceSrc051() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "�w��Ȃ�";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("EXPANDRESOURCE.SRC051");
            }
        } catch (MissingResourceException ex) {
            final String message = "��ꖼ[BlancoResourceBundle]�A�L�[[EXPANDRESOURCE.SRC051]�̒�`���擾�ł��܂���ł����B��`���̒l�𗘗p���ď������s���܂��B:" + ex.toString();
            Logger.getLogger("blanco.resourcebundle.resourcebundle").fine(message);
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoResourceBundle], key[EXPANDRESOURCE.SRC101]
     *
     * [�u��������'{'{0,number}'}'��u������l�B{1}�^��^���Ă��������B] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.math.BigDecimal�^��^���Ă��������B
     * @param arg1 �u��������{1}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[EXPANDRESOURCE.SRC101]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getExpandresourceSrc101(final BigDecimal arg0, final String arg1) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "�u��������'{'{0,number}'}'��u������l�B{1}�^��^���Ă��������B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("EXPANDRESOURCE.SRC101");
            }
        } catch (MissingResourceException ex) {
            final String message = "��ꖼ[BlancoResourceBundle]�A�L�[[EXPANDRESOURCE.SRC101]�̒�`���擾�ł��܂���ł����B��`���̒l�𗘗p���ď������s���܂��B:" + ex.toString();
            Logger.getLogger("blanco.resourcebundle.resourcebundle").fine(message);
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // �^����ꂽ���������ɒu���������u�������܂��B
        messageFormat.format(new Object[] {arg0, arg1}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[BlancoResourceBundle], key[EXPANDRESOURCE.SRC102]
     *
     * [key[{0}]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[EXPANDRESOURCE.SRC102]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getExpandresourceSrc102(final String arg0) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "key[{0}]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("EXPANDRESOURCE.SRC102");
            }
        } catch (MissingResourceException ex) {
            final String message = "��ꖼ[BlancoResourceBundle]�A�L�[[EXPANDRESOURCE.SRC102]�̒�`���擾�ł��܂���ł����B��`���̒l�𗘗p���ď������s���܂��B:" + ex.toString();
            Logger.getLogger("blanco.resourcebundle.resourcebundle").fine(message);
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // �^����ꂽ���������ɒu���������u�������܂��B
        messageFormat.format(new Object[] {arg0}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[BlancoResourceBundle], key[EXPANDRESOURCE.SRC103]
     *
     * [TODO: ����: ���P�[��({0})�͐ݒ肳��Ă��܂���B] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[EXPANDRESOURCE.SRC103]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getExpandresourceSrc103(final String arg0) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "TODO: ����: ���P�[��({0})�͐ݒ肳��Ă��܂���B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("EXPANDRESOURCE.SRC103");
            }
        } catch (MissingResourceException ex) {
            final String message = "��ꖼ[BlancoResourceBundle]�A�L�[[EXPANDRESOURCE.SRC103]�̒�`���擾�ł��܂���ł����B��`���̒l�𗘗p���ď������s���܂��B:" + ex.toString();
            Logger.getLogger("blanco.resourcebundle.resourcebundle").fine(message);
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // �^����ꂽ���������ɒu���������u�������܂��B
        messageFormat.format(new Object[] {arg0}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[BlancoResourceBundle], key[EXPANDRESOURCE.SRC104]
     *
     * [�����l�Ƃ��Ē�`���̒l�𗘗p���܂��B] (ja)<br>
     *
     * @return key[EXPANDRESOURCE.SRC104]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getExpandresourceSrc104() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "�����l�Ƃ��Ē�`���̒l�𗘗p���܂��B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("EXPANDRESOURCE.SRC104");
            }
        } catch (MissingResourceException ex) {
            final String message = "��ꖼ[BlancoResourceBundle]�A�L�[[EXPANDRESOURCE.SRC104]�̒�`���擾�ł��܂���ł����B��`���̒l�𗘗p���ď������s���܂��B:" + ex.toString();
            Logger.getLogger("blanco.resourcebundle.resourcebundle").fine(message);
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoResourceBundle], key[EXPANDRESOURCE.SRC105]
     *
     * [��ꖼ[{0}]�A�L�[[{1}]�̒�`���擾�ł��܂���ł����B��`���̒l�𗘗p���ď������s���܂��B:] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg1 �u��������{1}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[EXPANDRESOURCE.SRC105]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getExpandresourceSrc105(final String arg0, final String arg1) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "��ꖼ[{0}]�A�L�[[{1}]�̒�`���擾�ł��܂���ł����B��`���̒l�𗘗p���ď������s���܂��B:";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("EXPANDRESOURCE.SRC105");
            }
        } catch (MissingResourceException ex) {
            final String message = "��ꖼ[BlancoResourceBundle]�A�L�[[EXPANDRESOURCE.SRC105]�̒�`���擾�ł��܂���ł����B��`���̒l�𗘗p���ď������s���܂��B:" + ex.toString();
            Logger.getLogger("blanco.resourcebundle.resourcebundle").fine(message);
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // �^����ꂽ���������ɒu���������u�������܂��B
        messageFormat.format(new Object[] {arg0, arg1}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[BlancoResourceBundle], key[EXPANDRESOURCE.SRC106]
     *
     * [�^����ꂽ���������ɒu���������u�������܂��B] (ja)<br>
     *
     * @return key[EXPANDRESOURCE.SRC106]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getExpandresourceSrc106() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "�^����ꂽ���������ɒu���������u�������܂��B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("EXPANDRESOURCE.SRC106");
            }
        } catch (MissingResourceException ex) {
            final String message = "��ꖼ[BlancoResourceBundle]�A�L�[[EXPANDRESOURCE.SRC106]�̒�`���擾�ł��܂���ł����B��`���̒l�𗘗p���ď������s���܂��B:" + ex.toString();
            Logger.getLogger("blanco.resourcebundle.resourcebundle").fine(message);
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoResourceBundle], key[EXPANDRESOURCE.SRC107]
     *
     * [�u��������͂ЂƂ�����܂���B] (ja)<br>
     *
     * @return key[EXPANDRESOURCE.SRC107]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getExpandresourceSrc107() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "�u��������͂ЂƂ�����܂���B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("EXPANDRESOURCE.SRC107");
            }
        } catch (MissingResourceException ex) {
            final String message = "��ꖼ[BlancoResourceBundle]�A�L�[[EXPANDRESOURCE.SRC107]�̒�`���擾�ł��܂���ł����B��`���̒l�𗘗p���ď������s���܂��B:" + ex.toString();
            Logger.getLogger("blanco.resourcebundle.resourcebundle").fine(message);
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }
}
