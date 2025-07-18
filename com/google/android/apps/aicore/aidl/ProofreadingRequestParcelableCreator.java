package com.google.android.apps.aicore.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.aso;
import defpackage.bnh;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ProofreadingRequestParcelableCreator implements Parcelable.Creator {
    public static final int CONTENT_DESCRIPTION = 0;

    static void writeToParcel(ProofreadingRequest proofreadingRequest, Parcel parcel, int i) {
        int iC = bnh.c(parcel);
        bnh.w(parcel, 1, proofreadingRequest.getMessages());
        bnh.e(parcel, iC);
    }

    @Override // android.os.Parcelable.Creator
    public ProofreadingRequest createFromParcel(Parcel parcel) {
        int iG = aso.g(parcel);
        ArrayList arrayListO = null;
        while (parcel.dataPosition() < iG) {
            int i = parcel.readInt();
            if (aso.d(i) != 1) {
                aso.q(parcel, i);
            } else {
                arrayListO = aso.o(parcel, i, LLMMessage.CREATOR);
            }
        }
        aso.p(parcel, iG);
        return new ProofreadingRequest(arrayListO);
    }

    @Override // android.os.Parcelable.Creator
    public ProofreadingRequest[] newArray(int i) {
        return new ProofreadingRequest[i];
    }
}
