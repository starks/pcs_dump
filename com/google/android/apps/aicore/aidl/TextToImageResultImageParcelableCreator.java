package com.google.android.apps.aicore.aidl;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.aso;
import defpackage.bnh;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class TextToImageResultImageParcelableCreator implements Parcelable.Creator {
    public static final int CONTENT_DESCRIPTION = 0;

    static void writeToParcel(TextToImageResultImage textToImageResultImage, Parcel parcel, int i) {
        int iC = bnh.c(parcel);
        bnh.r(parcel, 1, textToImageResultImage.getBitmap(), i);
        bnh.j(parcel, 2, textToImageResultImage.getSafetyClassificationResult());
        bnh.e(parcel, iC);
    }

    @Override // android.os.Parcelable.Creator
    public TextToImageResultImage createFromParcel(Parcel parcel) {
        int iG = aso.g(parcel);
        int iE = 0;
        Bitmap bitmap = null;
        while (parcel.dataPosition() < iG) {
            int i = parcel.readInt();
            int iD = aso.d(i);
            if (iD == 1) {
                bitmap = (Bitmap) aso.k(parcel, i, Bitmap.CREATOR);
            } else if (iD != 2) {
                aso.q(parcel, i);
            } else {
                iE = aso.e(parcel, i);
            }
        }
        aso.p(parcel, iG);
        return new TextToImageResultImage(bitmap, iE);
    }

    @Override // android.os.Parcelable.Creator
    public TextToImageResultImage[] newArray(int i) {
        return new TextToImageResultImage[i];
    }
}
