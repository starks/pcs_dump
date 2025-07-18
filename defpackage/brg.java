package defpackage;

import android.app.job.JobScheduler;
import android.content.Context;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class brg {
    public static final cbx a = cbr.c("DynamiteModuleInit");
    private static boolean b;

    public static /* synthetic */ bxh a(cbq cbqVar) {
        Context contextA = cbqVar.a();
        bpz bpzVar = (bpz) cbqVar.c(bpz.class);
        bqm bqmVar = (bqm) cbqVar.c(bqm.class);
        cix cixVar = (cix) cbqVar.c(cix.class);
        ciu ciuVarA = civ.a();
        Context contextA2 = cbqVar.a();
        Pattern pattern = chq.a;
        chp chpVar = new chp(contextA2);
        chpVar.c("files");
        chpVar.d("brella");
        chpVar.e("training_task_store.pb");
        ciuVarA.d(chpVar.a());
        ciuVarA.c(ccp.a);
        return new bxh(contextA, bpzVar, bqmVar, cixVar.a(ciuVarA.a()), (cbu) cbqVar.c(cbu.class), new bxi((JobScheduler) cbqVar.a().getSystemService("jobscheduler"), new bxj(cbqVar.a(), (bpz) cbqVar.c(bpz.class), (bqm) cbqVar.c(bqm.class), (cbu) cbqVar.c(cbu.class)), (bqm) cbqVar.c(bqm.class)));
    }

    public static synchronized void b() {
        if (b) {
            return;
        }
        int i = 1;
        b = true;
        cbq.e(bpz.class, new avf(8));
        cbq.e(bus.class, new bre(2));
        cbq.e(cby.class, new bre(3));
        cbq.e(ccb.class, new avf(9));
        cbq.e(cdk.class, new avf(10));
        cbq.e(cdm.class, new avf(11));
        cbq.e(cbu.class, new avf(12));
        cbq.e(cbx.class, new avf(13));
        cbq.e(bqm.class, new avf(14));
        cbq.e(cbv.class, new avf(15));
        cbq.e(csm.class, new avf(16));
        cbq.e(cca.class, new avf(17));
        cbq.e(bxh.class, new avf(18));
        cbq.e(cix.class, new avf(19));
        cbq.e(bqs.class, new avf(20));
        cbq.e(brb.class, new bre(i));
        cbq.e(bpv.class, new bre(0));
    }
}
