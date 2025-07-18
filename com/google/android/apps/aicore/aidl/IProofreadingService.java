package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.apps.aicore.aidl.ICancellationCallback;
import com.google.android.apps.aicore.aidl.IPrepareInferenceEngineCallback;
import com.google.android.apps.aicore.aidl.IProofreadingResultCallback;
import defpackage.akg;
import defpackage.akh;
import defpackage.aki;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface IProofreadingService extends IInterface {

    /* compiled from: PG */
    public abstract class Stub extends akh implements IProofreadingService {
        private static final String DESCRIPTOR = "com.google.android.apps.aicore.aidl.IProofreadingService";
        static final int TRANSACTION_getApiVersion = 4;
        static final int TRANSACTION_prepareInferenceEngine = 5;
        static final int TRANSACTION_runCancellableInference = 3;
        static final int TRANSACTION_runInference = 2;

        /* compiled from: PG */
        public class Proxy extends akg implements IProofreadingService {
            public Proxy(IBinder iBinder) {
                super(iBinder, Stub.DESCRIPTOR);
            }

            @Override // com.google.android.apps.aicore.aidl.IProofreadingService
            public int getApiVersion() {
                Parcel parcelTransactAndReadException = transactAndReadException(4, obtainAndWriteInterfaceToken());
                int i = parcelTransactAndReadException.readInt();
                parcelTransactAndReadException.recycle();
                return i;
            }

            @Override // com.google.android.apps.aicore.aidl.IProofreadingService
            public ICancellationCallback prepareInferenceEngine(IPrepareInferenceEngineCallback iPrepareInferenceEngineCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                aki.d(parcelObtainAndWriteInterfaceToken, iPrepareInferenceEngineCallback);
                Parcel parcelTransactAndReadException = transactAndReadException(5, parcelObtainAndWriteInterfaceToken);
                ICancellationCallback iCancellationCallbackAsInterface = ICancellationCallback.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iCancellationCallbackAsInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.IProofreadingService
            public ICancellationCallback runCancellableInference(ProofreadingRequest proofreadingRequest, IProofreadingResultCallback iProofreadingResultCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                aki.b(parcelObtainAndWriteInterfaceToken, proofreadingRequest);
                aki.d(parcelObtainAndWriteInterfaceToken, iProofreadingResultCallback);
                Parcel parcelTransactAndReadException = transactAndReadException(3, parcelObtainAndWriteInterfaceToken);
                ICancellationCallback iCancellationCallbackAsInterface = ICancellationCallback.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iCancellationCallbackAsInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.IProofreadingService
            public void runInference(ProofreadingRequest proofreadingRequest, IProofreadingResultCallback iProofreadingResultCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                aki.b(parcelObtainAndWriteInterfaceToken, proofreadingRequest);
                aki.d(parcelObtainAndWriteInterfaceToken, iProofreadingResultCallback);
                transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super(DESCRIPTOR);
        }

        public static IProofreadingService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return iInterfaceQueryLocalInterface instanceof IProofreadingService ? (IProofreadingService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // defpackage.akh
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                ProofreadingRequest proofreadingRequest = (ProofreadingRequest) aki.a(parcel, ProofreadingRequest.CREATOR);
                IProofreadingResultCallback iProofreadingResultCallbackAsInterface = IProofreadingResultCallback.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                runInference(proofreadingRequest, iProofreadingResultCallbackAsInterface);
                parcel2.writeNoException();
                return true;
            }
            if (i == 3) {
                ProofreadingRequest proofreadingRequest2 = (ProofreadingRequest) aki.a(parcel, ProofreadingRequest.CREATOR);
                IProofreadingResultCallback iProofreadingResultCallbackAsInterface2 = IProofreadingResultCallback.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                ICancellationCallback iCancellationCallbackRunCancellableInference = runCancellableInference(proofreadingRequest2, iProofreadingResultCallbackAsInterface2);
                parcel2.writeNoException();
                aki.d(parcel2, iCancellationCallbackRunCancellableInference);
                return true;
            }
            if (i == 4) {
                int apiVersion = getApiVersion();
                parcel2.writeNoException();
                parcel2.writeInt(apiVersion);
                return true;
            }
            if (i != 5) {
                return false;
            }
            IPrepareInferenceEngineCallback iPrepareInferenceEngineCallbackAsInterface = IPrepareInferenceEngineCallback.Stub.asInterface(parcel.readStrongBinder());
            enforceNoDataAvail(parcel);
            ICancellationCallback iCancellationCallbackPrepareInferenceEngine = prepareInferenceEngine(iPrepareInferenceEngineCallbackAsInterface);
            parcel2.writeNoException();
            aki.d(parcel2, iCancellationCallbackPrepareInferenceEngine);
            return true;
        }
    }

    int getApiVersion();

    ICancellationCallback prepareInferenceEngine(IPrepareInferenceEngineCallback iPrepareInferenceEngineCallback);

    ICancellationCallback runCancellableInference(ProofreadingRequest proofreadingRequest, IProofreadingResultCallback iProofreadingResultCallback);

    @Deprecated
    void runInference(ProofreadingRequest proofreadingRequest, IProofreadingResultCallback iProofreadingResultCallback);
}
