/*
 * ���̃\�[�X�R�[�h�� blanco Framework�ɂ���Ď�����������Ă��܂��B
 */
package blanco.resourcebundle.message;

/**
 * blancoResourceBundle�̃��b�Z�[�W�N���X�B
 */
public class BlancoResourceBundleMessage {
    /**
     * ���b�Z�[�W���v���p�e�B�t�@�C���Ή������邽�߂̓����I�ɗ��p���郊�\�[�X�o���h���N���X�B
     */
    protected final BlancoResourceBundleMessageResourceBundle fBundle = new BlancoResourceBundleMessageResourceBundle();

    /**
     * ���b�Z�[�W��`ID[BlancoResourceBundle]�A�L�[[MBRBI001]�̕�������擾���܂��B
     *
     * No.2:
     * ������[���\�[�X��`[{0}]�̃p�b�P�[�W�̎w�肪������܂���B]
     *
     * @param arg0 �u��������{0}�̒l�B
     * @return ���b�Z�[�W������B
     */
    public String getMbrbi001(final String arg0) {
        if (arg0 == null) {
            throw new IllegalArgumentException("���\�b�h[getMbrbi001]�̃p�����[�^[arg0]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B");
        }

        return "[MBRBI001] " + fBundle.getMbrbi001(arg0);
    }

    /**
     * ���b�Z�[�W��`ID[BlancoResourceBundle]�A�L�[[MBRBI002]�̕�������擾���܂��B
     *
     * No.3:
     * ������[���\�[�X��`[{0}]�ɈقȂ�p�b�P�[�W�̎w��[{1}]��[{2}]��������܂����B]
     *
     * @param arg0 �u��������{0}�̒l�B
     * @param arg1 �u��������{1}�̒l�B
     * @param arg2 �u��������{2}�̒l�B
     * @return ���b�Z�[�W������B
     */
    public String getMbrbi002(final String arg0, final String arg1, final String arg2) {
        if (arg0 == null) {
            throw new IllegalArgumentException("���\�b�h[getMbrbi002]�̃p�����[�^[arg0]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B");
        }
        if (arg1 == null) {
            throw new IllegalArgumentException("���\�b�h[getMbrbi002]�̃p�����[�^[arg1]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B");
        }
        if (arg2 == null) {
            throw new IllegalArgumentException("���\�b�h[getMbrbi002]�̃p�����[�^[arg2]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B");
        }

        return "[MBRBI002] " + fBundle.getMbrbi002(arg0, arg1, arg2);
    }

    /**
     * ���b�Z�[�W��`ID[BlancoResourceBundle]�A�L�[[MBRBI003]�̕�������擾���܂��B
     *
     * No.4:
     * ������[�قȂ�T�t�B�b�N�X[{0}]��[{1}]������̐ݒ�t�@�C����Ɍ�����܂����B]
     *
     * @param arg0 �u��������{0}�̒l�B
     * @param arg1 �u��������{1}�̒l�B
     * @return ���b�Z�[�W������B
     */
    public String getMbrbi003(final String arg0, final String arg1) {
        if (arg0 == null) {
            throw new IllegalArgumentException("���\�b�h[getMbrbi003]�̃p�����[�^[arg0]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B");
        }
        if (arg1 == null) {
            throw new IllegalArgumentException("���\�b�h[getMbrbi003]�̃p�����[�^[arg1]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B");
        }

        return "[MBRBI003] " + fBundle.getMbrbi003(arg0, arg1);
    }

    /**
     * ���b�Z�[�W��`ID[BlancoResourceBundle]�A�L�[[MBRBI004]�̕�������擾���܂��B
     *
     * No.5:
     * ������[���\�[�X��`[{0}]�̃��P�[���̎w�肪������܂���B]
     *
     * @param arg0 �u��������{0}�̒l�B
     * @return ���b�Z�[�W������B
     */
    public String getMbrbi004(final String arg0) {
        if (arg0 == null) {
            throw new IllegalArgumentException("���\�b�h[getMbrbi004]�̃p�����[�^[arg0]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B");
        }

        return "[MBRBI004] " + fBundle.getMbrbi004(arg0);
    }

