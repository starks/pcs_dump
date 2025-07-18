package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import defpackage.akg;
import defpackage.akh;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface IHintCallback extends IInterface {

    /* compiled from: PG */
    public abstract class Stub extends akh implements IHintCallback {
        private static final String DESCRIPTOR = "com.google.android.apps.aicore.aidl.IHintCallback";
        static final int TRANSACTION_onHintFailure = 3;
        static final int TRANSACTION_onHintSuccess = 2;

        /* compiled from: PG */
        public class Proxy extends akg implements IHintCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, Stub.DESCRIPTOR);
            }

            @Override // com.google.android.apps.aicore.aidl.IHintCallback
            public void onHintFailure(int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                transactOneway(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.IHintCallback
            public void onHintSuccess() {
                transactOneway(2, obtainAndWriteInterfaceToken());
            }
        }

        public Stub() {
            super(DESCRIPTOR);
        }

        public static IHintCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return iInterfaceQueryLocalInterface instanceof IHintCallback ? (IHintCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // defpackage.akh
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                onHintSuccess();
                return true;
            }
            if (i != 3) {
                return false;
            }
            int i3 = parcel.readInt();
            enforceNoDataAvail(parcel);
            onHintFailure(i3);
            return true;
        }
    }

    void onHintFailure(int i);

    void onHintSuccess();
}
