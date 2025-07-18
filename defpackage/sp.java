package defpackage;

import com.google.android.gms.learning.internal.training.InAppJobService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sp implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ sp(Object obj, int i, int i2) {
        this.c = i2;
        this.b = obj;
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.c) {
            case 0:
                rv rvVar = ((sc) this.b).a;
                if (rvVar != null) {
                    rvVar.a(this.a);
                    return;
                }
                return;
            case 1:
                ((rv) this.b).a(this.a);
                return;
            case 2:
                ((bkb) this.b).k(this.a);
                return;
            case 3:
                ((InAppJobService) this.b).lambda$onTrimMemory$0(this.a);
                return;
            case 4:
                ccd ccdVarB = ccd.b(this.a);
                ccdVarB.getClass();
                ccw ccwVar = (ccw) this.b;
                ccwVar.a.i(ccdVarB, ccwVar.b);
                return;
            case 5:
                int iB = ccj.b(this.a);
                if (iB == 0) {
                    throw null;
                }
                ccw ccwVar2 = (ccw) this.b;
                ccwVar2.a.l(iB, ccwVar2.b);
                return;
            case 6:
                ((eur) this.b).b.c(this.a);
                return;
            case 7:
                ((euv) this.b).f.h(this.a);
                return;
            case 8:
                ((euv) this.b).f.n(this.a);
                return;
            default:
                ((euv) this.b).f.o(this.a);
                return;
        }
    }

    public sp(Object obj, int i, int i2, byte[] bArr) {
        this.c = i2;
        this.a = i;
        this.b = obj;
    }

    public sp(un unVar, int i, int i2) {
        this.c = i2;
        this.b = unVar;
        this.a = i;
    }
}
