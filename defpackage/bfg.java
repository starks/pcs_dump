package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum bfg implements eff {
    SURVEY_TRIGGER_ID_UNKNOWN(0),
    SURVEY_TRIGGER_ID_LIVE_CAPTION_OVERALL_SATISFACTION(1),
    UNRECOGNIZED(-1);

    private final int e;

    bfg(int i) {
        this.e = i;
    }

    public static bfg b(int i) {
        if (i == 0) {
            return SURVEY_TRIGGER_ID_UNKNOWN;
        }
        if (i != 1) {
            return null;
        }
        return SURVEY_TRIGGER_ID_LIVE_CAPTION_OVERALL_SATISFACTION;
    }

    @Override // defpackage.eff
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.e;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
