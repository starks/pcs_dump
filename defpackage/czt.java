package defpackage;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class czt implements dab, daz {
    private static final String a = new String();
    public final long b;
    public czs c;
    public daj d;
    private final Level e;
    private czw f;
    private dcc g;
    private Object[] h;

    protected czt(Level level) {
        long jB = dca.b();
        this.c = null;
        this.f = null;
        this.d = null;
        this.g = null;
        this.h = null;
        level.getClass();
        this.e = level;
        this.b = jB;
    }

    private final void A(String str, Object... objArr) {
        this.h = objArr;
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            if (obj instanceof czo) {
                objArr[i] = ((czo) obj).a();
            }
        }
        if (str != a) {
            this.g = new dcc(a(), str);
        }
        dcy dcyVarK = dca.k();
        if (!dcyVarK.a()) {
            dcy dcyVar = (dcy) j().d(czr.h);
            if (dcyVar != null && !dcyVar.a()) {
                dcyVarK = dcyVarK.a() ? dcyVar : new dcy(new dcw(dcyVarK.c, dcyVar.c));
            }
            n(czr.h, dcyVarK);
        }
        cze czeVarC = c();
        try {
            ddl ddlVarA = ddl.a();
            int i2 = ddlVarA.a + 1;
            ddlVarA.a = i2;
            if (i2 == 0) {
                throw new AssertionError("Overflow of RecursionDepth (possible error in core library)");
            }
            try {
                if (i2 <= 100) {
                    czeVarC.a.c(this);
                } else {
                    cze.g("unbounded recursion in log statement", this);
                }
                if (ddlVarA != null) {
                    ddlVarA.close();
                }
            } finally {
            }
        } catch (RuntimeException e) {
            try {
                czeVarC.a.b(e, this);
            } catch (dbd e2) {
                throw e2;
            } catch (RuntimeException e3) {
                cze.g(e3.getClass().getName() + ": " + e3.getMessage(), this);
                try {
                    e3.printStackTrace(System.err);
                } catch (RuntimeException unused) {
                }
            }
        }
    }

    private final boolean B() {
        czx czxVarB;
        czs czsVar;
        int i;
        if (this.f == null) {
            this.f = dca.g().a(czt.class, 1);
        }
        if (this.f != czw.a) {
            czxVarB = this.f;
            czs czsVar2 = this.c;
            if (czsVar2 != null && (i = czsVar2.b) > 0) {
                czxVarB.getClass();
                for (int i2 = 0; i2 < i; i2++) {
                    if (czr.f.equals(czsVar2.c(i2))) {
                        Object objE = czsVar2.e(i2);
                        czxVarB = objE instanceof dac ? ((dac) objE).b() : new dan(czxVarB, objE);
                    }
                }
            }
        } else {
            czxVarB = null;
        }
        boolean zB = b(czxVarB);
        daj dajVar = this.d;
        if (dajVar == null) {
            return zB;
        }
        dai daiVar = (dai) dai.a.b(czxVarB, this.c);
        int iIncrementAndGet = daiVar.c.incrementAndGet();
        int i3 = -1;
        if (dajVar != daj.c && daiVar.b.compareAndSet(false, true)) {
            try {
                dajVar.a();
                daiVar.b.set(false);
                daiVar.c.addAndGet(-iIncrementAndGet);
                i3 = (-1) + iIncrementAndGet;
            } catch (Throwable th) {
                daiVar.b.set(false);
                throw th;
            }
        }
        if (zB && i3 > 0 && (czsVar = this.c) != null) {
            czsVar.f(czr.e, Integer.valueOf(i3));
        }
        return zB & (i3 >= 0);
    }

    protected abstract ddg a();

    protected boolean b(czx czxVar) {
        throw null;
    }

    protected abstract cze c();

    protected abstract dab d();

    @Override // defpackage.daz
    public final long e() {
        return this.b;
    }

    @Override // defpackage.daz
    public final czw f() {
        czw czwVar = this.f;
        if (czwVar != null) {
            return czwVar;
        }
        throw new IllegalStateException("cannot request log site information prior to postProcess()");
    }

    @Override // defpackage.dab
    public final dab g(int i, TimeUnit timeUnit) {
        if (v()) {
            return d();
        }
        dae daeVar = czr.d;
        int i2 = czj.a;
        n(daeVar, new czi(i, timeUnit));
        return d();
    }

    @Override // defpackage.dab
    public final dab h(Throwable th) {
        dae daeVar = czr.a;
        daeVar.getClass();
        if (th != null) {
            n(daeVar, th);
        }
        return d();
    }

    @Override // defpackage.dab
    public final dab i(String str, String str2, int i, String str3) {
        czw czwVar = czw.a;
        czv czvVar = new czv(str, str2, i, str3);
        if (this.f == null) {
            this.f = czvVar;
        }
        return d();
    }

    @Override // defpackage.daz
    public final dbg j() {
        czs czsVar = this.c;
        return czsVar != null ? czsVar : dbf.a;
    }

    @Override // defpackage.daz
    public final dcc k() {
        return this.g;
    }

    @Override // defpackage.daz
    public final Object l() {
        cnx.V(this.g == null, "cannot get literal argument if a template context exists");
        Object[] objArr = this.h;
        if (objArr != null) {
            return objArr[0];
        }
        throw new IllegalStateException("cannot get literal argument before calling log()");
    }

    @Override // defpackage.daz
    public final Level m() {
        return this.e;
    }

    protected final void n(dae daeVar, Object obj) {
        if (this.c == null) {
            this.c = new czs();
        }
        this.c.f(daeVar, obj);
    }

    @Override // defpackage.dab
    public final void o(Object obj) {
        if (B()) {
            A("%s", obj);
        }
    }

    @Override // defpackage.dab
    public final void p(String str) {
        if (B()) {
            A(a, str);
        }
    }

    @Override // defpackage.dab
    public final void q(String str, int i) {
        if (B()) {
            A(str, Integer.valueOf(i));
        }
    }

    @Override // defpackage.dab
    public final void r(String str, Object obj) {
        if (B()) {
            A(str, obj);
        }
    }

    @Override // defpackage.dab
    public final void s(String str, long j, Object obj) {
        if (B()) {
            A(str, Long.valueOf(j), obj);
        }
    }

    @Override // defpackage.dab
    public final void t(String str, Object obj, Object obj2) {
        if (B()) {
            A(str, obj, obj2);
        }
    }

    @Override // defpackage.dab
    public final void u(String str, Object[] objArr) {
        if (B()) {
            A(str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    @Override // defpackage.daz
    public final boolean v() {
        return this.c != null && Boolean.TRUE.equals(this.c.d(czr.g));
    }

    @Override // defpackage.daz
    public final Object[] w() {
        cnx.V(this.g != null, "cannot get arguments unless a template context exists");
        Object[] objArr = this.h;
        if (objArr != null) {
            return objArr;
        }
        throw new IllegalStateException("cannot get arguments before calling log()");
    }

    @Override // defpackage.dab
    public final void x(int i, long j) {
        if (B()) {
            A("PCS sent [%d] bytes to client (%d bytes sent so far).", Integer.valueOf(i), Long.valueOf(j));
        }
    }

    @Override // defpackage.dab
    public final void y(Object obj, long j) {
        if (B()) {
            A("onReadyHandler called for URL [%s]. Bytes sent so far: [%d].", obj, Long.valueOf(j));
        }
    }

    @Override // defpackage.dab
    public final void z(Object obj, Object obj2, Object obj3, Object obj4) {
        if (B()) {
            A("Installed policy mismatch section=%s key=%s installedVal=%s pushedVal=%s", obj, obj2, obj3, obj4);
        }
    }
}
