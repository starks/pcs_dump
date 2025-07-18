package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum ccf implements eff {
    ATTESTATION_DEFAULT(0),
    ATTESTATION_DROID_GUARD_FULL(1),
    ATTESTATION_DROID_GUARD_NO_IDS(2),
    ATTESTATION_NONE(3),
    UNRECOGNIZED(-1);

    private final int g;

    ccf(int i) {
        this.g = i;
    }

    public static ccf b(int i) {
        if (i == 0) {
            return ATTESTATION_DEFAULT;
        }
        if (i == 1) {
            return ATTESTATION_DROID_GUARD_FULL;
        }
        if (i == 2) {
            return ATTESTATION_DROID_GUARD_NO_IDS;
        }
        if (i != 3) {
            return null;
        }
        return ATTESTATION_NONE;
    }

    @Override // defpackage.eff
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.g;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
