package defpackage;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.RemoteException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class btv {
    static final cbx a = cbr.d("brella", "TrainingJob");
    public static final Object b = new Object();
    public final Context c;
    public btu d = null;
    public djz e;
    public cbq f;
    public bpz g;
    public bxh h;
    public bqm i;
    public cbu j;
    private cdm k;
    private brb l;
    private final brb m;

    /* JADX WARN: Finally extract failed */
    public btv(brb brbVar, djz djzVar) {
        try {
            this.m = brbVar;
            this.e = djzVar;
            Context applicationContext = ((Context) brbVar.a).getApplicationContext();
            this.c = applicationContext;
            cbq cbqVarB = cbq.b(applicationContext);
            this.f = cbqVarB;
            this.g = (bpz) cbqVarB.c(bpz.class);
            this.k = (cdm) this.f.c(cdm.class);
            this.h = (bxh) this.f.c(bxh.class);
            this.i = (bqm) this.f.c(bqm.class);
            this.j = (cbu) this.f.c(cbu.class);
            this.l = (brb) this.f.c(brb.class);
            this.i.k(ccj.cb);
        } catch (Throwable th) {
            bqm bqmVar = this.i;
            if (bqmVar != null) {
                bqmVar.k(ccj.cc);
            }
            bnb.a(((Context) brbVar.a).getApplicationContext(), th);
            throw th;
        }
    }

    public static btw a(cco ccoVar) {
        int i = ccoVar.c;
        if (i == 4) {
            return bba.d((ccg) ccoVar.d);
        }
        return bba.e(i == 13 ? (cci) ccoVar.d : cci.a);
    }

    public static void b(djy djyVar, Context context) {
        try {
            cnx.H(djyVar);
        } catch (CancellationException unused) {
        } catch (ExecutionException e) {
            a.j(e, "Training failed");
            dkq dkqVar = new dkq(e);
            bnb.a(context, dkqVar);
            throw dkqVar;
        }
    }

    private final void g(btu btuVar, dzm dzmVar, int i, boolean z) {
        if (this.d != btuVar) {
            return;
        }
        this.d = null;
        if (dzmVar == null) {
            a.h("Cancelling: " + String.valueOf(btuVar.h) + " - " + z);
            btd btdVar = btuVar.h;
            if (btdVar != null) {
                try {
                    btdVar.a(btuVar.b);
                } catch (RemoteException unused) {
                }
            }
            if (z) {
                btuVar.f.cancel(true);
            }
        }
        ServiceConnection serviceConnection = btuVar.g;
        if (serviceConnection != null) {
            try {
                this.c.unbindService(serviceConnection);
            } catch (IllegalArgumentException unused2) {
                f(ccj.cs);
            }
        }
        cco ccoVar = btuVar.c;
        cnx.I(this.h.g(btuVar.a, ccoVar.f, a(ccoVar), dzmVar, i));
        ((JobService) this.m.a).jobFinished((JobParameters) btuVar.d, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x032d A[Catch: all -> 0x044a, RemoteException -> 0x044c, TryCatch #15 {all -> 0x044a, blocks: (B:215:0x0315, B:232:0x035c, B:320:0x044d, B:321:0x0459, B:224:0x032d, B:226:0x033b, B:228:0x0342, B:230:0x034c, B:231:0x034e, B:227:0x0340), top: B:438:0x02c0 }] */
    /* JADX WARN: Removed duplicated region for block: B:409:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0520  */
    /* JADX WARN: Type inference failed for: r26v0, types: [btv] */
    /* JADX WARN: Type inference failed for: r2v20, types: [dki] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v17, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v21, types: [long] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v70 */
    /* JADX WARN: Type inference failed for: r4v71 */
    /* JADX WARN: Type inference failed for: r4v72 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28, types: [btw] */
    /* JADX WARN: Type inference failed for: r5v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v16, types: [android.content.ServiceConnection] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v28, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r6v29, types: [bqm] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v31, types: [bqm] */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r6v35 */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v41 */
    /* JADX WARN: Type inference failed for: r6v43 */
    /* JADX WARN: Type inference failed for: r6v44 */
    /* JADX WARN: Type inference failed for: r6v45 */
    /* JADX WARN: Type inference failed for: r6v46 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [bqm] */
    /* JADX WARN: Type inference failed for: r6v7, types: [bqm] */
    /* JADX WARN: Type inference failed for: r8v1, types: [btd] */
    /* JADX WARN: Type inference failed for: r8v3, types: [btd] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(defpackage.btu r27) {
        /*
            Method dump skipped, instructions count: 1324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.btv.c(btu):void");
    }

    public final void d(btu btuVar, boolean z) {
        g(btuVar, null, 1, z);
    }

    public final boolean e(boolean z, String str, cck cckVar) {
        Set setA = z ? this.k.a(cckVar, str) : this.k.b(cckVar, str);
        Iterator it = setA.iterator();
        while (it.hasNext()) {
            int iOrdinal = ((cdl) it.next()).ordinal();
            if (iOrdinal == 0) {
                f(ccj.cA);
            } else if (iOrdinal == 1) {
                f(ccj.cz);
            } else if (iOrdinal == 2) {
                f(ccj.cD);
            } else if (iOrdinal == 3) {
                f(ccj.cB);
            }
        }
        return setA.isEmpty();
    }

    public final void f(int i) {
        synchronized (b) {
            btu btuVar = this.d;
            if (btuVar != null) {
                btuVar.e.k(i);
            } else {
                this.i.k(i);
            }
        }
    }
}
