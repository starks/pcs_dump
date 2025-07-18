package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.apps.aicore.aidl.ICancellationCallback;
import com.google.android.apps.aicore.aidl.IPrepareInferenceEngineCallback;
import com.google.android.apps.aicore.aidl.ISummarizationResultCallback;
import com.google.android.apps.aicore.aidl.ISummarizationResultWithInfoCallback;
import com.google.android.apps.aicore.aidl.ITokenizationCallback;
import defpackage.akg;
import defpackage.akh;
import defpackage.aki;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface ISummarizationService extends IInterface {

    /* compiled from: PG */
    public abstract class Stub extends akh implements ISummarizationService {
        private static final String DESCRIPTOR = "com.google.android.apps.aicore.aidl.ISummarizationService";
        static final int TRANSACTION_getApiVersion = 4;
        static final int TRANSACTION_getTokenCount = 7;
        static final int TRANSACTION_getTokenInfo = 8;
        static final int TRANSACTION_prepareInferenceEngine = 5;
        static final int TRANSACTION_runCancellableInference = 3;
        static final int TRANSACTION_runCancellableInferenceWithInfo = 6;
        static final int TRANSACTION_runInference = 2;

        /* compiled from: PG */
        public class Proxy extends akg implements ISummarizationService {
            public Proxy(IBinder iBinder) {
                super(iBinder, Stub.DESCRIPTOR);
            }

            @Override // com.google.android.apps.aicore.aidl.ISummarizationService
            public int getApiVersion() {
                Parcel parcelTransactAndReadException = transactAndReadException(4, obtainAndWriteInterfaceToken());
                int i = parcelTransactAndReadException.readInt();
                parcelTransactAndReadException.recycle();
                return i;
            }

            @Override // com.google.android.apps.aicore.aidl.ISummarizationService
            public ICancellationCallback getTokenCount(String str, ITokenizationCallback iTokenizationCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                aki.d(parcelObtainAndWriteInterfaceToken, iTokenizationCallback);
                Parcel parcelTransactAndReadException = transactAndReadException(7, parcelObtainAndWriteInterfaceToken);
                ICancellationCallback iCancellationCallbackAsInterface = ICancellationCallback.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iCancellationCallbackAsInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.ISummarizationService
            public ICancellationCallback getTokenInfo(SummarizationRequest summarizationRequest, boolean z, ITokenizationCallback iTokenizationCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                aki.b(parcelObtainAndWriteInterfaceToken, summarizationRequest);
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                aki.d(parcelObtainAndWriteInterfaceToken, iTokenizationCallback);
                Parcel parcelTransactAndReadException = transactAndReadException(8, parcelObtainAndWriteInterfaceToken);
                ICancellationCallback iCancellationCallbackAsInterface = ICancellationCallback.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iCancellationCallbackAsInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.ISummarizationService
            public ICancellationCallback prepareInferenceEngine(IPrepareInferenceEngineCallback iPrepareInferenceEngineCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                aki.d(parcelObtainAndWriteInterfaceToken, iPrepareInferenceEngineCallback);
                Parcel parcelTransactAndReadException = transactAndReadException(5, parcelObtainAndWriteInterfaceToken);
                ICancellationCallback iCancellationCallbackAsInterface = ICancellationCallback.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iCancellationCallbackAsInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.ISummarizationService
            public ICancellationCallback runCancellableInference(SummarizationRequest summarizationRequest, ISummarizationResultCallback iSummarizationResultCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                aki.b(parcelObtainAndWriteInterfaceToken, summarizationRequest);
                aki.d(parcelObtainAndWriteInterfaceToken, iSummarizationResultCallback);
                Parcel parcelTransactAndReadException = transactAndReadException(3, parcelObtainAndWriteInterfaceToken);
                ICancellationCallback iCancellationCallbackAsInterface = ICancellationCallback.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iCancellationCallbackAsInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.ISummarizationService
            public ICancellationCallback runCancellableInferenceWithInfo(SummarizationRequest summarizationRequest, ISummarizationResultWithInfoCallback iSummarizationResultWithInfoCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                aki.b(parcelObtainAndWriteInterfaceToken, summarizationRequest);
                aki.d(parcelObtainAndWriteInterfaceToken, iSummarizationResultWithInfoCallback);
                Parcel parcelTransactAndReadException = transactAndReadException(6, parcelObtainAndWriteInterfaceToken);
                ICancellationCallback iCancellationCallbackAsInterface = ICancellationCallback.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iCancellationCallbackAsInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.ISummarizationService
            public void runInference(SummarizationRequest summarizationRequest, ISummarizationResultCallback iSummarizationResultCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                aki.b(parcelObtainAndWriteInterfaceToken, summarizationRequest);
                aki.d(parcelObtainAndWriteInterfaceToken, iSummarizationResultCallback);
                transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super(DESCRIPTOR);
        }

        public static ISummarizationService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return iInterfaceQueryLocalInterface instanceof ISummarizationService ? (ISummarizationService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // defpackage.akh
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 2:
                    SummarizationRequest summarizationRequest = (SummarizationRequest) aki.a(parcel, SummarizationRequest.CREATOR);
                    ISummarizationResultCallback iSummarizationResultCallbackAsInterface = ISummarizationResultCallback.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    runInference(summarizationRequest, iSummarizationResultCallbackAsInterface);
                    parcel2.writeNoException();
                    return true;
                case 3:
                    SummarizationRequest summarizationRequest2 = (SummarizationRequest) aki.a(parcel, SummarizationRequest.CREATOR);
                    ISummarizationResultCallback iSummarizationResultCallbackAsInterface2 = ISummarizationResultCallback.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    ICancellationCallback iCancellationCallbackRunCancellableInference = runCancellableInference(summarizationRequest2, iSummarizationResultCallbackAsInterface2);
                    parcel2.writeNoException();
                    aki.d(parcel2, iCancellationCallbackRunCancellableInference);
                    return true;
                case 4:
                    int apiVersion = getApiVersion();
                    parcel2.writeNoException();
                    parcel2.writeInt(apiVersion);
                    return true;
                case 5:
                    IPrepareInferenceEngineCallback iPrepareInferenceEngineCallbackAsInterface = IPrepareInferenceEngineCallback.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    ICancellationCallback iCancellationCallbackPrepareInferenceEngine = prepareInferenceEngine(iPrepareInferenceEngineCallbackAsInterface);
                    parcel2.writeNoException();
                    aki.d(parcel2, iCancellationCallbackPrepareInferenceEngine);
                    return true;
                case 6:
                    SummarizationRequest summarizationRequest3 = (SummarizationRequest) aki.a(parcel, SummarizationRequest.CREATOR);
                    ISummarizationResultWithInfoCallback iSummarizationResultWithInfoCallbackAsInterface = ISummarizationResultWithInfoCallback.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    ICancellationCallback iCancellationCallbackRunCancellableInferenceWithInfo = runCancellableInferenceWithInfo(summarizationRequest3, iSummarizationResultWithInfoCallbackAsInterface);
                    parcel2.writeNoException();
                    aki.d(parcel2, iCancellationCallbackRunCancellableInferenceWithInfo);
                    return true;
                case 7:
                    String string = parcel.readString();
                    ITokenizationCallback iTokenizationCallbackAsInterface = ITokenizationCallback.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    ICancellationCallback tokenCount = getTokenCount(string, iTokenizationCallbackAsInterface);
                    parcel2.writeNoException();
                    aki.d(parcel2, tokenCount);
                    return true;
                case 8:
                    SummarizationRequest summarizationRequest4 = (SummarizationRequest) aki.a(parcel, SummarizationRequest.CREATOR);
                    boolean zE = aki.e(parcel);
                    ITokenizationCallback iTokenizationCallbackAsInterface2 = ITokenizationCallback.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    ICancellationCallback tokenInfo = getTokenInfo(summarizationRequest4, zE, iTokenizationCallbackAsInterface2);
                    parcel2.writeNoException();
                    aki.d(parcel2, tokenInfo);
                    return true;
                default:
                    return false;
            }
        }
    }

    int getApiVersion();

    @Deprecated
    ICancellationCallback getTokenCount(String str, ITokenizationCallback iTokenizationCallback);

    ICancellationCallback getTokenInfo(SummarizationRequest summarizationRequest, boolean z, ITokenizationCallback iTokenizationCallback);

    ICancellationCallback prepareInferenceEngine(IPrepareInferenceEngineCallback iPrepareInferenceEngineCallback);

    ICancellationCallback runCancellableInference(SummarizationRequest summarizationRequest, ISummarizationResultCallback iSummarizationResultCallback);

    ICancellationCallback runCancellableInferenceWithInfo(SummarizationRequest summarizationRequest, ISummarizationResultWithInfoCallback iSummarizationResultWithInfoCallback);

    @Deprecated
    void runInference(SummarizationRequest summarizationRequest, ISummarizationResultCallback iSummarizationResultCallback);
}
