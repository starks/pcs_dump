package defpackage;

import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class csv {
    static final csg a = new csj(new csq());
    static final csm b;
    cuc h;
    cuc i;
    cro m;
    cro n;
    csm o;
    csu q;
    cst r;
    boolean c = true;
    final int d = -1;
    int e = -1;
    long f = -1;
    long g = -1;
    long j = -1;
    long k = -1;
    final long l = -1;
    final csg p = a;

    static {
        new csz();
        b = new csr();
    }

    public final cta a(csy csyVar) {
        d();
        return new ctw(this, csyVar);
    }

    final cuc b() {
        return (cuc) clq.R(this.h, cuc.STRONG);
    }

    final cuc c() {
        return (cuc) clq.R(this.i, cuc.STRONG);
    }

    public final void d() {
        if (this.q == null) {
            clq.G(this.g == -1, "maximumWeight requires weigher");
        } else if (this.c) {
            clq.G(this.g != -1, "weigher requires maximumWeight");
        } else if (this.g == -1) {
            css.a.logp(Level.WARNING, "com.google.common.cache.CacheBuilder", "checkWeightWithWeigher", "ignoring weigher specified without maximumWeight");
        }
    }

    public final String toString() {
        crt crtVarQ = clq.Q(this);
        int i = this.e;
        if (i != -1) {
            crtVarQ.a("concurrencyLevel", i);
        }
        if (this.f != -1) {
            crtVarQ.b("maximumSize", 0L);
        }
        if (this.g != -1) {
            crtVarQ.b("maximumWeight", 0L);
        }
        long j = this.j;
        if (j != -1) {
            crtVarQ.e("expireAfterWrite", j + "ns");
        }
        long j2 = this.k;
        if (j2 != -1) {
            crtVarQ.e("expireAfterAccess", j2 + "ns");
        }
        cuc cucVar = this.h;
        if (cucVar != null) {
            crtVarQ.e("keyStrength", clq.S(cucVar.toString()));
        }
        cuc cucVar2 = this.i;
        if (cucVar2 != null) {
            crtVarQ.e("valueStrength", clq.S(cucVar2.toString()));
        }
        if (this.m != null) {
            crtVarQ.d("keyEquivalence");
        }
        if (this.n != null) {
            crtVarQ.d("valueEquivalence");
        }
        if (this.r != null) {
            crtVarQ.d("removalListener");
        }
        return crtVarQ.toString();
    }
}
