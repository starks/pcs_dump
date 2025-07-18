package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum atj implements eff {
    COLLECTION_NAME_UNDEFINED(0),
    COLLECTION_NAME_SIMPLESTORAGE(1),
    COLLECTION_NAME_PLAY_PROTECT(2),
    COLLECTION_NAME_STATSD(3);

    public final int e;

    atj(int i) {
        this.e = i;
    }

    public static atj b(int i) {
        if (i == 0) {
            return COLLECTION_NAME_UNDEFINED;
        }
        if (i == 1) {
            return COLLECTION_NAME_SIMPLESTORAGE;
        }
        if (i == 2) {
            return COLLECTION_NAME_PLAY_PROTECT;
        }
        if (i != 3) {
            return null;
        }
        return COLLECTION_NAME_STATSD;
    }

    @Override // defpackage.eff
    public final int a() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.e);
    }
}
