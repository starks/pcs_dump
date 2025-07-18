package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum atg implements eff {
    UNKNOWN_TYPE(0),
    FC_CHECK_IN(1),
    FC_TRAINING_START_QUERY(2),
    FC_TRAINING_RESULT_UPLOAD(3),
    HTTP(4),
    PIR(5);

    public final int g;

    atg(int i) {
        this.g = i;
    }

    public static atg b(int i) {
        if (i == 0) {
            return UNKNOWN_TYPE;
        }
        if (i == 1) {
            return FC_CHECK_IN;
        }
        if (i == 2) {
            return FC_TRAINING_START_QUERY;
        }
        if (i == 3) {
            return FC_TRAINING_RESULT_UPLOAD;
        }
        if (i == 4) {
            return HTTP;
        }
        if (i != 5) {
            return null;
        }
        return PIR;
    }

    @Override // defpackage.eff
    public final int a() {
        return this.g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.g);
    }
}
