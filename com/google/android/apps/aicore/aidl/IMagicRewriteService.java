package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.apps.aicore.aidl.ICancellationCallback;
import com.google.android.apps.aicore.aidl.IMagicRewriteResultCallback;
import com.google.android.apps.aicore.aidl.IMagicRewriteResultWithInfoCallback;
import com.google.android.apps.aicore.aidl.IPrepareInferenceEngineCallback;
import com.google.android.apps.aicore.aidl.ITokenizationCallback;
import defpackage.akg;
import defpackage.akh;
import defpackage.aki;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface IMagicRewriteService extends IInterface {

    /* compiled from: PG */
    public abstract class Stub extends akh implements IMagicRewriteService {
        private static final String DESCRIPTOR = "com.google.android.apps.aicore.aidl.IMagicRewriteService";
        static final int TRANSACTION_getApiVersion = 3;
        static final int TRANSACTION_getTokenInfo = 6;
        static final int TRANSACTION_prepareInferenceEngine = 4;
        static final int TRANSACTION_runCancellableInference = 2;
        static final int TRANSACTION_runCancellableInferenceWithInfo = 5;

        /* compiled from: PG */
        public class Proxy extends akg implements IMagicRewriteService {
            public Proxy(IBinder iBinder) {
                super(iBinder, Stub.DESCRIPTOR);
            }

            @Override // com.google.android.apps.aicore.aidl.IMagicRewriteService
            public int getApiVersion() {
                Parcel parcelTransactAndReadException = transactAndReadException(3, obtainAndWriteInterfaceToken());
                int i = parcelTransactAndReadException.readInt();
                parcelTransactAndReadException.recycle();
                return i;
            }

            @Override // com.google.android.apps.aicore.aidl.IMagicRewriteService
            public ICancellationCallback getTokenInfo(MagicRewriteRequest magicRewriteRequest, boolean z, ITokenizationCallback iTokenizationCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                aki.b(parcelObtainAndWriteInterfaceToken, magicRewriteRequest);
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                aki.d(parcelObtainAndWriteInterfaceToken, iTokenizationCallback);
                Parcel parcelTransactAndReadException = transactAndReadException(6, parcelObtainAndWriteInterfaceToken);
                ICancellationCallback iCancellationCallbackAsInterface = ICancellationCallback.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iCancellationCallbackAsInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.IMagicRewriteService
            public ICancellationCallback prepareInferenceEngine(IPrepareInferenceEngineCallback iPrepareInferenceEngineCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                aki.d(parcelObtainAndWriteInterfaceToken, iPrepareInferenceEngineCallback);
                Parcel parcelTransactAndReadException = transactAndReadException(4, parcelObtainAndWriteInterfaceToken);
                ICancellationCallback iCancellationCallbackAsInterface = ICancellationCallback.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iCancellationCallbackAsInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.IMagicRewriteService
            public ICancellationCallback runCancellableInference(MagicRewriteRequest magicRewriteRequest, IMagicRewriteResultCallback iMagicRewriteResultCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                aki.b(parcelObtainAndWriteInterfaceToken, magicRewriteRequest);
                aki.d(parcelObtainAndWriteInterfaceToken, iMagicRewriteResultCallback);
                Parcel parcelTransactAndReadException = transactAndReadException(2, parcelObtainAndWriteInterfaceToken);
                ICancellationCallback iCancellationCallbackAsInterface = ICancellationCallback.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iCancellationCallbackAsInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.IMagicRewriteService
            public ICancellationCallback runCancellableInferenceWithInfo(MagicRewriteRequest magicRewriteRequest, IMagicRewriteResultWithInfoCallback iMagicRewriteResultWithInfoCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                aki.b(parcelObtainAndWriteInterfaceToken, magicRewriteRequest);
                aki.d(parcelObtainAndWriteInterfaceToken, iMagicRewriteResultWithInfoCallback);
                Parcel parcelTransactAndReadException = transactAndReadException(5, parcelObtainAndWriteInterfaceToken);
                ICancellationCallback iCancellationCallbackAsInterface = ICancellationCallback.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iCancellationCallbackAsInterface;
            }
        }

        public Stub() {
            super(DESCRIPTOR);
        }

        public static IMagicRewriteService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return iInterfaceQueryLocalInterface instanceof IMagicRewriteService ? (IMagicRewriteService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // defpackage.akh
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                MagicRewriteRequest magicRewriteRequest = (MagicRewriteRequest) aki.a(parcel, MagicRewriteRequest.CREATOR);
                IMagicRewriteResultCallback iMagicRewriteResultCallbackAsInterface = IMagicRewriteResultCallback.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                ICancellationCallback iCancellationCallbackRunCancellableInference = runCancellableInference(magicRewriteRequest, iMagicRewriteResultCallbackAsInterface);
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
                MagicRewriteRequest magicRewriteRequest2 = (MagicRewriteRequest) aki.a(parcel, MagicRewriteRequest.CREATOR);
                IMagicRewriteResultWithInfoCallback iMagicRewriteResultWithInfoCallbackAsInterface = IMagicRewriteResultWithInfoCallback.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                ICancellationCallback iCancellationCallbackRunCancellableInferenceWithInfo = runCancellableInferenceWithInfo(magicRewriteRequest2, iMagicRewriteResultWithInfoCallbackAsInterface);
                parcel2.writeNoException();
                aki.d(parcel2, iCancellationCallbackRunCancellableInferenceWithInfo);
                return true;
            }
            if (i != 6) {
                return false;
            }
            MagicRewriteRequest magicRewriteRequest3 = (MagicRewriteRequest) aki.a(parcel, MagicRewriteRequest.CREATOR);
            boolean zE = aki.e(parcel);
            ITokenizationCallback iTokenizationCallbackAsInterface = ITokenizationCallback.Stub.asInterface(parcel.readStrongBinder());
            enforceNoDataAvail(parcel);
            ICancellationCallback tokenInfo = getTokenInfo(magicRewriteRequest3, zE, iTokenizationCallbackAsInterface);
            parcel2.writeNoException();
            aki.d(parcel2, tokenInfo);
            return true;
        }
    }

    int getApiVersion();

    ICancellationCallback getTokenInfo(MagicRewriteRequest magicRewriteRequest, boolean z, ITokenizationCallback iTokenizationCallback);

    ICancellationCallback prepareInferenceEngine(IPrepareInferenceEngineCallback iPrepareInferenceEngineCallback);

    ICancellationCallback runCancellableInference(MagicRewriteRequest magicRewriteRequest, IMagicRewriteResultCallback iMagicRewriteResultCallback);

    ICancellationCallback runCancellableInferenceWithInfo(MagicRewriteRequest magicRewriteRequest, IMagicRewriteResultWithInfoCallback iMagicRewriteResultWithInfoCallback);
}
