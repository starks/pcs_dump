package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.apps.aicore.aidl.ICancellationCallback;
import com.google.android.apps.aicore.aidl.ILLMService;
import com.google.android.apps.aicore.aidl.LLMRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alr extends akh implements als {
    final /* synthetic */ ILLMService a;

    public alr() {
        super("com.google.android.apps.miphone.astrea.ai.aidl.PccLlmService");
    }

    public final alo a(LLMRequest lLMRequest, alq alqVar) {
        alq alqVar2;
        try {
            alqVar2 = alqVar;
        } catch (RemoteException unused) {
            alqVar2 = alqVar;
        }
        try {
            return new aln((ICancellationCallback) anb.a(new amt(this, this.a, lLMRequest, alqVar2, 3)));
        } catch (RemoteException unused2) {
            alqVar2.a(6);
            return new aln(null);
        }
    }

    public final void b(LLMRequest lLMRequest, alq alqVar) {
        try {
            this.a.runInference(lLMRequest, new amw(alqVar));
        } catch (RemoteException e) {
            ((czl) ((czl) ((czl) anb.a.e()).h(e)).i("com/google/android/apps/miphone/astrea/ai/service/GenAiServiceUtils$5", "runInference", (char) 243, "GenAiServiceUtils.java")).p("Failed to run LLM service");
            alqVar.a(6);
        }
    }

    @Override // defpackage.akh
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        alq alpVar = null;
        if (i == 1) {
            LLMRequest lLMRequest = (LLMRequest) aki.a(parcel, LLMRequest.CREATOR);
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.apps.miphone.astrea.ai.aidl.PccLlmResultCallback");
                alpVar = iInterfaceQueryLocalInterface instanceof alq ? (alq) iInterfaceQueryLocalInterface : new alp(strongBinder);
            }
            enforceNoDataAvail(parcel);
            b(lLMRequest, alpVar);
            parcel2.writeNoException();
        } else {
            if (i != 2) {
                return false;
            }
            LLMRequest lLMRequest2 = (LLMRequest) aki.a(parcel, LLMRequest.CREATOR);
            IBinder strongBinder2 = parcel.readStrongBinder();
            if (strongBinder2 != null) {
                IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.apps.miphone.astrea.ai.aidl.PccLlmResultCallback");
                alpVar = iInterfaceQueryLocalInterface2 instanceof alq ? (alq) iInterfaceQueryLocalInterface2 : new alp(strongBinder2);
            }
            enforceNoDataAvail(parcel);
            alo aloVarA = a(lLMRequest2, alpVar);
            parcel2.writeNoException();
            aki.d(parcel2, aloVarA);
        }
        return true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public alr(ILLMService iLLMService) {
        this();
        this.a = iLLMService;
    }
}
