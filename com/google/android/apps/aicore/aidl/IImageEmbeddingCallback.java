package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import defpackage.akg;
import defpackage.akh;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface IImageEmbeddingCallback extends IInterface {

    /* compiled from: PG */
    public abstract class Stub extends akh implements IImageEmbeddingCallback {
        private static final String DESCRIPTOR = "com.google.android.apps.aicore.aidl.IImageEmbeddingCallback";
        static final int TRANSACTION_onNewEmbeddings = 2;

        /* compiled from: PG */
        public class Proxy extends akg implements IImageEmbeddingCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, Stub.DESCRIPTOR);
            }

            @Override // com.google.android.apps.aicore.aidl.IImageEmbeddingCallback
            public void onNewEmbeddings(List list) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeTypedList(list);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super(DESCRIPTOR);
        }

        public static IImageEmbeddingCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return iInterfaceQueryLocalInterface instanceof IImageEmbeddingCallback ? (IImageEmbeddingCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // defpackage.akh
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 2) {
                return false;
            }
            ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(ParcelFileDescriptor.CREATOR);
            enforceNoDataAvail(parcel);
            onNewEmbeddings(arrayListCreateTypedArrayList);
            return true;
        }
    }

    void onNewEmbeddings(List list);
}
