package com.google.android.apps.aicore.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.aso;
import defpackage.bnh;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class SuggestedTextReplyParcelableCreator implements Parcelable.Creator {
    public static final int CONTENT_DESCRIPTION = 0;

    static void writeToParcel(SuggestedTextReply suggestedTextReply, Parcel parcel, int i) {
        int iC = bnh.c(parcel);
        bnh.s(parcel, 1, suggestedTextReply.getText());
        bnh.j(parcel, 2, suggestedTextReply.getSafetyClassificationResult());
        bnh.e(parcel, iC);
    }

    @Override // android.os.Parcelable.Creator
    public SuggestedTextReply createFromParcel(Parcel parcel) {
        int iG = aso.g(parcel);
        int iE = 0;
        String strM = null;
        while (parcel.dataPosition() < iG) {
            int i = parcel.readInt();
            int iD = aso.d(i);
            if (iD == 1) {
                strM = aso.m(parcel, i);
            } else if (iD != 2) {
                aso.q(parcel, i);
            } else {
                iE = aso.e(parcel, i);
            }
        }
        aso.p(parcel, iG);
        return new SuggestedTextReply(strM, iE);
    }

    @Override // android.os.Parcelable.Creator
    public SuggestedTextReply[] newArray(int i) {
        return new SuggestedTextReply[i];
    }
}
