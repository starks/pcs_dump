package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aeb extends fhz {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ aec c;
    int d;
    aec e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeb(aec aecVar, fhk fhkVar) {
        super(fhkVar);
        this.c = aecVar;
    }

    @Override // defpackage.fhx
    public final Object b(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.c(null, null, this);
    }
}
