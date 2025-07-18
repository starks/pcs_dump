package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class foj extends fmj implements fia, fhk {
    public final flx b;
    public final fhk c;
    public Object d;
    public final Object e;
    public final fli f;

    public foj(flx flxVar, fhk fhkVar) {
        super(-1);
        this.b = flxVar;
        this.c = fhkVar;
        this.d = fok.a;
        this.e = fpe.a(d());
        this.f = fjp.v(null);
    }

    @Override // defpackage.fmj
    public final Object b() {
        Object obj = this.d;
        boolean z = fmd.a;
        this.d = fok.a;
        return obj;
    }

    @Override // defpackage.fia
    public final StackTraceElement bg() {
        return null;
    }

    @Override // defpackage.fhk
    public final fhq d() {
        return this.c.d();
    }

    @Override // defpackage.fhk
    public final void e(Object obj) {
        Object objP = fjp.p(obj);
        d();
        if (this.b.e()) {
            this.d = objP;
            this.a = 0;
            this.b.d(d(), this);
            return;
        }
        boolean z = fmd.a;
        fnq fnqVar = fnq.a;
        fmo fmoVarA = fnq.a();
        if (fmoVarA.n()) {
            this.d = objP;
            this.a = 0;
            fmoVarA.l(this);
            return;
        }
        fmoVarA.m(true);
        try {
            fhq fhqVarD = d();
            Object objB = fpe.b(fhqVarD, this.e);
            try {
                this.c.e(obj);
                while (fmoVarA.o()) {
                }
            } finally {
                fpe.c(fhqVarD, objB);
            }
        } catch (Throwable th) {
            try {
                j(th);
            } finally {
                fmoVarA.k(true);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [fhk, fia] */
    @Override // defpackage.fia
    public final fia g() {
        return this.c;
    }

    public final String toString() {
        Object objB;
        fhk fhkVar = this.c;
        try {
            objB = fhkVar + "@" + fme.b(fhkVar);
        } catch (Throwable th) {
            objB = ffh.b(th);
        }
        if (ffu.a(objB) != null) {
            objB = fhkVar.getClass().getName() + "@" + fme.b(fhkVar);
        }
        return "DispatchedContinuation[" + this.b + ", " + ((String) objB) + "]";
    }

    @Override // defpackage.fmj
    public final fhk h() {
        return this;
    }
}
