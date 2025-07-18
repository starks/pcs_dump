package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class adr extends fhz {
    Object a;
    int b;
    int c;
    /* synthetic */ Object d;
    final /* synthetic */ adu e;
    int f;
    String g;
    String[] h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adr(adu aduVar, fhk fhkVar) {
        super(fhkVar);
        this.e = aduVar;
    }

    @Override // defpackage.fhx
    public final Object b(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.d(null, 0, this);
    }
}
