package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import defpackage.akg;
import defpackage.akh;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface IPrepareInferenceEngineCallback extends IInterface {

    /* compiled from: PG */
    public abstract class Stub extends akh implements IPrepareInferenceEngineCallback {
        private static final String DESCRIPTOR = "com.google.android.apps.aicore.aidl.IPrepareInferenceEngineCallback";
        static final int TRANSACTION_onPreparationFailure = 3;
        static final int TRANSACTION_onPreparationSuccess = 2;

        /* compiled from: PG */
        public class Proxy extends akg implements IPrepareInferenceEngineCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, Stub.DESCRIPTOR);
            }

            @Override // com.google.android.apps.aicore.aidl.IPrepareInferenceEngineCallback
            public void onPreparationFailure(int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                transactOneway(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.IPrepareInferenceEngineCallback
            public void onPreparationSuccess() {
                transactOneway(2, obtainAndWriteInterfaceToken());
            }
        }

        public Stub() {
            super(DESCRIPTOR);
        }

        public static IPrepareInferenceEngineCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return iInterfaceQueryLocalInterface instanceof IPrepareInferenceEngineCallback ? (IPrepareInferenceEngineCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // defpackage.akh
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                onPreparationSuccess();
                return true;
            }
            if (i != 3) {
                return false;
            }
            int i3 = parcel.readInt();
            enforceNoDataAvail(parcel);
            onPreparationFailure(i3);
            return true;
        }
    }

    void onPreparationFailure(int i);

    void onPreparationSuccess();
}
