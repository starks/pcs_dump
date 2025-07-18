package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import defpackage.akg;
import defpackage.akh;
import defpackage.aki;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface ISuggestedTextResultWithInfoCallback extends IInterface {

    /* compiled from: PG */
    public abstract class Stub extends akh implements ISuggestedTextResultWithInfoCallback {
        private static final String DESCRIPTOR = "com.google.android.apps.aicore.aidl.ISuggestedTextResultWithInfoCallback";
        static final int TRANSACTION_onSuggestedTextInferenceFailure = 3;
        static final int TRANSACTION_onSuggestedTextInferenceSuccess = 2;

        /* compiled from: PG */
        public class Proxy extends akg implements ISuggestedTextResultWithInfoCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, Stub.DESCRIPTOR);
            }

            @Override // com.google.android.apps.aicore.aidl.ISuggestedTextResultWithInfoCallback
            public void onSuggestedTextInferenceFailure(FailedResult failedResult) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                aki.b(parcelObtainAndWriteInterfaceToken, failedResult);
                transactOneway(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.ISuggestedTextResultWithInfoCallback
            public void onSuggestedTextInferenceSuccess(SuggestedTextResult suggestedTextResult) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                aki.b(parcelObtainAndWriteInterfaceToken, suggestedTextResult);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super(DESCRIPTOR);
        }

        public static ISuggestedTextResultWithInfoCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return iInterfaceQueryLocalInterface instanceof ISuggestedTextResultWithInfoCallback ? (ISuggestedTextResultWithInfoCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // defpackage.akh
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                SuggestedTextResult suggestedTextResult = (SuggestedTextResult) aki.a(parcel, SuggestedTextResult.CREATOR);
                enforceNoDataAvail(parcel);
                onSuggestedTextInferenceSuccess(suggestedTextResult);
                return true;
            }
            if (i != 3) {
                return false;
            }
            FailedResult failedResult = (FailedResult) aki.a(parcel, FailedResult.CREATOR);
            enforceNoDataAvail(parcel);
            onSuggestedTextInferenceFailure(failedResult);
            return true;
        }
    }

    void onSuggestedTextInferenceFailure(FailedResult failedResult);

    void onSuggestedTextInferenceSuccess(SuggestedTextResult suggestedTextResult);
}
