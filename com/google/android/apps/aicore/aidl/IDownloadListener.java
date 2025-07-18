package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import defpackage.akg;
import defpackage.akh;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public interface IDownloadListener extends IInterface {

    /* compiled from: PG */
    public abstract class Stub extends akh implements IDownloadListener {
        private static final String DESCRIPTOR = "com.google.android.apps.aicore.aidl.IDownloadListener";
        static final int TRANSACTION_onDownloadCompleted = 5;
        static final int TRANSACTION_onDownloadFailed = 4;
        static final int TRANSACTION_onDownloadProgress = 3;
        static final int TRANSACTION_onDownloadStarted = 2;

        /* compiled from: PG */
        public class Proxy extends akg implements IDownloadListener {
            public Proxy(IBinder iBinder) {
                super(iBinder, Stub.DESCRIPTOR);
            }

            @Override // com.google.android.apps.aicore.aidl.IDownloadListener
            public void onDownloadCompleted(String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                transactOneway(5, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.IDownloadListener
            public void onDownloadFailed(String str, String str2) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                transactOneway(4, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.IDownloadListener
            public void onDownloadProgress(String str, long j) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeLong(j);
                transactOneway(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.IDownloadListener
            public void onDownloadStarted(String str, long j) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeLong(j);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super(DESCRIPTOR);
        }

        public static IDownloadListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return iInterfaceQueryLocalInterface instanceof IDownloadListener ? (IDownloadListener) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // defpackage.akh
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                String string = parcel.readString();
                long j = parcel.readLong();
                enforceNoDataAvail(parcel);
                onDownloadStarted(string, j);
                return true;
            }
            if (i == 3) {
                String string2 = parcel.readString();
                long j2 = parcel.readLong();
                enforceNoDataAvail(parcel);
                onDownloadProgress(string2, j2);
                return true;
            }
            if (i == 4) {
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                enforceNoDataAvail(parcel);
                onDownloadFailed(string3, string4);
                return true;
            }
            if (i != 5) {
                return false;
            }
            String string5 = parcel.readString();
            enforceNoDataAvail(parcel);
            onDownloadCompleted(string5);
            return true;
        }
    }

    void onDownloadCompleted(String str);

    void onDownloadFailed(String str, String str2);

    void onDownloadProgress(String str, long j);

    void onDownloadStarted(String str, long j);
}
