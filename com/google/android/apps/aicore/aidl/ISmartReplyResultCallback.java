package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import defpackage.akg;
import defpackage.akh;
import defpackage.aki;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface ISmartReplyResultCallback extends IInterface {

    /* compiled from: PG */
    public abstract class Stub extends akh implements ISmartReplyResultCallback {
        private static final String DESCRIPTOR = "com.google.android.apps.aicore.aidl.ISmartReplyResultCallback";
        static final int TRANSACTION_onSmartReplyInferenceFailure = 3;
        static final int TRANSACTION_onSmartReplyInferenceSuccess = 2;

        /* compiled from: PG */
        public class Proxy extends akg implements ISmartReplyResultCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, Stub.DESCRIPTOR);
            }

            @Override // com.google.android.apps.aicore.aidl.ISmartReplyResultCallback
            public void onSmartReplyInferenceFailure(int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                transactOneway(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.ISmartReplyResultCallback
            public void onSmartReplyInferenceSuccess(SmartReplyResult smartReplyResult) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                aki.b(parcelObtainAndWriteInterfaceToken, smartReplyResult);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super(DESCRIPTOR);
        }

        public static ISmartReplyResultCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return iInterfaceQueryLocalInterface instanceof ISmartReplyResultCallback ? (ISmartReplyResultCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // defpackage.akh
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                SmartReplyResult smartReplyResult = (SmartReplyResult) aki.a(parcel, SmartReplyResult.CREATOR);
                enforceNoDataAvail(parcel);
                onSmartReplyInferenceSuccess(smartReplyResult);
                return true;
            }
            if (i != 3) {
                return false;
            }
            int i3 = parcel.readInt();
            enforceNoDataAvail(parcel);
            onSmartReplyInferenceFailure(i3);
            return true;
        }
    }

    void onSmartReplyInferenceFailure(int i);

    void onSmartReplyInferenceSuccess(SmartReplyResult smartReplyResult);
}
