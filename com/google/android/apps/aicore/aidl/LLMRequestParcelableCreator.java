package com.google.android.apps.aicore.aidl;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.aso;
import defpackage.bnh;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class LLMRequestParcelableCreator implements Parcelable.Creator {
    public static final int CONTENT_DESCRIPTION = 0;

    static void writeToParcel(LLMRequest lLMRequest, Parcel parcel, int i) {
        int iC = bnh.c(parcel);
        bnh.w(parcel, 1, lLMRequest.getMessages());
        bnh.h(parcel, 2, lLMRequest.getTemperature());
        bnh.j(parcel, 3, lLMRequest.getTopK());
        bnh.u(parcel, 4, lLMRequest.getStopTokensList());
        bnh.j(parcel, 5, lLMRequest.getTargetReplyLengthMin());
        bnh.j(parcel, 6, lLMRequest.getTargetReplyLengthMax());
        bnh.o(parcel, 7, lLMRequest.getStreamingCallbackBinder());
        bnh.f(parcel, 8, lLMRequest.shouldApplySafetyFilter());
        bnh.j(parcel, 9, lLMRequest.getNumSamples());
        bnh.o(parcel, 10, lLMRequest.getImageEmbeddingCallbackBinder());
        bnh.j(parcel, 11, lLMRequest.getPreferredImageWidth());
        bnh.j(parcel, 12, lLMRequest.getPreferredImageHeight());
        bnh.s(parcel, 13, lLMRequest.getAppendedResult());
        bnh.l(parcel, 14, lLMRequest.getAuxiliaryFilesBundle());
        bnh.f(parcel, 15, lLMRequest.getPrivateInferenceEnabled());
        bnh.e(parcel, iC);
    }

    @Override // android.os.Parcelable.Creator
    public LLMRequest createFromParcel(Parcel parcel) {
        int iG = aso.g(parcel);
        int iE = 0;
        int iE2 = 0;
        int iE3 = 0;
        boolean zR = false;
        int iE4 = 0;
        int iE5 = 0;
        int iE6 = 0;
        boolean zR2 = false;
        ArrayList arrayListO = null;
        ArrayList arrayListN = null;
        IBinder iBinderJ = null;
        IBinder iBinderJ2 = null;
        String strM = null;
        Bundle bundleI = null;
        float fC = 0.0f;
        while (parcel.dataPosition() < iG) {
            int i = parcel.readInt();
            switch (aso.d(i)) {
                case 1:
                    arrayListO = aso.o(parcel, i, LLMMessage.CREATOR);
                    break;
                case 2:
                    fC = aso.c(parcel, i);
                    break;
                case 3:
                    iE = aso.e(parcel, i);
                    break;
                case 4:
                    arrayListN = aso.n(parcel, i);
                    break;
                case 5:
                    iE2 = aso.e(parcel, i);
                    break;
                case 6:
                    iE3 = aso.e(parcel, i);
                    break;
                case 7:
                    iBinderJ = aso.j(parcel, i);
                    break;
                case 8:
                    zR = aso.r(parcel, i);
                    break;
                case 9:
                    iE4 = aso.e(parcel, i);
                    break;
                case 10:
                    iBinderJ2 = aso.j(parcel, i);
                    break;
                case 11:
                    iE5 = aso.e(parcel, i);
                    break;
                case 12:
                    iE6 = aso.e(parcel, i);
                    break;
                case 13:
                    strM = aso.m(parcel, i);
                    break;
                case 14:
                    bundleI = aso.i(parcel, i);
                    break;
                case 15:
                    zR2 = aso.r(parcel, i);
                    break;
                default:
                    aso.q(parcel, i);
                    break;
            }
        }
        aso.p(parcel, iG);
        return new LLMRequest(arrayListO, fC, iE, arrayListN, iE2, iE3, iBinderJ, zR, iE4, iBinderJ2, iE5, iE6, strM, bundleI, zR2);
    }

    @Override // android.os.Parcelable.Creator
    public LLMRequest[] newArray(int i) {
        return new LLMRequest[i];
    }
}
