package com.google.android.apps.aicore.aidl;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.aso;
import defpackage.bnh;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class InfoExtractionInputParcelableCreator implements Parcelable.Creator {
    public static final int CONTENT_DESCRIPTION = 0;

    static void writeToParcel(InfoExtractionInput infoExtractionInput, Parcel parcel, int i) {
        int iC = bnh.c(parcel);
        bnh.s(parcel, 1, infoExtractionInput.getMessage());
        bnh.r(parcel, 2, infoExtractionInput.getBitmap(), i);
        bnh.e(parcel, iC);
    }

    @Override // android.os.Parcelable.Creator
    public InfoExtractionInput createFromParcel(Parcel parcel) {
        int iG = aso.g(parcel);
        String strM = null;
        Bitmap bitmap = null;
        while (parcel.dataPosition() < iG) {
            int i = parcel.readInt();
            int iD = aso.d(i);
            if (iD == 1) {
                strM = aso.m(parcel, i);
            } else if (iD != 2) {
                aso.q(parcel, i);
            } else {
                bitmap = (Bitmap) aso.k(parcel, i, Bitmap.CREATOR);
            }
        }
        aso.p(parcel, iG);
        return new InfoExtractionInput(strM, bitmap);
    }

    @Override // android.os.Parcelable.Creator
    public InfoExtractionInput[] newArray(int i) {
        return new InfoExtractionInput[i];
    }
}
