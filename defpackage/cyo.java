package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cyo extends cwr {
    static final cyo a = new cyo();
    final transient Object[] b;
    private final transient Object c;
    private final transient int d;
    private final transient int e;
    private final transient cyo f;

    private cyo() {
        this.c = null;
        this.b = new Object[0];
        this.d = 0;
        this.e = 0;
        this.f = this;
    }

    @Override // defpackage.cwr
    public final cwr a() {
        return this.f;
    }

    @Override // defpackage.cxg, java.util.Map
    public final Object get(Object obj) {
        Object objP = cyu.p(this.c, this.b, this.e, this.d, obj);
        if (objP == null) {
            return null;
        }
        return objP;
    }

    @Override // defpackage.cxg
    public final cxo h() {
        return new cyr(this, this.b, this.d, this.e);
    }

    @Override // defpackage.cxg
    public final cxo i() {
        return new cys(this, new cyt(this.b, this.d, this.e));
    }

    @Override // java.util.Map
    public final int size() {
        return this.e;
    }

    @Override // defpackage.cwr, defpackage.cxg
    public Object writeReplace() {
        return super.writeReplace();
    }

    private cyo(Object obj, Object[] objArr, int i, cyo cyoVar) {
        this.c = obj;
        this.b = objArr;
        this.d = 1;
        this.e = i;
        this.f = cyoVar;
    }

    public cyo(Object[] objArr, int i) {
        this.b = objArr;
        this.e = i;
        this.d = 0;
        int iJ = i >= 2 ? cxo.j(i) : 0;
        this.c = cyu.o(objArr, i, iJ, 0);
        this.f = new cyo(cyu.o(objArr, i, iJ, 1), objArr, i, this);
    }

    @Override // defpackage.cxg
    public final void m() {
    }
}
