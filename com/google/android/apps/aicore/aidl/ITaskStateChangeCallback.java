package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import defpackage.akg;
import defpackage.akh;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface ITaskStateChangeCallback extends IInterface {

    /* compiled from: PG */
    public abstract class Stub extends akh implements ITaskStateChangeCallback {
        private static final String DESCRIPTOR = "com.google.android.apps.aicore.aidl.ITaskStateChangeCallback";
        static final int TRANSACTION_onInferenceProgress = 3;
        static final int TRANSACTION_onTaskStateChange = 2;

        /* compiled from: PG */
        public class Proxy extends akg implements ITaskStateChangeCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, Stub.DESCRIPTOR);
            }

            @Override // com.google.android.apps.aicore.aidl.ITaskStateChangeCallback
            public void onInferenceProgress(float f) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeFloat(f);
                transactOneway(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.ITaskStateChangeCallback
            public void onTaskStateChange(int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super(DESCRIPTOR);
        }

        public static ITaskStateChangeCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return iInterfaceQueryLocalInterface instanceof ITaskStateChangeCallback ? (ITaskStateChangeCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // defpackage.akh
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                int i3 = parcel.readInt();
                enforceNoDataAvail(parcel);
                onTaskStateChange(i3);
                return true;
            }
            if (i != 3) {
                return false;
            }
            float f = parcel.readFloat();
            enforceNoDataAvail(parcel);
            onInferenceProgress(f);
            return true;
        }
    }

    void onInferenceProgress(float f);

    void onTaskStateChange(int i);
}
