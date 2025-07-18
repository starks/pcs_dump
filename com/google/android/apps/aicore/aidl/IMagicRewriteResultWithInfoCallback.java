package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import defpackage.akg;
import defpackage.akh;
import defpackage.aki;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface IMagicRewriteResultWithInfoCallback extends IInterface {

    /* compiled from: PG */
    public abstract class Stub extends akh implements IMagicRewriteResultWithInfoCallback {
        private static final String DESCRIPTOR = "com.google.android.apps.aicore.aidl.IMagicRewriteResultWithInfoCallback";
        static final int TRANSACTION_onMagicRewriteInferenceFailure = 3;
        static final int TRANSACTION_onMagicRewriteInferenceSuccess = 2;

        /* compiled from: PG */
        public class Proxy extends akg implements IMagicRewriteResultWithInfoCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, Stub.DESCRIPTOR);
            }

            @Override // com.google.android.apps.aicore.aidl.IMagicRewriteResultWithInfoCallback
            public void onMagicRewriteInferenceFailure(FailedResult failedResult) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                aki.b(parcelObtainAndWriteInterfaceToken, failedResult);
                transactOneway(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.IMagicRewriteResultWithInfoCallback
            public void onMagicRewriteInferenceSuccess(MagicRewriteResult magicRewriteResult) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                aki.b(parcelObtainAndWriteInterfaceToken, magicRewriteResult);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super(DESCRIPTOR);
        }

        public static IMagicRewriteResultWithInfoCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return iInterfaceQueryLocalInterface instanceof IMagicRewriteResultWithInfoCallback ? (IMagicRewriteResultWithInfoCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
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
            FailedResult failedResult = (FailedResult) aki.a(parcel, FailedResult.CREATOR);
            enforceNoDataAvail(parcel);
            onMagicRewriteInferenceFailure(failedResult);
            return true;
        }
    }

    void onMagicRewriteInferenceFailure(FailedResult failedResult);

    void onMagicRewriteInferenceSuccess(MagicRewriteResult magicRewriteResult);
}
