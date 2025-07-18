package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class eew extends eeu implements egj {
    protected eew(eex eexVar) {
        super(eexVar);
    }

    @Override // defpackage.eeu
    public final void B() {
        super.B();
        if (((eex) this.a).a != eep.a) {
            eex eexVar = (eex) this.a;
            eexVar.a = eexVar.a.clone();
        }
    }

    @Override // defpackage.eeu
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final eex A() {
        if (!((eex) this.a).isMutable()) {
            return (eex) this.a;
        }
        ((eex) this.a).a.e();
        return (eex) super.A();
    }
}
