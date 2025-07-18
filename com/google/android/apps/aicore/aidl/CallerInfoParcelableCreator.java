package com.google.android.apps.aicore.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.aso;
import defpackage.bnh;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class CallerInfoParcelableCreator implements Parcelable.Creator {
    public static final int CONTENT_DESCRIPTION = 0;

    static void writeToParcel(CallerInfo callerInfo, Parcel parcel, int i) {
        int iC = bnh.c(parcel);
        bnh.j(parcel, 1, callerInfo.getCallerUid());
        bnh.u(parcel, 2, callerInfo.getCallingUidPackageNames());
        bnh.u(parcel, 3, callerInfo.getCallingUidPackageSigners());
        bnh.f(parcel, 4, callerInfo.getFromIsolatedService());
        bnh.f(parcel, 5, callerInfo.getIsDebugKeyAicore());
        bnh.e(parcel, iC);
    }

    @Override // android.os.Parcelable.Creator
    public CallerInfo createFromParcel(Parcel parcel) {
        int iG = aso.g(parcel);
        int iE = 0;
        boolean zR = false;
        boolean zR2 = false;
        ArrayList arrayListN = null;
        ArrayList arrayListN2 = null;
        while (parcel.dataPosition() < iG) {
            int i = parcel.readInt();
            int iD = aso.d(i);
            if (iD == 1) {
                iE = aso.e(parcel, i);
            } else if (iD == 2) {
                arrayListN = aso.n(parcel, i);
            } else if (iD == 3) {
                arrayListN2 = aso.n(parcel, i);
            } else if (iD == 4) {
                zR = aso.r(parcel, i);
            } else if (iD != 5) {
                aso.q(parcel, i);
            } else {
                zR2 = aso.r(parcel, i);
            }
        }
        aso.p(parcel, iG);
        return new CallerInfo(iE, arrayListN, arrayListN2, zR, zR2);
    }

    @Override // android.os.Parcelable.Creator
    public CallerInfo[] newArray(int i) {
        return new CallerInfo[i];
    }
}
