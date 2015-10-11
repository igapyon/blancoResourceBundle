/*
 * blanco Framework
 * Copyright (C) 2004-2009 IGA Tosiki
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 */
package blanco.resourcebundle.valueobject;

/**
 * ���\�[�X�o���h���̃��P�[���{�����������킷�\���̃N���X�B
 */
public class BlancoResourceBundleBundleResourceStringStructure {
    /**
     * ���P�[���B
     *
     * �t�B�[���h: [locale]�B
     */
    private String fLocale;

    /**
     * ���\�[�X������B
     *
     * �t�B�[���h: [resourceString]�B
     */
    private String fResourceString;

    /**
     * �t�B�[���h [locale] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [���P�[���B]�B
     *
     * @param argLocale �t�B�[���h[locale]�ɐݒ肷��l�B
     */
    public void setLocale(final String argLocale) {
        fLocale = argLocale;
    }

    /**
     * �t�B�[���h [locale] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [���P�[���B]�B
     *
     * @return �t�B�[���h[locale]����擾�����l�B
     */
    public String getLocale() {
        return fLocale;
    }

    /**
     * �t�B�[���h [resourceString] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [���\�[�X������B]�B
     *
     * @param argResourceString �t�B�[���h[resourceString]�ɐݒ肷��l�B
     */
    public void setResourceString(final String argResourceString) {
        fResourceString = argResourceString;
    }

    /**
     * �t�B�[���h [resourceString] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [���\�[�X������B]�B
     *
     * @return �t�B�[���h[resourceString]����擾�����l�B
     */
    public String getResourceString() {
        return fResourceString;
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
        buf.append("blanco.resourcebundle.valueobject.BlancoResourceBundleBundleResourceStringStructure[");
        buf.append("locale=" + fLocale);
        buf.append(",resourceString=" + fResourceString);
        buf.append("]");
        return buf.toString();
    }
}
