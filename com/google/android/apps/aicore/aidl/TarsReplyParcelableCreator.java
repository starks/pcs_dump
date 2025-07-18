package com.google.android.apps.aicore.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.aso;
import defpackage.bnh;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class TarsReplyParcelableCreator implements Parcelable.Creator {
    public static final int CONTENT_DESCRIPTION = 0;

    static void writeToParcel(TarsReply tarsReply, Parcel parcel, int i) {
        int iC = bnh.c(parcel);
        bnh.s(parcel, 1, tarsReply.getText());
        bnh.h(parcel, 2, tarsReply.getScore());
        bnh.e(parcel, iC);
    }

    @Override // android.os.Parcelable.Creator
    public TarsReply createFromParcel(Parcel parcel) {
        int iG = aso.g(parcel);
        float fC = 0.0f;
        String strM = null;
        while (parcel.dataPosition() < iG) {
            int i = parcel.readInt();
            int iD = aso.d(i);
            if (iD == 1) {
                strM = aso.m(parcel, i);
            } else if (iD != 2) {
                aso.q(parcel, i);
            } else {
                fC = aso.c(parcel, i);
            }
        }
        aso.p(parcel, iG);
        return new TarsReply(strM, fC);
    }

    @Override // android.os.Parcelable.Creator
    public TarsReply[] newArray(int i) {
        return new TarsReply[i];
    }
}
