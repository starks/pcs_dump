package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes.dex */
public class emr {
    public static final Logger c = Logger.getLogger(emr.class.getName());
    public static final emr d = new emr();
    final emk e;
    public final epx f;
    public final int g;

    private emr() {
        this.e = null;
        this.f = null;
        this.g = 0;
        e(0);
    }

    private static void e(int i) {
        if (i == 1000) {
            c.logp(Level.SEVERE, "io.grpc.Context", "validateGeneration", "Context ancestry chain length is abnormally long. This suggests an error in application code. Length exceeded: 1000", (Throwable) new Exception());
        }
    }

    public static emr l() {
        emr emrVarA = emp.a.a();
        return emrVarA == null ? d : emrVarA;
    }

    static void n(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException((String) obj2);
        }
    }

    public emr a() {
        emr emrVarB = emp.a.b(this);
        return emrVarB == null ? d : emrVarB;
    }

    public ems b() {
        emk emkVar = this.e;
        if (emkVar == null) {
            return null;
        }
        return emkVar.a;
    }

    public Throwable c() {
        emk emkVar = this.e;
        if (emkVar == null) {
            return null;
        }
        return emkVar.c();
    }

    public void d(eml emlVar, Executor executor) {
        n(executor, "executor");
        emk emkVar = this.e;
        if (emkVar == null) {
            return;
        }
        emkVar.e(new emn(executor, emlVar, this));
    }

    public void f(emr emrVar) {
        n(emrVar, "toAttach");
        emp.a.c(this, emrVar);
    }

    public void g(eml emlVar) {
        emk emkVar = this.e;
        if (emkVar == null) {
            return;
        }
        emkVar.h(emlVar, this);
    }

    public boolean i() {
        emk emkVar = this.e;
        if (emkVar == null) {
            return false;
        }
        return emkVar.i();
    }

    public final emk k(ems emsVar, ScheduledExecutorService scheduledExecutorService) {
        n(scheduledExecutorService, "scheduler");
        ems emsVarB = b();
        boolean z = true;
        if (emsVarB != null && emsVarB.compareTo(emsVar) <= 0) {
            z = false;
            emsVar = emsVarB;
        }
        emk emkVar = new emk(this, emsVar);
        if (z) {
            if (!emsVar.e()) {
                synchronized (emkVar) {
                    chg chgVar = new chg(emkVar, 6, null);
                    ems.f(scheduledExecutorService, "scheduler");
                    emkVar.b = scheduledExecutorService.schedule(chgVar, emsVar.a - fjp.M(), TimeUnit.NANOSECONDS);
                }
                return emkVar;
            }
            emkVar.j(new TimeoutException("context timed out"));
        }
        return emkVar;
    }

    public final emr m(emo emoVar, Object obj) {
        epx epxVar = this.f;
        return new emr(this, epxVar == null ? new epw(emoVar, obj) : epxVar.b(emoVar, obj, emoVar.hashCode(), 0));
    }

    public emr(emr emrVar, epx epxVar) {
        this.e = emrVar instanceof emk ? (emk) emrVar : emrVar.e;
        this.f = epxVar;
        int i = emrVar.g + 1;
        this.g = i;
        e(i);
    }

    public emr(epx epxVar, int i) {
        this.e = null;
        this.f = epxVar;
        this.g = i;
        e(i);
    }
}
