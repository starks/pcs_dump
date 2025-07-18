package com.google.android.apps.aicore.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.aso;
import defpackage.bnh;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class SmartReplyReplyEntryParcelableCreator implements Parcelable.Creator {
    public static final int CONTENT_DESCRIPTION = 0;

    static void writeToParcel(SmartReplyReplyEntry smartReplyReplyEntry, Parcel parcel, int i) {
        int iC = bnh.c(parcel);
        bnh.s(parcel, 1, smartReplyReplyEntry.getText());
        bnh.j(parcel, 2, smartReplyReplyEntry.getSafetyClassificationResult());
        bnh.h(parcel, 3, smartReplyReplyEntry.getScore());
        bnh.e(parcel, iC);
    }

    @Override // android.os.Parcelable.Creator
    public SmartReplyReplyEntry createFromParcel(Parcel parcel) {
        int iG = aso.g(parcel);
        float fC = 0.0f;
        int iE = 0;
        String strM = null;
        while (parcel.dataPosition() < iG) {
            int i = parcel.readInt();
            int iD = aso.d(i);
            if (iD == 1) {
                strM = aso.m(parcel, i);
            } else if (iD == 2) {
                iE = aso.e(parcel, i);
            } else if (iD != 3) {
                aso.q(parcel, i);
            } else {
                fC = aso.c(parcel, i);
            }
        }
        aso.p(parcel, iG);
        return new SmartReplyReplyEntry(strM, iE, fC);
    }

    @Override // android.os.Parcelable.Creator
    public SmartReplyReplyEntry[] newArray(int i) {
        return new SmartReplyReplyEntry[i];
    }
}
