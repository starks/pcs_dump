package com.google.android.apps.aicore.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.aso;
import defpackage.bnh;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class HintParcelableCreator implements Parcelable.Creator {
    public static final int CONTENT_DESCRIPTION = 0;

    static void writeToParcel(Hint hint, Parcel parcel, int i) {
        int iC = bnh.c(parcel);
        bnh.j(parcel, 1, hint.getType());
        bnh.e(parcel, iC);
    }

    @Override // android.os.Parcelable.Creator
    public Hint createFromParcel(Parcel parcel) {
        int iG = aso.g(parcel);
        int iE = 0;
        while (parcel.dataPosition() < iG) {
            int i = parcel.readInt();
            if (aso.d(i) != 1) {
                aso.q(parcel, i);
            } else {
                iE = aso.e(parcel, i);
            }
        }
        aso.p(parcel, iG);
        return new Hint(iE);
    }

    @Override // android.os.Parcelable.Creator
    public Hint[] newArray(int i) {
        return new Hint[i];
    }
}
