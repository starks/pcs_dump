package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import defpackage.akg;
import defpackage.akh;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface IMagicRewriteStreamingCallback extends IInterface {

    /* compiled from: PG */
    public abstract class Stub extends akh implements IMagicRewriteStreamingCallback {
        private static final String DESCRIPTOR = "com.google.android.apps.aicore.aidl.IMagicRewriteStreamingCallback";
        static final int TRANSACTION_onNewText = 2;

        /* compiled from: PG */
        public class Proxy extends akg implements IMagicRewriteStreamingCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, Stub.DESCRIPTOR);
            }

            @Override // com.google.android.apps.aicore.aidl.IMagicRewriteStreamingCallback
            public void onNewText(String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super(DESCRIPTOR);
        }

        public static IMagicRewriteStreamingCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return iInterfaceQueryLocalInterface instanceof IMagicRewriteStreamingCallback ? (IMagicRewriteStreamingCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // defpackage.akh
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 2) {
                return false;
            }
            String string = parcel.readString();
            enforceNoDataAvail(parcel);
            onNewText(string);
            return true;
        }
    }

    void onNewText(String str);
}
