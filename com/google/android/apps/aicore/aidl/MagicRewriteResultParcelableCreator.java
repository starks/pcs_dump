package com.google.android.apps.aicore.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.aso;
import defpackage.bnh;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class MagicRewriteResultParcelableCreator implements Parcelable.Creator {
    public static final int CONTENT_DESCRIPTION = 0;

    static void writeToParcel(MagicRewriteResult magicRewriteResult, Parcel parcel, int i) {
        int iC = bnh.c(parcel);
        bnh.w(parcel, 1, magicRewriteResult.getResults());
        bnh.r(parcel, 2, magicRewriteResult.getInferenceEventTraceResult(), i);
        bnh.e(parcel, iC);
    }

    @Override // android.os.Parcelable.Creator
    public MagicRewriteResult createFromParcel(Parcel parcel) {
        int iG = aso.g(parcel);
        ArrayList arrayListO = null;
        InferenceEventTraceResult inferenceEventTraceResult = null;
        while (parcel.dataPosition() < iG) {
            int i = parcel.readInt();
            int iD = aso.d(i);
            if (iD == 1) {
                arrayListO = aso.o(parcel, i, Rewrite.CREATOR);
            } else if (iD != 2) {
                aso.q(parcel, i);
            } else {
                inferenceEventTraceResult = (InferenceEventTraceResult) aso.k(parcel, i, InferenceEventTraceResult.CREATOR);
            }
        }
        aso.p(parcel, iG);
        return new MagicRewriteResult(arrayListO, inferenceEventTraceResult);
    }

    @Override // android.os.Parcelable.Creator
    public MagicRewriteResult[] newArray(int i) {
        return new MagicRewriteResult[i];
    }
}
