package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class caq {
    private static cat a;

    public static synchronized cat a() {
        if (a == null) {
            b(new cat());
        }
        return a;
    }

    public static synchronized void b(cat catVar) {
        if (a != null) {
            throw new IllegalStateException("init() already called");
        }
        a = catVar;
    }
}
