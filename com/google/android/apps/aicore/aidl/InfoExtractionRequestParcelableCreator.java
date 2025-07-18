package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.aso;
import defpackage.bnh;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class InfoExtractionRequestParcelableCreator implements Parcelable.Creator {
    public static final int CONTENT_DESCRIPTION = 0;

    static void writeToParcel(InfoExtractionRequest infoExtractionRequest, Parcel parcel, int i) {
        int iC = bnh.c(parcel);
        bnh.w(parcel, 1, infoExtractionRequest.getInputs());
        bnh.j(parcel, 2, infoExtractionRequest.getSafetyClassificationMode());
        bnh.o(parcel, 3, infoExtractionRequest.getStreamingCallbackBinder());
        bnh.j(parcel, 4, infoExtractionRequest.getPreferredImageWidth());
        bnh.j(parcel, 5, infoExtractionRequest.getPreferredImageHeight());
        bnh.o(parcel, 6, infoExtractionRequest.getTaskStateChangeCallbackBinder());
        bnh.s(parcel, 7, infoExtractionRequest.getAppendedResult());
        Float temperature = infoExtractionRequest.getTemperature();
        if (temperature != null) {
            bnh.i(parcel, 8, 4);
            parcel.writeFloat(temperature.floatValue());
        }
        bnh.q(parcel, 9, infoExtractionRequest.getTopK());
        bnh.e(parcel, iC);
    }

    @Override // android.os.Parcelable.Creator
    public InfoExtractionRequest createFromParcel(Parcel parcel) {
        int iG = aso.g(parcel);
        ArrayList arrayListO = null;
        IBinder iBinderJ = null;
        IBinder iBinderJ2 = null;
        String strM = null;
        Float fValueOf = null;
        Integer numL = null;
        int iE = 0;
        int iE2 = 0;
        int iE3 = 0;
        while (parcel.dataPosition() < iG) {
            int i = parcel.readInt();
            switch (aso.d(i)) {
                case 1:
                    arrayListO = aso.o(parcel, i, InfoExtractionInput.CREATOR);
                    break;
                case 2:
                    iE = aso.e(parcel, i);
                    break;
                case 3:
                    iBinderJ = aso.j(parcel, i);
                    break;
                case 4:
                    iE2 = aso.e(parcel, i);
                    break;
                case 5:
                    iE3 = aso.e(parcel, i);
                    break;
                case 6:
                    iBinderJ2 = aso.j(parcel, i);
                    break;
                case 7:
                    strM = aso.m(parcel, i);
                    break;
                case 8:
                    int iF = aso.f(parcel, i);
                    if (iF != 0) {
                        aso.x(parcel, iF);
                        fValueOf = Float.valueOf(parcel.readFloat());
                        break;
                    } else {
                        fValueOf = null;
                        break;
                    }
                case 9:
                    numL = aso.l(parcel, i);
                    break;
                default:
                    aso.q(parcel, i);
                    break;
            }
        }
        aso.p(parcel, iG);
        return new InfoExtractionRequest(arrayListO, iE, iBinderJ, iE2, iE3, iBinderJ2, strM, fValueOf, numL);
    }

    @Override // android.os.Parcelable.Creator
    public InfoExtractionRequest[] newArray(int i) {
        return new InfoExtractionRequest[i];
    }
}
