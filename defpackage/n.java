package defpackage;

import android.app.job.JobParameters;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.learning.dynamite.training.InAppTrainingServiceImpl;
import com.google.android.gms.learning.internal.training.InAppJobService;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class n implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ n(bno bnoVar, Map map, bof bofVar, int i) {
        this.d = i;
        this.c = bnoVar;
        this.b = map;
        this.a = bofVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v24, types: [btg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v7, types: [djy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v14, types: [java.lang.Object, java.util.concurrent.Future] */
    @Override // java.lang.Runnable
    public final void run() {
        byte[] bArrD;
        switch (this.d) {
            case 0:
                bg bgVar = bg.a;
                return;
            case 1:
                int i = h.e;
                ((ViewGroup) this.b).endViewTransition((View) this.a);
                Object obj = this.c;
                ((i) obj).a.a.f((bt) obj);
                return;
            case 2:
                bo.x((View) this.b, (Rect) this.c);
                return;
            case 3:
                ?? r0 = this.b;
                Object obj2 = this.c;
                try {
                    bArrD = ((bno) obj2).a != null ? ((bno) obj2).a.d(r0) : null;
                    if (bArrD == null) {
                        ((bno) obj2).b = ayg.k("Received null");
                        bArrD = ((bno) obj2).b;
                    }
                } catch (Exception e) {
                    bno bnoVar = (bno) obj2;
                    bnoVar.b = ayg.l("Snapshot failed: ".concat(e.toString()), e);
                    bArrD = bnoVar.b;
                    bnoVar.close();
                }
                bof bofVar = (bof) this.a;
                if (bofVar.b) {
                    throw new RuntimeException("BlockingChannel can be written only once.");
                }
                bofVar.b = true;
                bofVar.a.offer(bArrD);
                return;
            case 4:
                InAppTrainingServiceImpl.$r8$lambda$7yFM7fFTrbxxIw4saooezJO5994((InAppTrainingServiceImpl) this.a, this.b, this.c);
                return;
            case 5:
                ((InAppJobService) this.b).lambda$onStartJob$0((Context) this.a, (JobParameters) this.c);
                return;
            case 6:
                Object obj3 = this.c;
                Object obj4 = this.b;
                try {
                    try {
                        cnx.H(this.a);
                        Log.i("PhenotypeBackgroundRecv", "Successfully updated snapshot for " + ((String) obj4));
                    } catch (ExecutionException e2) {
                        Log.w("PhenotypeBackgroundRecv", "Failed to update local snapshot for " + ((String) obj4), e2);
                    }
                    return;
                } finally {
                    ((BroadcastReceiver.PendingResult) obj3).finish();
                }
            case 7:
                ?? r02 = this.b;
                Object obj5 = this.c;
                Object obj6 = this.a;
                int size = r02.size();
                for (int i2 = 0; i2 < size; i2++) {
                    erz erzVar = (erz) r02.get(i2);
                    synchronized (erzVar) {
                        erzVar.b((eqo) obj5);
                    }
                }
                synchronized (obj6) {
                    ((erm) obj6).e();
                }
                ((erm) obj6).i();
                return;
            case 8:
                ((eur) this.b).b.e((ebz) this.c, (epc) this.a);
                return;
            case 9:
                ((euq) this.b).d.y((eqo) this.a, (epc) this.c);
                return;
            case 10:
                Object obj7 = this.b;
                exm exmVar = ((exd) obj7).b;
                if (obj7 != exmVar.t || exmVar.u) {
                    return;
                }
                exmVar.k((eog) this.a);
                if (this.c != emh.SHUTDOWN) {
                    ((exd) this.b).b.G.b(2, "Entering {0} state with picker: {1}", this.c, this.a);
                    ((exd) this.b).b.p.a((emh) this.c);
                    return;
                }
                return;
            default:
                synchronized (((ezn) this.c).a) {
                    Object obj8 = this.c;
                    if (((ezn) obj8).b) {
                        return;
                    }
                    ((ezn) obj8).a();
                    ((ezs) this.a).b.g.execute(new euy(this, this.b, 11));
                    return;
                }
        }
    }

    public n(eur eurVar, ebz ebzVar, epc epcVar, int i) {
        this.d = i;
        this.c = ebzVar;
        this.a = epcVar;
        this.b = eurVar;
    }

    public n(ezs ezsVar, ezn eznVar, ezt eztVar, int i) {
        this.d = i;
        this.c = eznVar;
        this.b = eztVar;
        this.a = ezsVar;
    }

    public /* synthetic */ n(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public /* synthetic */ n(Object obj, Object obj2, Object obj3, int i, byte[] bArr) {
        this.d = i;
        this.b = obj;
        this.a = obj2;
        this.c = obj3;
    }

    public n(Object obj, Object obj2, Object obj3, int i, char[] cArr) {
        this.d = i;
        this.a = obj2;
        this.c = obj3;
        this.b = obj;
    }
}
