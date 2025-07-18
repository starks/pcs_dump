package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import defpackage.akg;
import defpackage.akh;
import defpackage.aki;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface ISummarizationResultWithInfoCallback extends IInterface {

    /* compiled from: PG */
    public abstract class Stub extends akh implements ISummarizationResultWithInfoCallback {
        private static final String DESCRIPTOR = "com.google.android.apps.aicore.aidl.ISummarizationResultWithInfoCallback";
        static final int TRANSACTION_onSummarizationInferenceFailure = 3;
        static final int TRANSACTION_onSummarizationInferenceSuccess = 2;

        /* compiled from: PG */
        public class Proxy extends akg implements ISummarizationResultWithInfoCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, Stub.DESCRIPTOR);
            }

            @Override // com.google.android.apps.aicore.aidl.ISummarizationResultWithInfoCallback
            public void onSummarizationInferenceFailure(FailedResult failedResult) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                aki.b(parcelObtainAndWriteInterfaceToken, failedResult);
                transactOneway(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.ISummarizationResultWithInfoCallback
            public void onSummarizationInferenceSuccess(SummarizationResult summarizationResult) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                aki.b(parcelObtainAndWriteInterfaceToken, summarizationResult);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super(DESCRIPTOR);
        }

        public static ISummarizationResultWithInfoCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return iInterfaceQueryLocalInterface instanceof ISummarizationResultWithInfoCallback ? (ISummarizationResultWithInfoCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
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
            FailedResult failedResult = (FailedResult) aki.a(parcel, FailedResult.CREATOR);
            enforceNoDataAvail(parcel);
            onSummarizationInferenceFailure(failedResult);
            return true;
        }
    }

    void onSummarizationInferenceFailure(FailedResult failedResult);

    void onSummarizationInferenceSuccess(SummarizationResult summarizationResult);
}
