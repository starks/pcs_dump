package com.google.android.apps.aicore.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.aso;
import defpackage.bnh;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class OptimusRequestParcelableCreator implements Parcelable.Creator {
    public static final int CONTENT_DESCRIPTION = 0;

    static void writeToParcel(OptimusRequest optimusRequest, Parcel parcel, int i) {
        int iC = bnh.c(parcel);
        bnh.s(parcel, 1, optimusRequest.getSourceLanguage());
        bnh.s(parcel, 2, optimusRequest.getTargetLanguage());
        bnh.r(parcel, 3, optimusRequest.getInput(), i);
        bnh.e(parcel, iC);
    }

    @Override // android.os.Parcelable.Creator
    public OptimusRequest createFromParcel(Parcel parcel) {
        int iG = aso.g(parcel);
        String strM = null;
        String strM2 = null;
        OptimusInput optimusInput = null;
        while (parcel.dataPosition() < iG) {
            int i = parcel.readInt();
            int iD = aso.d(i);
            if (iD == 1) {
                strM = aso.m(parcel, i);
            } else if (iD == 2) {
                strM2 = aso.m(parcel, i);
            } else if (iD != 3) {
                aso.q(parcel, i);
            } else {
                optimusInput = (OptimusInput) aso.k(parcel, i, OptimusInput.CREATOR);
            }
        }
        aso.p(parcel, iG);
        return new OptimusRequest(strM, strM2, optimusInput);
    }

    @Override // android.os.Parcelable.Creator
    public OptimusRequest[] newArray(int i) {
        return new OptimusRequest[i];
    }
}
