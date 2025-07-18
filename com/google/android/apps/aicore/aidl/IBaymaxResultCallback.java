package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import defpackage.akg;
import defpackage.akh;
import defpackage.aki;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface IBaymaxResultCallback extends IInterface {

    /* compiled from: PG */
    public abstract class Stub extends akh implements IBaymaxResultCallback {
        private static final String DESCRIPTOR = "com.google.android.apps.aicore.aidl.IBaymaxResultCallback";
        static final int TRANSACTION_onBaymaxInferenceFailure = 3;
        static final int TRANSACTION_onBaymaxInferenceSuccess = 2;

        /* compiled from: PG */
        public class Proxy extends akg implements IBaymaxResultCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, Stub.DESCRIPTOR);
            }

            @Override // com.google.android.apps.aicore.aidl.IBaymaxResultCallback
            public void onBaymaxInferenceFailure(int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                transactOneway(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.IBaymaxResultCallback
            public void onBaymaxInferenceSuccess(BaymaxResult baymaxResult) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                aki.b(parcelObtainAndWriteInterfaceToken, baymaxResult);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super(DESCRIPTOR);
        }

        public static IBaymaxResultCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return iInterfaceQueryLocalInterface instanceof IBaymaxResultCallback ? (IBaymaxResultCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // defpackage.akh
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                BaymaxResult baymaxResult = (BaymaxResult) aki.a(parcel, BaymaxResult.CREATOR);
                enforceNoDataAvail(parcel);
                onBaymaxInferenceSuccess(baymaxResult);
                return true;
            }
            if (i != 3) {
                return false;
            }
            int i3 = parcel.readInt();
            enforceNoDataAvail(parcel);
            onBaymaxInferenceFailure(i3);
            return true;
        }
    }

    void onBaymaxInferenceFailure(int i);

    void onBaymaxInferenceSuccess(BaymaxResult baymaxResult);
}
