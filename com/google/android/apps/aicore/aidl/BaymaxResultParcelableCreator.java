package com.google.android.apps.aicore.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.aso;
import defpackage.bnh;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class BaymaxResultParcelableCreator implements Parcelable.Creator {
    public static final int CONTENT_DESCRIPTION = 0;

    static void writeToParcel(BaymaxResult baymaxResult, Parcel parcel, int i) {
        int iC = bnh.c(parcel);
        bnh.s(parcel, 1, baymaxResult.getTitle());
        bnh.r(parcel, 2, baymaxResult.getInferenceEventTraceResult(), i);
        bnh.e(parcel, iC);
    }

    @Override // android.os.Parcelable.Creator
    public BaymaxResult createFromParcel(Parcel parcel) {
        int iG = aso.g(parcel);
        String strM = null;
        InferenceEventTraceResult inferenceEventTraceResult = null;
        while (parcel.dataPosition() < iG) {
            int i = parcel.readInt();
            int iD = aso.d(i);
            if (iD == 1) {
                strM = aso.m(parcel, i);
            } else if (iD != 2) {
                aso.q(parcel, i);
            } else {
                inferenceEventTraceResult = (InferenceEventTraceResult) aso.k(parcel, i, InferenceEventTraceResult.CREATOR);
            }
        }
        aso.p(parcel, iG);
        return new BaymaxResult(strM, inferenceEventTraceResult);
    }

    @Override // android.os.Parcelable.Creator
    public BaymaxResult[] newArray(int i) {
        return new BaymaxResult[i];
    }
}
