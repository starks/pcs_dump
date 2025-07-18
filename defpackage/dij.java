package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class dij extends djf implements Runnable {
    djy a;
    Object b;

    public dij(djy djyVar, Object obj) {
        djyVar.getClass();
        this.a = djyVar;
        this.b = obj;
    }

    public static djy i(djy djyVar, crp crpVar, Executor executor) {
        dii diiVar = new dii(djyVar, crpVar);
        djyVar.c(diiVar, cnx.w(executor, diiVar));
        return diiVar;
    }

    public static djy j(djy djyVar, dis disVar, Executor executor) {
        executor.getClass();
        dih dihVar = new dih(djyVar, disVar);
        djyVar.c(dihVar, cnx.w(executor, dihVar));
        return dihVar;
    }

    @Override // defpackage.dif
    protected final String a() {
        djy djyVar = this.a;
        Object obj = this.b;
        String strA = super.a();
        String strG = djyVar != null ? a.G(djyVar, "inputFuture=[", "], ") : "";
        if (obj == null) {
            if (strA != null) {
                return String.valueOf(strG).concat(strA);
            }
            return null;
        }
        return strG + "function=[" + obj.toString() + "]";
    }

    @Override // defpackage.dif
    protected final void b() {
        o(this.a);
        this.a = null;
        this.b = null;
    }

    public abstract Object g(Object obj, Object obj2);

    public abstract void h(Object obj);

    @Override // java.lang.Runnable
    public final void run() {
        djy djyVar = this.a;
        Object obj = this.b;
        if ((isCancelled() | (djyVar == null)) || (obj == null)) {
            return;
        }
        this.a = null;
        if (djyVar.isCancelled()) {
            f(djyVar);
            return;
        }
        try {
            try {
                Object objG = g(obj, cnx.H(djyVar));
                this.b = null;
                h(objG);
            } catch (Throwable th) {
                try {
                    cnx.u(th);
                    e(th);
                } finally {
                    this.b = null;
                }
            }
        } catch (Error e) {
            e(e);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e2) {
            e(e2.getCause());
        } catch (Exception e3) {
            e(e3);
        }
    }
}
