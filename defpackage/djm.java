package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class djm extends dia implements Runnable {
    private djy a;

    public djm(djy djyVar) {
        this.a = djyVar;
    }

    @Override // defpackage.dif
    protected final String a() {
        djy djyVar = this.a;
        if (djyVar != null) {
            return a.G(djyVar, "delegate=[", "]");
        }
        return null;
    }

    @Override // defpackage.dif
    protected final void b() {
        this.a = null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        djy djyVar = this.a;
        if (djyVar != null) {
            f(djyVar);
        }
    }
}
