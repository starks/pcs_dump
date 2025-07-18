package com.google.android.apps.aicore.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.aso;
import defpackage.bnh;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class SummarizationMessageParcelableCreator implements Parcelable.Creator {
    public static final int CONTENT_DESCRIPTION = 0;

    static void writeToParcel(SummarizationMessage summarizationMessage, Parcel parcel, int i) {
        int iC = bnh.c(parcel);
        bnh.s(parcel, 1, summarizationMessage.getMessage());
        bnh.e(parcel, iC);
    }

    @Override // android.os.Parcelable.Creator
    public SummarizationMessage createFromParcel(Parcel parcel) {
        int iG = aso.g(parcel);
        String strM = null;
        while (parcel.dataPosition() < iG) {
            int i = parcel.readInt();
            if (aso.d(i) != 1) {
                aso.q(parcel, i);
            } else {
                strM = aso.m(parcel, i);
            }
        }
        aso.p(parcel, iG);
        return new SummarizationMessage(strM);
    }

    @Override // android.os.Parcelable.Creator
    public SummarizationMessage[] newArray(int i) {
        return new SummarizationMessage[i];
    }
}
