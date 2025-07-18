package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import defpackage.akg;
import defpackage.akh;
import defpackage.aki;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface IRosieRobotResultWithInfoCallback extends IInterface {

    /* compiled from: PG */
    public abstract class Stub extends akh implements IRosieRobotResultWithInfoCallback {
        private static final String DESCRIPTOR = "com.google.android.apps.aicore.aidl.IRosieRobotResultWithInfoCallback";
        static final int TRANSACTION_onRosieRobotInferenceFailure = 3;
        static final int TRANSACTION_onRosieRobotInferenceSuccess = 2;

        /* compiled from: PG */
        public class Proxy extends akg implements IRosieRobotResultWithInfoCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, Stub.DESCRIPTOR);
            }

            @Override // com.google.android.apps.aicore.aidl.IRosieRobotResultWithInfoCallback
            public void onRosieRobotInferenceFailure(FailedResult failedResult) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                aki.b(parcelObtainAndWriteInterfaceToken, failedResult);
                transactOneway(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.IRosieRobotResultWithInfoCallback
            public void onRosieRobotInferenceSuccess(RosieRobotResult rosieRobotResult) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                aki.b(parcelObtainAndWriteInterfaceToken, rosieRobotResult);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super(DESCRIPTOR);
        }

        public static IRosieRobotResultWithInfoCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return iInterfaceQueryLocalInterface instanceof IRosieRobotResultWithInfoCallback ? (IRosieRobotResultWithInfoCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // defpackage.akh
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                RosieRobotResult rosieRobotResult = (RosieRobotResult) aki.a(parcel, RosieRobotResult.CREATOR);
                enforceNoDataAvail(parcel);
                onRosieRobotInferenceSuccess(rosieRobotResult);
                return true;
            }
            if (i != 3) {
                return false;
            }
            FailedResult failedResult = (FailedResult) aki.a(parcel, FailedResult.CREATOR);
            enforceNoDataAvail(parcel);
            onRosieRobotInferenceFailure(failedResult);
            return true;
        }
    }

    void onRosieRobotInferenceFailure(FailedResult failedResult);

    void onRosieRobotInferenceSuccess(RosieRobotResult rosieRobotResult);
}
