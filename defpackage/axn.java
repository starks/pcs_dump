package defpackage;

import com.google.android.apps.aicore.aidl.AIFeature;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum axn implements eff {
    VARIANT_UNSPECIFIED(0),
    OEM(1),
    PIXEL(2),
    SAMSUNG_QC(3),
    SAMSUNG_SLSI(4),
    VARIANT_5(5),
    VARIANT_6(6),
    VARIANT_7(7),
    VARIANT_8(8),
    VARIANT_9(9),
    VARIANT_10(10),
    VARIANT_11(11),
    VARIANT_12(12),
    VARIANT_13(13),
    VARIANT_14(14),
    VARIANT_15(15),
    VARIANT_16(16),
    VARIANT_17(17),
    VARIANT_18(18),
    VARIANT_19(19),
    VARIANT_20(20),
    VARIANT_21(21),
    VARIANT_22(22),
    VARIANT_23(23),
    VARIANT_24(24),
    VARIANT_25(25),
    VARIANT_26(26),
    VARIANT_27(27),
    VARIANT_28(28),
    VARIANT_29(29),
    VARIANT_30(30),
    VARIANT_31(31),
    VARIANT_32(32),
    VARIANT_33(33),
    VARIANT_34(34),
    VARIANT_35(35),
    VARIANT_36(36),
    VARIANT_37(37),
    VARIANT_38(38),
    VARIANT_39(39),
    VARIANT_40(40),
    UNRECOGNIZED(-1);

    private final int R;

    axn(int i) {
        this.R = i;
    }

    public static axn b(int i) {
        switch (i) {
            case 0:
                return VARIANT_UNSPECIFIED;
            case 1:
                return OEM;
            case 2:
                return PIXEL;
            case 3:
                return SAMSUNG_QC;
            case 4:
                return SAMSUNG_SLSI;
            case 5:
                return VARIANT_5;
            case 6:
                return VARIANT_6;
            case 7:
                return VARIANT_7;
            case 8:
                return VARIANT_8;
            case 9:
                return VARIANT_9;
            case 10:
                return VARIANT_10;
            case 11:
                return VARIANT_11;
            case 12:
                return VARIANT_12;
            case 13:
                return VARIANT_13;
            case 14:
                return VARIANT_14;
            case 15:
                return VARIANT_15;
            case 16:
                return VARIANT_16;
            case 17:
                return VARIANT_17;
            case 18:
                return VARIANT_18;
            case AIFeature.Type.IMAGE_DESCRIPTION /* 19 */:
                return VARIANT_19;
            case 20:
                return VARIANT_20;
            case 21:
                return VARIANT_21;
            case 22:
                return VARIANT_22;
            case 23:
                return VARIANT_23;
            case 24:
                return VARIANT_24;
            case 25:
                return VARIANT_25;
            case 26:
                return VARIANT_26;
            case 27:
                return VARIANT_27;
            case 28:
                return VARIANT_28;
            case 29:
                return VARIANT_29;
            case 30:
                return VARIANT_30;
            case 31:
                return VARIANT_31;
            case 32:
                return VARIANT_32;
            case 33:
                return VARIANT_33;
            case 34:
                return VARIANT_34;
            case 35:
                return VARIANT_35;
            case 36:
                return VARIANT_36;
            case 37:
                return VARIANT_37;
            case 38:
                return VARIANT_38;
            case 39:
                return VARIANT_39;
            case 40:
                return VARIANT_40;
            default:
                return null;
        }
    }

    @Override // defpackage.eff
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.R;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
