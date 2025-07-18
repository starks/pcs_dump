package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum ebr implements eff {
    UNSPECIFIED(0),
    INT32(1),
    INT64(2),
    BOOL(3),
    FLOAT(4),
    DOUBLE(5),
    BYTES(6),
    STRING(7),
    UNRECOGNIZED(-1);

    private final int k;

    ebr(int i) {
        this.k = i;
    }

    public static ebr b(int i) {
        switch (i) {
            case 0:
                return UNSPECIFIED;
            case 1:
                return INT32;
            case 2:
                return INT64;
            case 3:
                return BOOL;
            case 4:
                return FLOAT;
            case 5:
                return DOUBLE;
            case 6:
                return BYTES;
            case 7:
                return STRING;
            default:
                return null;
        }
    }

    @Override // defpackage.eff
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.k;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
