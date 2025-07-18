package defpackage;

import android.content.Context;
import com.google.android.apps.miphone.astrea.fl.brella.service.AstreaExampleStoreService;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class bnk implements Runnable {
    public final /* synthetic */ long a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ bnk(bnm bnmVar, long j, bnm bnmVar2, int i) {
        this.d = i;
        this.b = bnmVar;
        this.a = j;
        this.c = bnmVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.d;
        if (i == 0) {
            String str = "getResults init timeout: " + this.a + " ms";
            bnp bnpVar = (bnp) this.c;
            boi boiVar = bnpVar.g;
            fcy fcyVar = (fcy) this.b;
            bnpVar.b(new bno((Context) fcyVar.b, (bnr) fcyVar.a, str, boiVar));
            return;
        }
        if (i != 1) {
            String str2 = "getResults snapshot timeout: " + this.a + " ms";
            bnm bnmVar = (bnm) this.b;
            bno bnoVar = new bno(bnmVar.a, bnmVar.b, str2, bnmVar.c);
            String strA = bnoVar.a(new HashMap());
            bnoVar.close();
            ((bnm) this.c).a(strA);
            return;
        }
        avm avmVar = ((AstreaExampleStoreService) this.b).n;
        bdn bdnVar = (bdn) this.c;
        int iB = bdm.b(bdnVar.g);
        if (iB == 0) {
            iB = bdm.r;
        }
        String strA2 = bdm.a(iB);
        if (iB == 0) {
            throw null;
        }
        String str3 = bdnVar.c;
        clq.v(!clq.O(strA2));
        euw euwVarO = ayg.o(auw.FC_TRAINING_START_QUERY, str3);
        asr asrVar = (asr) auj.a.createBuilder();
        asr asrVar2 = (asr) auk.a.createBuilder();
        if (!asrVar2.a.isMutable()) {
            asrVar2.B();
        }
        auk aukVar = (auk) asrVar2.a;
        strA2.getClass();
        aukVar.b |= 1;
        aukVar.c = strA2;
        auk aukVar2 = (auk) asrVar2.z();
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        auj aujVar = (auj) asrVar.a;
        aukVar2.getClass();
        aujVar.c = aukVar2;
        aujVar.b = 1;
        euwVarO.l((auj) asrVar.z());
        aux auxVarK = euwVarO.k();
        ajc ajcVar = bdnVar.d;
        if (ajcVar == null) {
            ajcVar = ajc.a;
        }
        long j = this.a;
        clq.v(auxVarK.c == auw.FC_TRAINING_START_QUERY);
        clq.v(auxVarK.b.b == 1);
        ajcVar.getClass();
        clq.v(ajcVar.isInitialized());
        auz auzVarF = ayg.f(auxVarK, 1, 0L);
        auzVarF.e(j);
        auzVarF.g(ajcVar);
        avmVar.d(auzVarF.a());
    }

    public /* synthetic */ bnk(Object obj, Object obj2, long j, int i) {
        this.d = i;
        this.b = obj;
        this.c = obj2;
        this.a = j;
    }
}