    /**
     * ���b�Z�[�W��`ID[BlancoResourceBundle]�A�L�[[MBRBI005]�̕�������擾���܂��B
     *
     * No.6:
     * ������[��ꖼ[{0}] �͊��Ƀ��P�[��[{1}]�ŏ�������Ă��܂��B]
     *
     * @param arg0 �u��������{0}�̒l�B
     * @param arg1 �u��������{1}�̒l�B
     * @return ���b�Z�[�W������B
     */
    public String getMbrbi005(final String arg0, final String arg1) {
        if (arg0 == null) {
            throw new IllegalArgumentException("���\�b�h[getMbrbi005]�̃p�����[�^[arg0]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B");
        }
        if (arg1 == null) {
            throw new IllegalArgumentException("���\�b�h[getMbrbi005]�̃p�����[�^[arg1]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B");
        }

        return "[MBRBI005] " + fBundle.getMbrbi005(arg0, arg1);
    }

    /**
     * ���b�Z�[�W��`ID[BlancoResourceBundle]�A�L�[[MBRBI006]�̕�������擾���܂��B
     *
     * No.7:
     * ������[���\�[�X�o���h����`[{0}]�̃��P�[��[{1}]���d�����Ē�`����Ă��܂��B]
     *
     * @param arg0 �u��������{0}�̒l�B
     * @param arg1 �u��������{1}�̒l�B
     * @return ���b�Z�[�W������B
     */
    public String getMbrbi006(final String arg0, final String arg1) {
        if (arg0 == null) {
            throw new IllegalArgumentException("���\�b�h[getMbrbi006]�̃p�����[�^[arg0]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B");
        }
        if (arg1 == null) {
            throw new IllegalArgumentException("���\�b�h[getMbrbi006]�̃p�����[�^[arg1]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B");
        }

        return "[MBRBI006] " + fBundle.getMbrbi006(arg0, arg1);
    }

    /**
     * ���b�Z�[�W��`ID[BlancoResourceBundle]�A�L�[[MBRBI007]�̕�������擾���܂��B
     *
     * No.8:
     * ������[���\�[�X�o���h����`[{0}]�̃��P�[��[{1}]�̃��\�[�XID[{2}]���d�����Ē�`����Ă��܂��B]
     *
     * @param arg0 �u��������{0}�̒l�B
     * @param arg1 �u��������{1}�̒l�B
     * @param arg2 �u��������{2}�̒l�B
     * @return ���b�Z�[�W������B
     */
    public String getMbrbi007(final String arg0, final String arg1, final String arg2) {
        if (arg0 == null) {
            throw new IllegalArgumentException("���\�b�h[getMbrbi007]�̃p�����[�^[arg0]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B");
        }
        if (arg1 == null) {
            throw new IllegalArgumentException("���\�b�h[getMbrbi007]�̃p�����[�^[arg1]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B");
        }
        if (arg2 == null) {
            throw new IllegalArgumentException("���\�b�h[getMbrbi007]�̃p�����[�^[arg2]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B");
        }

        return "[MBRBI007] " + fBundle.getMbrbi007(arg0, arg1, arg2);
    }

    /**
     * ���b�Z�[�W��`ID[BlancoResourceBundle]�A�L�[[MBRBI008]�̕�������擾���܂��B
     *
     * No.9:
     * ������[��ꖼ[{0}] ���P�[��[{1}] �L�[[{2}] ������[{3}]�̉�͂Ɏ��s���܂����B�����񂪕s���ł���\��������܂��B]
     *
     * @param arg0 �u��������{0}�̒l�B
     * @param arg1 �u��������{1}�̒l�B
     * @param arg2 �u��������{2}�̒l�B
     * @param arg3 �u��������{3}�̒l�B
     * @return ���b�Z�[�W������B
     */
    public String getMbrbi008(final String arg0, final String arg1, final String arg2, final String arg3) {
        if (arg0 == null) {
            throw new IllegalArgumentException("���\�b�h[getMbrbi008]�̃p�����[�^[arg0]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B");
        }
        if (arg1 == null) {
            throw new IllegalArgumentException("���\�b�h[getMbrbi008]�̃p�����[�^[arg1]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B");
        }
        if (arg2 == null) {
            throw new IllegalArgumentException("���\�b�h[getMbrbi008]�̃p�����[�^[arg2]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B");
        }
        if (arg3 == null) {
            throw new IllegalArgumentException("���\�b�h[getMbrbi008]�̃p�����[�^[arg3]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B");
        }

        return "[MBRBI008] " + fBundle.getMbrbi008(arg0, arg1, arg2, arg3);
    }

