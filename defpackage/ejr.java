package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ejr implements ekj {
    private volatile Object a;
    private final Object b = new Object();
    private final fuu c;

    public ejr(fuu fuuVar) {
        this.c = fuuVar;
    }

    @Override // defpackage.ekj
    public final Object aS() {
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    fuu fuuVar = this.c;
                    ekr ekrVar = ale.a;
                    ekb ekbVar = new ekb((byte[]) null);
                    ekbVar.a = new ekf(fuuVar.a);
                    ebq.r(ekbVar.a, ekf.class);
                    this.a = new all((ekf) ekbVar.a);
                }
            }
        }
        return this.a;
    }
}
