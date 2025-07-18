package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.RemoteException;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class erl extends erm implements fay {
    public final List a;
    private faz m;

    public erl(eyg eygVar, elp elpVar, List list, fbc fbcVar, IBinder iBinder) throws RemoteException {
        super(eygVar, elpVar, fbcVar, eno.a(erl.class, "from ".concat(String.valueOf(String.valueOf(elpVar.a(ene.a))))));
        this.a = list;
        ScheduledExecutorService scheduledExecutorService = this.f;
        Logger logger = esh.a;
        esh esfVar = iBinder instanceof Binder ? new esf(iBinder, scheduledExecutorService) : new esg(iBinder);
        this.k = esfVar;
        try {
            esfVar.b.linkToDeath(this, 0);
        } catch (RemoteException unused) {
        }
    }

    final synchronized eqo a(faw fawVar, String str, epc epcVar) {
        if (m()) {
            return eqo.l.e("transport is shutdown");
        }
        this.m.b(fawVar, str, epcVar);
        return eqo.b;
    }

    @Override // defpackage.erm
    protected final erz b(int i) {
        return new erz(this, this.i, i);
    }

    @Override // defpackage.erm
    public final void e() {
        faz fazVar = this.m;
        if (fazVar != null) {
            fazVar.c();
        }
    }

    public final synchronized void f(faz fazVar) {
        esj esjVarC;
        this.m = fazVar;
        if (m()) {
            n(5);
            e();
            i();
            return;
        }
        esh eshVar = this.k;
        eshVar.getClass();
        try {
            esjVarC = esj.c();
        } catch (RemoteException e) {
            p(erm.h(e));
        }
        try {
            esjVarC.a().writeInt(1);
            esjVarC.a().writeStrongBinder(this.g);
            eshVar.a(1, esjVarC);
            esjVarC.close();
            if (m()) {
                return;
            }
            n(3);
            this.i = fazVar.a(this.i);
        } catch (Throwable th) {
            try {
                esjVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.fay
    public final synchronized void g(eqo eqoVar) {
        p(eqoVar);
    }
}
