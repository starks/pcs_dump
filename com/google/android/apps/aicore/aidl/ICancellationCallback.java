package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import defpackage.akg;
import defpackage.akh;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface ICancellationCallback extends IInterface {

    /* compiled from: PG */
    public abstract class Stub extends akh implements ICancellationCallback {
        private static final String DESCRIPTOR = "com.google.android.apps.aicore.aidl.ICancellationCallback";
        static final int TRANSACTION_cancel = 2;

        /* compiled from: PG */
        public class Proxy extends akg implements ICancellationCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, Stub.DESCRIPTOR);
            }

            @Override // com.google.android.apps.aicore.aidl.ICancellationCallback
            public void cancel() {
                transactOneway(2, obtainAndWriteInterfaceToken());
            }
        }

        public Stub() {
            super(DESCRIPTOR);
        }

        public static ICancellationCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return iInterfaceQueryLocalInterface instanceof ICancellationCallback ? (ICancellationCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // defpackage.akh
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 2) {
                return false;
            }
            cancel();
            return true;
        }
    }

    void cancel();
}
