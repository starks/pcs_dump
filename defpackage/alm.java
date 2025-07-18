package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.apps.aicore.aidl.AIFeature;
import com.google.android.apps.aicore.aidl.IAICoreService;
import com.google.android.apps.aicore.aidl.IDownloadListener;
import com.google.android.apps.aicore.aidl.IDownloadListener2;
import com.google.android.apps.aicore.aidl.ILLMService;
import com.google.android.apps.aicore.aidl.ISmartReplyService;
import com.google.android.apps.aicore.aidl.ISummarizationService;
import com.google.android.apps.aicore.aidl.ITarsService;
import com.google.android.apps.aicore.aidl.ITextEmbeddingService;
import com.google.android.apps.miphone.astrea.ai.service.GenAiInferenceService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alm extends akh implements IInterface {
    final /* synthetic */ GenAiInferenceService a;

    public alm() {
        super("com.google.android.apps.miphone.astrea.ai.aidl.IGenAiInferenceService");
    }

    public final int a(AIFeature aIFeature) {
        aIFeature.getClass();
        try {
            return this.a.c().getFeatureStatus(aIFeature);
        } catch (RemoteException e) {
            ((czl) ((czl) ((czl) GenAiInferenceService.a.e()).h(e)).i("com/google/android/apps/miphone/astrea/ai/service/GenAiInferenceService$GenAiServiceBinderStub", "getFeatureStatus", (char) 212, "GenAiInferenceService.java")).p("Failed to get feature status");
            return 0;
        }
    }

    public final int b(AIFeature aIFeature) {
        aIFeature.getClass();
        try {
            return this.a.c().requestDownloadableFeature(aIFeature);
        } catch (RemoteException e) {
            ((czl) ((czl) ((czl) GenAiInferenceService.a.e()).h(e)).i("com/google/android/apps/miphone/astrea/ai/service/GenAiInferenceService$GenAiServiceBinderStub", "requestDownloadableFeature", (char) 200, "GenAiInferenceService.java")).p("Failed to request downloadable feature");
            return 1;
        }
    }

    public final int c(AIFeature aIFeature, IDownloadListener iDownloadListener) {
        aIFeature.getClass();
        iDownloadListener.getClass();
        try {
            return this.a.c().requestDownloadableFeatureWithDownloadListener(aIFeature, iDownloadListener);
        } catch (RemoteException e) {
            ((czl) ((czl) ((czl) GenAiInferenceService.a.e()).h(e)).i("com/google/android/apps/miphone/astrea/ai/service/GenAiInferenceService$GenAiServiceBinderStub", "requestDownloadableFeatureWithDownloadListener", (char) 167, "GenAiInferenceService.java")).p("Failed to request downloadable feature");
            iDownloadListener.onDownloadFailed(aIFeature.getName(), String.format("Failed to request download: %s", e.getMessage()));
            return 1;
        }
    }

    public final int d(AIFeature aIFeature, IDownloadListener2 iDownloadListener2) {
        aIFeature.getClass();
        iDownloadListener2.getClass();
        try {
            return this.a.c().requestDownloadableFeatureWithDownloadListener2(aIFeature, iDownloadListener2);
        } catch (RemoteException e) {
            ((czl) ((czl) ((czl) GenAiInferenceService.a.e()).h(e)).i("com/google/android/apps/miphone/astrea/ai/service/GenAiInferenceService$GenAiServiceBinderStub", "requestDownloadableFeatureWithDownloadListener2", (char) 184, "GenAiInferenceService.java")).p("Failed to request downloadable feature");
            iDownloadListener2.onDownloadFailed(aIFeature.getName(), 0, String.format("Failed to request download: %s", e.getMessage()));
            return 1;
        }
    }

    @Override // defpackage.akh
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                AIFeature[] aIFeatureArrM = m();
                parcel2.writeNoException();
                parcel2.writeTypedArray(aIFeatureArrM, 1);
                return true;
            case 2:
                int i3 = parcel.readInt();
                enforceNoDataAvail(parcel);
                AIFeature aIFeatureE = e(i3);
                parcel2.writeNoException();
                aki.c(parcel2, aIFeatureE);
                return true;
            case 3:
                AIFeature aIFeature = (AIFeature) aki.a(parcel, AIFeature.CREATOR);
                enforceNoDataAvail(parcel);
                int iA = a(aIFeature);
                parcel2.writeNoException();
                parcel2.writeInt(iA);
                return true;
            case 4:
                AIFeature aIFeature2 = (AIFeature) aki.a(parcel, AIFeature.CREATOR);
                enforceNoDataAvail(parcel);
                int iB = b(aIFeature2);
                parcel2.writeNoException();
                parcel2.writeInt(iB);
                return true;
            case 5:
                AIFeature aIFeature3 = (AIFeature) aki.a(parcel, AIFeature.CREATOR);
                enforceNoDataAvail(parcel);
                als alsVarG = g(aIFeature3);
                parcel2.writeNoException();
                aki.d(parcel2, alsVarG);
                return true;
            case 6:
                AIFeature aIFeature4 = (AIFeature) aki.a(parcel, AIFeature.CREATOR);
                enforceNoDataAvail(parcel);
                alw alwVarH = h(aIFeature4);
                parcel2.writeNoException();
                aki.d(parcel2, alwVarH);
                return true;
            case 7:
                AIFeature aIFeature5 = (AIFeature) aki.a(parcel, AIFeature.CREATOR);
                enforceNoDataAvail(parcel);
                ama amaVarI = i(aIFeature5);
                parcel2.writeNoException();
                aki.d(parcel2, amaVarI);
                return true;
            case 8:
                AIFeature aIFeature6 = (AIFeature) aki.a(parcel, AIFeature.CREATOR);
                IDownloadListener iDownloadListenerAsInterface = IDownloadListener.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                int iC = c(aIFeature6, iDownloadListenerAsInterface);
                parcel2.writeNoException();
                parcel2.writeInt(iC);
                return true;
            case 9:
                boolean zL = l();
                parcel2.writeNoException();
                int i4 = aki.a;
                parcel2.writeInt(zL ? 1 : 0);
                return true;
            case 10:
                AIFeature aIFeature7 = (AIFeature) aki.a(parcel, AIFeature.CREATOR);
                enforceNoDataAvail(parcel);
                ami amiVarK = k(aIFeature7);
                parcel2.writeNoException();
                aki.d(parcel2, amiVarK);
                return true;
            case 11:
                AIFeature aIFeature8 = (AIFeature) aki.a(parcel, AIFeature.CREATOR);
                IDownloadListener2 iDownloadListener2AsInterface = IDownloadListener2.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                int iD = d(aIFeature8, iDownloadListener2AsInterface);
                parcel2.writeNoException();
                parcel2.writeInt(iD);
                return true;
            case 12:
                AIFeature aIFeature9 = (AIFeature) aki.a(parcel, AIFeature.CREATOR);
                enforceNoDataAvail(parcel);
                ame ameVarJ = j(aIFeature9);
                parcel2.writeNoException();
                aki.d(parcel2, ameVarJ);
                return true;
            case 13:
                int i5 = parcel.readInt();
                int i6 = parcel.readInt();
                enforceNoDataAvail(parcel);
                AIFeature aIFeatureF = f(i5, i6);
                parcel2.writeNoException();
                aki.c(parcel2, aIFeatureF);
                return true;
            default:
                return false;
        }
    }

    public final AIFeature e(int i) {
        return this.a.c().getFeature(i);
    }

    public final AIFeature f(int i, int i2) throws RemoteException {
        if (this.a.c().getApiVersion() >= 6) {
            return this.a.c().getFeatureOrControl(i, i2);
        }
        throw new RemoteException("getFeatureOrControl is not supported before AICoreVersion V7");
    }

    public final als g(AIFeature aIFeature) {
        aIFeature.getClass();
        return new alr((ILLMService) anb.a(new amq(this.a.c(), aIFeature, 1)));
    }

    public final alw h(AIFeature aIFeature) {
        aIFeature.getClass();
        return new alv((ISmartReplyService) anb.a(new amq(this.a.c(), aIFeature, 0)));
    }

    public final ama i(AIFeature aIFeature) {
        aIFeature.getClass();
        return new alz((ISummarizationService) anb.a(new amq(this.a.c(), aIFeature, 4)));
    }

    public final ame j(AIFeature aIFeature) {
        IAICoreService iAICoreServiceC = this.a.c();
        aIFeature.getClass();
        return new amd((ITarsService) anb.a(new amq(iAICoreServiceC, aIFeature, 2)));
    }

    public final ami k(AIFeature aIFeature) {
        aIFeature.getClass();
        return new amh((ITextEmbeddingService) anb.a(new amq(this.a.c(), aIFeature, 3)));
    }

    public final boolean l() {
        return this.a.c().isPersistentModeEnabled();
    }

    public final AIFeature[] m() {
        return this.a.c().listFeatures();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public alm(GenAiInferenceService genAiInferenceService) {
        this();
        this.a = genAiInferenceService;
    }
}
