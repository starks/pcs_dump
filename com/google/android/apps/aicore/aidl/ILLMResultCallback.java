package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import defpackage.akg;
import defpackage.akh;
import defpackage.aki;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface ILLMResultCallback extends IInterface {

    /* compiled from: PG */
    public abstract class Stub extends akh implements ILLMResultCallback {
        private static final String DESCRIPTOR = "com.google.android.apps.aicore.aidl.ILLMResultCallback";
        static final int TRANSACTION_onLLMInferenceFailure = 3;
        static final int TRANSACTION_onLLMInferenceSuccess = 2;

        /* compiled from: PG */
        public class Proxy extends akg implements ILLMResultCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, Stub.DESCRIPTOR);
            }

            @Override // com.google.android.apps.aicore.aidl.ILLMResultCallback
            public void onLLMInferenceFailure(int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                transactOneway(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.ILLMResultCallback
            public void onLLMInferenceSuccess(LLMResult lLMResult) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                aki.b(parcelObtainAndWriteInterfaceToken, lLMResult);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super(DESCRIPTOR);
        }

        public static ILLMResultCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return iInterfaceQueryLocalInterface instanceof ILLMResultCallback ? (ILLMResultCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // defpackage.akh
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                LLMResult lLMResult = (LLMResult) aki.a(parcel, LLMResult.CREATOR);
                enforceNoDataAvail(parcel);
                onLLMInferenceSuccess(lLMResult);
                return true;
            }
            if (i != 3) {
                return false;
            }
            int i3 = parcel.readInt();
            enforceNoDataAvail(parcel);
            onLLMInferenceFailure(i3);
            return true;
        }
    }

    void onLLMInferenceFailure(int i);

    void onLLMInferenceSuccess(LLMResult lLMResult);
}
