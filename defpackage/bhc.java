package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bhc extends biz implements bgb {
    public static final /* synthetic */ int a = 0;
    private final csg l;

    static {
        new AtomicBoolean(false);
    }

    public bhc(Context context, csg csgVar) {
        fcy fcyVar = bga.m;
        biu biuVar = biv.m;
        eqh eqhVar = new eqh((char[]) null, (byte[]) null);
        eqhVar.a = new zl();
        super(context, fcyVar, biuVar, eqhVar.l());
        this.l = csgVar;
    }

    public static boolean b(djy djyVar) {
        if (djyVar.isDone() && !djyVar.isCancelled()) {
            try {
                a.f(djyVar);
                return true;
            } catch (RuntimeException | ExecutionException unused) {
            }
        }
        return false;
    }

    public static final cag d(bfx bfxVar, crp crpVar) {
        djy djyVarI;
        int i = 1;
        if (bfxVar.k) {
            Log.e("AbstractLogEventBuilder", "resolveComplianceData should not be invoked more than once per log.");
            djyVarI = dju.a;
        } else {
            bfxVar.k = true;
            bge bgeVar = bfxVar.i;
            if ((bgeVar != null && bgeVar.b() == eiz.b) || bgeVar != null) {
                bfxVar.a(bgeVar);
            }
            if (bfxVar.a.c()) {
                djyVarI = dju.a;
            } else {
                djy djyVarC = cnx.C(null);
                djyVarI = dij.i(dij.j(djyVarC, new aqf(bfxVar, djyVarC, 7), diy.a), new arl(bfxVar, 9), diy.a);
            }
        }
        return b(djyVarI) ? (cag) crpVar.a(bfxVar) : up.l(djyVarI).a(diy.a, new bgz(crpVar, bfxVar, i));
    }

    public final cag a(bfx bfxVar, bgv bgvVar) {
        bjt bjtVar = new bjt(this, bfxVar, this.h, bgvVar);
        boolean z = true;
        if (!bjtVar.h && !((Boolean) BasePendingResult.b.get()).booleanValue()) {
            z = false;
        }
        bjtVar.h = z;
        bkf bkfVar = this.i;
        bkfVar.n.sendMessage(bkfVar.n.obtainMessage(4, new cgm(new bjm(bjtVar), bkfVar.k.get(), this)));
        aso asoVar = new aso();
        aso asoVar2 = bmh.a;
        brb brbVar = new brb((byte[]) null, (char[]) null, (byte[]) null);
        bjtVar.g(new bmg(bjtVar, brbVar, asoVar, asoVar2));
        return (cag) brbVar.a;
    }

    public final void c(bgy bgyVar) {
        if (bgyVar.a.isEmpty()) {
            up.o(Status.a);
            return;
        }
        bku bkuVar = new bku();
        bkuVar.a = new bys(this, bgyVar, 1);
        bkuVar.b = new bhq[]{bgs.a};
        bkuVar.b();
        e(bkuVar.a());
    }
}
