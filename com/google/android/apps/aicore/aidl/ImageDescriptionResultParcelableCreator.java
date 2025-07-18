package com.google.android.apps.aicore.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.aso;
import defpackage.bnh;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ImageDescriptionResultParcelableCreator implements Parcelable.Creator {
    public static final int CONTENT_DESCRIPTION = 0;

    static void writeToParcel(ImageDescriptionResult imageDescriptionResult, Parcel parcel, int i) {
        int iC = bnh.c(parcel);
        bnh.u(parcel, 1, imageDescriptionResult.getDescriptions());
        bnh.r(parcel, 2, imageDescriptionResult.getInferenceEventTraceResult(), i);
        bnh.w(parcel, 3, imageDescriptionResult.getResults());
        bnh.e(parcel, iC);
    }

    @Override // android.os.Parcelable.Creator
    public ImageDescriptionResult createFromParcel(Parcel parcel) {
        int iG = aso.g(parcel);
        ArrayList arrayListN = null;
        InferenceEventTraceResult inferenceEventTraceResult = null;
        ArrayList arrayListO = null;
        while (parcel.dataPosition() < iG) {
            int i = parcel.readInt();
            int iD = aso.d(i);
            if (iD == 1) {
                arrayListN = aso.n(parcel, i);
            } else if (iD == 2) {
                inferenceEventTraceResult = (InferenceEventTraceResult) aso.k(parcel, i, InferenceEventTraceResult.CREATOR);
            } else if (iD != 3) {
                aso.q(parcel, i);
            } else {
                arrayListO = aso.o(parcel, i, LLMReply.CREATOR);
            }
        }
        aso.p(parcel, iG);
        return new ImageDescriptionResult(arrayListN, inferenceEventTraceResult, arrayListO);
    }

    @Override // android.os.Parcelable.Creator
    public ImageDescriptionResult[] newArray(int i) {
        return new ImageDescriptionResult[i];
    }
}
