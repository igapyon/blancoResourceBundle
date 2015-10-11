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
 * ���\�[�X�o���h��������킷�\���̃N���X�B��ꖼ��p�b�P�[�W�ȂǊ�{��񂪊܂܂�܂��B
 */
public class BlancoResourceBundleBundleStructure {
    /**
     * ���\�[�X�o���h���̊�ꖼ�B
     *
     * �t�B�[���h: [name]�B
     */
    private String fName;

    /**
     * ���̃��\�[�X�o���h�����Ή����郍�P�[���̈ꗗ�B(Combine��̏ꍇ�ɂ̂ݗL��)
     *
     * �t�B�[���h: [listLocale]�B
     * �f�t�H���g: [new java.util.ArrayList<java.lang.String>()]�B
     */
    private List<java.lang.String> fListLocale = new java.util.ArrayList<java.lang.String>();

    /**
     * �p�b�P�[�W���B
     *
     * �t�B�[���h: [package]�B
     */
    private String fPackage;

    /**
     * �N���X�ɕt�^�����T�t�B�b�N�X�B
     *
     * �t�B�[���h: [suffix]�B
     */
    private String fSuffix;

    /**
     * ���̃��\�[�X�o���h���ɑ΂�������B
     *
     * �t�B�[���h: [description]�B
     */
    private String fDescription;

    /**
     * ���̃N���X�̃A�N�Z�X�B��{�I�ɂ� public �ŗ��p���܂��B
     *
     * �t�B�[���h: [access]�B
     * �f�t�H���g: ["public"]�B
     */
    private String fAccess = "public";

    /**
     * �e�L�[�{�l�̏��B
     *
     * �t�B�[���h: [itemList]�B
     * �f�t�H���g: [new java.util.ArrayList<blanco.resourcebundle.valueobject.BlancoResourceBundleBundleItemStructure>()]�B
     */
    private List<blanco.resourcebundle.valueobject.BlancoResourceBundleBundleItemStructure> fItemList = new java.util.ArrayList<blanco.resourcebundle.valueobject.BlancoResourceBundleBundleItemStructure>();

    /**
     * ���[�N�ɗ��p�����t�B�[���h�B
     *
     * �t�B�[���h: [resourceItem]�B
     */
    private BlancoResourceBundleBundleItemStructure fResourceItem;

    /**
     * ���ݏ������Ă��郍�P�[�����L�����܂��B
     *
     * �t�B�[���h: [currentLocale]�B
     */
    private String fCurrentLocale;

    /**
     * ���ݏ������Ă��郊�\�[�X��������L�����܂��B
     *
     * �t�B�[���h: [currentResourceString]�B
     */
    private String fCurrentResourceString;

    /**
     * �t�B�[���h [name] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [���\�[�X�o���h���̊�ꖼ�B]�B
     *
     * @param argName �t�B�[���h[name]�ɐݒ肷��l�B
     */
    public void setName(final String argName) {
        fName = argName;
    }

    /**
     * �t�B�[���h [name] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [���\�[�X�o���h���̊�ꖼ�B]�B
     *
     * @return �t�B�[���h[name]����擾�����l�B
     */
    public String getName() {
        return fName;
    }

    /**
     * �t�B�[���h [listLocale] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [���̃��\�[�X�o���h�����Ή����郍�P�[���̈ꗗ�B(Combine��̏ꍇ�ɂ̂ݗL��)]�B
     *
     * @param argListLocale �t�B�[���h[listLocale]�ɐݒ肷��l�B
     */
    public void setListLocale(final List<java.lang.String> argListLocale) {
        fListLocale = argListLocale;
    }

    /**
     * �t�B�[���h [listLocale] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [���̃��\�[�X�o���h�����Ή����郍�P�[���̈ꗗ�B(Combine��̏ꍇ�ɂ̂ݗL��)]�B
     * �f�t�H���g: [new java.util.ArrayList<java.lang.String>()]�B
     *
     * @return �t�B�[���h[listLocale]����擾�����l�B
     */
    public List<java.lang.String> getListLocale() {
        return fListLocale;
    }

    /**
     * �t�B�[���h [package] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [�p�b�P�[�W���B]�B
     *
     * @param argPackage �t�B�[���h[package]�ɐݒ肷��l�B
     */
    public void setPackage(final String argPackage) {
        fPackage = argPackage;
    }

    /**
     * �t�B�[���h [package] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [�p�b�P�[�W���B]�B
     *
     * @return �t�B�[���h[package]����擾�����l�B
     */
    public String getPackage() {
        return fPackage;
    }

    /**
     * �t�B�[���h [suffix] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [�N���X�ɕt�^�����T�t�B�b�N�X�B]�B
     *
     * @param argSuffix �t�B�[���h[suffix]�ɐݒ肷��l�B
     */
    public void setSuffix(final String argSuffix) {
        fSuffix = argSuffix;
    }

    /**
     * �t�B�[���h [suffix] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [�N���X�ɕt�^�����T�t�B�b�N�X�B]�B
     *
     * @return �t�B�[���h[suffix]����擾�����l�B
     */
    public String getSuffix() {
        return fSuffix;
    }

    /**
     * �t�B�[���h [description] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [���̃��\�[�X�o���h���ɑ΂�������B]�B
     *
     * @param argDescription �t�B�[���h[description]�ɐݒ肷��l�B
     */
    public void setDescription(final String argDescription) {
        fDescription = argDescription;
    }

    /**
     * �t�B�[���h [description] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [���̃��\�[�X�o���h���ɑ΂�������B]�B
     *
     * @return �t�B�[���h[description]����擾�����l�B
     */
    public String getDescription() {
        return fDescription;
    }

    /**
     * �t�B�[���h [access] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [���̃N���X�̃A�N�Z�X�B��{�I�ɂ� public �ŗ��p���܂��B]�B
     *
     * @param argAccess �t�B�[���h[access]�ɐݒ肷��l�B
     */
    public void setAccess(final String argAccess) {
        fAccess = argAccess;
    }

    /**
     * �t�B�[���h [access] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [���̃N���X�̃A�N�Z�X�B��{�I�ɂ� public �ŗ��p���܂��B]�B
     * �f�t�H���g: ["public"]�B
     *
     * @return �t�B�[���h[access]����擾�����l�B
     */
    public String getAccess() {
        return fAccess;
    }

    /**
     * �t�B�[���h [itemList] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [�e�L�[�{�l�̏��B]�B
     *
     * @param argItemList �t�B�[���h[itemList]�ɐݒ肷��l�B
     */
    public void setItemList(final List<blanco.resourcebundle.valueobject.BlancoResourceBundleBundleItemStructure> argItemList) {
        fItemList = argItemList;
    }

    /**
     * �t�B�[���h [itemList] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [�e�L�[�{�l�̏��B]�B
     * �f�t�H���g: [new java.util.ArrayList<blanco.resourcebundle.valueobject.BlancoResourceBundleBundleItemStructure>()]�B
     *
     * @return �t�B�[���h[itemList]����擾�����l�B
     */
    public List<blanco.resourcebundle.valueobject.BlancoResourceBundleBundleItemStructure> getItemList() {
        return fItemList;
    }

    /**
     * �t�B�[���h [resourceItem] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [���[�N�ɗ��p�����t�B�[���h�B]�B
     *
     * @param argResourceItem �t�B�[���h[resourceItem]�ɐݒ肷��l�B
     */
    public void setResourceItem(final BlancoResourceBundleBundleItemStructure argResourceItem) {
        fResourceItem = argResourceItem;
    }

    /**
     * �t�B�[���h [resourceItem] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [���[�N�ɗ��p�����t�B�[���h�B]�B
     *
     * @return �t�B�[���h[resourceItem]����擾�����l�B
     */
    public BlancoResourceBundleBundleItemStructure getResourceItem() {
        return fResourceItem;
    }

    /**
     * �t�B�[���h [currentLocale] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [���ݏ������Ă��郍�P�[�����L�����܂��B]�B
     *
     * @param argCurrentLocale �t�B�[���h[currentLocale]�ɐݒ肷��l�B
     */
    public void setCurrentLocale(final String argCurrentLocale) {
        fCurrentLocale = argCurrentLocale;
    }

    /**
     * �t�B�[���h [currentLocale] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [���ݏ������Ă��郍�P�[�����L�����܂��B]�B
     *
     * @return �t�B�[���h[currentLocale]����擾�����l�B
     */
    public String getCurrentLocale() {
        return fCurrentLocale;
    }

    /**
     * �t�B�[���h [currentResourceString] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [���ݏ������Ă��郊�\�[�X��������L�����܂��B]�B
     *
     * @param argCurrentResourceString �t�B�[���h[currentResourceString]�ɐݒ肷��l�B
     */
    public void setCurrentResourceString(final String argCurrentResourceString) {
        fCurrentResourceString = argCurrentResourceString;
    }

    /**
     * �t�B�[���h [currentResourceString] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [���ݏ������Ă��郊�\�[�X��������L�����܂��B]�B
     *
     * @return �t�B�[���h[currentResourceString]����擾�����l�B
     */
    public String getCurrentResourceString() {
        return fCurrentResourceString;
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
        buf.append("blanco.resourcebundle.valueobject.BlancoResourceBundleBundleStructure[");
        buf.append("name=" + fName);
        buf.append(",listLocale=" + fListLocale);
        buf.append(",package=" + fPackage);
        buf.append(",suffix=" + fSuffix);
        buf.append(",description=" + fDescription);
        buf.append(",access=" + fAccess);
        buf.append(",itemList=" + fItemList);
        buf.append(",resourceItem=" + fResourceItem);
        buf.append(",currentLocale=" + fCurrentLocale);
        buf.append(",currentResourceString=" + fCurrentResourceString);
        buf.append("]");
        return buf.toString();
    }
}
