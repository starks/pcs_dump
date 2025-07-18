package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.apps.aicore.aidl.ICancellationCallback;
import com.google.android.apps.aicore.aidl.IPrepareInferenceEngineCallback;
import com.google.android.apps.aicore.aidl.ISonnyResultCallback;
import defpackage.akg;
import defpackage.akh;
import defpackage.aki;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface ISonnyService extends IInterface {

    /* compiled from: PG */
    public abstract class Stub extends akh implements ISonnyService {
        private static final String DESCRIPTOR = "com.google.android.apps.aicore.aidl.ISonnyService";
        static final int TRANSACTION_getApiVersion = 4;
        static final int TRANSACTION_prepareInferenceEngine = 3;
        static final int TRANSACTION_runCancellableInference = 2;

        /* compiled from: PG */
        public class Proxy extends akg implements ISonnyService {
            public Proxy(IBinder iBinder) {
                super(iBinder, Stub.DESCRIPTOR);
            }

            @Override // com.google.android.apps.aicore.aidl.ISonnyService
            public int getApiVersion() {
                Parcel parcelTransactAndReadException = transactAndReadException(4, obtainAndWriteInterfaceToken());
                int i = parcelTransactAndReadException.readInt();
                parcelTransactAndReadException.recycle();
                return i;
            }

            @Override // com.google.android.apps.aicore.aidl.ISonnyService
            public ICancellationCallback prepareInferenceEngine(IPrepareInferenceEngineCallback iPrepareInferenceEngineCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                aki.d(parcelObtainAndWriteInterfaceToken, iPrepareInferenceEngineCallback);
                Parcel parcelTransactAndReadException = transactAndReadException(3, parcelObtainAndWriteInterfaceToken);
                ICancellationCallback iCancellationCallbackAsInterface = ICancellationCallback.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iCancellationCallbackAsInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.ISonnyService
            public ICancellationCallback runCancellableInference(SonnyRequest sonnyRequest, ISonnyResultCallback iSonnyResultCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                aki.b(parcelObtainAndWriteInterfaceToken, sonnyRequest);
                aki.d(parcelObtainAndWriteInterfaceToken, iSonnyResultCallback);
                Parcel parcelTransactAndReadException = transactAndReadException(2, parcelObtainAndWriteInterfaceToken);
                ICancellationCallback iCancellationCallbackAsInterface = ICancellationCallback.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iCancellationCallbackAsInterface;
            }
        }

        public Stub() {
            super(DESCRIPTOR);
        }

        public static ISonnyService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return iInterfaceQueryLocalInterface instanceof ISonnyService ? (ISonnyService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // defpackage.akh
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                SonnyRequest sonnyRequest = (SonnyRequest) aki.a(parcel, SonnyRequest.CREATOR);
                ISonnyResultCallback iSonnyResultCallbackAsInterface = ISonnyResultCallback.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                ICancellationCallback iCancellationCallbackRunCancellableInference = runCancellableInference(sonnyRequest, iSonnyResultCallbackAsInterface);
                parcel2.writeNoException();
                aki.d(parcel2, iCancellationCallbackRunCancellableInference);
                return true;
            }
            if (i != 3) {
                if (i != 4) {
                    return false;
                }
                int apiVersion = getApiVersion();
                parcel2.writeNoException();
                parcel2.writeInt(apiVersion);
                return true;
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

    ICancellationCallback runCancellableInference(SonnyRequest sonnyRequest, ISonnyResultCallback iSonnyResultCallback);
}
