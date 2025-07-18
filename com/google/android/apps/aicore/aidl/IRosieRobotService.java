package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.apps.aicore.aidl.ICancellationCallback;
import com.google.android.apps.aicore.aidl.IHintCallback;
import com.google.android.apps.aicore.aidl.IPrepareInferenceEngineCallback;
import com.google.android.apps.aicore.aidl.IRosieRobotResultCallback;
import com.google.android.apps.aicore.aidl.IRosieRobotResultWithInfoCallback;
import defpackage.akg;
import defpackage.akh;
import defpackage.aki;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface IRosieRobotService extends IInterface {

    /* compiled from: PG */
    public abstract class Stub extends akh implements IRosieRobotService {
        private static final String DESCRIPTOR = "com.google.android.apps.aicore.aidl.IRosieRobotService";
        static final int TRANSACTION_getApiVersion = 3;
        static final int TRANSACTION_hint = 7;
        static final int TRANSACTION_prepareInferenceEngine = 4;
        static final int TRANSACTION_runCancellableInference = 2;
        static final int TRANSACTION_runCancellableInferenceWithInfo = 6;

        /* compiled from: PG */
        public class Proxy extends akg implements IRosieRobotService {
            public Proxy(IBinder iBinder) {
                super(iBinder, Stub.DESCRIPTOR);
            }

            @Override // com.google.android.apps.aicore.aidl.IRosieRobotService
            public int getApiVersion() {
                Parcel parcelTransactAndReadException = transactAndReadException(3, obtainAndWriteInterfaceToken());
                int i = parcelTransactAndReadException.readInt();
                parcelTransactAndReadException.recycle();
                return i;
            }

            @Override // com.google.android.apps.aicore.aidl.IRosieRobotService
            public ICancellationCallback hint(Hint hint, IHintCallback iHintCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                aki.b(parcelObtainAndWriteInterfaceToken, hint);
                aki.d(parcelObtainAndWriteInterfaceToken, iHintCallback);
                Parcel parcelTransactAndReadException = transactAndReadException(7, parcelObtainAndWriteInterfaceToken);
                ICancellationCallback iCancellationCallbackAsInterface = ICancellationCallback.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iCancellationCallbackAsInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.IRosieRobotService
            public ICancellationCallback prepareInferenceEngine(IPrepareInferenceEngineCallback iPrepareInferenceEngineCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                aki.d(parcelObtainAndWriteInterfaceToken, iPrepareInferenceEngineCallback);
                Parcel parcelTransactAndReadException = transactAndReadException(4, parcelObtainAndWriteInterfaceToken);
                ICancellationCallback iCancellationCallbackAsInterface = ICancellationCallback.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iCancellationCallbackAsInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.IRosieRobotService
            public ICancellationCallback runCancellableInference(RosieRobotRequest rosieRobotRequest, IRosieRobotResultCallback iRosieRobotResultCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                aki.b(parcelObtainAndWriteInterfaceToken, rosieRobotRequest);
                aki.d(parcelObtainAndWriteInterfaceToken, iRosieRobotResultCallback);
                Parcel parcelTransactAndReadException = transactAndReadException(2, parcelObtainAndWriteInterfaceToken);
                ICancellationCallback iCancellationCallbackAsInterface = ICancellationCallback.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iCancellationCallbackAsInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.IRosieRobotService
            public ICancellationCallback runCancellableInferenceWithInfo(RosieRobotRequest rosieRobotRequest, IRosieRobotResultWithInfoCallback iRosieRobotResultWithInfoCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                aki.b(parcelObtainAndWriteInterfaceToken, rosieRobotRequest);
                aki.d(parcelObtainAndWriteInterfaceToken, iRosieRobotResultWithInfoCallback);
                Parcel parcelTransactAndReadException = transactAndReadException(6, parcelObtainAndWriteInterfaceToken);
                ICancellationCallback iCancellationCallbackAsInterface = ICancellationCallback.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iCancellationCallbackAsInterface;
            }
        }

        public Stub() {
            super(DESCRIPTOR);
        }

        public static IRosieRobotService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return iInterfaceQueryLocalInterface instanceof IRosieRobotService ? (IRosieRobotService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // defpackage.akh
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                RosieRobotRequest rosieRobotRequest = (RosieRobotRequest) aki.a(parcel, RosieRobotRequest.CREATOR);
                IRosieRobotResultCallback iRosieRobotResultCallbackAsInterface = IRosieRobotResultCallback.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                ICancellationCallback iCancellationCallbackRunCancellableInference = runCancellableInference(rosieRobotRequest, iRosieRobotResultCallbackAsInterface);
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
            if (i == 6) {
                RosieRobotRequest rosieRobotRequest2 = (RosieRobotRequest) aki.a(parcel, RosieRobotRequest.CREATOR);
                IRosieRobotResultWithInfoCallback iRosieRobotResultWithInfoCallbackAsInterface = IRosieRobotResultWithInfoCallback.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                ICancellationCallback iCancellationCallbackRunCancellableInferenceWithInfo = runCancellableInferenceWithInfo(rosieRobotRequest2, iRosieRobotResultWithInfoCallbackAsInterface);
                parcel2.writeNoException();
                aki.d(parcel2, iCancellationCallbackRunCancellableInferenceWithInfo);
                return true;
            }
            if (i != 7) {
                return false;
            }
            Hint hint = (Hint) aki.a(parcel, Hint.CREATOR);
            IHintCallback iHintCallbackAsInterface = IHintCallback.Stub.asInterface(parcel.readStrongBinder());
            enforceNoDataAvail(parcel);
            ICancellationCallback iCancellationCallbackHint = hint(hint, iHintCallbackAsInterface);
            parcel2.writeNoException();
            aki.d(parcel2, iCancellationCallbackHint);
            return true;
        }
    }

    int getApiVersion();

    ICancellationCallback hint(Hint hint, IHintCallback iHintCallback);

    ICancellationCallback prepareInferenceEngine(IPrepareInferenceEngineCallback iPrepareInferenceEngineCallback);

    ICancellationCallback runCancellableInference(RosieRobotRequest rosieRobotRequest, IRosieRobotResultCallback iRosieRobotResultCallback);

    ICancellationCallback runCancellableInferenceWithInfo(RosieRobotRequest rosieRobotRequest, IRosieRobotResultWithInfoCallback iRosieRobotResultWithInfoCallback);
}
