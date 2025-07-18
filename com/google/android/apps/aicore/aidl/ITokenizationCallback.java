package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import defpackage.akg;
import defpackage.akh;
import defpackage.aki;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface ITokenizationCallback extends IInterface {

    /* compiled from: PG */
    public abstract class Stub extends akh implements ITokenizationCallback {
        private static final String DESCRIPTOR = "com.google.android.apps.aicore.aidl.ITokenizationCallback";
        static final int TRANSACTION_onTokenizationFailure = 3;
        static final int TRANSACTION_onTokenizationInfoSuccess = 4;
        static final int TRANSACTION_onTokenizationSuccess = 2;

        /* compiled from: PG */
        public class Proxy extends akg implements ITokenizationCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, Stub.DESCRIPTOR);
            }

            @Override // com.google.android.apps.aicore.aidl.ITokenizationCallback
            public void onTokenizationFailure(int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                transactOneway(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.ITokenizationCallback
            public void onTokenizationInfoSuccess(TokenInfo tokenInfo) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                aki.b(parcelObtainAndWriteInterfaceToken, tokenInfo);
                transactOneway(4, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.ITokenizationCallback
            public void onTokenizationSuccess(int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super(DESCRIPTOR);
        }

        public static ITokenizationCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return iInterfaceQueryLocalInterface instanceof ITokenizationCallback ? (ITokenizationCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // defpackage.akh
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                int i3 = parcel.readInt();
                enforceNoDataAvail(parcel);
                onTokenizationSuccess(i3);
                return true;
            }
            if (i == 3) {
                int i4 = parcel.readInt();
                enforceNoDataAvail(parcel);
                onTokenizationFailure(i4);
                return true;
            }
            if (i != 4) {
                return false;
            }
            TokenInfo tokenInfo = (TokenInfo) aki.a(parcel, TokenInfo.CREATOR);
            enforceNoDataAvail(parcel);
            onTokenizationInfoSuccess(tokenInfo);
            return true;
        }
    }

    void onTokenizationFailure(int i);

    void onTokenizationInfoSuccess(TokenInfo tokenInfo);

    @Deprecated
    void onTokenizationSuccess(int i);
}
