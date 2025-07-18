package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import defpackage.akg;
import defpackage.akh;
import defpackage.aki;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface ISonnyResultCallback extends IInterface {

    /* compiled from: PG */
    public abstract class Stub extends akh implements ISonnyResultCallback {
        private static final String DESCRIPTOR = "com.google.android.apps.aicore.aidl.ISonnyResultCallback";
        static final int TRANSACTION_onSonnyFailure = 3;
        static final int TRANSACTION_onSonnySuccess = 2;

        /* compiled from: PG */
        public class Proxy extends akg implements ISonnyResultCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, Stub.DESCRIPTOR);
            }

            @Override // com.google.android.apps.aicore.aidl.ISonnyResultCallback
            public void onSonnyFailure(int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                transactOneway(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.ISonnyResultCallback
            public void onSonnySuccess(SonnyResult sonnyResult) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                aki.b(parcelObtainAndWriteInterfaceToken, sonnyResult);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super(DESCRIPTOR);
        }

        public static ISonnyResultCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return iInterfaceQueryLocalInterface instanceof ISonnyResultCallback ? (ISonnyResultCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // defpackage.akh
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                SonnyResult sonnyResult = (SonnyResult) aki.a(parcel, SonnyResult.CREATOR);
                enforceNoDataAvail(parcel);
                onSonnySuccess(sonnyResult);
                return true;
            }
            if (i != 3) {
                return false;
            }
            int i3 = parcel.readInt();
            enforceNoDataAvail(parcel);
            onSonnyFailure(i3);
            return true;
        }
    }

    void onSonnyFailure(int i);

    void onSonnySuccess(SonnyResult sonnyResult);
}
