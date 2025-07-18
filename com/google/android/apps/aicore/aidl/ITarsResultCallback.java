package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import defpackage.akg;
import defpackage.akh;
import defpackage.aki;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface ITarsResultCallback extends IInterface {

    /* compiled from: PG */
    public abstract class Stub extends akh implements ITarsResultCallback {
        private static final String DESCRIPTOR = "com.google.android.apps.aicore.aidl.ITarsResultCallback";
        static final int TRANSACTION_onTarsFailure = 3;
        static final int TRANSACTION_onTarsSuccess = 2;

        /* compiled from: PG */
        public class Proxy extends akg implements ITarsResultCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, Stub.DESCRIPTOR);
            }

            @Override // com.google.android.apps.aicore.aidl.ITarsResultCallback
            public void onTarsFailure(int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                transactOneway(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.ITarsResultCallback
            public void onTarsSuccess(TarsResult tarsResult) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                aki.b(parcelObtainAndWriteInterfaceToken, tarsResult);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super(DESCRIPTOR);
        }

        public static ITarsResultCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return iInterfaceQueryLocalInterface instanceof ITarsResultCallback ? (ITarsResultCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // defpackage.akh
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                TarsResult tarsResult = (TarsResult) aki.a(parcel, TarsResult.CREATOR);
                enforceNoDataAvail(parcel);
                onTarsSuccess(tarsResult);
                return true;
            }
            if (i != 3) {
                return false;
            }
            int i3 = parcel.readInt();
            enforceNoDataAvail(parcel);
            onTarsFailure(i3);
            return true;
        }
    }

    void onTarsFailure(int i);

    void onTarsSuccess(TarsResult tarsResult);
}
