package com.google.android.apps.aicore.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.aso;
import defpackage.bnh;
import defpackage.ecz;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class OcrResultParcelableCreator implements Parcelable.Creator {
    public static final int CONTENT_DESCRIPTION = 0;

    static void writeToParcel(OcrResult ocrResult, Parcel parcel, int i) {
        int iC = bnh.c(parcel);
        bnh.r(parcel, 1, ocrResult.getTextParcel(), i);
        bnh.r(parcel, 2, ocrResult.getInferenceEventTraceResult(), i);
        bnh.e(parcel, iC);
    }

    @Override // android.os.Parcelable.Creator
    public OcrResult createFromParcel(Parcel parcel) {
        int iG = aso.g(parcel);
        ecz eczVar = null;
        InferenceEventTraceResult inferenceEventTraceResult = null;
        while (parcel.dataPosition() < iG) {
            int i = parcel.readInt();
            int iD = aso.d(i);
            if (iD == 1) {
                eczVar = (ecz) aso.k(parcel, i, ecz.CREATOR);
            } else if (iD != 2) {
                aso.q(parcel, i);
            } else {
                inferenceEventTraceResult = (InferenceEventTraceResult) aso.k(parcel, i, InferenceEventTraceResult.CREATOR);
            }
        }
        aso.p(parcel, iG);
        return new OcrResult(eczVar, inferenceEventTraceResult);
    }

    @Override // android.os.Parcelable.Creator
    public OcrResult[] newArray(int i) {
        return new OcrResult[i];
    }
}
