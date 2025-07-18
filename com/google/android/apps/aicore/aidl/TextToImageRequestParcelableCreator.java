package com.google.android.apps.aicore.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.aso;
import defpackage.bnh;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class TextToImageRequestParcelableCreator implements Parcelable.Creator {
    public static final int CONTENT_DESCRIPTION = 0;

    static void writeToParcel(TextToImageRequest textToImageRequest, Parcel parcel, int i) {
        int iC = bnh.c(parcel);
        bnh.s(parcel, 1, textToImageRequest.getPrompt());
        bnh.j(parcel, 2, textToImageRequest.getIteration());
        bnh.j(parcel, 3, textToImageRequest.getSeed());
        bnh.j(parcel, 4, textToImageRequest.getFeatureType());
        bnh.j(parcel, 5, textToImageRequest.getSafetyClassificationMode());
        bnh.e(parcel, iC);
    }

    @Override // android.os.Parcelable.Creator
    public TextToImageRequest createFromParcel(Parcel parcel) {
        int iG = aso.g(parcel);
        int iE = 0;
        int iE2 = 0;
        int iE3 = 0;
        int iE4 = 0;
        String strM = null;
        while (parcel.dataPosition() < iG) {
            int i = parcel.readInt();
            int iD = aso.d(i);
            if (iD == 1) {
                strM = aso.m(parcel, i);
            } else if (iD == 2) {
                iE = aso.e(parcel, i);
            } else if (iD == 3) {
                iE2 = aso.e(parcel, i);
            } else if (iD == 4) {
                iE3 = aso.e(parcel, i);
            } else if (iD != 5) {
                aso.q(parcel, i);
            } else {
                iE4 = aso.e(parcel, i);
            }
        }
        aso.p(parcel, iG);
        return new TextToImageRequest(strM, iE, iE2, iE3, iE4);
    }

    @Override // android.os.Parcelable.Creator
    public TextToImageRequest[] newArray(int i) {
        return new TextToImageRequest[i];
    }
}
