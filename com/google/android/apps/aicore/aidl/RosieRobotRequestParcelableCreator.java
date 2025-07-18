package com.google.android.apps.aicore.aidl;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import defpackage.aso;
import defpackage.bnh;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class RosieRobotRequestParcelableCreator implements Parcelable.Creator {
    public static final int CONTENT_DESCRIPTION = 0;

    static void writeToParcel(RosieRobotRequest rosieRobotRequest, Parcel parcel, int i) {
        int iC = bnh.c(parcel);
        bnh.m(parcel, 1, rosieRobotRequest.getAudio());
        bnh.s(parcel, 2, rosieRobotRequest.getLocale());
        bnh.j(parcel, 3, rosieRobotRequest.getSafetyClassificationMode());
        bnh.r(parcel, 4, rosieRobotRequest.getAudioFileDescriptor(), i);
        bnh.s(parcel, 5, rosieRobotRequest.getContextString());
        bnh.e(parcel, iC);
    }

    @Override // android.os.Parcelable.Creator
    public RosieRobotRequest createFromParcel(Parcel parcel) {
        int iG = aso.g(parcel);
        byte[] bArrS = null;
        String strM = null;
        ParcelFileDescriptor parcelFileDescriptor = null;
        String strM2 = null;
        int iE = 0;
        while (parcel.dataPosition() < iG) {
            int i = parcel.readInt();
            int iD = aso.d(i);
            if (iD == 1) {
                bArrS = aso.s(parcel, i);
            } else if (iD == 2) {
                strM = aso.m(parcel, i);
            } else if (iD == 3) {
                iE = aso.e(parcel, i);
            } else if (iD == 4) {
                parcelFileDescriptor = (ParcelFileDescriptor) aso.k(parcel, i, ParcelFileDescriptor.CREATOR);
            } else if (iD != 5) {
                aso.q(parcel, i);
            } else {
                strM2 = aso.m(parcel, i);
            }
        }
        aso.p(parcel, iG);
        return new RosieRobotRequest(bArrS, strM, iE, parcelFileDescriptor, strM2);
    }

    @Override // android.os.Parcelable.Creator
    public RosieRobotRequest[] newArray(int i) {
        return new RosieRobotRequest[i];
    }
}
