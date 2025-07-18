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
public final class ImageDescriptionRequestParcelableCreator implements Parcelable.Creator {
    public static final int CONTENT_DESCRIPTION = 0;

    static void writeToParcel(ImageDescriptionRequest imageDescriptionRequest, Parcel parcel, int i) {
        int iC = bnh.c(parcel);
        bnh.w(parcel, 1, imageDescriptionRequest.getImages());
        bnh.o(parcel, 2, imageDescriptionRequest.getStreamingCallbackBinder());
        bnh.s(parcel, 3, imageDescriptionRequest.getAppendedResult());
        bnh.e(parcel, iC);
    }

    @Override // android.os.Parcelable.Creator
    public ImageDescriptionRequest createFromParcel(Parcel parcel) {
        int iG = aso.g(parcel);
        ArrayList arrayListO = null;
        IBinder iBinderJ = null;
        String strM = null;
        while (parcel.dataPosition() < iG) {
            int i = parcel.readInt();
            int iD = aso.d(i);
            if (iD == 1) {
                arrayListO = aso.o(parcel, i, Bitmap.CREATOR);
            } else if (iD == 2) {
                iBinderJ = aso.j(parcel, i);
            } else if (iD != 3) {
                aso.q(parcel, i);
            } else {
                strM = aso.m(parcel, i);
            }
        }
        aso.p(parcel, iG);
        return new ImageDescriptionRequest(arrayListO, iBinderJ, strM);
    }

    @Override // android.os.Parcelable.Creator
    public ImageDescriptionRequest[] newArray(int i) {
        return new ImageDescriptionRequest[i];
    }
}
