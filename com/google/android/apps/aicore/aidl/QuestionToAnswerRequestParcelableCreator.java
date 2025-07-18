package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.aso;
import defpackage.bnh;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class QuestionToAnswerRequestParcelableCreator implements Parcelable.Creator {
    public static final int CONTENT_DESCRIPTION = 0;

    static void writeToParcel(QuestionToAnswerRequest questionToAnswerRequest, Parcel parcel, int i) {
        int iC = bnh.c(parcel);
        bnh.s(parcel, 1, questionToAnswerRequest.getQuestion());
        bnh.j(parcel, 2, questionToAnswerRequest.getSafetyClassificationMode());
        bnh.s(parcel, 3, questionToAnswerRequest.getMemories());
        bnh.o(parcel, 4, questionToAnswerRequest.getTaskStateChangeCallbackBinder());
        bnh.u(parcel, 5, questionToAnswerRequest.getPromptValues());
        bnh.s(parcel, 6, questionToAnswerRequest.getAppendedResult());
        bnh.o(parcel, 7, questionToAnswerRequest.getStreamingCallbackBinder());
        bnh.e(parcel, iC);
    }

    @Override // android.os.Parcelable.Creator
    public QuestionToAnswerRequest createFromParcel(Parcel parcel) {
        int iG = aso.g(parcel);
        String strM = null;
        String strM2 = null;
        IBinder iBinderJ = null;
        IBinder iBinderJ2 = null;
        ArrayList arrayListN = null;
        String strM3 = null;
        int iE = 0;
        while (parcel.dataPosition() < iG) {
            int i = parcel.readInt();
            switch (aso.d(i)) {
                case 1:
                    strM = aso.m(parcel, i);
                    break;
                case 2:
                    iE = aso.e(parcel, i);
                    break;
                case 3:
                    strM2 = aso.m(parcel, i);
                    break;
                case 4:
                    iBinderJ = aso.j(parcel, i);
                    break;
                case 5:
                    arrayListN = aso.n(parcel, i);
                    break;
                case 6:
                    strM3 = aso.m(parcel, i);
                    break;
                case 7:
                    iBinderJ2 = aso.j(parcel, i);
                    break;
                default:
                    aso.q(parcel, i);
                    break;
            }
        }
        aso.p(parcel, iG);
        return new QuestionToAnswerRequest(strM, strM2, iE, iBinderJ, iBinderJ2, arrayListN, strM3);
    }

    @Override // android.os.Parcelable.Creator
    public QuestionToAnswerRequest[] newArray(int i) {
        return new QuestionToAnswerRequest[i];
    }
}
