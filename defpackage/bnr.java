package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bnr implements Runnable, bjx, bkn {
    private static bnr d;
    public final LinkedBlockingQueue a = new LinkedBlockingQueue();
    public int b = 0;
    public final Handler c;
    private final bln e;

    private bnr(Context context) {
        HandlerThread handlerThread = new HandlerThread("DG");
        handlerThread.start();
        bya byaVar = new bya(handlerThread.getLooper());
        this.c = byaVar;
        this.e = new bnn(context, byaVar.getLooper(), this, this);
    }

    public static synchronized bnr c(Context context) {
        if (d == null) {
            d = new bnr(context);
        }
        return d;
    }

    private final void f(String str) {
        while (true) {
            bnp bnpVar = (bnp) this.a.poll();
            if (bnpVar == null) {
                return;
            }
            bln blnVar = this.e;
            bnpVar.b(new bno(blnVar.a, this, str, bnpVar.g));
        }
    }

    private final void g() {
        bnr bnrVar;
        bno bnoVar;
        bnu bnuVarA;
        while (true) {
            bnp bnpVar = (bnp) this.a.poll();
            if (bnpVar == null) {
                this.d();
                return;
            }
            if (!bnpVar.f) {
                boi boiVar = bnpVar.g;
                boiVar.c(cqw.c, boh.FINE);
                try {
                    bnuVarA = ((bnw) this.e.t()).a();
                    boiVar.c(cqw.d, boh.FINE);
                    bnpVar.e.b(this.b);
                    bnq bnqVarA = bnuVarA.a(bnpVar.d, bnpVar.e);
                    if (bnqVarA == null) {
                        bnuVarA.c(bnpVar.d);
                    }
                    boiVar.c(cqw.e, boh.FINE);
                    if (bnqVarA != null) {
                        bnh.B(this.e.a, boiVar, bnqVarA);
                    }
                    this.b++;
                    bnrVar = this;
                } catch (Exception e) {
                    e = e;
                    bnrVar = this;
                }
                try {
                    bnoVar = new bno(this.e.a, bnrVar, bnuVarA, bnpVar.e.a(), boiVar);
                } catch (Exception e2) {
                    e = e2;
                    boiVar = boiVar;
                    Exception exc = e;
                    bnoVar = new bno(bnrVar.e.a, bnrVar, "Initialization failed: ".concat(exc.toString()), boiVar, exc);
                    bnpVar.g.c(cqw.m, boh.COARSE);
                    bnpVar.b(bnoVar);
                    this = bnrVar;
                }
                bnpVar.g.c(cqw.m, boh.COARSE);
                bnpVar.b(bnoVar);
                this = bnrVar;
            }
        }
    }

    @Override // defpackage.bjx
    public final void a(int i) {
        aso.A(this.c);
        f(a.x(i, "Disconnected: "));
    }

    @Override // defpackage.bjx
    public final void b() {
        aso.A(this.c);
        g();
    }

    public final void d() {
        if (this.a.isEmpty() && this.b == 0 && this.e.k()) {
            this.e.x();
        }
    }

    final void e(Runnable runnable) {
        if (Looper.myLooper() == this.c.getLooper()) {
            runnable.run();
        } else {
            this.c.post(runnable);
        }
    }

    @Override // defpackage.bkn
    public final void i(bho bhoVar) {
        aso.A(this.c);
        f("Connection failed: ".concat(String.valueOf(String.valueOf(bhoVar))));
    }

    @Override // java.lang.Runnable
    public final void run() throws PackageManager.NameNotFoundException {
        aso.A(this.c);
        if (this.e.k()) {
            g();
        } else {
            if (this.e.l() || this.a.isEmpty()) {
                return;
            }
            this.e.w();
        }
    }
}
