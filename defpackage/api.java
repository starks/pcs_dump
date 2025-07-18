package defpackage;

import com.google.android.gms.common.api.Status;
import j$.time.Instant;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes.dex */
public class api {
    public static volatile eqi a;
    private static volatile epg b;

    public static epg a() {
        epg epgVarA;
        epg epgVar = b;
        if (epgVar != null) {
            return epgVar;
        }
        synchronized (api.class) {
            epgVarA = b;
            if (epgVarA == null) {
                epd epdVarA = epg.a();
                epdVarA.c = epf.UNARY;
                epdVarA.d = epg.c("com.google.android.apps.miphone.astrea.fl.api.TrainingService", "ScheduleFederatedComputation");
                epdVarA.b();
                apd apdVar = apd.a;
                int i = fec.b;
                epdVarA.a = new fea(apdVar);
                epdVarA.b = new fea(apf.a);
                epgVarA = epdVarA.a();
                b = epgVarA;
            }
        }
        return epgVarA;
    }

    public static Instant b() {
        return Instant.now();
    }

    public static boolean c(Future future) {
        if (future != null && future.isDone()) {
            try {
                cnx.H(future);
                return true;
            } catch (CancellationException | ExecutionException unused) {
            }
        }
        return false;
    }

    public static bix d(Status status) {
        return status.g != null ? new bjg(status) : new bix(status);
    }

    public static void e(Status status, brb brbVar) {
        f(status, null, brbVar);
    }

    public static void f(Status status, Object obj, brb brbVar) {
        if (status.a()) {
            brbVar.D(obj);
        } else {
            brbVar.C(d(status));
        }
    }
}
