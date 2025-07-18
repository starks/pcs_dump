package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import defpackage.akg;
import defpackage.akh;
import defpackage.aki;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface ISummarizationResultCallback extends IInterface {

    /* compiled from: PG */
    public abstract class Stub extends akh implements ISummarizationResultCallback {
        private static final String DESCRIPTOR = "com.google.android.apps.aicore.aidl.ISummarizationResultCallback";
        static final int TRANSACTION_onSummarizationInferenceFailure = 3;
        static final int TRANSACTION_onSummarizationInferenceSuccess = 2;

        /* compiled from: PG */
        public class Proxy extends akg implements ISummarizationResultCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, Stub.DESCRIPTOR);
            }

            @Override // com.google.android.apps.aicore.aidl.ISummarizationResultCallback
            public void onSummarizationInferenceFailure(int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                transactOneway(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.ISummarizationResultCallback
            public void onSummarizationInferenceSuccess(SummarizationResult summarizationResult) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                aki.b(parcelObtainAndWriteInterfaceToken, summarizationResult);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super(DESCRIPTOR);
        }

        public static ISummarizationResultCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return iInterfaceQueryLocalInterface instanceof ISummarizationResultCallback ? (ISummarizationResultCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // defpackage.akh
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                SummarizationResult summarizationResult = (SummarizationResult) aki.a(parcel, SummarizationResult.CREATOR);
                enforceNoDataAvail(parcel);
                onSummarizationInferenceSuccess(summarizationResult);
                return true;
            }
            if (i != 3) {
                return false;
            }
            int i3 = parcel.readInt();
            enforceNoDataAvail(parcel);
            onSummarizationInferenceFailure(i3);
            return true;
        }
    }

    void onSummarizationInferenceFailure(int i);

    void onSummarizationInferenceSuccess(SummarizationResult summarizationResult);
}
