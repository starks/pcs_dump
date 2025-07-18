package com.google.android.apps.aicore.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.aso;
import defpackage.bnh;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class SuggestedTextMessageParcelableCreator implements Parcelable.Creator {
    public static final int CONTENT_DESCRIPTION = 0;

    static void writeToParcel(SuggestedTextMessage suggestedTextMessage, Parcel parcel, int i) {
        int iC = bnh.c(parcel);
        bnh.s(parcel, 1, suggestedTextMessage.getUserId());
        bnh.s(parcel, 2, suggestedTextMessage.getMessage());
        bnh.e(parcel, iC);
    }

    @Override // android.os.Parcelable.Creator
    public SuggestedTextMessage createFromParcel(Parcel parcel) {
        int iG = aso.g(parcel);
        String strM = null;
        String strM2 = null;
        while (parcel.dataPosition() < iG) {
            int i = parcel.readInt();
            int iD = aso.d(i);
            if (iD == 1) {
                strM = aso.m(parcel, i);
            } else if (iD != 2) {
                aso.q(parcel, i);
            } else {
                strM2 = aso.m(parcel, i);
            }
        }
        aso.p(parcel, iG);
        return new SuggestedTextMessage(strM, strM2);
    }

    @Override // android.os.Parcelable.Creator
    public SuggestedTextMessage[] newArray(int i) {
        return new SuggestedTextMessage[i];
    }
}
