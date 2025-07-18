package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import defpackage.akg;
import defpackage.akh;
import defpackage.aki;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface ITextEmbeddingResultCallback extends IInterface {

    /* compiled from: PG */
    public abstract class Stub extends akh implements ITextEmbeddingResultCallback {
        private static final String DESCRIPTOR = "com.google.android.apps.aicore.aidl.ITextEmbeddingResultCallback";
        static final int TRANSACTION_onTextEmbeddingInferenceFailure = 3;
        static final int TRANSACTION_onTextEmbeddingInferenceSuccess = 2;

        /* compiled from: PG */
        public class Proxy extends akg implements ITextEmbeddingResultCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, Stub.DESCRIPTOR);
            }

            @Override // com.google.android.apps.aicore.aidl.ITextEmbeddingResultCallback
            public void onTextEmbeddingInferenceFailure(int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                transactOneway(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.ITextEmbeddingResultCallback
            public void onTextEmbeddingInferenceSuccess(TextEmbeddingResult textEmbeddingResult) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                aki.b(parcelObtainAndWriteInterfaceToken, textEmbeddingResult);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super(DESCRIPTOR);
        }

        public static ITextEmbeddingResultCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return iInterfaceQueryLocalInterface instanceof ITextEmbeddingResultCallback ? (ITextEmbeddingResultCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // defpackage.akh
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                TextEmbeddingResult textEmbeddingResult = (TextEmbeddingResult) aki.a(parcel, TextEmbeddingResult.CREATOR);
                enforceNoDataAvail(parcel);
                onTextEmbeddingInferenceSuccess(textEmbeddingResult);
                return true;
            }
            if (i != 3) {
                return false;
            }
            int i3 = parcel.readInt();
            enforceNoDataAvail(parcel);
            onTextEmbeddingInferenceFailure(i3);
            return true;
        }
    }

    void onTextEmbeddingInferenceFailure(int i);

    void onTextEmbeddingInferenceSuccess(TextEmbeddingResult textEmbeddingResult);
}
