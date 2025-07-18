package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cxm extends cws {
    Object[] d;

    public cxm() {
        super(4);
    }

    @Override // defpackage.cws, defpackage.cwt
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public cxm c(Object obj) {
        obj.getClass();
        this.d = null;
        super.b(obj);
        return this;
    }

    public cxm h(cxm cxmVar) {
        a(cxmVar.a, cxmVar.b);
        return this;
    }

    public cxo i() {
        int i = this.b;
        if (i == 0) {
            return cyv.a;
        }
        if (i == 1) {
            Object obj = this.a[0];
            obj.getClass();
            return new cyz(obj);
        }
        cxo cxoVarL = cxo.l(this.b, this.a);
        this.b = cxoVarL.size();
        this.c = true;
        this.d = null;
        return cxoVarL;
    }

    public final void j(Object... objArr) {
        super.d(objArr);
    }

    public final void k(Iterable iterable) {
        super.e(iterable);
    }
}
