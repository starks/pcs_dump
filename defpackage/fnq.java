package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fnq {
    public static final fnq a = new fnq();
    public static final ThreadLocal b = new ThreadLocal();

    private fnq() {
    }

    public static final fmo a() {
        ThreadLocal threadLocal = b;
        fmo fmoVar = (fmo) threadLocal.get();
        if (fmoVar != null) {
            return fmoVar;
        }
        flm flmVar = new flm(Thread.currentThread());
        threadLocal.set(flmVar);
        return flmVar;
    }
}
