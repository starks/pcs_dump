package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.apps.aicore.aidl.ICancellationCallback;
import com.google.android.apps.aicore.aidl.IPrepareInferenceEngineCallback;
import com.google.android.apps.aicore.aidl.ISmartReplyResultCallback;
import com.google.android.apps.aicore.aidl.ISmartReplyResultWithInfoCallback;
import com.google.android.apps.aicore.aidl.ITokenizationCallback;
import defpackage.akg;
import defpackage.akh;
import defpackage.aki;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface ISmartReplyService extends IInterface {

    /* compiled from: PG */
    public abstract class Stub extends akh implements ISmartReplyService {
        private static final String DESCRIPTOR = "com.google.android.apps.aicore.aidl.ISmartReplyService";
        static final int TRANSACTION_getApiVersion = 4;
        static final int TRANSACTION_getTokenCount = 7;
        static final int TRANSACTION_getTokenInfo = 8;
        static final int TRANSACTION_prepareInferenceEngine = 5;
        static final int TRANSACTION_runCancellableInference = 3;
        static final int TRANSACTION_runCancellableInferenceWithInfo = 6;
        static final int TRANSACTION_runInference = 2;

        /* compiled from: PG */
        public class Proxy extends akg implements ISmartReplyService {
            public Proxy(IBinder iBinder) {
                super(iBinder, Stub.DESCRIPTOR);
            }

            @Override // com.google.android.apps.aicore.aidl.ISmartReplyService
            public int getApiVersion() {
                Parcel parcelTransactAndReadException = transactAndReadException(4, obtainAndWriteInterfaceToken());
                int i = parcelTransactAndReadException.readInt();
                parcelTransactAndReadException.recycle();
                return i;
            }

            @Override // com.google.android.apps.aicore.aidl.ISmartReplyService
            public ICancellationCallback getTokenCount(String str, ITokenizationCallback iTokenizationCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                aki.d(parcelObtainAndWriteInterfaceToken, iTokenizationCallback);
                Parcel parcelTransactAndReadException = transactAndReadException(7, parcelObtainAndWriteInterfaceToken);
                ICancellationCallback iCancellationCallbackAsInterface = ICancellationCallback.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iCancellationCallbackAsInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.ISmartReplyService
            public ICancellationCallback getTokenInfo(SmartReplyRequest smartReplyRequest, boolean z, ITokenizationCallback iTokenizationCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                aki.b(parcelObtainAndWriteInterfaceToken, smartReplyRequest);
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                aki.d(parcelObtainAndWriteInterfaceToken, iTokenizationCallback);
                Parcel parcelTransactAndReadException = transactAndReadException(8, parcelObtainAndWriteInterfaceToken);
                ICancellationCallback iCancellationCallbackAsInterface = ICancellationCallback.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iCancellationCallbackAsInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.ISmartReplyService
            public ICancellationCallback prepareInferenceEngine(IPrepareInferenceEngineCallback iPrepareInferenceEngineCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                aki.d(parcelObtainAndWriteInterfaceToken, iPrepareInferenceEngineCallback);
                Parcel parcelTransactAndReadException = transactAndReadException(5, parcelObtainAndWriteInterfaceToken);
                ICancellationCallback iCancellationCallbackAsInterface = ICancellationCallback.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iCancellationCallbackAsInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.ISmartReplyService
            public ICancellationCallback runCancellableInference(SmartReplyRequest smartReplyRequest, ISmartReplyResultCallback iSmartReplyResultCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                aki.b(parcelObtainAndWriteInterfaceToken, smartReplyRequest);
                aki.d(parcelObtainAndWriteInterfaceToken, iSmartReplyResultCallback);
                Parcel parcelTransactAndReadException = transactAndReadException(3, parcelObtainAndWriteInterfaceToken);
                ICancellationCallback iCancellationCallbackAsInterface = ICancellationCallback.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iCancellationCallbackAsInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.ISmartReplyService
            public ICancellationCallback runCancellableInferenceWithInfo(SmartReplyRequest smartReplyRequest, ISmartReplyResultWithInfoCallback iSmartReplyResultWithInfoCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                aki.b(parcelObtainAndWriteInterfaceToken, smartReplyRequest);
                aki.d(parcelObtainAndWriteInterfaceToken, iSmartReplyResultWithInfoCallback);
                Parcel parcelTransactAndReadException = transactAndReadException(6, parcelObtainAndWriteInterfaceToken);
                ICancellationCallback iCancellationCallbackAsInterface = ICancellationCallback.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iCancellationCallbackAsInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.ISmartReplyService
            public void runInference(SmartReplyRequest smartReplyRequest, ISmartReplyResultCallback iSmartReplyResultCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                aki.b(parcelObtainAndWriteInterfaceToken, smartReplyRequest);
                aki.d(parcelObtainAndWriteInterfaceToken, iSmartReplyResultCallback);
                transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super(DESCRIPTOR);
        }

        public static ISmartReplyService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return iInterfaceQueryLocalInterface instanceof ISmartReplyService ? (ISmartReplyService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // defpackage.akh
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 2:
                    SmartReplyRequest smartReplyRequest = (SmartReplyRequest) aki.a(parcel, SmartReplyRequest.CREATOR);
                    ISmartReplyResultCallback iSmartReplyResultCallbackAsInterface = ISmartReplyResultCallback.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    runInference(smartReplyRequest, iSmartReplyResultCallbackAsInterface);
                    parcel2.writeNoException();
                    return true;
                case 3:
                    SmartReplyRequest smartReplyRequest2 = (SmartReplyRequest) aki.a(parcel, SmartReplyRequest.CREATOR);
                    ISmartReplyResultCallback iSmartReplyResultCallbackAsInterface2 = ISmartReplyResultCallback.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    ICancellationCallback iCancellationCallbackRunCancellableInference = runCancellableInference(smartReplyRequest2, iSmartReplyResultCallbackAsInterface2);
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
                    SmartReplyRequest smartReplyRequest3 = (SmartReplyRequest) aki.a(parcel, SmartReplyRequest.CREATOR);
                    ISmartReplyResultWithInfoCallback iSmartReplyResultWithInfoCallbackAsInterface = ISmartReplyResultWithInfoCallback.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    ICancellationCallback iCancellationCallbackRunCancellableInferenceWithInfo = runCancellableInferenceWithInfo(smartReplyRequest3, iSmartReplyResultWithInfoCallbackAsInterface);
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
                    SmartReplyRequest smartReplyRequest4 = (SmartReplyRequest) aki.a(parcel, SmartReplyRequest.CREATOR);
                    boolean zE = aki.e(parcel);
                    ITokenizationCallback iTokenizationCallbackAsInterface2 = ITokenizationCallback.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    ICancellationCallback tokenInfo = getTokenInfo(smartReplyRequest4, zE, iTokenizationCallbackAsInterface2);
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

    ICancellationCallback getTokenInfo(SmartReplyRequest smartReplyRequest, boolean z, ITokenizationCallback iTokenizationCallback);

    ICancellationCallback prepareInferenceEngine(IPrepareInferenceEngineCallback iPrepareInferenceEngineCallback);

    ICancellationCallback runCancellableInference(SmartReplyRequest smartReplyRequest, ISmartReplyResultCallback iSmartReplyResultCallback);

    ICancellationCallback runCancellableInferenceWithInfo(SmartReplyRequest smartReplyRequest, ISmartReplyResultWithInfoCallback iSmartReplyResultWithInfoCallback);

    @Deprecated
    void runInference(SmartReplyRequest smartReplyRequest, ISmartReplyResultCallback iSmartReplyResultCallback);
}
