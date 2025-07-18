package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.apps.aicore.aidl.ICancellationCallback;
import com.google.android.apps.aicore.aidl.IPrepareInferenceEngineCallback;
import com.google.android.apps.aicore.aidl.ISuggestedTextResultCallback;
import com.google.android.apps.aicore.aidl.ISuggestedTextResultWithInfoCallback;
import com.google.android.apps.aicore.aidl.ITokenizationCallback;
import defpackage.akg;
import defpackage.akh;
import defpackage.aki;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface ISuggestedTextService extends IInterface {

    /* compiled from: PG */
    public abstract class Stub extends akh implements ISuggestedTextService {
        private static final String DESCRIPTOR = "com.google.android.apps.aicore.aidl.ISuggestedTextService";
        static final int TRANSACTION_getApiVersion = 3;
        static final int TRANSACTION_getTokenInfo = 6;
        static final int TRANSACTION_prepareInferenceEngine = 4;
        static final int TRANSACTION_runCancellableInference = 2;
        static final int TRANSACTION_runCancellableInferenceWithInfo = 5;

        /* compiled from: PG */
        public class Proxy extends akg implements ISuggestedTextService {
            public Proxy(IBinder iBinder) {
                super(iBinder, Stub.DESCRIPTOR);
            }

            @Override // com.google.android.apps.aicore.aidl.ISuggestedTextService
            public int getApiVersion() {
                Parcel parcelTransactAndReadException = transactAndReadException(3, obtainAndWriteInterfaceToken());
                int i = parcelTransactAndReadException.readInt();
                parcelTransactAndReadException.recycle();
                return i;
            }

            @Override // com.google.android.apps.aicore.aidl.ISuggestedTextService
            public ICancellationCallback getTokenInfo(SuggestedTextRequest suggestedTextRequest, boolean z, ITokenizationCallback iTokenizationCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                aki.b(parcelObtainAndWriteInterfaceToken, suggestedTextRequest);
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                aki.d(parcelObtainAndWriteInterfaceToken, iTokenizationCallback);
                Parcel parcelTransactAndReadException = transactAndReadException(6, parcelObtainAndWriteInterfaceToken);
                ICancellationCallback iCancellationCallbackAsInterface = ICancellationCallback.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iCancellationCallbackAsInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.ISuggestedTextService
            public ICancellationCallback prepareInferenceEngine(IPrepareInferenceEngineCallback iPrepareInferenceEngineCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                aki.d(parcelObtainAndWriteInterfaceToken, iPrepareInferenceEngineCallback);
                Parcel parcelTransactAndReadException = transactAndReadException(4, parcelObtainAndWriteInterfaceToken);
                ICancellationCallback iCancellationCallbackAsInterface = ICancellationCallback.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iCancellationCallbackAsInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.ISuggestedTextService
            public ICancellationCallback runCancellableInference(SuggestedTextRequest suggestedTextRequest, ISuggestedTextResultCallback iSuggestedTextResultCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                aki.b(parcelObtainAndWriteInterfaceToken, suggestedTextRequest);
                aki.d(parcelObtainAndWriteInterfaceToken, iSuggestedTextResultCallback);
                Parcel parcelTransactAndReadException = transactAndReadException(2, parcelObtainAndWriteInterfaceToken);
                ICancellationCallback iCancellationCallbackAsInterface = ICancellationCallback.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iCancellationCallbackAsInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.ISuggestedTextService
            public ICancellationCallback runCancellableInferenceWithInfo(SuggestedTextRequest suggestedTextRequest, ISuggestedTextResultWithInfoCallback iSuggestedTextResultWithInfoCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                aki.b(parcelObtainAndWriteInterfaceToken, suggestedTextRequest);
                aki.d(parcelObtainAndWriteInterfaceToken, iSuggestedTextResultWithInfoCallback);
                Parcel parcelTransactAndReadException = transactAndReadException(5, parcelObtainAndWriteInterfaceToken);
                ICancellationCallback iCancellationCallbackAsInterface = ICancellationCallback.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iCancellationCallbackAsInterface;
            }
        }

        public Stub() {
            super(DESCRIPTOR);
        }

        public static ISuggestedTextService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return iInterfaceQueryLocalInterface instanceof ISuggestedTextService ? (ISuggestedTextService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // defpackage.akh
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                SuggestedTextRequest suggestedTextRequest = (SuggestedTextRequest) aki.a(parcel, SuggestedTextRequest.CREATOR);
                ISuggestedTextResultCallback iSuggestedTextResultCallbackAsInterface = ISuggestedTextResultCallback.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                ICancellationCallback iCancellationCallbackRunCancellableInference = runCancellableInference(suggestedTextRequest, iSuggestedTextResultCallbackAsInterface);
                parcel2.writeNoException();
                aki.d(parcel2, iCancellationCallbackRunCancellableInference);
                return true;
            }
            if (i == 3) {
                int apiVersion = getApiVersion();
                parcel2.writeNoException();
                parcel2.writeInt(apiVersion);
                return true;
            }
            if (i == 4) {
                IPrepareInferenceEngineCallback iPrepareInferenceEngineCallbackAsInterface = IPrepareInferenceEngineCallback.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                ICancellationCallback iCancellationCallbackPrepareInferenceEngine = prepareInferenceEngine(iPrepareInferenceEngineCallbackAsInterface);
                parcel2.writeNoException();
                aki.d(parcel2, iCancellationCallbackPrepareInferenceEngine);
                return true;
            }
            if (i == 5) {
                SuggestedTextRequest suggestedTextRequest2 = (SuggestedTextRequest) aki.a(parcel, SuggestedTextRequest.CREATOR);
                ISuggestedTextResultWithInfoCallback iSuggestedTextResultWithInfoCallbackAsInterface = ISuggestedTextResultWithInfoCallback.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                ICancellationCallback iCancellationCallbackRunCancellableInferenceWithInfo = runCancellableInferenceWithInfo(suggestedTextRequest2, iSuggestedTextResultWithInfoCallbackAsInterface);
                parcel2.writeNoException();
                aki.d(parcel2, iCancellationCallbackRunCancellableInferenceWithInfo);
                return true;
            }
            if (i != 6) {
                return false;
            }
            SuggestedTextRequest suggestedTextRequest3 = (SuggestedTextRequest) aki.a(parcel, SuggestedTextRequest.CREATOR);
            boolean zE = aki.e(parcel);
            ITokenizationCallback iTokenizationCallbackAsInterface = ITokenizationCallback.Stub.asInterface(parcel.readStrongBinder());
            enforceNoDataAvail(parcel);
            ICancellationCallback tokenInfo = getTokenInfo(suggestedTextRequest3, zE, iTokenizationCallbackAsInterface);
            parcel2.writeNoException();
            aki.d(parcel2, tokenInfo);
            return true;
        }
    }

    int getApiVersion();

    ICancellationCallback getTokenInfo(SuggestedTextRequest suggestedTextRequest, boolean z, ITokenizationCallback iTokenizationCallback);

    ICancellationCallback prepareInferenceEngine(IPrepareInferenceEngineCallback iPrepareInferenceEngineCallback);

    ICancellationCallback runCancellableInference(SuggestedTextRequest suggestedTextRequest, ISuggestedTextResultCallback iSuggestedTextResultCallback);

    ICancellationCallback runCancellableInferenceWithInfo(SuggestedTextRequest suggestedTextRequest, ISuggestedTextResultWithInfoCallback iSuggestedTextResultWithInfoCallback);
}
