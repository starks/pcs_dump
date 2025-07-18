package com.google.android.apps.aicore.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.aso;
import defpackage.bnh;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class TextEmbeddingRequestParcelableCreator implements Parcelable.Creator {
    public static final int CONTENT_DESCRIPTION = 0;

    static void writeToParcel(TextEmbeddingRequest textEmbeddingRequest, Parcel parcel, int i) {
        int iC = bnh.c(parcel);
        bnh.w(parcel, 1, textEmbeddingRequest.getMessages());
        bnh.e(parcel, iC);
    }

    @Override // android.os.Parcelable.Creator
    public TextEmbeddingRequest createFromParcel(Parcel parcel) {
        int iG = aso.g(parcel);
        ArrayList arrayListO = null;
        while (parcel.dataPosition() < iG) {
            int i = parcel.readInt();
            if (aso.d(i) != 1) {
                aso.q(parcel, i);
            } else {
                arrayListO = aso.o(parcel, i, TextEmbeddingMessage.CREATOR);
            }
        }
        aso.p(parcel, iG);
        return new TextEmbeddingRequest(arrayListO);
    }

    @Override // android.os.Parcelable.Creator
    public TextEmbeddingRequest[] newArray(int i) {
        return new TextEmbeddingRequest[i];
    }
}
