package defpackage;

import android.os.Process;
import android.util.Log;
import com.google.android.apps.aicore.aidl.AIFeature;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.net.HttpURLConnection;
import java.util.concurrent.Future;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class chg implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ chg(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r6v56, types: [exv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v57, types: [exv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v58, types: [exv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v7, types: [csg, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                try {
                    cnx.H(this.a);
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 1:
                if (((Boolean) ((cgm) this.a).c.a()).booleanValue()) {
                    Log.i("PhenotypeProcessReaper", "Killing process to refresh experiment configuration");
                    Process.killProcess(Process.myPid());
                    System.exit(0);
                    return;
                }
                return;
            case 2:
                ckx ckxVar = (ckx) this.a;
                ckxVar.b = false;
                ws wsVar = ckxVar.c.x;
                if (wsVar != null && wsVar.l()) {
                    ckx ckxVar2 = (ckx) this.a;
                    ckxVar2.a(ckxVar2.a);
                    return;
                }
                ckx ckxVar3 = (ckx) this.a;
                BottomSheetBehavior bottomSheetBehavior = ckxVar3.c;
                if (bottomSheetBehavior.w == 2) {
                    bottomSheetBehavior.J(ckxVar3.a);
                    return;
                }
                return;
            case 3:
                Object obj = this.a;
                synchronized (obj) {
                    if (((dxe) obj).n == 4) {
                        return;
                    }
                    int i = ((dxe) obj).n;
                    ((dxe) obj).n = 4;
                    ((dxe) obj).r(eis.b, "request cancelled via close()", i);
                    Future future = ((dxe) obj).i;
                    if (future != null) {
                        future.cancel(true);
                    }
                    if (((dxe) obj).f) {
                        ((dxe) obj).h.run();
                    }
                    return;
                }
            case 4:
                ((HttpURLConnection) this.a).disconnect();
                return;
            case 5:
                dxx dxxVar = (dxx) this.a;
                dxxVar.b.close();
                dxxVar.a.close();
                return;
            case 6:
                try {
                    ((emk) this.a).j(new TimeoutException("context timed out"));
                    return;
                } catch (Throwable th) {
                    emr.c.logp(Level.SEVERE, "io.grpc.Context$CancellableContext$1CancelOnExpiration", "run", "Cancel threw an exception, which should not happen", th);
                    return;
                }
            case 7:
                ((erk) this.a).b();
                return;
            case 8:
                Object obj2 = this.a;
                synchronized (obj2) {
                    if (((erm) obj2).o(4)) {
                        ((erm) obj2).p(((erm) obj2).j);
                    }
                }
                return;
            case 9:
                etg etgVar = (etg) this.a;
                exo exoVar = etgVar.e;
                if (exoVar != null && exoVar.b()) {
                    etgVar.e.a();
                }
                etgVar.d = null;
                return;
            case 10:
                ((eur) this.a).b.b();
                return;
            case 11:
                ((euq) this.a).d.B();
                return;
            case 12:
                this.a.b(true);
                return;
            case 13:
                this.a.b(false);
                return;
            case 14:
                this.a.e();
                return;
            case 15:
                ((euv) this.a).f.g();
                return;
            case 16:
                ((euv) this.a).q();
                return;
            case 17:
                ((euv) this.a).f.f();
                return;
            case 18:
                ((euv) this.a).f.e();
                return;
            case AIFeature.Type.IMAGE_DESCRIPTION /* 19 */:
                ((euu) this.a).a.e();
                return;
            default:
                ewn ewnVar = (ewn) this.a;
                ewnVar.s = null;
                ewnVar.c.a(2, "CONNECTING after backoff");
                ((ewn) this.a).b(emh.CONNECTING);
                ((ewn) this.a).h();
                return;
        }
    }

    public chg(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
