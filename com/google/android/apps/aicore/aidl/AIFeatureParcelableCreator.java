package com.google.android.apps.aicore.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.aso;
import defpackage.bnh;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class AIFeatureParcelableCreator implements Parcelable.Creator {
    public static final int CONTENT_DESCRIPTION = 0;

    static void writeToParcel(AIFeature aIFeature, Parcel parcel, int i) {
        int iC = bnh.c(parcel);
        bnh.s(parcel, 1, aIFeature.getName());
        bnh.s(parcel, 2, aIFeature.getModelName());
        bnh.j(parcel, 3, aIFeature.getType());
        bnh.j(parcel, 4, aIFeature.getVariant());
        bnh.j(parcel, 5, aIFeature.getId());
        bnh.j(parcel, 6, aIFeature.getVersion());
        bnh.e(parcel, iC);
    }

    @Override // android.os.Parcelable.Creator
    public AIFeature createFromParcel(Parcel parcel) {
        int iG = aso.g(parcel);
        int iE = 0;
        int iE2 = 0;
        int iE3 = 0;
        int iE4 = 0;
        String strM = null;
        String strM2 = null;
        while (parcel.dataPosition() < iG) {
            int i = parcel.readInt();
            switch (aso.d(i)) {
                case 1:
                    strM = aso.m(parcel, i);
                    break;
                case 2:
                    strM2 = aso.m(parcel, i);
                    break;
                case 3:
                    iE = aso.e(parcel, i);
                    break;
                case 4:
                    iE2 = aso.e(parcel, i);
                    break;
                case 5:
                    iE3 = aso.e(parcel, i);
                    break;
                case 6:
                    iE4 = aso.e(parcel, i);
                    break;
                default:
                    aso.q(parcel, i);
                    break;
            }
        }
        aso.p(parcel, iG);
        return new AIFeature(strM, strM2, iE, iE2, iE3, iE4);
    }

    @Override // android.os.Parcelable.Creator
    public AIFeature[] newArray(int i) {
        return new AIFeature[i];
    }
}
