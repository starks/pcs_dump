package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum atr implements eff {
    TRAIN_ERROR_DEFAULT(0),
    TRAIN_ERROR_TENSORFLOW(1),
    TRAIN_ERROR_LOCAL_IO(2),
    TRAIN_ERROR_EXAMPLE_SELECTOR(3);

    public final int e;

    atr(int i) {
        this.e = i;
    }

    public static atr b(int i) {
        if (i == 0) {
            return TRAIN_ERROR_DEFAULT;
        }
        if (i == 1) {
            return TRAIN_ERROR_TENSORFLOW;
        }
        if (i == 2) {
            return TRAIN_ERROR_LOCAL_IO;
        }
        if (i != 3) {
            return null;
        }
        return TRAIN_ERROR_EXAMPLE_SELECTOR;
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
