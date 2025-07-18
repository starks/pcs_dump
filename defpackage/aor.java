package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum aor {
    INTERNAL,
    RELEASE,
    UNKNOWN;

    public final boolean a() {
        return !b();
    }

    public final boolean b() {
        return this == RELEASE;
    }
}
