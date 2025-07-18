package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Base64;
import j$.time.Duration;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class brc implements cbv {
    private final Context a;

    public brc(Context context) {
        this.a = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Object, java.lang.Runnable] */
    @Override // defpackage.cbv
    public final void a(String str, Map map, ccx ccxVar) {
        final fuu fuuVar = new fuu(ccxVar);
        Context context = this.a;
        fcy fcyVar = new fcy(context, (byte[]) null);
        csg csgVarT = clq.t(new bsr(context, 1));
        ceu.f(context);
        if (!elh.a.a().a()) {
            bnl bnlVar = new bnl(fcyVar, str, map, fuuVar);
            long jA = bnlVar.e.a();
            ((Handler) fcyVar.c).postAtTime(new bnk(fcyVar, bnlVar, jA, 0), bnlVar, jA + SystemClock.uptimeMillis());
            bnlVar.g.c(cqw.b, boh.COARSE);
            ?? r7 = fcyVar.a;
            bnr bnrVar = (bnr) r7;
            bnrVar.a.offer(bnlVar);
            bnrVar.c.post(r7);
            return;
        }
        final bnz bnzVar = (bnz) csgVarT.a();
        Duration duration = bok.a;
        boj bojVar = new boj(null);
        Duration duration2 = bok.a;
        if (duration2 == null) {
            throw new NullPointerException("Null initTimeout");
        }
        bojVar.a = duration2;
        bojVar.b = duration2;
        bojVar.a(true);
        bojVar.d = new Bundle();
        bojVar.a(false);
        if (bojVar.e == 1 && bojVar.a != null && bojVar.b != null && bojVar.d != null) {
            ((fcy) bnzVar.a).k(str, map, new bok(bojVar.a, bojVar.b, bojVar.c, bojVar.d)).g(new cab() { // from class: bns
                @Override // defpackage.cab
                public final void a(cag cagVar) {
                    String strEncodeToString;
                    Object obj = bnzVar.b;
                    Exception excB = cagVar.b();
                    if (excB != null) {
                        strEncodeToString = bnz.a((Context) obj, excB);
                    } else if (((cal) cagVar).c) {
                        strEncodeToString = bnz.a((Context) obj, new CancellationException("Task is canceled"));
                    } else {
                        strEncodeToString = Base64.encodeToString((byte[]) ((brb) cagVar.c()).a, 11);
                    }
                    fuuVar.q(strEncodeToString);
                }
            });
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (bojVar.a == null) {
            sb.append(" initTimeout");
        }
        if (bojVar.b == null) {
            sb.append(" snapshotTimeout");
        }
        if (bojVar.e == 0) {
            sb.append(" reinitializeHandleOnGetSnapshot");
        }
        if (bojVar.d == null) {
            sb.append(" extras");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
