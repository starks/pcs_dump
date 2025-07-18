package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import defpackage.akg;
import defpackage.akh;
import defpackage.aki;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface ISmartReplyResultWithInfoCallback extends IInterface {

    /* compiled from: PG */
    public abstract class Stub extends akh implements ISmartReplyResultWithInfoCallback {
        private static final String DESCRIPTOR = "com.google.android.apps.aicore.aidl.ISmartReplyResultWithInfoCallback";
        static final int TRANSACTION_onSmartReplyInferenceFailure = 3;
        static final int TRANSACTION_onSmartReplyInferenceSuccess = 2;

        /* compiled from: PG */
        public class Proxy extends akg implements ISmartReplyResultWithInfoCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, Stub.DESCRIPTOR);
            }

            @Override // com.google.android.apps.aicore.aidl.ISmartReplyResultWithInfoCallback
            public void onSmartReplyInferenceFailure(FailedResult failedResult) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                aki.b(parcelObtainAndWriteInterfaceToken, failedResult);
                transactOneway(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.ISmartReplyResultWithInfoCallback
            public void onSmartReplyInferenceSuccess(SmartReplyResult smartReplyResult) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                aki.b(parcelObtainAndWriteInterfaceToken, smartReplyResult);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super(DESCRIPTOR);
        }

        public static ISmartReplyResultWithInfoCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return iInterfaceQueryLocalInterface instanceof ISmartReplyResultWithInfoCallback ? (ISmartReplyResultWithInfoCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // defpackage.akh
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                SmartReplyResult smartReplyResult = (SmartReplyResult) aki.a(parcel, SmartReplyResult.CREATOR);
                enforceNoDataAvail(parcel);
                onSmartReplyInferenceSuccess(smartReplyResult);
                return true;
            }
            if (i != 3) {
                return false;
            }
            FailedResult failedResult = (FailedResult) aki.a(parcel, FailedResult.CREATOR);
            enforceNoDataAvail(parcel);
            onSmartReplyInferenceFailure(failedResult);
            return true;
        }
    }

    void onSmartReplyInferenceFailure(FailedResult failedResult);

    void onSmartReplyInferenceSuccess(SmartReplyResult smartReplyResult);
}
