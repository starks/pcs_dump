package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import defpackage.akg;
import defpackage.akh;
import defpackage.aki;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface IOptimusResultCallback extends IInterface {

    /* compiled from: PG */
    public abstract class Stub extends akh implements IOptimusResultCallback {
        private static final String DESCRIPTOR = "com.google.android.apps.aicore.aidl.IOptimusResultCallback";
        static final int TRANSACTION_onOptimusInferenceFailure = 3;
        static final int TRANSACTION_onOptimusInferenceSuccess = 2;

        /* compiled from: PG */
        public class Proxy extends akg implements IOptimusResultCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, Stub.DESCRIPTOR);
            }

            @Override // com.google.android.apps.aicore.aidl.IOptimusResultCallback
            public void onOptimusInferenceFailure(int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                transactOneway(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.IOptimusResultCallback
            public void onOptimusInferenceSuccess(OptimusResult optimusResult) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                aki.b(parcelObtainAndWriteInterfaceToken, optimusResult);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super(DESCRIPTOR);
        }

        public static IOptimusResultCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return iInterfaceQueryLocalInterface instanceof IOptimusResultCallback ? (IOptimusResultCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // defpackage.akh
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                OptimusResult optimusResult = (OptimusResult) aki.a(parcel, OptimusResult.CREATOR);
                enforceNoDataAvail(parcel);
                onOptimusInferenceSuccess(optimusResult);
                return true;
            }
            if (i != 3) {
                return false;
            }
            int i3 = parcel.readInt();
            enforceNoDataAvail(parcel);
            onOptimusInferenceFailure(i3);
            return true;
        }
    }

    void onOptimusInferenceFailure(int i);

    void onOptimusInferenceSuccess(OptimusResult optimusResult);
}
