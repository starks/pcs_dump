package com.google.android.apps.aicore.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.aso;
import defpackage.bnh;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class SonnyResultParcelableCreator implements Parcelable.Creator {
    public static final int CONTENT_DESCRIPTION = 0;

    static void writeToParcel(SonnyResult sonnyResult, Parcel parcel, int i) {
        int iC = bnh.c(parcel);
        bnh.r(parcel, 1, sonnyResult.getInferenceEventTraceResult(), i);
        bnh.e(parcel, iC);
    }

    @Override // android.os.Parcelable.Creator
    public SonnyResult createFromParcel(Parcel parcel) {
        int iG = aso.g(parcel);
        InferenceEventTraceResult inferenceEventTraceResult = null;
        while (parcel.dataPosition() < iG) {
            int i = parcel.readInt();
            if (aso.d(i) != 1) {
                aso.q(parcel, i);
            } else {
                inferenceEventTraceResult = (InferenceEventTraceResult) aso.k(parcel, i, InferenceEventTraceResult.CREATOR);
            }
        }
        aso.p(parcel, iG);
        return new SonnyResult(inferenceEventTraceResult);
    }

    @Override // android.os.Parcelable.Creator
    public SonnyResult[] newArray(int i) {
        return new SonnyResult[i];
    }
}
