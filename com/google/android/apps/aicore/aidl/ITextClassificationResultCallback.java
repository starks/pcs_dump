package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import defpackage.akg;
import defpackage.akh;
import defpackage.aki;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface ITextClassificationResultCallback extends IInterface {

    /* compiled from: PG */
    public abstract class Stub extends akh implements ITextClassificationResultCallback {
        private static final String DESCRIPTOR = "com.google.android.apps.aicore.aidl.ITextClassificationResultCallback";
        static final int TRANSACTION_onTextClassificationInferenceFailure = 3;
        static final int TRANSACTION_onTextClassificationInferenceSuccess = 2;

        /* compiled from: PG */
        public class Proxy extends akg implements ITextClassificationResultCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, Stub.DESCRIPTOR);
            }

            @Override // com.google.android.apps.aicore.aidl.ITextClassificationResultCallback
            public void onTextClassificationInferenceFailure(int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                transactOneway(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.ITextClassificationResultCallback
            public void onTextClassificationInferenceSuccess(TextClassificationResult textClassificationResult) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                aki.b(parcelObtainAndWriteInterfaceToken, textClassificationResult);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super(DESCRIPTOR);
        }

        public static ITextClassificationResultCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return iInterfaceQueryLocalInterface instanceof ITextClassificationResultCallback ? (ITextClassificationResultCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // defpackage.akh
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                TextClassificationResult textClassificationResult = (TextClassificationResult) aki.a(parcel, TextClassificationResult.CREATOR);
                enforceNoDataAvail(parcel);
                onTextClassificationInferenceSuccess(textClassificationResult);
                return true;
            }
            if (i != 3) {
                return false;
            }
            int i3 = parcel.readInt();
            enforceNoDataAvail(parcel);
            onTextClassificationInferenceFailure(i3);
            return true;
        }
    }

    void onTextClassificationInferenceFailure(int i);

    void onTextClassificationInferenceSuccess(TextClassificationResult textClassificationResult);
}
