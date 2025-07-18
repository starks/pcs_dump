package defpackage;

import android.content.Context;
import googledata.experiments.mobile.gmscore.brella.GmscoreBrella;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class brh {
    public static final cbx a = cbr.c("DynamitePhenoInit");
    private static boolean b = false;

    public static synchronized void a(Context context) {
        djy djyVarA;
        if (b) {
            return;
        }
        String strValueOf = String.valueOf(context.getPackageName());
        cem.b(context);
        byte[] bArr = new byte[0];
        cem cemVarA = cem.a(context);
        if (cemVarA == null) {
            djyVarA = dju.a;
        } else {
            brb brbVarF = cemVarA.f();
            cgr cgrVar = GmscoreBrella.a;
            djyVarA = brbVarF.A(cej.b(context, "com.google.android.gms.learning"), new String[]{"BRELLA", "BRELLA_COUNTERS"}, bArr);
        }
        cnx.J(djyVarA, new ars("com.google.android.gms.learning#".concat(strValueOf), 6), diy.a);
        b = true;
    }
}
