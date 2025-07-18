package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class erq implements djj {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public erq(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.a = obj2;
        this.b = obj3;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [feu, java.lang.Object] */
    @Override // defpackage.djj
    public final void a(Throwable th) {
        if (this.d != 0) {
            this.a.b(th);
            return;
        }
        Object obj = this.b;
        ((ConcurrentHashMap) ((err) this.c).b).remove(this.a, obj);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [feu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [feu, java.lang.Object] */
    @Override // defpackage.djj
    public final /* synthetic */ void b(Object obj) {
        if (this.d == 0) {
            return;
        }
        beq beqVar = (beq) obj;
        this.a.c(beqVar);
        this.a.a();
        bfg bfgVarB = bfg.b(((bes) this.b).d);
        Object obj2 = this.c;
        if (bfgVarB == null) {
            bfgVarB = bfg.UNRECOGNIZED;
        }
        try {
            beu beuVar = beqVar.d;
            if (beuVar == null) {
                beuVar = beu.a;
            }
            bfi bfiVar = (bfi) efb.parseFrom(bfi.a, beuVar.c, een.a());
            Map map = ((bfr) obj2).f;
            bew bewVar = bfiVar.b;
            if (bewVar == null) {
                bewVar = bew.a;
            }
            map.put(bfgVarB, bewVar);
        } catch (efp e) {
            ((czl) ((czl) ((czl) bfr.a.e()).h(e)).i("com/google/android/apps/miphone/astrea/survey/service/SurveyGrpcBindableService", "updateSurveySession", (char) 442, "SurveyGrpcBindableService.java")).p("Failed to parse survey trigger response.");
        }
    }
}
