package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class dhq extends djf implements Runnable {
    djy a;
    Class b;
    Object c;

    public dhq(djy djyVar, Class cls, Object obj) {
        djyVar.getClass();
        this.a = djyVar;
        this.b = cls;
        this.c = obj;
    }

    public static djy i(djy djyVar, Class cls, crp crpVar, Executor executor) {
        dhp dhpVar = new dhp(djyVar, cls, crpVar);
        djyVar.c(dhpVar, cnx.w(executor, dhpVar));
        return dhpVar;
    }

    public static djy j(djy djyVar, Class cls, dis disVar, Executor executor) {
        dho dhoVar = new dho(djyVar, cls, disVar);
        djyVar.c(dhoVar, cnx.w(executor, dhoVar));
        return dhoVar;
    }

    @Override // defpackage.dif
    protected final String a() {
        djy djyVar = this.a;
        Class cls = this.b;
        Object obj = this.c;
        String strA = super.a();
        String strG = djyVar != null ? a.G(djyVar, "inputFuture=[", "], ") : "";
        if (cls == null || obj == null) {
            if (strA != null) {
                return String.valueOf(strG).concat(strA);
            }
            return null;
        }
        return strG + "exceptionType=[" + cls.toString() + "], fallback=[" + obj.toString() + "]";
    }

    @Override // defpackage.dif
    protected final void b() {
        o(this.a);
        this.a = null;
        this.b = null;
        this.c = null;
    }

    public abstract Object g(Object obj, Throwable th);

    public abstract void h(Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        djy djyVar = this.a;
        Class cls = this.b;
        Object obj = this.c;
        if (((obj == null) || ((djyVar == 0) | (cls == null))) || isCancelled()) {
            return;
        }
        this.a = null;
        try {
            th = djyVar instanceof dkr ? ((dkr) djyVar).l() : null;
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause == null) {
                cause = new NullPointerException("Future type " + String.valueOf(djyVar.getClass()) + " threw " + String.valueOf(e.getClass()) + " without a cause");
            }
            th = cause;
        } catch (Throwable th) {
            th = th;
        }
        Object objH = th == null ? cnx.H(djyVar) : null;
        if (th == null) {
            d(objH);
            return;
        }
        if (!cls.isInstance(th)) {
            f(djyVar);
            return;
        }
        try {
            Object objG = g(obj, th);
            this.b = null;
            this.c = null;
            h(objG);
        } catch (Throwable th2) {
            try {
                cnx.u(th2);
                e(th2);
            } finally {
                this.b = null;
                this.c = null;
            }
        }
    }
}
