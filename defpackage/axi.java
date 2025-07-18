package defpackage;

import com.google.android.apps.aicore.aidl.AIFeature;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum axi implements eff {
    UNDEFINED(0),
    SUSPICIOUS_MESSAGE_ALERTS(1),
    PLAY_PROTECT_SERVICE(2),
    PLAY_PROTECT_SERVICE_CORE_DEFAULT(3),
    AI_CORE_PROTECTED_DOWNLOAD(4),
    AI_CORE_TEXT_INPUT(5),
    AI_CORE_IMAGE_OUTPUT(6),
    PLAY_PROTECT_SERVICE_PVM_DEFAULT(7),
    AI_CORE_TEXT_OUTPUT(8),
    AI_CORE_IMAGE_INPUT(9),
    AI_CORE_MESSAGES_TEXT(10),
    AI_CORE_CHROME_SUMMARIZATION_OUTPUT(11),
    AI_CORE_CLIENT_12(12),
    AI_CORE_CLIENT_13(13),
    AI_CORE_CLIENT_14(14),
    AI_CORE_CLIENT_15(15),
    AI_CORE_CLIENT_16(16),
    AI_CORE_CLIENT_17(17),
    AI_CORE_CLIENT_18(18),
    AI_CORE_CLIENT_19(19),
    AI_CORE_CLIENT_20(20),
    AI_CORE_CLIENT_21(21),
    AI_CORE_CLIENT_22(22),
    AI_CORE_CLIENT_23(23),
    AI_CORE_CLIENT_24(24),
    AI_CORE_CLIENT_25(25),
    AI_CORE_CLIENT_26(26),
    AI_CORE_CLIENT_27(27),
    AI_CORE_CLIENT_28(28),
    AI_CORE_CLIENT_29(29),
    AI_CORE_CLIENT_30(30),
    AI_CORE_CLIENT_31(31),
    AI_CORE_CLIENT_32(32),
    AI_CORE_CLIENT_33(33),
    AI_CORE_CLIENT_34(34),
    AI_CORE_CLIENT_35(35),
    AI_CORE_CLIENT_36(36),
    AI_CORE_CLIENT_37(37),
    AI_CORE_CLIENT_38(38),
    AI_CORE_CLIENT_39(39),
    AI_CORE_CLIENT_40(40),
    PROTECTED_DOWNLOAD_TESTING(99997),
    STRESSTEST_LEGACY(99998),
    STRESSTEST_CORE_DEFAULT(99999),
    UNRECOGNIZED(-1);

    private final int U;

    axi(int i) {
        this.U = i;
    }

    public static axi b(int i) {
        switch (i) {
            case 0:
                return UNDEFINED;
            case 1:
                return SUSPICIOUS_MESSAGE_ALERTS;
            case 2:
                return PLAY_PROTECT_SERVICE;
            case 3:
                return PLAY_PROTECT_SERVICE_CORE_DEFAULT;
            case 4:
                return AI_CORE_PROTECTED_DOWNLOAD;
            case 5:
                return AI_CORE_TEXT_INPUT;
            case 6:
                return AI_CORE_IMAGE_OUTPUT;
            case 7:
                return PLAY_PROTECT_SERVICE_PVM_DEFAULT;
            case 8:
                return AI_CORE_TEXT_OUTPUT;
            case 9:
                return AI_CORE_IMAGE_INPUT;
            case 10:
                return AI_CORE_MESSAGES_TEXT;
            case 11:
                return AI_CORE_CHROME_SUMMARIZATION_OUTPUT;
            case 12:
                return AI_CORE_CLIENT_12;
            case 13:
                return AI_CORE_CLIENT_13;
            case 14:
                return AI_CORE_CLIENT_14;
            case 15:
                return AI_CORE_CLIENT_15;
            case 16:
                return AI_CORE_CLIENT_16;
            case 17:
                return AI_CORE_CLIENT_17;
            case 18:
                return AI_CORE_CLIENT_18;
            case AIFeature.Type.IMAGE_DESCRIPTION /* 19 */:
                return AI_CORE_CLIENT_19;
            case 20:
                return AI_CORE_CLIENT_20;
            case 21:
                return AI_CORE_CLIENT_21;
            case 22:
                return AI_CORE_CLIENT_22;
            case 23:
                return AI_CORE_CLIENT_23;
            case 24:
                return AI_CORE_CLIENT_24;
            case 25:
                return AI_CORE_CLIENT_25;
            case 26:
                return AI_CORE_CLIENT_26;
            case 27:
                return AI_CORE_CLIENT_27;
            case 28:
                return AI_CORE_CLIENT_28;
            case 29:
                return AI_CORE_CLIENT_29;
            case 30:
                return AI_CORE_CLIENT_30;
            case 31:
                return AI_CORE_CLIENT_31;
            case 32:
                return AI_CORE_CLIENT_32;
            case 33:
                return AI_CORE_CLIENT_33;
            case 34:
                return AI_CORE_CLIENT_34;
            case 35:
                return AI_CORE_CLIENT_35;
            case 36:
                return AI_CORE_CLIENT_36;
            case 37:
                return AI_CORE_CLIENT_37;
            case 38:
                return AI_CORE_CLIENT_38;
            case 39:
                return AI_CORE_CLIENT_39;
            case 40:
                return AI_CORE_CLIENT_40;
            default:
                switch (i) {
                    case 99997:
                        return PROTECTED_DOWNLOAD_TESTING;
                    case 99998:
                        return STRESSTEST_LEGACY;
                    case 99999:
                        return STRESSTEST_CORE_DEFAULT;
                    default:
                        return null;
                }
        }
    }

    @Override // defpackage.eff
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.U;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
