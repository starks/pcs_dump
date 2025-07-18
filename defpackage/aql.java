package defpackage;

import android.content.pm.PackageManager;
import android.net.Uri;
import com.google.android.gms.common.api.Status;
import j$.util.Optional;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class aql implements cad {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ aql(aqm aqmVar, cad cadVar, cac cacVar, int i) {
        this.d = i;
        this.a = aqmVar;
        this.b = cadVar;
        this.c = cacVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [cad, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [cad, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [cac, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v2, types: [cac, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3, types: [feu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v4, types: [feu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.cad
    public final void d(Object obj) throws PackageManager.NameNotFoundException {
        cag cagVarN;
        int i = this.d;
        if (i == 0) {
            cag cagVarL = ((brb) obj).L();
            aqm aqmVar = (aqm) this.a;
            cagVarL.k(aqmVar.a, this.b);
            cagVarL.j(aqmVar.a, this.c);
            return;
        }
        if (i == 1) {
            cag cagVarJ = ((brb) obj).J();
            aqm aqmVar2 = (aqm) this.a;
            cagVarJ.k(aqmVar2.a, this.b);
            cagVarJ.j(aqmVar2.a, this.c);
            return;
        }
        int i2 = 2;
        if (i == 2) {
            czl czlVar = (czl) ((czl) arw.a.c()).i("com/google/android/apps/miphone/astrea/fl/server/TrainerGrpcBindableService", "scheduleFederatedComputation", 72, "TrainerGrpcBindableService.java");
            apd apdVar = (apd) this.a;
            czlVar.t("Scheduling training succeeded [population=%s, session=%s]", apdVar.f, apdVar.d);
            arw arwVar = (arw) this.c;
            if (arwVar.c(apdVar)) {
                Optional optional = arwVar.b;
                Executor executor = arwVar.c;
                String str = apdVar.d;
                Uri.parse(apdVar.h);
                Uri.parse(apdVar.i);
                cnx.J(djr.q(((arr) optional.get()).b()), new ars(str, 1), executor);
            }
            asr asrVar = (asr) apf.a.createBuilder();
            int i3 = ape.b;
            if (!asrVar.a.isMutable()) {
                asrVar.B();
            }
            ?? r9 = this.b;
            apf apfVar = (apf) asrVar.a;
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            apfVar.c = i4;
            apfVar.b |= 1;
            r9.c((apf) asrVar.z());
            r9.a();
            return;
        }
        if (i != 3) {
            boolean z = cbh.a;
            biz bizVar = (biz) this.a;
            int iE = bht.d.e(bizVar.b, 12451000);
            Object obj2 = this.c;
            if (iE == 0) {
                bku bkuVar = new bku();
                bkuVar.a = new bys((String) obj2, i2);
                cagVarN = bizVar.f(bkuVar.a());
            } else {
                cagVarN = up.n(new bix(new Status(16)));
            }
            cagVarN.j(this.b, new cbg((String) obj2, 0));
            return;
        }
        czl czlVar2 = (czl) ((czl) arw.a.c()).i("com/google/android/apps/miphone/astrea/fl/server/TrainerGrpcBindableService", "scheduleFederatedComputation", 100, "TrainerGrpcBindableService.java");
        apd apdVar2 = (apd) this.a;
        czlVar2.t("Cancelling training succeeded [population=%s, session=%s]", apdVar2.f, apdVar2.d);
        arw arwVar2 = (arw) this.c;
        if (arwVar2.c(apdVar2)) {
            cnx.J(djr.q(((arr) arwVar2.b.get()).a()), new ars(apdVar2.d, 0), arwVar2.c);
        }
        asr asrVar2 = (asr) apf.a.createBuilder();
        int i5 = ape.b;
        if (!asrVar2.a.isMutable()) {
            asrVar2.B();
        }
        ?? r92 = this.b;
        apf apfVar2 = (apf) asrVar2.a;
        int i6 = i5 - 1;
        if (i5 == 0) {
            throw null;
        }
        apfVar2.c = i6;
        apfVar2.b |= 1;
        r92.c((apf) asrVar2.z());
        r92.a();
    }

    public /* synthetic */ aql(arw arwVar, apd apdVar, feu feuVar, int i) {
        this.d = i;
        this.c = arwVar;
        this.a = apdVar;
        this.b = feuVar;
    }

    public /* synthetic */ aql(byw bywVar, String str, Executor executor, int i) {
        this.d = i;
        this.a = bywVar;
        this.c = str;
        this.b = executor;
    }
}
