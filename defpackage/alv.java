package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.apps.aicore.aidl.ICancellationCallback;
import com.google.android.apps.aicore.aidl.IPrepareInferenceEngineCallback;
import com.google.android.apps.aicore.aidl.ISmartReplyService;
import com.google.android.apps.aicore.aidl.SmartReplyRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alv extends akh implements alw {
    final /* synthetic */ ISmartReplyService a;

    public alv() {
        super("com.google.android.apps.miphone.astrea.ai.aidl.PccSmartReplyService");
    }

    public final int a() {
        return this.a.getApiVersion();
    }

    public final alo b(IPrepareInferenceEngineCallback iPrepareInferenceEngineCallback) {
        try {
            return new aln((ICancellationCallback) anb.a(new amy(this, this.a, iPrepareInferenceEngineCallback, 0)));
        } catch (RemoteException unused) {
            iPrepareInferenceEngineCallback.onPreparationFailure(6);
            return new aln(null);
        }
    }

    public final alo c(SmartReplyRequest smartReplyRequest, alu aluVar) {
        alu aluVar2;
        try {
            aluVar2 = aluVar;
        } catch (RemoteException unused) {
            aluVar2 = aluVar;
        }
        try {
            return new aln((ICancellationCallback) anb.a(new amt(this, this.a, smartReplyRequest, aluVar2, 4)));
        } catch (RemoteException unused2) {
            aluVar2.a(6);
            return new aln(null);
        }
    }

    @Override // defpackage.akh
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        alu altVar;
        if (i == 1) {
            SmartReplyRequest smartReplyRequest = (SmartReplyRequest) aki.a(parcel, SmartReplyRequest.CREATOR);
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                altVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.apps.miphone.astrea.ai.aidl.PccSmartReplyResultCallback");
                altVar = iInterfaceQueryLocalInterface instanceof alu ? (alu) iInterfaceQueryLocalInterface : new alt(strongBinder);
            }
            enforceNoDataAvail(parcel);
            alo aloVarC = c(smartReplyRequest, altVar);
            parcel2.writeNoException();
            aki.d(parcel2, aloVarC);
        } else if (i == 2) {
            int iA = a();
            parcel2.writeNoException();
            parcel2.writeInt(iA);
        } else {
            if (i != 3) {
                return false;
            }
            IPrepareInferenceEngineCallback iPrepareInferenceEngineCallbackAsInterface = IPrepareInferenceEngineCallback.Stub.asInterface(parcel.readStrongBinder());
            enforceNoDataAvail(parcel);
            alo aloVarB = b(iPrepareInferenceEngineCallbackAsInterface);
            parcel2.writeNoException();
            aki.d(parcel2, aloVarB);
        }
        return true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public alv(ISmartReplyService iSmartReplyService) {
        this();
        this.a = iSmartReplyService;
    }
}
