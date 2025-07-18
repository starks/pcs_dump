package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.apps.aicore.aidl.ICancellationCallback;
import com.google.android.apps.aicore.aidl.ILLMResultCallback;
import com.google.android.apps.aicore.aidl.ILLMResultWithInfoCallback;
import com.google.android.apps.aicore.aidl.IPrepareInferenceEngineCallback;
import defpackage.akg;
import defpackage.akh;
import defpackage.aki;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface ILLMService extends IInterface {

    /* compiled from: PG */
    public abstract class Stub extends akh implements ILLMService {
        private static final String DESCRIPTOR = "com.google.android.apps.aicore.aidl.ILLMService";
        static final int TRANSACTION_getApiVersion = 4;
        static final int TRANSACTION_prepareInferenceEngine = 5;
        static final int TRANSACTION_runCancellableInference = 3;
        static final int TRANSACTION_runCancellableInferenceWithInfo = 6;
        static final int TRANSACTION_runInference = 2;

        /* compiled from: PG */
        public class Proxy extends akg implements ILLMService {
            public Proxy(IBinder iBinder) {
                super(iBinder, Stub.DESCRIPTOR);
            }

            @Override // com.google.android.apps.aicore.aidl.ILLMService
            public int getApiVersion() {
                Parcel parcelTransactAndReadException = transactAndReadException(4, obtainAndWriteInterfaceToken());
                int i = parcelTransactAndReadException.readInt();
                parcelTransactAndReadException.recycle();
                return i;
            }

            @Override // com.google.android.apps.aicore.aidl.ILLMService
            public ICancellationCallback prepareInferenceEngine(IPrepareInferenceEngineCallback iPrepareInferenceEngineCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                aki.d(parcelObtainAndWriteInterfaceToken, iPrepareInferenceEngineCallback);
                Parcel parcelTransactAndReadException = transactAndReadException(5, parcelObtainAndWriteInterfaceToken);
                ICancellationCallback iCancellationCallbackAsInterface = ICancellationCallback.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iCancellationCallbackAsInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.ILLMService
            public ICancellationCallback runCancellableInference(LLMRequest lLMRequest, ILLMResultCallback iLLMResultCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                aki.b(parcelObtainAndWriteInterfaceToken, lLMRequest);
                aki.d(parcelObtainAndWriteInterfaceToken, iLLMResultCallback);
                Parcel parcelTransactAndReadException = transactAndReadException(3, parcelObtainAndWriteInterfaceToken);
                ICancellationCallback iCancellationCallbackAsInterface = ICancellationCallback.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iCancellationCallbackAsInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.ILLMService
            public ICancellationCallback runCancellableInferenceWithInfo(LLMRequest lLMRequest, ILLMResultWithInfoCallback iLLMResultWithInfoCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                aki.b(parcelObtainAndWriteInterfaceToken, lLMRequest);
                aki.d(parcelObtainAndWriteInterfaceToken, iLLMResultWithInfoCallback);
                Parcel parcelTransactAndReadException = transactAndReadException(6, parcelObtainAndWriteInterfaceToken);
                ICancellationCallback iCancellationCallbackAsInterface = ICancellationCallback.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iCancellationCallbackAsInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.ILLMService
            public void runInference(LLMRequest lLMRequest, ILLMResultCallback iLLMResultCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                aki.b(parcelObtainAndWriteInterfaceToken, lLMRequest);
                aki.d(parcelObtainAndWriteInterfaceToken, iLLMResultCallback);
                transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super(DESCRIPTOR);
        }

        public static ILLMService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return iInterfaceQueryLocalInterface instanceof ILLMService ? (ILLMService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // defpackage.akh
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                LLMRequest lLMRequest = (LLMRequest) aki.a(parcel, LLMRequest.CREATOR);
                ILLMResultCallback iLLMResultCallbackAsInterface = ILLMResultCallback.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                runInference(lLMRequest, iLLMResultCallbackAsInterface);
                parcel2.writeNoException();
                return true;
            }
            if (i == 3) {
                LLMRequest lLMRequest2 = (LLMRequest) aki.a(parcel, LLMRequest.CREATOR);
                ILLMResultCallback iLLMResultCallbackAsInterface2 = ILLMResultCallback.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                ICancellationCallback iCancellationCallbackRunCancellableInference = runCancellableInference(lLMRequest2, iLLMResultCallbackAsInterface2);
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
            if (i == 5) {
                IPrepareInferenceEngineCallback iPrepareInferenceEngineCallbackAsInterface = IPrepareInferenceEngineCallback.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                ICancellationCallback iCancellationCallbackPrepareInferenceEngine = prepareInferenceEngine(iPrepareInferenceEngineCallbackAsInterface);
                parcel2.writeNoException();
                aki.d(parcel2, iCancellationCallbackPrepareInferenceEngine);
                return true;
            }
            if (i != 6) {
                return false;
            }
            LLMRequest lLMRequest3 = (LLMRequest) aki.a(parcel, LLMRequest.CREATOR);
            ILLMResultWithInfoCallback iLLMResultWithInfoCallbackAsInterface = ILLMResultWithInfoCallback.Stub.asInterface(parcel.readStrongBinder());
            enforceNoDataAvail(parcel);
            ICancellationCallback iCancellationCallbackRunCancellableInferenceWithInfo = runCancellableInferenceWithInfo(lLMRequest3, iLLMResultWithInfoCallbackAsInterface);
            parcel2.writeNoException();
            aki.d(parcel2, iCancellationCallbackRunCancellableInferenceWithInfo);
            return true;
        }
    }

    int getApiVersion();

    ICancellationCallback prepareInferenceEngine(IPrepareInferenceEngineCallback iPrepareInferenceEngineCallback);

    ICancellationCallback runCancellableInference(LLMRequest lLMRequest, ILLMResultCallback iLLMResultCallback);

    ICancellationCallback runCancellableInferenceWithInfo(LLMRequest lLMRequest, ILLMResultWithInfoCallback iLLMResultWithInfoCallback);

    @Deprecated
    void runInference(LLMRequest lLMRequest, ILLMResultCallback iLLMResultCallback);
}
