package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.apps.aicore.aidl.ICancellationCallback;
import com.google.android.apps.aicore.aidl.IPrepareInferenceEngineCallback;
import com.google.android.apps.aicore.aidl.ISummarizationService;
import com.google.android.apps.aicore.aidl.SummarizationRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alz extends akh implements ama {
    final /* synthetic */ ISummarizationService a;

    public alz() {
        super("com.google.android.apps.miphone.astrea.ai.aidl.PccSummarizationService");
    }

    public final alo a(IPrepareInferenceEngineCallback iPrepareInferenceEngineCallback) {
        try {
            return new aln((ICancellationCallback) anb.a(new amy(this, this.a, iPrepareInferenceEngineCallback, 1)));
        } catch (RemoteException unused) {
            iPrepareInferenceEngineCallback.onPreparationFailure(6);
            return new aln(null);
        }
    }

    public final alo b(SummarizationRequest summarizationRequest, aly alyVar) {
        aly alyVar2;
        try {
            alyVar2 = alyVar;
            try {
                return new aln((ICancellationCallback) anb.a(new amt(this, this.a, summarizationRequest, alyVar2, 1)));
            } catch (RemoteException e) {
                e = e;
                ((czl) ((czl) ((czl) anb.a.e()).h(e)).i("com/google/android/apps/miphone/astrea/ai/service/GenAiServiceUtils$2", "runCancellableInference", 'l', "GenAiServiceUtils.java")).p("Failed to run summarization service");
                alyVar2.a(6);
                return new aln(null);
            }
        } catch (RemoteException e2) {
            e = e2;
            alyVar2 = alyVar;
        }
    }

    @Override // defpackage.akh
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        aly alxVar;
        if (i == 1) {
            SummarizationRequest summarizationRequest = (SummarizationRequest) aki.a(parcel, SummarizationRequest.CREATOR);
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                alxVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.apps.miphone.astrea.ai.aidl.PccSummarizationResultCallback");
                alxVar = iInterfaceQueryLocalInterface instanceof aly ? (aly) iInterfaceQueryLocalInterface : new alx(strongBinder);
            }
            enforceNoDataAvail(parcel);
            alo aloVarB = b(summarizationRequest, alxVar);
            parcel2.writeNoException();
            aki.d(parcel2, aloVarB);
        } else {
            if (i != 2) {
                return false;
            }
            IPrepareInferenceEngineCallback iPrepareInferenceEngineCallbackAsInterface = IPrepareInferenceEngineCallback.Stub.asInterface(parcel.readStrongBinder());
            enforceNoDataAvail(parcel);
            alo aloVarA = a(iPrepareInferenceEngineCallbackAsInterface);
            parcel2.writeNoException();
            aki.d(parcel2, aloVarA);
        }
        return true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public alz(ISummarizationService iSummarizationService) {
        this();
        this.a = iSummarizationService;
    }
}
