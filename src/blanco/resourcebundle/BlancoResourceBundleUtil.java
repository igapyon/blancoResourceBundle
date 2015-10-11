/*
 * blanco Framework
 * Copyright (C) 2004-2007 IGA Tosiki
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 */
package blanco.resourcebundle;

import java.text.Format;
import java.text.MessageFormat;

public class BlancoResourceBundleUtil {
    /**
     * MessageFormat����t�H�[�}�b�g�����擾���܂��B
     * 
     * ���̃��\�b�h�� blancoResourceBundle�ȊO�� blancoMessage���痘�p����Ă��܂��B
     * 
     * @param argResourceString
     *            ���\�[�X������
     * @param argIsFailOnMessageFormatError
     *            MessageFormat�Ƃ��ăp�[�X�����ꍇ�ɃG���[�Ƃ��Ĉ������ǂ����B
     * @return ��͌�̃t�H�[�}�b�g�z��B
     */
    public static final Format[] getFormatsByArgumentIndex(
            final String argResourceString,
            final boolean argIsFailOnMessageFormatError) {
        try {
            final MessageFormat messageFormat = new MessageFormat(
                    argResourceString);
            return messageFormat.getFormatsByArgumentIndex();

        } catch (IllegalArgumentException ex) {
            if (argIsFailOnMessageFormatError) {
                throw ex;
            }

            // �G���[�𖳎����āA�������Ȃ��������̂��Ƃ��U�����܂��B
            return new Format[0];
        }
    }
}
