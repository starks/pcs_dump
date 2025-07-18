package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import defpackage.akg;
import defpackage.akh;
import defpackage.aki;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface IImageDescriptionResultCallback extends IInterface {

    /* compiled from: PG */
    public abstract class Stub extends akh implements IImageDescriptionResultCallback {
        private static final String DESCRIPTOR = "com.google.android.apps.aicore.aidl.IImageDescriptionResultCallback";
        static final int TRANSACTION_onImageDescriptionFailure = 3;
        static final int TRANSACTION_onImageDescriptionSuccess = 2;

        /* compiled from: PG */
        public class Proxy extends akg implements IImageDescriptionResultCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, Stub.DESCRIPTOR);
            }

            @Override // com.google.android.apps.aicore.aidl.IImageDescriptionResultCallback
            public void onImageDescriptionFailure(int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                transactOneway(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.IImageDescriptionResultCallback
            public void onImageDescriptionSuccess(ImageDescriptionResult imageDescriptionResult) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                aki.b(parcelObtainAndWriteInterfaceToken, imageDescriptionResult);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super(DESCRIPTOR);
        }

        public static IImageDescriptionResultCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return iInterfaceQueryLocalInterface instanceof IImageDescriptionResultCallback ? (IImageDescriptionResultCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // defpackage.akh
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                ImageDescriptionResult imageDescriptionResult = (ImageDescriptionResult) aki.a(parcel, ImageDescriptionResult.CREATOR);
                enforceNoDataAvail(parcel);
                onImageDescriptionSuccess(imageDescriptionResult);
                return true;
            }
            if (i != 3) {
                return false;
            }
            int i3 = parcel.readInt();
            enforceNoDataAvail(parcel);
            onImageDescriptionFailure(i3);
            return true;
        }
    }

    void onImageDescriptionFailure(int i);

    void onImageDescriptionSuccess(ImageDescriptionResult imageDescriptionResult);
}
