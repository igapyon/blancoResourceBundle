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

import java.util.List;

/**
 * ���\�[�X�o���h���̃L�[�{�l������킷�\���̃N���X�B�L�[�l�ƕ�������܂݂܂��B
 */
public class BlancoResourceBundleBundleItemStructure {
    /**
     * ���ڔԍ��B
     *
     * �t�B�[���h: [no]�B
     */
    private String fNo;

    /**
     * ���\�[�X�o���h����̃L�[�l�B
     *
     * �t�B�[���h: [key]�B
     */
    private String fKey;

    /**
     * ���\�[�X������̃��X�g�BBlancoResourceBundleBundleResourceStringStructure�N���X�̃C���X�^���X�����X�g�Ŋi�[����܂��B��Combine�̏ꍇ�ɂ́AMAX�P�����܂܂�܂��BCombine�̏ꍇ�ɂ́A���P�[�����ƂɂP���B
     *
     * �t�B�[���h: [resourceStringList]�B
     * �f�t�H���g: [new java.util.ArrayList<blanco.resourcebundle.valueobject.BlancoResourceBundleBundleResourceStringStructure>()]�B
     */
    private List<blanco.resourcebundle.valueobject.BlancoResourceBundleBundleResourceStringStructure> fResourceStringList = new java.util.ArrayList<blanco.resourcebundle.valueobject.BlancoResourceBundleBundleResourceStringStructure>();

    /**
     * �t�B�[���h [no] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [���ڔԍ��B]�B
     *
     * @param argNo �t�B�[���h[no]�ɐݒ肷��l�B
     */
    public void setNo(final String argNo) {
        fNo = argNo;
    }

    /**
     * �t�B�[���h [no] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [���ڔԍ��B]�B
     *
     * @return �t�B�[���h[no]����擾�����l�B
     */
    public String getNo() {
        return fNo;
    }

    /**
     * �t�B�[���h [key] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [���\�[�X�o���h����̃L�[�l�B]�B
     *
     * @param argKey �t�B�[���h[key]�ɐݒ肷��l�B
     */
    public void setKey(final String argKey) {
        fKey = argKey;
    }

    /**
     * �t�B�[���h [key] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [���\�[�X�o���h����̃L�[�l�B]�B
     *
     * @return �t�B�[���h[key]����擾�����l�B
     */
    public String getKey() {
        return fKey;
    }

    /**
     * �t�B�[���h [resourceStringList] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [���\�[�X������̃��X�g�BBlancoResourceBundleBundleResourceStringStructure�N���X�̃C���X�^���X�����X�g�Ŋi�[����܂��B��Combine�̏ꍇ�ɂ́AMAX�P�����܂܂�܂��BCombine�̏ꍇ�ɂ́A���P�[�����ƂɂP���B]�B
     *
     * @param argResourceStringList �t�B�[���h[resourceStringList]�ɐݒ肷��l�B
     */
    public void setResourceStringList(final List<blanco.resourcebundle.valueobject.BlancoResourceBundleBundleResourceStringStructure> argResourceStringList) {
        fResourceStringList = argResourceStringList;
    }

    /**
     * �t�B�[���h [resourceStringList] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [���\�[�X������̃��X�g�BBlancoResourceBundleBundleResourceStringStructure�N���X�̃C���X�^���X�����X�g�Ŋi�[����܂��B��Combine�̏ꍇ�ɂ́AMAX�P�����܂܂�܂��BCombine�̏ꍇ�ɂ́A���P�[�����ƂɂP���B]�B
     * �f�t�H���g: [new java.util.ArrayList<blanco.resourcebundle.valueobject.BlancoResourceBundleBundleResourceStringStructure>()]�B
     *
     * @return �t�B�[���h[resourceStringList]����擾�����l�B
     */
    public List<blanco.resourcebundle.valueobject.BlancoResourceBundleBundleResourceStringStructure> getResourceStringList() {
        return fResourceStringList;
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
        buf.append("blanco.resourcebundle.valueobject.BlancoResourceBundleBundleItemStructure[");
        buf.append("no=" + fNo);
        buf.append(",key=" + fKey);
        buf.append(",resourceStringList=" + fResourceStringList);
        buf.append("]");
        return buf.toString();
    }
}