    /**
     * ���b�Z�[�W��`ID[BlancoResourceBundle]�A�L�[[MBRBI009]�̕�������擾���܂��B
     *
     * No.10:
     * ������[���\�[�X�o���h����`[{0}]�̃��P�[��[{1}]�̃��\�[�XID[{2}]�̃��b�Z�[�W���ɂ����ăp�����[�^�̎w�肪({3})����܂����A����܂Ō���Ă���������ɂ̓p�����[�^�̎w�肪����܂���ł����B]
     *
     * @param arg0 �u��������{0}�̒l�B
     * @param arg1 �u��������{1}�̒l�B
     * @param arg2 �u��������{2}�̒l�B
     * @param arg3 �u��������{3}�̒l�B
     * @return ���b�Z�[�W������B
     */
    public String getMbrbi009(final String arg0, final String arg1, final String arg2, final String arg3) {
        if (arg0 == null) {
            throw new IllegalArgumentException("���\�b�h[getMbrbi009]�̃p�����[�^[arg0]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B");
        }
        if (arg1 == null) {
            throw new IllegalArgumentException("���\�b�h[getMbrbi009]�̃p�����[�^[arg1]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B");
        }
        if (arg2 == null) {
            throw new IllegalArgumentException("���\�b�h[getMbrbi009]�̃p�����[�^[arg2]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B");
        }
        if (arg3 == null) {
            throw new IllegalArgumentException("���\�b�h[getMbrbi009]�̃p�����[�^[arg3]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B");
        }

        return "[MBRBI009] " + fBundle.getMbrbi009(arg0, arg1, arg2, arg3);
    }

    /**
     * ���b�Z�[�W��`ID[BlancoResourceBundle]�A�L�[[MBRBI010]�̕�������擾���܂��B
     *
     * No.11:
     * ������[���\�[�X�o���h����`[{0}]�̃��P�[��[{1}]�̃��\�[�XID[{2}]�̃��b�Z�[�W���ɂ����ăp�����[�^�̎w�肪����܂��񂪁A����܂Ō���Ă���������ɂ�({3})�̃p�����[�^�̎w�肪����܂����B]
     *
     * @param arg0 �u��������{0}�̒l�B
     * @param arg1 �u��������{1}�̒l�B
     * @param arg2 �u��������{2}�̒l�B
     * @param arg3 �u��������{3}�̒l�B
     * @return ���b�Z�[�W������B
     */
    public String getMbrbi010(final String arg0, final String arg1, final String arg2, final String arg3) {
        if (arg0 == null) {
            throw new IllegalArgumentException("���\�b�h[getMbrbi010]�̃p�����[�^[arg0]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B");
        }
        if (arg1 == null) {
            throw new IllegalArgumentException("���\�b�h[getMbrbi010]�̃p�����[�^[arg1]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B");
        }
        if (arg2 == null) {
            throw new IllegalArgumentException("���\�b�h[getMbrbi010]�̃p�����[�^[arg2]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B");
        }
        if (arg3 == null) {
            throw new IllegalArgumentException("���\�b�h[getMbrbi010]�̃p�����[�^[arg3]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B");
        }

        return "[MBRBI010] " + fBundle.getMbrbi010(arg0, arg1, arg2, arg3);
    }

