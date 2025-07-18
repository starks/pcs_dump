package com.google.android.apps.aicore.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.aso;
import defpackage.bnh;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class FailedResultParcelableCreator implements Parcelable.Creator {
    public static final int CONTENT_DESCRIPTION = 0;

    static void writeToParcel(FailedResult failedResult, Parcel parcel, int i) {
        int iC = bnh.c(parcel);
        bnh.j(parcel, 1, failedResult.getError());
        bnh.r(parcel, 2, failedResult.getInferenceEventTraceResult(), i);
        bnh.e(parcel, iC);
    }

    @Override // android.os.Parcelable.Creator
    public FailedResult createFromParcel(Parcel parcel) {
        int iG = aso.g(parcel);
        InferenceEventTraceResult inferenceEventTraceResult = null;
        int iE = 0;
        while (parcel.dataPosition() < iG) {
            int i = parcel.readInt();
            int iD = aso.d(i);
            if (iD == 1) {
                iE = aso.e(parcel, i);
            } else if (iD != 2) {
                aso.q(parcel, i);
            } else {
                inferenceEventTraceResult = (InferenceEventTraceResult) aso.k(parcel, i, InferenceEventTraceResult.CREATOR);
            }
        }
        aso.p(parcel, iG);
        return new FailedResult(iE, inferenceEventTraceResult);
    }

    @Override // android.os.Parcelable.Creator
    public FailedResult[] newArray(int i) {
        return new FailedResult[i];
    }
}
