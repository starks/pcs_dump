package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dko extends djw {
    final /* synthetic */ dkp a;
    private final Callable b;

    public dko(dkp dkpVar, Callable callable) {
        this.a = dkpVar;
        callable.getClass();
        this.b = callable;
    }

    @Override // defpackage.djw
    public final Object a() {
        return this.b.call();
    }

    @Override // defpackage.djw
    public final String b() {
        return this.b.toString();
    }

    @Override // defpackage.djw
    public final void d(Throwable th) {
        this.a.e(th);
    }

    @Override // defpackage.djw
    public final void e(Object obj) {
        this.a.d(obj);
    }

    @Override // defpackage.djw
    public final boolean g() {
        return this.a.isDone();
    }
}
