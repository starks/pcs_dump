package com.google.android.apps.aicore.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.aso;
import defpackage.bnh;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class TarsRequestParcelableCreator implements Parcelable.Creator {
    public static final int CONTENT_DESCRIPTION = 0;

    static void writeToParcel(TarsRequest tarsRequest, Parcel parcel, int i) {
        int iC = bnh.c(parcel);
        bnh.w(parcel, 1, tarsRequest.getInputs());
        bnh.e(parcel, iC);
    }

    @Override // android.os.Parcelable.Creator
    public TarsRequest createFromParcel(Parcel parcel) {
        int iG = aso.g(parcel);
        ArrayList arrayListO = null;
        while (parcel.dataPosition() < iG) {
            int i = parcel.readInt();
            if (aso.d(i) != 1) {
                aso.q(parcel, i);
            } else {
                arrayListO = aso.o(parcel, i, TarsInput.CREATOR);
            }
        }
        aso.p(parcel, iG);
        return new TarsRequest(arrayListO);
    }

    @Override // android.os.Parcelable.Creator
    public TarsRequest[] newArray(int i) {
        return new TarsRequest[i];
    }
}
