package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class enc extends end {
    private final emr a;
    private final fjp b;

    protected enc(fjp fjpVar) {
        this.b = fjpVar;
    }

    @Override // defpackage.fjp
    public final void S() {
        emr emrVarA = this.a.a();
        try {
            g().S();
        } finally {
            this.a.f(emrVarA);
        }
    }

    @Override // defpackage.fjp
    public final void c() {
        emr emrVarA = this.a.a();
        try {
            g().c();
        } finally {
            this.a.f(emrVarA);
        }
    }

    @Override // defpackage.fjp
    public final void d() {
        emr emrVarA = this.a.a();
        try {
            g().d();
        } finally {
            this.a.f(emrVarA);
        }
    }

    @Override // defpackage.fjp
    public final void e(Object obj) {
        emr emrVarA = this.a.a();
        try {
            g().e(obj);
        } finally {
            this.a.f(emrVarA);
        }
    }

    @Override // defpackage.fjp
    public final void f() {
        emr emrVarA = this.a.a();
        try {
            g().f();
        } finally {
            this.a.f(emrVarA);
        }
    }

    @Override // defpackage.end, defpackage.ept
    protected final fjp g() {
        return this.b;
    }

    public enc(fjp fjpVar, emr emrVar) {
        this(fjpVar);
        this.a = emrVar;
    }
}
