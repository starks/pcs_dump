package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum axm implements eff {
    UNKNOWN(0),
    ULTRA_LOW(1),
    LOW(2),
    MID(3),
    HIGH(4),
    ULTRA(5),
    UNRECOGNIZED(-1);

    private final int i;

    axm(int i) {
        this.i = i;
    }

    public static axm b(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return ULTRA_LOW;
        }
        if (i == 2) {
            return LOW;
        }
        if (i == 3) {
            return MID;
        }
        if (i == 4) {
            return HIGH;
        }
        if (i != 5) {
            return null;
        }
        return ULTRA;
    }

    @Override // defpackage.eff
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.i;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
