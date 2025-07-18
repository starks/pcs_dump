package com.google.android.apps.aicore.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.aso;
import defpackage.bnh;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class OptimusInputParcelableCreator implements Parcelable.Creator {
    public static final int CONTENT_DESCRIPTION = 0;

    static void writeToParcel(OptimusInput optimusInput, Parcel parcel, int i) {
        int iC = bnh.c(parcel);
        bnh.s(parcel, 1, optimusInput.getText());
        bnh.e(parcel, iC);
    }

    @Override // android.os.Parcelable.Creator
    public OptimusInput createFromParcel(Parcel parcel) {
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
        return new OptimusInput(strM);
    }

    @Override // android.os.Parcelable.Creator
    public OptimusInput[] newArray(int i) {
        return new OptimusInput[i];
    }
}
