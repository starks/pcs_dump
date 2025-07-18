package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class djc implements dir {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public djc(cqn cqnVar, dir dirVar, int i) {
        this.c = i;
        this.b = cqnVar;
        this.a = dirVar;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [cqn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [dir, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [dir, java.lang.Object] */
    @Override // defpackage.dir
    public final djy a() {
        if (this.c == 0) {
            return !((dje) this.a).compareAndSet(djd.NOT_RUN, djd.STARTED) ? cnx.A() : this.b.a();
        }
        ?? r0 = this.b;
        ezn eznVarH = cqa.h();
        cqn cqnVarI = cqa.i(eznVarH, r0);
        try {
            djy djyVarA = this.a.a();
            cqa.i(eznVarH, cqnVarI);
            djyVarA.getClass();
            return djyVarA;
        } finally {
        }
    }

    public final String toString() {
        if (this.c == 0) {
            return this.b.toString();
        }
        return "propagating=[" + this.a + "]";
    }

    public djc(dje djeVar, dir dirVar, int i) {
        this.c = i;
        this.a = djeVar;
        this.b = dirVar;
    }
}
