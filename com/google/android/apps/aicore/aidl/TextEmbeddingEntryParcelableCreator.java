package com.google.android.apps.aicore.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.aso;
import defpackage.bnh;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class TextEmbeddingEntryParcelableCreator implements Parcelable.Creator {
    public static final int CONTENT_DESCRIPTION = 0;

    static void writeToParcel(TextEmbeddingEntry textEmbeddingEntry, Parcel parcel, int i) {
        int iC = bnh.c(parcel);
        float[] embedding = textEmbeddingEntry.getEmbedding();
        if (embedding != null) {
            int iD = bnh.d(parcel, 1);
            parcel.writeFloatArray(embedding);
            bnh.e(parcel, iD);
        }
        bnh.e(parcel, iC);
    }

    @Override // android.os.Parcelable.Creator
    public TextEmbeddingEntry createFromParcel(Parcel parcel) {
        int iG = aso.g(parcel);
        while (true) {
            float[] fArr = null;
            while (parcel.dataPosition() < iG) {
                int i = parcel.readInt();
                if (aso.d(i) != 1) {
                    aso.q(parcel, i);
                } else {
                    int iF = aso.f(parcel, i);
                    int iDataPosition = parcel.dataPosition();
                    if (iF == 0) {
                        break;
                    }
                    float[] fArrCreateFloatArray = parcel.createFloatArray();
                    parcel.setDataPosition(iDataPosition + iF);
                    fArr = fArrCreateFloatArray;
                }
            }
            aso.p(parcel, iG);
            return new TextEmbeddingEntry(fArr);
        }
    }

    @Override // android.os.Parcelable.Creator
    public TextEmbeddingEntry[] newArray(int i) {
        return new TextEmbeddingEntry[i];
    }
}