    /**
     * ���b�Z�[�W��`ID[BlancoResourceBundle]�A�L�[[MBRBI011]�̕�������擾���܂��B
     *
     * No.12:
     * ������[���\�[�X�o���h����`[{0}]�̃��P�[��[{1}]�̃��\�[�XID[{2}]�̃��b�Z�[�W���ɂ�����p�����[�^�̐�({3})���A����܂Ō���Ă����p�����[�^�̐�({4})�ƈ�v���܂���B]
     *
     * @param arg0 �u��������{0}�̒l�B
     * @param arg1 �u��������{1}�̒l�B
     * @param arg2 �u��������{2}�̒l�B
     * @param arg3 �u��������{3}�̒l�B
     * @param arg4 �u��������{4}�̒l�B
     * @return ���b�Z�[�W������B
     */
    public String getMbrbi011(final String arg0, final String arg1, final String arg2, final String arg3, final String arg4) {
        if (arg0 == null) {
            throw new IllegalArgumentException("���\�b�h[getMbrbi011]�̃p�����[�^[arg0]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B");
        }
        if (arg1 == null) {
            throw new IllegalArgumentException("���\�b�h[getMbrbi011]�̃p�����[�^[arg1]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B");
        }
        if (arg2 == null) {
            throw new IllegalArgumentException("���\�b�h[getMbrbi011]�̃p�����[�^[arg2]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B");
        }
        if (arg3 == null) {
            throw new IllegalArgumentException("���\�b�h[getMbrbi011]�̃p�����[�^[arg3]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B");
        }
        if (arg4 == null) {
            throw new IllegalArgumentException("���\�b�h[getMbrbi011]�̃p�����[�^[arg4]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B");
        }

        return "[MBRBI011] " + fBundle.getMbrbi011(arg0, arg1, arg2, arg3, arg4);
    }

    /**
     * ���b�Z�[�W��`ID[BlancoResourceBundle]�A�L�[[MBRBI012]�̕�������擾���܂��B
     *
     * No.13:
     * ������[���\�[�X�o���h����`[{0}]�̃��P�[��[{1}]�̃��\�[�XID[{2}]�̃��b�Z�[�W���ɂ�����p�����[�^�̌^({3})���A����܂Ō���Ă����p�����[�^�̌^({4})�ƈ�v���܂���B]
     *
     * @param arg0 �u��������{0}�̒l�B
     * @param arg1 �u��������{1}�̒l�B
     * @param arg2 �u��������{2}�̒l�B
     * @param arg3 �u��������{3}�̒l�B
     * @param arg4 �u��������{4}�̒l�B
     * @return ���b�Z�[�W������B
     */
    public String getMbrbi012(final String arg0, final String arg1, final String arg2, final String arg3, final String arg4) {
        if (arg0 == null) {
            throw new IllegalArgumentException("���\�b�h[getMbrbi012]�̃p�����[�^[arg0]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B");
        }
        if (arg1 == null) {
            throw new IllegalArgumentException("���\�b�h[getMbrbi012]�̃p�����[�^[arg1]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B");
        }
        if (arg2 == null) {
            throw new IllegalArgumentException("���\�b�h[getMbrbi012]�̃p�����[�^[arg2]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B");
        }
        if (arg3 == null) {
            throw new IllegalArgumentException("���\�b�h[getMbrbi012]�̃p�����[�^[arg3]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B");
        }
        if (arg4 == null) {
            throw new IllegalArgumentException("���\�b�h[getMbrbi012]�̃p�����[�^[arg4]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B");
        }

        return "[MBRBI012] " + fBundle.getMbrbi012(arg0, arg1, arg2, arg3, arg4);
    }

    /**
     * ���b�Z�[�W��`ID[BlancoResourceBundle]�A�L�[[MBRBA001]�̕�������擾���܂��B
     *
     * No.15:
     * ������[�w���metadir[{0}]��������܂���B]
     *
     * @param arg0 �u��������{0}�̒l�B
     * @return ���b�Z�[�W������B
     */
    public String getMbrba001(final String arg0) {
        if (arg0 == null) {
            throw new IllegalArgumentException("���\�b�h[getMbrba001]�̃p�����[�^[arg0]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B");
        }

        return "[MBRBA001] " + fBundle.getMbrba001(arg0);
    }
}
