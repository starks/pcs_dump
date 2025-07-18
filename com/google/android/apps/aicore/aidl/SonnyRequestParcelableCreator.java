package com.google.android.apps.aicore.aidl;

import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.aso;
import defpackage.bnh;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class SonnyRequestParcelableCreator implements Parcelable.Creator {
    public static final int CONTENT_DESCRIPTION = 0;

    static void writeToParcel(SonnyRequest sonnyRequest, Parcel parcel, int i) {
        int iC = bnh.c(parcel);
        bnh.w(parcel, 1, sonnyRequest.getImages());
        bnh.o(parcel, 2, sonnyRequest.getImageEmbeddingCallbackBinder());
        bnh.j(parcel, 3, sonnyRequest.getPreferredImageWidth());
        bnh.j(parcel, 4, sonnyRequest.getPreferredImageHeight());
        bnh.e(parcel, iC);
    }

    @Override // android.os.Parcelable.Creator
    public SonnyRequest createFromParcel(Parcel parcel) {
        int iG = aso.g(parcel);
        int iE = 0;
        ArrayList arrayListO = null;
        IBinder iBinderJ = null;
        int iE2 = 0;
        while (parcel.dataPosition() < iG) {
            int i = parcel.readInt();
            int iD = aso.d(i);
            if (iD == 1) {
                arrayListO = aso.o(parcel, i, Bitmap.CREATOR);
            } else if (iD == 2) {
                iBinderJ = aso.j(parcel, i);
            } else if (iD == 3) {
                iE = aso.e(parcel, i);
            } else if (iD != 4) {
                aso.q(parcel, i);
            } else {
                iE2 = aso.e(parcel, i);
            }
        }
        aso.p(parcel, iG);
        return new SonnyRequest(arrayListO, iBinderJ, iE, iE2);
    }

    @Override // android.os.Parcelable.Creator
    public SonnyRequest[] newArray(int i) {
        return new SonnyRequest[i];
    }
}
