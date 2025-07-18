package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bzz implements cah {
    public final Object a;
    public final Object b;
    private final Executor c;
    private final /* synthetic */ int d;

    public bzz(Executor executor, bzx bzxVar, cal calVar, int i) {
        this.d = i;
        this.c = executor;
        this.b = bzxVar;
        this.a = calVar;
    }

    @Override // defpackage.cah
    public final void a(cag cagVar) {
        int i = this.d;
        if (i == 0) {
            if (((cal) cagVar).c) {
                synchronized (this.a) {
                }
                this.c.execute(new bks(this, 11));
                return;
            }
            return;
        }
        if (i == 1) {
            this.c.execute(new bkd(this, cagVar, 13, (byte[]) null));
            return;
        }
        if (i == 2) {
            synchronized (this.a) {
            }
            this.c.execute(new bkd(this, cagVar, 15, (byte[]) null));
        } else {
            if (i != 3) {
                if (cagVar.e()) {
                    synchronized (this.a) {
                    }
                    this.c.execute(new bkd(this, cagVar, 17, (byte[]) null));
                    return;
                }
                return;
            }
            if (cagVar.e() || ((cal) cagVar).c) {
                return;
            }
            synchronized (this.a) {
            }
            this.c.execute(new bkd(this, cagVar, 16, (byte[]) null));
        }
    }

    public bzz(Executor executor, Object obj, int i) {
        this.d = i;
        this.a = new Object();
        this.c = executor;
        this.b = obj;
    }
}
