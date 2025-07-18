package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import defpackage.akg;
import defpackage.akh;
import defpackage.aki;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface IQuestionToAnswerResultWithInfoCallback extends IInterface {

    /* compiled from: PG */
    public abstract class Stub extends akh implements IQuestionToAnswerResultWithInfoCallback {
        private static final String DESCRIPTOR = "com.google.android.apps.aicore.aidl.IQuestionToAnswerResultWithInfoCallback";
        static final int TRANSACTION_onQuestionToAnswerInferenceFailure = 3;
        static final int TRANSACTION_onQuestionToAnswerInferenceSuccess = 2;

        /* compiled from: PG */
        public class Proxy extends akg implements IQuestionToAnswerResultWithInfoCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, Stub.DESCRIPTOR);
            }

            @Override // com.google.android.apps.aicore.aidl.IQuestionToAnswerResultWithInfoCallback
            public void onQuestionToAnswerInferenceFailure(FailedResult failedResult) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                aki.b(parcelObtainAndWriteInterfaceToken, failedResult);
                transactOneway(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.IQuestionToAnswerResultWithInfoCallback
            public void onQuestionToAnswerInferenceSuccess(QuestionToAnswerResult questionToAnswerResult) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                aki.b(parcelObtainAndWriteInterfaceToken, questionToAnswerResult);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super(DESCRIPTOR);
        }

        public static IQuestionToAnswerResultWithInfoCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return iInterfaceQueryLocalInterface instanceof IQuestionToAnswerResultWithInfoCallback ? (IQuestionToAnswerResultWithInfoCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // defpackage.akh
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                QuestionToAnswerResult questionToAnswerResult = (QuestionToAnswerResult) aki.a(parcel, QuestionToAnswerResult.CREATOR);
                enforceNoDataAvail(parcel);
                onQuestionToAnswerInferenceSuccess(questionToAnswerResult);
                return true;
            }
            if (i != 3) {
                return false;
            }
            FailedResult failedResult = (FailedResult) aki.a(parcel, FailedResult.CREATOR);
            enforceNoDataAvail(parcel);
            onQuestionToAnswerInferenceFailure(failedResult);
            return true;
        }
    }

    void onQuestionToAnswerInferenceFailure(FailedResult failedResult);

    void onQuestionToAnswerInferenceSuccess(QuestionToAnswerResult questionToAnswerResult);
}
