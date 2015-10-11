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
 * ���� [BlancoResourceBundleProcess]�C���^�t�F�[�X�B
 *
 * ���̃C���^�t�F�[�X���p������ [blanco.resourcebundle.task]�p�b�P�[�W��[BlancoResourceBundleProcess]�N���X���쐬���Ď��ۂ̃o�b�`�������������Ă��������B<br>
 */
interface BlancoResourceBundleProcess {
    /**
     * �N���X���C���X�^���X�����ď��������s����ۂ̃G���g���|�C���g�ł��B
     *
     * @param input �����̓��̓p�����[�^�B
     * @return �����̎��s���ʁB
     * @throws IOException ���o�͗�O�����������ꍇ�B
     * @throws IllegalArgumentException ���͒l�ɕs�������������ꍇ�B
     */
    int execute(final BlancoResourceBundleProcessInput input) throws IOException, IllegalArgumentException;

    /**
     * �����̒��ŃA�C�e������������邽�тɐi���񍐂Ƃ��ăR�[���o�b�N���܂��B
     *
     * @param argProgressMessage ���ݏ������Ă���A�C�e���Ɋւ��郁�b�Z�[�W�B
     * @return ���������̂܂܌p������ꍇ�� false�B�������f�����N�G�X�g�������ꍇ�� true�B
     */
    boolean progress(final String argProgressMessage);
}
