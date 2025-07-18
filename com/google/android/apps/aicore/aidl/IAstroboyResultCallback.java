package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import defpackage.akg;
import defpackage.akh;
import defpackage.aki;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface IAstroboyResultCallback extends IInterface {

    /* compiled from: PG */
    public abstract class Stub extends akh implements IAstroboyResultCallback {
        private static final String DESCRIPTOR = "com.google.android.apps.aicore.aidl.IAstroboyResultCallback";
        static final int TRANSACTION_onAstroboyFailure = 3;
        static final int TRANSACTION_onAstroboySuccess = 2;

        /* compiled from: PG */
        public class Proxy extends akg implements IAstroboyResultCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, Stub.DESCRIPTOR);
            }

            @Override // com.google.android.apps.aicore.aidl.IAstroboyResultCallback
            public void onAstroboyFailure(int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                transactOneway(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.IAstroboyResultCallback
            public void onAstroboySuccess(AstroboyResult astroboyResult) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                aki.b(parcelObtainAndWriteInterfaceToken, astroboyResult);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super(DESCRIPTOR);
        }

        public static IAstroboyResultCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return iInterfaceQueryLocalInterface instanceof IAstroboyResultCallback ? (IAstroboyResultCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // defpackage.akh
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                AstroboyResult astroboyResult = (AstroboyResult) aki.a(parcel, AstroboyResult.CREATOR);
                enforceNoDataAvail(parcel);
                onAstroboySuccess(astroboyResult);
                return true;
            }
            if (i != 3) {
                return false;
            }
            int i3 = parcel.readInt();
            enforceNoDataAvail(parcel);
            onAstroboyFailure(i3);
            return true;
        }
    }

    void onAstroboyFailure(int i);

    void onAstroboySuccess(AstroboyResult astroboyResult);
}
