package defpackage;

import com.google.android.apps.aicore.aidl.AIFeature;
import com.google.android.gms.learning.dynamite.training.InAppTrainerImpl;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ayn implements crp {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ ayn(cxg cxgVar, int i) {
        this.c = i;
        this.a = cxgVar;
        this.b = "ondevicesafety-pa.googleapis.com";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [djy, java.lang.Object] */
    @Override // defpackage.crp
    public final Object a(Object obj) {
        switch (this.c) {
            case 0:
                String str = (String) ((cxg) this.a).getOrDefault((axi) obj, this.b);
                List listB = eor.a().b();
                eop eopVar = listB.isEmpty() ? null : (eop) listB.get(0);
                if (eopVar == null) {
                    throw new eoo();
                }
                eon eonVarB = eopVar.b(str);
                ((fbz) eonVarB).d(33554432);
                return eonVarB.a();
            case 1:
                ((anw) this.a).c(this.b);
                return obj;
            case 2:
                bbo bboVar = (bbo) this.a;
                ((bbq) this.b).i.b(bboVar.d(), 1, bboVar.a());
                return bboVar.c();
            case 3:
                czn cznVar = bbq.b;
                return new bbp((bbc) this.b, (csd) this.a, (ayk) obj);
            case 4:
                ((czl) ((czl) ((czl) bbq.b.c()).h((Exception) obj)).i("com/google/android/apps/miphone/astrea/pd/processor/impl/ProtectedDownloadProcessorImpl", "integrityCheck", AIFeature.Id.AIAI_ZERO_STATE_2, "ProtectedDownloadProcessorImpl.java")).p("Failed to get attestation token.");
                return new bbp((bbc) this.b, (csd) this.a, new ayk(eea.b, 3));
            case 5:
                throw null;
            case 6:
                return InAppTrainerImpl.$r8$lambda$97OQ_75UeTG3jVunfznmec81ylw((InAppTrainerImpl) this.a, (bxh) this.b, (Boolean) obj);
            case 7:
                return InAppTrainerImpl.$r8$lambda$R_YmcIhsVd8wIQoa0VUWJYUdglc((InAppTrainerImpl) this.a, (bxh) this.b, (IOException) obj);
            case 8:
                return InAppTrainerImpl.m20$r8$lambda$nXLQM9aoMYeviY1aLxChFHUC6E((InAppTrainerImpl) this.a, (bxh) this.b, (Void) obj);
            case 9:
                return InAppTrainerImpl.$r8$lambda$YlO8MyQP7SrPfvT1vOUSdP_YKBc((InAppTrainerImpl) this.a, (bxh) this.b, (bxf) obj);
            case 10:
                return InAppTrainerImpl.$r8$lambda$LuBzWy4wstyNXKJnW07wxeh91n8((InAppTrainerImpl) this.a, (bxh) this.b, (IOException) obj);
            case 11:
                throw null;
            default:
                cfy cfyVar = (cfy) obj;
                int i = cgi.a;
                cfw cfwVar = cfw.a;
                egd egdVar = cfyVar.b;
                Object obj2 = this.a;
                if (egdVar.containsKey(obj2)) {
                    cfwVar = (cfw) egdVar.get(obj2);
                }
                Object obj3 = this.b;
                asr asrVar = (asr) cfwVar.toBuilder();
                if (!DesugarCollections.unmodifiableList(((cfw) asrVar.a).c).contains(obj3)) {
                    asrVar.d((String) obj3);
                }
                asr asrVar2 = (asr) cfyVar.toBuilder();
                if (!asrVar.a.isMutable()) {
                    asrVar.B();
                }
                cfw cfwVar2 = (cfw) asrVar.a;
                cfwVar2.b = 1 | cfwVar2.b;
                cfwVar2.d = (String) obj3;
                asrVar2.c((String) obj2, (cfw) asrVar.z());
                return (cfy) asrVar2.z();
        }
    }

    public /* synthetic */ ayn(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    public /* synthetic */ ayn(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    public /* synthetic */ ayn(String str, String str2, int i) {
        this.c = i;
        this.a = str;
        this.b = "";
    }
}
