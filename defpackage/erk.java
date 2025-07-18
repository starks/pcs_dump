package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class erk implements ewd, esa {
    public final esb a;
    private final eyg b;
    private final eyg c;
    private final cxc d;
    private final eqx e;
    private final erd f;
    private fav g;
    private Executor h;
    private final fuu i;

    static {
        Logger.getLogger(erk.class.getName());
    }

    public erk(erj erjVar) {
        eqx eqxVar = erjVar.a;
        eqxVar.getClass();
        this.e = eqxVar;
        eyg eygVar = erjVar.c;
        eygVar.getClass();
        this.c = eygVar;
        this.b = erjVar.d;
        List list = erjVar.b;
        list.getClass();
        this.d = cxc.o(list);
        exo exoVar = erjVar.f;
        exoVar.getClass();
        this.i = new fuu(exoVar);
        this.f = erjVar.e;
        this.a = new esb(this);
    }

    @Override // defpackage.ewd
    public final List a() {
        return cxc.q(this.e);
    }

    public final synchronized void b() {
        this.c.b(this.h);
        this.h = null;
    }

    @Override // defpackage.ewd
    public final synchronized void c(fav favVar) {
        this.g = new eri(favVar);
        this.h = (Executor) this.c.a();
    }

    @Override // defpackage.esa
    public final synchronized boolean d(int i, Parcel parcel) {
        IBinder strongBinder;
        if (i == 1) {
            if (parcel.readInt() > 0 && (strongBinder = parcel.readStrongBinder()) != null) {
                int callingUid = Binder.getCallingUid();
                elp elpVar = elp.a;
                eln elnVar = new eln(elp.a);
                elnVar.b(ene.b, this.e);
                elnVar.b(ene.a, new erv(callingUid));
                elnVar.b(erm.c, Integer.valueOf(callingUid));
                eqx eqxVar = this.e;
                elnVar.b(erm.d, eqxVar.a.getPackage() != null ? eqxVar.a.getPackage() : eqxVar.a.getComponent().getPackageName());
                elnVar.b(erm.e, this.f);
                fuu fuuVar = this.i;
                Executor executor = this.h;
                executor.getClass();
                elnVar.b(ers.a, new err(callingUid, fuuVar, executor));
                elnVar.b(evo.a, eqa.PRIVACY_AND_INTEGRITY);
                erl erlVar = new erl(this.b, elnVar.a(), this.d, esh.c, strongBinder);
                fav favVar = this.g;
                synchronized (favVar) {
                    clq.G(true, "Illegal transportCreated() after serverShutdown()");
                    ((eri) favVar).b++;
                }
                fav favVar2 = ((eri) favVar).a;
                synchronized (((fao) favVar2).a.m) {
                    ((fao) favVar2).a.n.add(erlVar);
                }
                far farVar = new far(((fao) favVar2).a, erlVar);
                long j = farVar.c.j;
                if (j != Long.MAX_VALUE) {
                    farVar.b = ((erm) farVar.a).f.schedule(new ezk(farVar, 5), j, TimeUnit.MILLISECONDS);
                } else {
                    farVar.b = new FutureTask(new bkp(8), null);
                }
                fas fasVar = farVar.c;
                enl.b((enk) fasVar.r.g.get(Long.valueOf(enl.a(fasVar))), farVar.a);
                erlVar.f(new erh((eri) favVar, farVar));
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return "BinderServer[" + this.e.toString() + "]";
    }
}
