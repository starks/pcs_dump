package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.aso;
import defpackage.bnh;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class MagicRewriteRequestParcelableCreator implements Parcelable.Creator {
    public static final int CONTENT_DESCRIPTION = 0;

    static void writeToParcel(MagicRewriteRequest magicRewriteRequest, Parcel parcel, int i) {
        int iC = bnh.c(parcel);
        bnh.s(parcel, 1, magicRewriteRequest.getMessage());
        bnh.j(parcel, 2, magicRewriteRequest.getSafetyClassificationMode());
        bnh.j(parcel, 3, magicRewriteRequest.getTone());
        bnh.o(parcel, 4, magicRewriteRequest.getStreamingCallbackBinder());
        bnh.e(parcel, iC);
    }

    @Override // android.os.Parcelable.Creator
    public MagicRewriteRequest createFromParcel(Parcel parcel) {
        int iG = aso.g(parcel);
        String strM = null;
        int iE = 0;
        int iE2 = 0;
        IBinder iBinderJ = null;
        while (parcel.dataPosition() < iG) {
            int i = parcel.readInt();
            int iD = aso.d(i);
            if (iD == 1) {
                strM = aso.m(parcel, i);
            } else if (iD == 2) {
                iE = aso.e(parcel, i);
            } else if (iD == 3) {
                iE2 = aso.e(parcel, i);
            } else if (iD != 4) {
                aso.q(parcel, i);
            } else {
                iBinderJ = aso.j(parcel, i);
            }
        }
        aso.p(parcel, iG);
        return new MagicRewriteRequest(strM, iE, iE2, iBinderJ);
    }

    @Override // android.os.Parcelable.Creator
    public MagicRewriteRequest[] newArray(int i) {
        return new MagicRewriteRequest[i];
    }
}
