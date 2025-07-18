package defpackage;

import android.net.Uri;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cjc extends cjh {
    public static final cjh a = new cjc();

    private cjc() {
    }

    @Override // defpackage.cjh
    public final String a(int i) {
        return "singleproc";
    }

    @Override // defpackage.cjh
    public final /* bridge */ /* synthetic */ cjd b(civ civVar, String str, Executor executor, fcy fcyVar, int i) {
        een eenVarA;
        if (civVar.e) {
            eenVarA = een.a();
        } else {
            een eenVar = een.a;
            egr egrVar = egr.a;
            eenVarA = een.a;
        }
        cjj cjjVar = new cjj(civVar.b, eenVarA);
        Uri uri = civVar.a;
        return new cjd(str, cnx.C(uri), cjjVar, executor, fcyVar, civVar.c, new clq(null, null, null, null, null));
    }
}
