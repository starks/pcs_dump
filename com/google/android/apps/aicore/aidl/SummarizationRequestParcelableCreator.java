package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.aso;
import defpackage.bnh;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class SummarizationRequestParcelableCreator implements Parcelable.Creator {
    public static final int CONTENT_DESCRIPTION = 0;

    static void writeToParcel(SummarizationRequest summarizationRequest, Parcel parcel, int i) {
        int iC = bnh.c(parcel);
        bnh.w(parcel, 1, summarizationRequest.getMessages());
        bnh.h(parcel, 2, summarizationRequest.getTemperature());
        bnh.j(parcel, 3, summarizationRequest.getTopK());
        bnh.j(parcel, 4, summarizationRequest.getTargetReplyLengthMin());
        bnh.j(parcel, 5, summarizationRequest.getTargetReplyLengthMax());
        bnh.o(parcel, 6, summarizationRequest.getStreamingCallbackBinder());
        bnh.j(parcel, 7, summarizationRequest.getSafetyClassificationMode());
        bnh.j(parcel, 8, summarizationRequest.getBulletPointNum());
        bnh.o(parcel, 9, summarizationRequest.getTaskStateChangeCallbackBinder());
        bnh.j(parcel, 10, summarizationRequest.getRgnSeed());
        bnh.r(parcel, 11, summarizationRequest.getArguments(), i);
        bnh.e(parcel, iC);
    }

    @Override // android.os.Parcelable.Creator
    public SummarizationRequest createFromParcel(Parcel parcel) {
        int iG = aso.g(parcel);
        ArrayList arrayListO = null;
        IBinder iBinderJ = null;
        IBinder iBinderJ2 = null;
        SummarizationArguments summarizationArguments = null;
        int iE = 0;
        int iE2 = 0;
        int iE3 = 0;
        int iE4 = 0;
        int iE5 = 0;
        int iE6 = 0;
        float fC = 0.0f;
        while (parcel.dataPosition() < iG) {
            int i = parcel.readInt();
            switch (aso.d(i)) {
                case 1:
                    arrayListO = aso.o(parcel, i, SummarizationMessage.CREATOR);
                    break;
                case 2:
                    fC = aso.c(parcel, i);
                    break;
                case 3:
                    iE = aso.e(parcel, i);
                    break;
                case 4:
                    iE2 = aso.e(parcel, i);
                    break;
                case 5:
                    iE3 = aso.e(parcel, i);
                    break;
                case 6:
                    iBinderJ = aso.j(parcel, i);
                    break;
                case 7:
                    iE4 = aso.e(parcel, i);
                    break;
                case 8:
                    iE5 = aso.e(parcel, i);
                    break;
                case 9:
                    iBinderJ2 = aso.j(parcel, i);
                    break;
                case 10:
                    iE6 = aso.e(parcel, i);
                    break;
                case 11:
                    summarizationArguments = (SummarizationArguments) aso.k(parcel, i, SummarizationArguments.CREATOR);
                    break;
                default:
                    aso.q(parcel, i);
                    break;
            }
        }
        aso.p(parcel, iG);
        return new SummarizationRequest(arrayListO, fC, iE, iE2, iE3, iBinderJ, iE4, iE5, iBinderJ2, iE6, summarizationArguments);
    }

    @Override // android.os.Parcelable.Creator
    public SummarizationRequest[] newArray(int i) {
        return new SummarizationRequest[i];
    }
}
