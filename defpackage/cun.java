package defpackage;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
class cun extends WeakReference implements cuv {
    final int g;
    final cuv h;
    volatile cuj i;

    public cun(ReferenceQueue referenceQueue, Object obj, int i, cuv cuvVar) {
        super(obj, referenceQueue);
        this.i = cuu.b;
        this.g = i;
        this.h = cuvVar;
    }

    @Override // defpackage.cuv
    public final int a() {
        return this.g;
    }

    public long b() {
        throw new UnsupportedOperationException();
    }

    public long c() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.cuv
    public final cuj d() {
        return this.i;
    }

    @Override // defpackage.cuv
    public final cuv e() {
        return this.h;
    }

    public cuv f() {
        throw new UnsupportedOperationException();
    }

    public cuv g() {
        throw new UnsupportedOperationException();
    }

    public cuv h() {
        throw new UnsupportedOperationException();
    }

    public cuv i() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.cuv
    public final Object j() {
        return get();
    }

    public void k(long j) {
        throw new UnsupportedOperationException();
    }

    public void l(cuv cuvVar) {
        throw new UnsupportedOperationException();
    }

    public void m(cuv cuvVar) {
        throw new UnsupportedOperationException();
    }

    public void n(cuv cuvVar) {
        throw new UnsupportedOperationException();
    }

    public void o(cuv cuvVar) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.cuv
    public final void p(cuj cujVar) {
        this.i = cujVar;
    }

    public void q(long j) {
        throw new UnsupportedOperationException();
    }
}
