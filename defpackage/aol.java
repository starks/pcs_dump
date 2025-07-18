package defpackage;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aol implements eko {
    private final ekr a;
    private final /* synthetic */ int b;

    public aol(ekr ekrVar, int i) {
        this.b = i;
        this.a = ekrVar;
    }

    @Override // defpackage.ffk, defpackage.ffj
    public final /* synthetic */ Object b() throws IOException {
        switch (this.b) {
            case 0:
                return new fsc(((ekg) this.a).b(), (byte[]) null);
            case 1:
                return new akr((aoa) this.a.b());
            case 2:
                return new aoo(((ekg) this.a).b());
            case 3:
                return new auh((akq) this.a.b());
            case 4:
                cxc cxcVarS = cxc.s(new awm(ann.c()), new avz(0), new avz(1), new avz(2));
                cxcVarS.getClass();
                return cxcVarS;
            case 5:
                return new ayu(cxg.g(((ekq) this.a).b()));
            case 6:
                return new bao((bba) this.a.b());
            case 7:
                return new bbb(((avn) this.a).b());
            default:
                Context contextB = ((ekg) this.a).b();
                cvo cvoVar = new cvo();
                for (String str : ffh.q(Arrays.copyOf(new String[]{"AmbientContextPolicy_FederatedCompute_ASI_PROD.binarypb", "AppLaunchPredictionMetricsPolicy_FederatedCompute_ASI_PROD.binarypb", "AutofillPolicy_FederatedCompute_ASI_PROD.binarypb", "ContentCapturePerformanceDataPolicy_FederatedCompute_ASI_PROD.binarypb", "GPPServicePolicyV2_FederatedCompute_GPPS_PROD.binarypb", "GPPServicePolicy_FederatedCompute_GPPS_PROD.binarypb", "LiveTranslatePolicy_FederatedCompute_ASI_PROD.binarypb", "NowPlayingUsagePolicy_FederatedCompute_ASI_PROD.binarypb", "PecanContextPolicy_FederatedCompute_ASI_PROD.binarypb", "PecanConversationFragmentEventPolicy_FederatedCompute_ASI_PROD.binarypb", "PecanConversationThreadEventPolicy_FederatedCompute_ASI_PROD.binarypb", "PecanLatencyAnalyticsEventPolicy_FederatedCompute_ASI_PROD.binarypb", "PecanMessageEventPolicy_FederatedCompute_ASI_PROD.binarypb", "PecanUsageEventPolicy_FederatedCompute_ASI_PROD.binarypb", "PlatformLoggingPolicy_FederatedCompute_PCS_RELEASE.binarypb", "SafecommsPolicy_FederatedCompute_ASI_PROD.binarypb", "SearchPolicy_FederatedCompute_ASI_PROD.binarypb", "SmartSelectAnalyticsPolicy_FederatedCompute_ASI_PROD.binarypb", "SmartSelectLearningPolicy_FederatedCompute_ASI_PROD.binarypb", "ToastQueryPolicy_FederatedCompute_ASI_PROD.binarypb"}, 20))) {
                    str.getClass();
                    InputStream inputStreamOpen = contextB.getAssets().open(str);
                    try {
                        inputStreamOpen.getClass();
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStreamOpen.available()));
                        byte[] bArr = new byte[8192];
                        for (int i = inputStreamOpen.read(bArr); i >= 0; i = inputStreamOpen.read(bArr)) {
                            byteArrayOutputStream.write(bArr, 0, i);
                        }
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArray.getClass();
                        fjp.x(inputStreamOpen, null);
                        aiw aiwVar = (aiw) efb.parseFrom(aiw.a, byteArray);
                        aiwVar.getClass();
                        if (aiwVar.b.size() != 1) {
                            throw new IllegalStateException(str + " has " + aiwVar.b.size() + " policies, expected 1.");
                        }
                        efm efmVar = aiwVar.b;
                        efmVar.getClass();
                        Object objF = ffh.F(efmVar);
                        objF.getClass();
                        ajc ajcVar = (ajc) objF;
                        String str2 = ajcVar.b;
                        Collection collection = (Collection) ((cvj) cvoVar).a.get(str2);
                        if (collection == null) {
                            Collection collectionA = cvoVar.a();
                            if (!collectionA.add(ajcVar)) {
                                throw new AssertionError("New Collection violated the Collection spec");
                            }
                            ((cvj) cvoVar).b++;
                            ((cvj) cvoVar).a.put(str2, collectionA);
                        } else if (collection.add(ajcVar)) {
                            ((cvj) cvoVar).b++;
                        }
                    } finally {
                    }
                }
                return cvoVar;
        }
    }
}
