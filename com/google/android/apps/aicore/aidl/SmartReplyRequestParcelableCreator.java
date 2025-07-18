package com.google.android.apps.aicore.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.aso;
import defpackage.bnh;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class SmartReplyRequestParcelableCreator implements Parcelable.Creator {
    public static final int CONTENT_DESCRIPTION = 0;

    static void writeToParcel(SmartReplyRequest smartReplyRequest, Parcel parcel, int i) {
        int iC = bnh.c(parcel);
        bnh.u(parcel, 1, smartReplyRequest.getMessages());
        bnh.j(parcel, 2, smartReplyRequest.getSafetyClassificationMode());
        bnh.e(parcel, iC);
    }

    @Override // android.os.Parcelable.Creator
    public SmartReplyRequest createFromParcel(Parcel parcel) {
        int iG = aso.g(parcel);
        int iE = 0;
        ArrayList arrayListN = null;
        while (parcel.dataPosition() < iG) {
            int i = parcel.readInt();
            int iD = aso.d(i);
            if (iD == 1) {
                arrayListN = aso.n(parcel, i);
            } else if (iD != 2) {
                aso.q(parcel, i);
            } else {
                iE = aso.e(parcel, i);
            }
        }
        aso.p(parcel, iG);
        return new SmartReplyRequest(arrayListN, iE);
    }

    @Override // android.os.Parcelable.Creator
    public SmartReplyRequest[] newArray(int i) {
        return new SmartReplyRequest[i];
    }
}
