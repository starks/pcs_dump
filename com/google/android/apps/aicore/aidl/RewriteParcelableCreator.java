package com.google.android.apps.aicore.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.aso;
import defpackage.bnh;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class RewriteParcelableCreator implements Parcelable.Creator {
    public static final int CONTENT_DESCRIPTION = 0;

    static void writeToParcel(Rewrite rewrite, Parcel parcel, int i) {
        int iC = bnh.c(parcel);
        bnh.s(parcel, 1, rewrite.getText());
        bnh.j(parcel, 2, rewrite.getTone());
        bnh.j(parcel, 3, rewrite.getSafetyClassificationResult());
        bnh.h(parcel, 4, rewrite.getScore());
        bnh.e(parcel, iC);
    }

    @Override // android.os.Parcelable.Creator
    public Rewrite createFromParcel(Parcel parcel) {
        int iG = aso.g(parcel);
        float fC = 0.0f;
        int iE = 0;
        String strM = null;
        int iE2 = 0;
        while (parcel.dataPosition() < iG) {
            int i = parcel.readInt();
            int iD = aso.d(i);
            if (iD == 1) {
                strM = aso.m(parcel, i);
            } else if (iD == 2) {
                iE = aso.e(parcel, i);
            } else if (iD == 3) {
                iE2 = aso.e(parcel, i);
            } else if (iD != 4) {
                aso.q(parcel, i);
            } else {
                fC = aso.c(parcel, i);
            }
        }
        aso.p(parcel, iG);
        return new Rewrite(strM, iE, iE2, fC);
    }

    @Override // android.os.Parcelable.Creator
    public Rewrite[] newArray(int i) {
        return new Rewrite[i];
    }
}
