package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class fne extends fou implements fmm, fmx {
    public fnh b;

    public abstract void b(Throwable th);

    @Override // defpackage.fmx
    public final fnl bb() {
        return null;
    }

    @Override // defpackage.fmx
    public final boolean bc() {
        return true;
    }

    public abstract boolean c();

    @Override // defpackage.fmm
    public final void d() {
        e().C(this);
    }

    public final fnh e() {
        fnh fnhVar = this.b;
        if (fnhVar != null) {
            return fnhVar;
        }
        fjs.b("job");
        return null;
    }

    @Override // defpackage.fou
    public final String toString() {
        return fme.a(this) + "@" + fme.b(this) + "[job@" + fme.b(e()) + "]";
    }
}
