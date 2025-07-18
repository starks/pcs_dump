package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cbo extends dif {
    Object a;
    Runnable b = null;

    public cbo(Object obj, Runnable runnable) {
        this.a = obj;
    }

    @Override // defpackage.dif
    public final String a() {
        Object obj = this.a;
        return obj == null ? "" : obj.toString();
    }

    @Override // defpackage.dif
    protected final void b() {
        this.a = null;
        this.b = null;
    }

    @Override // defpackage.dif
    public final boolean d(Object obj) {
        return super.d(obj);
    }

    @Override // defpackage.dif
    public final boolean e(Throwable th) {
        return super.e(th);
    }
}
