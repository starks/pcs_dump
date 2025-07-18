package com.google.android.apps.aicore.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.aso;
import defpackage.bnh;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class LLMReplyParcelableCreator implements Parcelable.Creator {
    public static final int CONTENT_DESCRIPTION = 0;

    static void writeToParcel(LLMReply lLMReply, Parcel parcel, int i) {
        int iC = bnh.c(parcel);
        bnh.s(parcel, 1, lLMReply.getText());
        bnh.h(parcel, 2, lLMReply.getPerplexity());
        bnh.j(parcel, 3, lLMReply.getStopReason());
        bnh.h(parcel, 4, lLMReply.getScore());
        bnh.e(parcel, iC);
    }

    @Override // android.os.Parcelable.Creator
    public LLMReply createFromParcel(Parcel parcel) {
        int iG = aso.g(parcel);
        float fC = 0.0f;
        String strM = null;
        int iE = 0;
        float fC2 = 0.0f;
        while (parcel.dataPosition() < iG) {
            int i = parcel.readInt();
            int iD = aso.d(i);
            if (iD == 1) {
                strM = aso.m(parcel, i);
            } else if (iD == 2) {
                fC = aso.c(parcel, i);
            } else if (iD == 3) {
                iE = aso.e(parcel, i);
            } else if (iD != 4) {
                aso.q(parcel, i);
            } else {
                fC2 = aso.c(parcel, i);
            }
        }
        aso.p(parcel, iG);
        return new LLMReply(strM, fC, iE, fC2);
    }

    @Override // android.os.Parcelable.Creator
    public LLMReply[] newArray(int i) {
        return new LLMReply[i];
    }
}
