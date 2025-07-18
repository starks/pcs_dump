package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ema {
    private final elt a;
    private final int b;
    private final boolean c;

    public ema(elt eltVar, int i, boolean z) {
        eltVar.getClass();
        this.a = eltVar;
        this.b = i;
        this.c = z;
    }

    public final String toString() {
        crt crtVarQ = clq.Q(this);
        crtVarQ.e("callOptions", this.a);
        return crtVarQ.a("previousAttempts", this.b).c("isTransparentRetry", this.c).toString();
    }
}
