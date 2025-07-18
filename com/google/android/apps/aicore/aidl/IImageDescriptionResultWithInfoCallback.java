package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import defpackage.akg;
import defpackage.akh;
import defpackage.aki;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface IImageDescriptionResultWithInfoCallback extends IInterface {

    /* compiled from: PG */
    public abstract class Stub extends akh implements IImageDescriptionResultWithInfoCallback {
        private static final String DESCRIPTOR = "com.google.android.apps.aicore.aidl.IImageDescriptionResultWithInfoCallback";
        static final int TRANSACTION_onImageDescriptionFailure = 3;
        static final int TRANSACTION_onImageDescriptionSuccess = 2;

        /* compiled from: PG */
        public class Proxy extends akg implements IImageDescriptionResultWithInfoCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, Stub.DESCRIPTOR);
            }

            @Override // com.google.android.apps.aicore.aidl.IImageDescriptionResultWithInfoCallback
            public void onImageDescriptionFailure(FailedResult failedResult) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                aki.b(parcelObtainAndWriteInterfaceToken, failedResult);
                transactOneway(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.IImageDescriptionResultWithInfoCallback
            public void onImageDescriptionSuccess(ImageDescriptionResult imageDescriptionResult) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                aki.b(parcelObtainAndWriteInterfaceToken, imageDescriptionResult);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super(DESCRIPTOR);
        }

        public static IImageDescriptionResultWithInfoCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return iInterfaceQueryLocalInterface instanceof IImageDescriptionResultWithInfoCallback ? (IImageDescriptionResultWithInfoCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
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
            FailedResult failedResult = (FailedResult) aki.a(parcel, FailedResult.CREATOR);
            enforceNoDataAvail(parcel);
            onImageDescriptionFailure(failedResult);
            return true;
        }
    }

    void onImageDescriptionFailure(FailedResult failedResult);

    void onImageDescriptionSuccess(ImageDescriptionResult imageDescriptionResult);
}
