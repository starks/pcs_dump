package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum yu {
    ON_CREATE,
    ON_START,
    ON_RESUME,
    ON_PAUSE,
    ON_STOP,
    ON_DESTROY,
    ON_ANY;

    public static final yt Companion = new yt();

    public final yv a() {
        int iOrdinal = ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    return yv.RESUMED;
                }
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        if (iOrdinal == 5) {
                            return yv.DESTROYED;
                        }
                        toString();
                        throw new IllegalArgumentException(toString().concat(" has no target state"));
                    }
                }
            }
            return yv.STARTED;
        }
        return yv.CREATED;
    }
}
