package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fht extends fib {
    final /* synthetic */ fjc a;
    final /* synthetic */ Object b;
    private int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fht(fhk fhkVar, fjc fjcVar, Object obj) {
        super(fhkVar);
        this.a = fjcVar;
        this.b = obj;
    }

    @Override // defpackage.fhx
    protected final Object b(Object obj) throws Throwable {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.c = 2;
            ffh.c(obj);
            return obj;
        }
        this.c = 1;
        ffh.c(obj);
        fjc fjcVar = this.a;
        fjz.c(fjcVar, 2);
        return fjcVar.a(this.b, this);
    }
}
