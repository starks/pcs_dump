package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.apps.aicore.aidl.IAiCoreServiceProviderCallback;
import defpackage.akg;
import defpackage.akh;
import defpackage.aki;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface IAiCoreServiceProvider extends IInterface {

    /* compiled from: PG */
    public abstract class Stub extends akh implements IAiCoreServiceProvider {
        private static final String DESCRIPTOR = "com.google.android.apps.aicore.aidl.IAiCoreServiceProvider";
        static final int TRANSACTION_get = 2;
        static final int TRANSACTION_getWithCallerInfo = 3;

        /* compiled from: PG */
        public class Proxy extends akg implements IAiCoreServiceProvider {
            public Proxy(IBinder iBinder) {
                super(iBinder, Stub.DESCRIPTOR);
            }

            @Override // com.google.android.apps.aicore.aidl.IAiCoreServiceProvider
            public void get(IAiCoreServiceProviderCallback iAiCoreServiceProviderCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                aki.d(parcelObtainAndWriteInterfaceToken, iAiCoreServiceProviderCallback);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.IAiCoreServiceProvider
            public void getWithCallerInfo(CallerInfo callerInfo, IAiCoreServiceProviderCallback iAiCoreServiceProviderCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                aki.b(parcelObtainAndWriteInterfaceToken, callerInfo);
                aki.d(parcelObtainAndWriteInterfaceToken, iAiCoreServiceProviderCallback);
                transactOneway(3, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super(DESCRIPTOR);
        }

        public static IAiCoreServiceProvider asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return iInterfaceQueryLocalInterface instanceof IAiCoreServiceProvider ? (IAiCoreServiceProvider) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // defpackage.akh
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                IAiCoreServiceProviderCallback iAiCoreServiceProviderCallbackAsInterface = IAiCoreServiceProviderCallback.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                get(iAiCoreServiceProviderCallbackAsInterface);
                return true;
            }
            if (i != 3) {
                return false;
            }
            CallerInfo callerInfo = (CallerInfo) aki.a(parcel, CallerInfo.CREATOR);
            IAiCoreServiceProviderCallback iAiCoreServiceProviderCallbackAsInterface2 = IAiCoreServiceProviderCallback.Stub.asInterface(parcel.readStrongBinder());
            enforceNoDataAvail(parcel);
            getWithCallerInfo(callerInfo, iAiCoreServiceProviderCallbackAsInterface2);
            return true;
        }
    }

    void get(IAiCoreServiceProviderCallback iAiCoreServiceProviderCallback);

    void getWithCallerInfo(CallerInfo callerInfo, IAiCoreServiceProviderCallback iAiCoreServiceProviderCallback);
}
