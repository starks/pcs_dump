package com.google.android.apps.aicore.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.aso;
import defpackage.bnh;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class SummarizationResultParcelableCreator implements Parcelable.Creator {
    public static final int CONTENT_DESCRIPTION = 0;

    static void writeToParcel(SummarizationResult summarizationResult, Parcel parcel, int i) {
        int iC = bnh.c(parcel);
        bnh.w(parcel, 1, summarizationResult.getResults());
        bnh.r(parcel, 2, summarizationResult.getInferenceEventTraceResult(), i);
        bnh.h(parcel, 3, summarizationResult.getProcessedInputRatio());
        bnh.e(parcel, iC);
    }

    @Override // android.os.Parcelable.Creator
    public SummarizationResult createFromParcel(Parcel parcel) {
        int iG = aso.g(parcel);
        float fC = 1.0f;
        ArrayList arrayListO = null;
        InferenceEventTraceResult inferenceEventTraceResult = null;
        while (parcel.dataPosition() < iG) {
            int i = parcel.readInt();
            int iD = aso.d(i);
            if (iD == 1) {
                arrayListO = aso.o(parcel, i, LLMReply.CREATOR);
            } else if (iD == 2) {
                inferenceEventTraceResult = (InferenceEventTraceResult) aso.k(parcel, i, InferenceEventTraceResult.CREATOR);
            } else if (iD != 3) {
                aso.q(parcel, i);
            } else {
                fC = aso.c(parcel, i);
            }
        }
        aso.p(parcel, iG);
        return new SummarizationResult(arrayListO, inferenceEventTraceResult, fC);
    }

    @Override // android.os.Parcelable.Creator
    public SummarizationResult[] newArray(int i) {
        return new SummarizationResult[i];
    }
}
