package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class flx extends fhf implements fhm {
    public static final fms b = new fms(null);

    public flx() {
        super(fhm.a);
    }

    @Override // defpackage.fhm
    public final fhk a(fhk fhkVar) {
        return new foj(this, fhkVar);
    }

    @Override // defpackage.fhm
    public final void b(fhk fhkVar) {
        foj fojVar = (foj) fhkVar;
        while (fojVar.f.a == fok.b) {
        }
        Object obj = fojVar.f.a;
        if ((obj instanceof fln ? (fln) obj : null) != null) {
            throw null;
        }
    }

    public abstract void d(fhq fhqVar, Runnable runnable);

    public boolean e() {
        return true;
    }

    public flx f(int i) {
        fjs.p(i);
        return new foq(this, i);
    }

    @Override // defpackage.fhf, defpackage.fhn, defpackage.fhq
    public final fhn get(fho fhoVar) {
        fhoVar.getClass();
        if (!(fhoVar instanceof fhg)) {
            if (fhm.a == fhoVar) {
                return this;
            }
            return null;
        }
        fhg fhgVar = (fhg) fhoVar;
        if (!fhgVar.b(getKey())) {
            return null;
        }
        fhn fhnVarA = fhgVar.a(this);
        if (fhnVarA instanceof fhn) {
            return fhnVarA;
        }
        return null;
    }

    @Override // defpackage.fhf, defpackage.fhq
    public final fhq minusKey(fho fhoVar) {
        fhoVar.getClass();
        if (fhoVar instanceof fhg) {
            fhg fhgVar = (fhg) fhoVar;
            if (!fhgVar.b(getKey()) || fhgVar.a(this) == null) {
                return this;
            }
        } else if (fhm.a != fhoVar) {
            return this;
        }
        return fhr.a;
    }

    public String toString() {
        return fme.a(this) + "@" + fme.b(this);
    }
}
