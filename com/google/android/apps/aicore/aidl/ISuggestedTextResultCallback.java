package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import defpackage.akg;
import defpackage.akh;
import defpackage.aki;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface ISuggestedTextResultCallback extends IInterface {

    /* compiled from: PG */
    public abstract class Stub extends akh implements ISuggestedTextResultCallback {
        private static final String DESCRIPTOR = "com.google.android.apps.aicore.aidl.ISuggestedTextResultCallback";
        static final int TRANSACTION_onSuggestedTextInferenceFailure = 3;
        static final int TRANSACTION_onSuggestedTextInferenceSuccess = 2;

        /* compiled from: PG */
        public class Proxy extends akg implements ISuggestedTextResultCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, Stub.DESCRIPTOR);
            }

            @Override // com.google.android.apps.aicore.aidl.ISuggestedTextResultCallback
            public void onSuggestedTextInferenceFailure(int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                transactOneway(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.ISuggestedTextResultCallback
            public void onSuggestedTextInferenceSuccess(SuggestedTextResult suggestedTextResult) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                aki.b(parcelObtainAndWriteInterfaceToken, suggestedTextResult);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super(DESCRIPTOR);
        }

        public static ISuggestedTextResultCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return iInterfaceQueryLocalInterface instanceof ISuggestedTextResultCallback ? (ISuggestedTextResultCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // defpackage.akh
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                SuggestedTextResult suggestedTextResult = (SuggestedTextResult) aki.a(parcel, SuggestedTextResult.CREATOR);
                enforceNoDataAvail(parcel);
                onSuggestedTextInferenceSuccess(suggestedTextResult);
                return true;
            }
            if (i != 3) {
                return false;
            }
            int i3 = parcel.readInt();
            enforceNoDataAvail(parcel);
            onSuggestedTextInferenceFailure(i3);
            return true;
        }
    }

    void onSuggestedTextInferenceFailure(int i);

    void onSuggestedTextInferenceSuccess(SuggestedTextResult suggestedTextResult);
}
