package defpackage;

import java.lang.ref.ReferenceQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ctv implements cuj {
    volatile cuj a;
    final dki b;
    final csf c;

    public ctv() {
        this(cuu.b);
    }

    @Override // defpackage.cuj
    public final int a() {
        return this.a.a();
    }

    @Override // defpackage.cuj
    public final cuv c() {
        return null;
    }

    @Override // defpackage.cuj
    public final Object d() {
        return a.f(this.b);
    }

    @Override // defpackage.cuj
    public final void e(Object obj) {
        if (obj != null) {
            j(obj);
        } else {
            this.a = cuu.b;
        }
    }

    @Override // defpackage.cuj
    public final boolean f() {
        return this.a.f();
    }

    @Override // defpackage.cuj
    public final boolean g() {
        return true;
    }

    @Override // defpackage.cuj
    public final Object get() {
        return this.a.get();
    }

    public final long h() {
        return this.c.a(TimeUnit.NANOSECONDS);
    }

    public final djy i(Object obj, csy csyVar) {
        try {
            this.c.d();
            if (this.a.get() != null) {
                return dij.i(cnx.C(csyVar.a(obj)), new arl(this, 18), diy.a);
            }
            Object objA = csyVar.a(obj);
            return j(objA) ? this.b : cnx.C(objA);
        } catch (Throwable th) {
            djy djyVarB = k(th) ? this.b : cnx.B(th);
            if (th instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            return djyVarB;
        }
    }

    public final boolean j(Object obj) {
        return this.b.d(obj);
    }

    public final boolean k(Throwable th) {
        return this.b.e(th);
    }

    public ctv(cuj cujVar) {
        this.b = new dki();
        this.c = new csf();
        this.a = cujVar;
    }

    @Override // defpackage.cuj
    public final cuj b(ReferenceQueue referenceQueue, Object obj, cuv cuvVar) {
        return this;
    }
}
