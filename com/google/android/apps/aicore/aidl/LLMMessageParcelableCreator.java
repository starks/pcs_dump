package com.google.android.apps.aicore.aidl;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import defpackage.aso;
import defpackage.bnh;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class LLMMessageParcelableCreator implements Parcelable.Creator {
    public static final int CONTENT_DESCRIPTION = 0;

    static void writeToParcel(LLMMessage lLMMessage, Parcel parcel, int i) {
        int iC = bnh.c(parcel);
        bnh.j(parcel, 1, lLMMessage.getRole());
        bnh.s(parcel, 2, lLMMessage.getMessage());
        bnh.r(parcel, 3, lLMMessage.getBitmap(), i);
        bnh.j(parcel, 4, lLMMessage.getType());
        bnh.r(parcel, 5, lLMMessage.getImageEmbedding(), i);
        bnh.f(parcel, 6, lLMMessage.getWriteImageEmbedding());
        bnh.e(parcel, iC);
    }

    @Override // android.os.Parcelable.Creator
    public LLMMessage createFromParcel(Parcel parcel) {
        int iG = aso.g(parcel);
        int iE = 0;
        int iE2 = 0;
        boolean zR = false;
        String strM = null;
        Bitmap bitmap = null;
        ParcelFileDescriptor parcelFileDescriptor = null;
        while (parcel.dataPosition() < iG) {
            int i = parcel.readInt();
            switch (aso.d(i)) {
                case 1:
                    iE = aso.e(parcel, i);
                    break;
                case 2:
                    strM = aso.m(parcel, i);
                    break;
                case 3:
                    bitmap = (Bitmap) aso.k(parcel, i, Bitmap.CREATOR);
                    break;
                case 4:
                    iE2 = aso.e(parcel, i);
                    break;
                case 5:
                    parcelFileDescriptor = (ParcelFileDescriptor) aso.k(parcel, i, ParcelFileDescriptor.CREATOR);
                    break;
                case 6:
                    zR = aso.r(parcel, i);
                    break;
                default:
                    aso.q(parcel, i);
                    break;
            }
        }
        aso.p(parcel, iG);
        return new LLMMessage(iE, strM, bitmap, iE2, parcelFileDescriptor, zR);
    }

    @Override // android.os.Parcelable.Creator
    public LLMMessage[] newArray(int i) {
        return new LLMMessage[i];
    }
}
