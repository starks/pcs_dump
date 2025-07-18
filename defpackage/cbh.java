package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cbh {
    private static final String[] c = {"COLLECTION_BASIS_VERIFIER"};
    public static boolean a = false;
    public static final Object b = new Object();

    public static void a(cay cayVar, ekb ekbVar) {
        ExecutorService threadPoolExecutor;
        byw bywVar = new byw(cayVar.a);
        String strValueOf = String.valueOf(cayVar.a.getPackageName());
        Context context = cayVar.a;
        if (ekbVar.a == null) {
            try {
                ekbVar.a = Integer.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
                ekbVar.a = -1;
            }
        }
        String strConcat = "com.google.android.libraries.consentverifier#".concat(strValueOf);
        cag cagVarB = bywVar.b(strConcat, ((Integer) ekbVar.a).intValue(), c, null);
        cayVar.b.c();
        if (up.m(cayVar.a)) {
            threadPoolExecutor = bxz.a.h(10, 1);
        } else {
            RejectedExecutionHandler rejectedExecutionHandler = cbk.a;
            LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(10);
            eqh eqhVar = new eqh((byte[]) null, (byte[]) null);
            eqhVar.h("ConsentVerifierLibraryThread-%d");
            threadPoolExecutor = new ThreadPoolExecutor(0, 10, 10L, TimeUnit.SECONDS, linkedBlockingQueue, eqh.m(eqhVar), cbk.a);
        }
        try {
            cagVarB.k(threadPoolExecutor, new aql(bywVar, strConcat, threadPoolExecutor, 4));
            cagVarB.j(threadPoolExecutor, new cbg(strConcat, 1));
        } catch (RejectedExecutionException e) {
            Log.w("CBVerifier", String.format("Execution failure when updating phenotypeflags for %s. %s", strConcat, e));
        }
    }
}
