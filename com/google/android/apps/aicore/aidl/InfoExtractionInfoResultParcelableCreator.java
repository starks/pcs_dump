package com.google.android.apps.aicore.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.aso;
import defpackage.bnh;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class InfoExtractionInfoResultParcelableCreator implements Parcelable.Creator {
    public static final int CONTENT_DESCRIPTION = 0;

    static void writeToParcel(InfoExtractionInfo infoExtractionInfo, Parcel parcel, int i) {
        int iC = bnh.c(parcel);
        bnh.s(parcel, 1, infoExtractionInfo.getText());
        bnh.e(parcel, iC);
    }

    @Override // android.os.Parcelable.Creator
    public InfoExtractionInfo createFromParcel(Parcel parcel) {
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
        return new InfoExtractionInfo(strM);
    }

    @Override // android.os.Parcelable.Creator
    public InfoExtractionInfo[] newArray(int i) {
        return new InfoExtractionInfo[i];
    }
}
