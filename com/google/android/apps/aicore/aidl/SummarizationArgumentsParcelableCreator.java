package com.google.android.apps.aicore.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.aso;
import defpackage.bnh;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class SummarizationArgumentsParcelableCreator implements Parcelable.Creator {
    public static final int CONTENT_DESCRIPTION = 0;

    static void writeToParcel(SummarizationArguments summarizationArguments, Parcel parcel, int i) {
        int iC = bnh.c(parcel);
        bnh.u(parcel, 1, summarizationArguments.getKeys());
        bnh.u(parcel, 2, summarizationArguments.getValues());
        bnh.e(parcel, iC);
    }

    @Override // android.os.Parcelable.Creator
    public SummarizationArguments createFromParcel(Parcel parcel) {
        int iG = aso.g(parcel);
        ArrayList arrayListN = null;
        ArrayList arrayListN2 = null;
        while (parcel.dataPosition() < iG) {
            int i = parcel.readInt();
            int iD = aso.d(i);
            if (iD == 1) {
                arrayListN = aso.n(parcel, i);
            } else if (iD != 2) {
                aso.q(parcel, i);
            } else {
                arrayListN2 = aso.n(parcel, i);
            }
        }
        aso.p(parcel, iG);
        return new SummarizationArguments(arrayListN, arrayListN2);
    }

    @Override // android.os.Parcelable.Creator
    public SummarizationArguments[] newArray(int i) {
        return new SummarizationArguments[i];
    }
}
