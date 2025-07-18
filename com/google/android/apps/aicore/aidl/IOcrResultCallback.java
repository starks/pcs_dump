package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import defpackage.akg;
import defpackage.akh;
import defpackage.aki;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface IOcrResultCallback extends IInterface {

    /* compiled from: PG */
    public abstract class Stub extends akh implements IOcrResultCallback {
        private static final String DESCRIPTOR = "com.google.android.apps.aicore.aidl.IOcrResultCallback";
        static final int TRANSACTION_onOcrInferenceFailure = 3;
        static final int TRANSACTION_onOcrInferenceSuccess = 2;

        /* compiled from: PG */
        public class Proxy extends akg implements IOcrResultCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, Stub.DESCRIPTOR);
            }

            @Override // com.google.android.apps.aicore.aidl.IOcrResultCallback
            public void onOcrInferenceFailure(int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                transactOneway(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.IOcrResultCallback
            public void onOcrInferenceSuccess(OcrResult ocrResult) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                aki.b(parcelObtainAndWriteInterfaceToken, ocrResult);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super(DESCRIPTOR);
        }

        public static IOcrResultCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return iInterfaceQueryLocalInterface instanceof IOcrResultCallback ? (IOcrResultCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // defpackage.akh
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                OcrResult ocrResult = (OcrResult) aki.a(parcel, OcrResult.CREATOR);
                enforceNoDataAvail(parcel);
                onOcrInferenceSuccess(ocrResult);
                return true;
            }
            if (i != 3) {
                return false;
            }
            int i3 = parcel.readInt();
            enforceNoDataAvail(parcel);
            onOcrInferenceFailure(i3);
            return true;
        }
    }

    void onOcrInferenceFailure(int i);

    void onOcrInferenceSuccess(OcrResult ocrResult);
}
