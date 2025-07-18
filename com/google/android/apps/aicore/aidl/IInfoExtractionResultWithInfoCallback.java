package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import defpackage.akg;
import defpackage.akh;
import defpackage.aki;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface IInfoExtractionResultWithInfoCallback extends IInterface {

    /* compiled from: PG */
    public abstract class Stub extends akh implements IInfoExtractionResultWithInfoCallback {
        private static final String DESCRIPTOR = "com.google.android.apps.aicore.aidl.IInfoExtractionResultWithInfoCallback";
        static final int TRANSACTION_onInfoExtractionInferenceFailure = 3;
        static final int TRANSACTION_onInfoExtractionInferenceSuccess = 2;

        /* compiled from: PG */
        public class Proxy extends akg implements IInfoExtractionResultWithInfoCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, Stub.DESCRIPTOR);
            }

            @Override // com.google.android.apps.aicore.aidl.IInfoExtractionResultWithInfoCallback
            public void onInfoExtractionInferenceFailure(FailedResult failedResult) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                aki.b(parcelObtainAndWriteInterfaceToken, failedResult);
                transactOneway(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.IInfoExtractionResultWithInfoCallback
            public void onInfoExtractionInferenceSuccess(InfoExtractionResult infoExtractionResult) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                aki.b(parcelObtainAndWriteInterfaceToken, infoExtractionResult);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super(DESCRIPTOR);
        }

        public static IInfoExtractionResultWithInfoCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return iInterfaceQueryLocalInterface instanceof IInfoExtractionResultWithInfoCallback ? (IInfoExtractionResultWithInfoCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // defpackage.akh
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                InfoExtractionResult infoExtractionResult = (InfoExtractionResult) aki.a(parcel, InfoExtractionResult.CREATOR);
                enforceNoDataAvail(parcel);
                onInfoExtractionInferenceSuccess(infoExtractionResult);
                return true;
            }
            if (i != 3) {
                return false;
            }
            FailedResult failedResult = (FailedResult) aki.a(parcel, FailedResult.CREATOR);
            enforceNoDataAvail(parcel);
            onInfoExtractionInferenceFailure(failedResult);
            return true;
        }
    }

    void onInfoExtractionInferenceFailure(FailedResult failedResult);

    void onInfoExtractionInferenceSuccess(InfoExtractionResult infoExtractionResult);
}
