package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum axj implements eff {
    ALL(0),
    BETA(1),
    ALPHA(2),
    THIRD_PARTY_EAP(3),
    THIRD_PARTY_EXPERIMENTAL(4),
    UNRECOGNIZED(-1);

    private final int h;

    axj(int i) {
        this.h = i;
    }

    public static axj b(int i) {
        if (i == 0) {
            return ALL;
        }
        if (i == 1) {
            return BETA;
        }
        if (i == 2) {
            return ALPHA;
        }
        if (i == 3) {
            return THIRD_PARTY_EAP;
        }
        if (i != 4) {
            return null;
        }
        return THIRD_PARTY_EXPERIMENTAL;
    }

    @Override // defpackage.eff
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.h;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
