package com.google.android.apps.aicore.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.aso;
import defpackage.bnh;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class SuggestedTextRequestParcelableCreator implements Parcelable.Creator {
    public static final int CONTENT_DESCRIPTION = 0;

    static void writeToParcel(SuggestedTextRequest suggestedTextRequest, Parcel parcel, int i) {
        int iC = bnh.c(parcel);
        bnh.w(parcel, 1, suggestedTextRequest.getMessages());
        bnh.j(parcel, 2, suggestedTextRequest.getSafetyClassificationMode());
        bnh.e(parcel, iC);
    }

    @Override // android.os.Parcelable.Creator
    public SuggestedTextRequest createFromParcel(Parcel parcel) {
        int iG = aso.g(parcel);
        int iE = 0;
        ArrayList arrayListO = null;
        while (parcel.dataPosition() < iG) {
            int i = parcel.readInt();
            int iD = aso.d(i);
            if (iD == 1) {
                arrayListO = aso.o(parcel, i, SuggestedTextMessage.CREATOR);
            } else if (iD != 2) {
                aso.q(parcel, i);
            } else {
                iE = aso.e(parcel, i);
            }
        }
        aso.p(parcel, iG);
        return new SuggestedTextRequest(arrayListO, iE);
    }

    @Override // android.os.Parcelable.Creator
    public SuggestedTextRequest[] newArray(int i) {
        return new SuggestedTextRequest[i];
    }
}
