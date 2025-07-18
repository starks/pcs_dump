package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.apps.aicore.aidl.IAICoreService;
import defpackage.akg;
import defpackage.akh;
import defpackage.aki;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface IAiCoreServiceProviderCallback extends IInterface {

    /* compiled from: PG */
    public abstract class Stub extends akh implements IAiCoreServiceProviderCallback {
        private static final String DESCRIPTOR = "com.google.android.apps.aicore.aidl.IAiCoreServiceProviderCallback";
        static final int TRANSACTION_onServiceProviderFailure = 3;
        static final int TRANSACTION_onServiceProviderSuccess = 2;

        /* compiled from: PG */
        public class Proxy extends akg implements IAiCoreServiceProviderCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, Stub.DESCRIPTOR);
            }

            @Override // com.google.android.apps.aicore.aidl.IAiCoreServiceProviderCallback
            public void onServiceProviderFailure(int i, String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                transactOneway(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.IAiCoreServiceProviderCallback
            public void onServiceProviderSuccess(IAICoreService iAICoreService) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                aki.d(parcelObtainAndWriteInterfaceToken, iAICoreService);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super(DESCRIPTOR);
        }

        public static IAiCoreServiceProviderCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return iInterfaceQueryLocalInterface instanceof IAiCoreServiceProviderCallback ? (IAiCoreServiceProviderCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // defpackage.akh
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                IAICoreService iAICoreServiceAsInterface = IAICoreService.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                onServiceProviderSuccess(iAICoreServiceAsInterface);
                return true;
            }
            if (i != 3) {
                return false;
            }
            int i3 = parcel.readInt();
            String string = parcel.readString();
            enforceNoDataAvail(parcel);
            onServiceProviderFailure(i3, string);
            return true;
        }
    }

    void onServiceProviderFailure(int i, String str);

    void onServiceProviderSuccess(IAICoreService iAICoreService);
}
