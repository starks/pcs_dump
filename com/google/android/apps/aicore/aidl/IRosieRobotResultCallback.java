package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import defpackage.akg;
import defpackage.akh;
import defpackage.aki;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface IRosieRobotResultCallback extends IInterface {

    /* compiled from: PG */
    public abstract class Stub extends akh implements IRosieRobotResultCallback {
        private static final String DESCRIPTOR = "com.google.android.apps.aicore.aidl.IRosieRobotResultCallback";
        static final int TRANSACTION_onRosieRobotInferenceFailure = 3;
        static final int TRANSACTION_onRosieRobotInferenceSuccess = 2;

        /* compiled from: PG */
        public class Proxy extends akg implements IRosieRobotResultCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, Stub.DESCRIPTOR);
            }

            @Override // com.google.android.apps.aicore.aidl.IRosieRobotResultCallback
            public void onRosieRobotInferenceFailure(int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                transactOneway(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.IRosieRobotResultCallback
            public void onRosieRobotInferenceSuccess(RosieRobotResult rosieRobotResult) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                aki.b(parcelObtainAndWriteInterfaceToken, rosieRobotResult);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super(DESCRIPTOR);
        }

        public static IRosieRobotResultCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return iInterfaceQueryLocalInterface instanceof IRosieRobotResultCallback ? (IRosieRobotResultCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
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
            int i3 = parcel.readInt();
            enforceNoDataAvail(parcel);
            onRosieRobotInferenceFailure(i3);
            return true;
        }
    }

    void onRosieRobotInferenceFailure(int i);

    void onRosieRobotInferenceSuccess(RosieRobotResult rosieRobotResult);
}
