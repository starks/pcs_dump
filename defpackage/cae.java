package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cae implements cah, cad, cac, caa {
    public final cal a;
    public final Object b;
    private final Executor c;
    private final /* synthetic */ int d;

    public cae(Executor executor, Object obj, cal calVar, int i) {
        this.d = i;
        this.c = executor;
        this.b = obj;
        this.a = calVar;
    }

    @Override // defpackage.cah
    public final void a(cag cagVar) {
        if (this.d != 0) {
            this.c.execute(new bkd(this, cagVar, 14, (byte[]) null));
        } else {
            this.c.execute(new bkd(this, cagVar, 18, (byte[]) null));
        }
    }

    @Override // defpackage.caa
    public final void b() {
        int i = this.d;
        cal calVar = this.a;
        if (i != 0) {
            calVar.p();
        } else {
            calVar.p();
        }
    }

    @Override // defpackage.cac
    public final void c(Exception exc) {
        int i = this.d;
        cal calVar = this.a;
        if (i != 0) {
            calVar.m(exc);
        } else {
            calVar.m(exc);
        }
    }

    @Override // defpackage.cad
    public final void d(Object obj) {
        int i = this.d;
        cal calVar = this.a;
        if (i != 0) {
            calVar.n(obj);
        } else {
            calVar.n(obj);
        }
    }
}
