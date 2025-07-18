package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import defpackage.akg;
import defpackage.akh;
import defpackage.aki;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface ITextToImageResultCallback extends IInterface {

    /* compiled from: PG */
    public abstract class Stub extends akh implements ITextToImageResultCallback {
        private static final String DESCRIPTOR = "com.google.android.apps.aicore.aidl.ITextToImageResultCallback";
        static final int TRANSACTION_onTextToImageInferenceFailure = 3;
        static final int TRANSACTION_onTextToImageInferenceSuccess = 2;

        /* compiled from: PG */
        public class Proxy extends akg implements ITextToImageResultCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, Stub.DESCRIPTOR);
            }

            @Override // com.google.android.apps.aicore.aidl.ITextToImageResultCallback
            public void onTextToImageInferenceFailure(int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                transactOneway(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.ITextToImageResultCallback
            public void onTextToImageInferenceSuccess(TextToImageResult textToImageResult) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                aki.b(parcelObtainAndWriteInterfaceToken, textToImageResult);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super(DESCRIPTOR);
        }

        public static ITextToImageResultCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return iInterfaceQueryLocalInterface instanceof ITextToImageResultCallback ? (ITextToImageResultCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // defpackage.akh
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                TextToImageResult textToImageResult = (TextToImageResult) aki.a(parcel, TextToImageResult.CREATOR);
                enforceNoDataAvail(parcel);
                onTextToImageInferenceSuccess(textToImageResult);
                return true;
            }
            if (i != 3) {
                return false;
            }
            int i3 = parcel.readInt();
            enforceNoDataAvail(parcel);
            onTextToImageInferenceFailure(i3);
            return true;
        }
    }

    void onTextToImageInferenceFailure(int i);

    void onTextToImageInferenceSuccess(TextToImageResult textToImageResult);
}
