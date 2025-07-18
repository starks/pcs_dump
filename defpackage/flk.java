package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class flk extends fnh implements fna, fhk, fma {
    public final fhq a;

    public flk(fhq fhqVar, boolean z) {
        super(z);
        A((fna) fhqVar.get(fna.c));
        this.a = fhqVar.plus(this);
    }

    @Override // defpackage.fnh
    protected final String a() {
        return String.valueOf(fme.a(this)).concat(" was cancelled");
    }

    @Override // defpackage.fnh
    public final String b() {
        String str = null;
        if (fmd.b) {
            fhq fhqVar = this.a;
            fly flyVar = (fly) fhqVar.get(fly.b);
            if (flyVar != null) {
                flz flzVar = (flz) fhqVar.get(flz.b);
                str = (flzVar != null ? flzVar.a : "coroutine") + "#" + flyVar.a;
            }
        }
        if (str == null) {
            return fme.a(this);
        }
        return "\"" + str + "\":" + fme.a(this);
    }

    @Override // defpackage.fma
    public final fhq c() {
        return this.a;
    }

    @Override // defpackage.fhk
    public final fhq d() {
        return this.a;
    }

    @Override // defpackage.fhk
    public final void e(Object obj) {
        Object objU = u(fjp.p(obj));
        if (objU == fni.b) {
            return;
        }
        h(objU);
    }

    protected void h(Object obj) {
        f(obj);
    }

    @Override // defpackage.fnh
    public final void i(Throwable th) {
        fme.d(this.a, th);
    }

    @Override // defpackage.fnh
    protected final void k(Object obj) {
        if (!(obj instanceof flq)) {
            j(obj);
            return;
        }
        flq flqVar = (flq) obj;
        Throwable th = flqVar.a;
        flqVar.b.a();
        l(th);
    }

    protected void j(Object obj) {
    }

    protected void l(Throwable th) {
    }
}
