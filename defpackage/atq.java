package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum atq implements eff {
    TRAINING_DATA_SOURCE_UNDEFINED(0),
    FEED(1),
    DATASET(2);

    public final int d;

    atq(int i) {
        this.d = i;
    }

    public static atq b(int i) {
        if (i == 0) {
            return TRAINING_DATA_SOURCE_UNDEFINED;
        }
        if (i == 1) {
            return FEED;
        }
        if (i != 2) {
            return null;
        }
        return DATASET;
    }

    @Override // defpackage.eff
    public final int a() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.d);
    }
}
