package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import defpackage.akg;
import defpackage.akh;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface ILLMStreamingCallback extends IInterface {

    /* compiled from: PG */
    public abstract class Stub extends akh implements ILLMStreamingCallback {
        private static final String DESCRIPTOR = "com.google.android.apps.aicore.aidl.ILLMStreamingCallback";
        static final int TRANSACTION_onNewText = 2;

        /* compiled from: PG */
        public class Proxy extends akg implements ILLMStreamingCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, Stub.DESCRIPTOR);
            }

            @Override // com.google.android.apps.aicore.aidl.ILLMStreamingCallback
            public void onNewText(int i, String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super(DESCRIPTOR);
        }

        public static ILLMStreamingCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return iInterfaceQueryLocalInterface instanceof ILLMStreamingCallback ? (ILLMStreamingCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // defpackage.akh
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 2) {
                return false;
            }
            int i3 = parcel.readInt();
            String string = parcel.readString();
            enforceNoDataAvail(parcel);
            onNewText(i3, string);
            return true;
        }
    }

    void onNewText(int i, String str);
}
