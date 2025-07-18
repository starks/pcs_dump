package com.google.android.apps.aicore.aidl;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.aso;
import defpackage.bnh;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class OcrRequestParcelableCreator implements Parcelable.Creator {
    public static final int CONTENT_DESCRIPTION = 0;

    static void writeToParcel(OcrRequest ocrRequest, Parcel parcel, int i) {
        int iC = bnh.c(parcel);
        bnh.r(parcel, 1, ocrRequest.getBitmap(), i);
        bnh.e(parcel, iC);
    }

    @Override // android.os.Parcelable.Creator
    public OcrRequest createFromParcel(Parcel parcel) {
        int iG = aso.g(parcel);
        Bitmap bitmap = null;
        while (parcel.dataPosition() < iG) {
            int i = parcel.readInt();
            if (aso.d(i) != 1) {
                aso.q(parcel, i);
            } else {
                bitmap = (Bitmap) aso.k(parcel, i, Bitmap.CREATOR);
            }
        }
        aso.p(parcel, iG);
        return new OcrRequest(bitmap);
    }

    @Override // android.os.Parcelable.Creator
    public OcrRequest[] newArray(int i) {
        return new OcrRequest[i];
    }
}
