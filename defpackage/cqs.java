package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cqs implements dis {
    final /* synthetic */ cqn a;
    final /* synthetic */ dis b;

    public cqs(cqn cqnVar, dis disVar) {
        this.a = cqnVar;
        this.b = disVar;
    }

    @Override // defpackage.dis
    public final djy a(Object obj) {
        cqn cqnVarI = cqa.i(cqa.h(), this.a);
        try {
            djy djyVarA = this.b.a(obj);
            if (djyVarA != null) {
                return djyVarA;
            }
            throw new IllegalStateException("AsyncFunction should return a ListenableFuture instead of null.");
        } finally {
        }
    }

    public final String toString() {
        return "propagating=[" + this.b + "]";
    }
}
