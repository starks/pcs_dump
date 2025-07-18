package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import defpackage.akg;
import defpackage.akh;
import defpackage.aki;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface IMagicRewriteResultCallback extends IInterface {

    /* compiled from: PG */
    public abstract class Stub extends akh implements IMagicRewriteResultCallback {
        private static final String DESCRIPTOR = "com.google.android.apps.aicore.aidl.IMagicRewriteResultCallback";
        static final int TRANSACTION_onMagicRewriteInferenceFailure = 3;
        static final int TRANSACTION_onMagicRewriteInferenceSuccess = 2;

        /* compiled from: PG */
        public class Proxy extends akg implements IMagicRewriteResultCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, Stub.DESCRIPTOR);
            }

            @Override // com.google.android.apps.aicore.aidl.IMagicRewriteResultCallback
            public void onMagicRewriteInferenceFailure(int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                transactOneway(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.IMagicRewriteResultCallback
            public void onMagicRewriteInferenceSuccess(MagicRewriteResult magicRewriteResult) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                aki.b(parcelObtainAndWriteInterfaceToken, magicRewriteResult);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super(DESCRIPTOR);
        }

        public static IMagicRewriteResultCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return iInterfaceQueryLocalInterface instanceof IMagicRewriteResultCallback ? (IMagicRewriteResultCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // defpackage.akh
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                MagicRewriteResult magicRewriteResult = (MagicRewriteResult) aki.a(parcel, MagicRewriteResult.CREATOR);
                enforceNoDataAvail(parcel);
                onMagicRewriteInferenceSuccess(magicRewriteResult);
                return true;
            }
            if (i != 3) {
                return false;
            }
            int i3 = parcel.readInt();
            enforceNoDataAvail(parcel);
            onMagicRewriteInferenceFailure(i3);
            return true;
        }
    }

    void onMagicRewriteInferenceFailure(int i);

    void onMagicRewriteInferenceSuccess(MagicRewriteResult magicRewriteResult);
}
