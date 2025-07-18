package defpackage;

import android.content.Intent;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class byl implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public byl(int i) {
        this.a = i;
    }

    public static boolean a(int i) {
        return i == 0;
    }

    public static boolean b(Object obj) {
        return obj == null;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        boolean zR = false;
        int iE = 0;
        int iE2 = 0;
        int iE3 = 0;
        int iE4 = 0;
        String strM = null;
        String strM2 = null;
        bho bhoVar = null;
        bmj bmjVar = null;
        ArrayList arrayListN = null;
        Intent intent = null;
        ArrayList arrayListO = null;
        switch (this.a) {
            case 0:
                int iG = aso.g(parcel);
                double dB = 0.0d;
                long jH = 0;
                boolean zR2 = false;
                int iE5 = 0;
                int iE6 = 0;
                int iE7 = 0;
                String strM3 = null;
                String strM4 = null;
                byte[] bArrS = null;
                while (parcel.dataPosition() < iG) {
                    int i = parcel.readInt();
                    switch (aso.d(i)) {
                        case 2:
                            strM3 = aso.m(parcel, i);
                            break;
                        case 3:
                            jH = aso.h(parcel, i);
                            break;
                        case 4:
                            zR2 = aso.r(parcel, i);
                            break;
                        case 5:
                            dB = aso.b(parcel, i);
                            break;
                        case 6:
                            strM4 = aso.m(parcel, i);
                            break;
                        case 7:
                            bArrS = aso.s(parcel, i);
                            break;
                        case 8:
                            iE5 = aso.e(parcel, i);
                            break;
                        case 9:
                            iE6 = aso.e(parcel, i);
                            break;
                        case 10:
                            iE7 = aso.e(parcel, i);
                            break;
                        default:
                            aso.q(parcel, i);
                            break;
                    }
                }
                aso.p(parcel, iG);
                return new byk(strM3, jH, zR2, dB, strM4, bArrS, iE5, iE6, iE7);
            case 1:
                int iG2 = aso.g(parcel);
                String strM5 = null;
                byte[] bArrS2 = null;
                byte[][] bArrW = null;
                byte[][] bArrW2 = null;
                byte[][] bArrW3 = null;
                byte[][] bArrW4 = null;
                int[] iArrT = null;
                byte[][] bArrW5 = null;
                int[] iArrT2 = null;
                byte[][] bArrW6 = null;
                while (parcel.dataPosition() < iG2) {
                    int i2 = parcel.readInt();
                    switch (aso.d(i2)) {
                        case 2:
                            strM5 = aso.m(parcel, i2);
                            break;
                        case 3:
                            bArrS2 = aso.s(parcel, i2);
                            break;
                        case 4:
                            bArrW = aso.w(parcel, i2);
                            break;
                        case 5:
                            bArrW2 = aso.w(parcel, i2);
                            break;
                        case 6:
                            bArrW3 = aso.w(parcel, i2);
                            break;
                        case 7:
                            bArrW4 = aso.w(parcel, i2);
                            break;
                        case 8:
                            iArrT = aso.t(parcel, i2);
                            break;
                        case 9:
                            bArrW5 = aso.w(parcel, i2);
                            break;
                        case 10:
                            iArrT2 = aso.t(parcel, i2);
                            break;
                        case 11:
                            bArrW6 = aso.w(parcel, i2);
                            break;
                        default:
                            aso.q(parcel, i2);
                            break;
                    }
                }
                aso.p(parcel, iG2);
                return new byi(strM5, bArrS2, bArrW, bArrW2, bArrW3, bArrW4, iArrT, bArrW5, iArrT2, bArrW6);
            case 2:
                int iG3 = aso.g(parcel);
                String strM6 = null;
                byk bykVar = null;
                while (parcel.dataPosition() < iG3) {
                    int i3 = parcel.readInt();
                    int iD = aso.d(i3);
                    if (iD == 2) {
                        strM = aso.m(parcel, i3);
                    } else if (iD == 3) {
                        strM6 = aso.m(parcel, i3);
                    } else if (iD == 4) {
                        bykVar = (byk) aso.k(parcel, i3, byk.CREATOR);
                    } else if (iD != 5) {
                        aso.q(parcel, i3);
                    } else {
                        zR = aso.r(parcel, i3);
                    }
                }
                aso.p(parcel, iG3);
                return new bym(strM, strM6, bykVar, zR);
            case 3:
                int iG4 = aso.g(parcel);
                while (parcel.dataPosition() < iG4) {
                    int i4 = parcel.readInt();
                    if (aso.d(i4) != 2) {
                        aso.q(parcel, i4);
                    } else {
                        arrayListO = aso.o(parcel, i4, bym.CREATOR);
                    }
                }
                aso.p(parcel, iG4);
                return new byn(arrayListO);
            case 4:
                int iG5 = aso.g(parcel);
                int iE8 = 0;
                while (parcel.dataPosition() < iG5) {
                    int i5 = parcel.readInt();
                    int iD2 = aso.d(i5);
                    if (iD2 == 1) {
                        iE4 = aso.e(parcel, i5);
                    } else if (iD2 != 2) {
                        aso.q(parcel, i5);
                    } else {
                        iE8 = aso.e(parcel, i5);
                    }
                }
                aso.p(parcel, iG5);
                return new byo(iE4, iE8);
            case 5:
                int iG6 = aso.g(parcel);
                int iE9 = 0;
                while (parcel.dataPosition() < iG6) {
                    int i6 = parcel.readInt();
                    int iD3 = aso.d(i6);
                    if (iD3 == 1) {
                        iE3 = aso.e(parcel, i6);
                    } else if (iD3 == 2) {
                        iE9 = aso.e(parcel, i6);
                    } else if (iD3 != 3) {
                        aso.q(parcel, i6);
                    } else {
                        intent = (Intent) aso.k(parcel, i6, Intent.CREATOR);
                    }
                }
                aso.p(parcel, iG6);
                return new bzn(iE3, iE9, intent);
            case 6:
                int iG7 = aso.g(parcel);
                String strM7 = null;
                while (parcel.dataPosition() < iG7) {
                    int i7 = parcel.readInt();
                    int iD4 = aso.d(i7);
                    if (iD4 == 1) {
                        arrayListN = aso.n(parcel, i7);
                    } else if (iD4 != 2) {
                        aso.q(parcel, i7);
                    } else {
                        strM7 = aso.m(parcel, i7);
                    }
                }
                aso.p(parcel, iG7);
                return new bzs(arrayListN, strM7);
            case 7:
                int iG8 = aso.g(parcel);
                while (parcel.dataPosition() < iG8) {
                    int i8 = parcel.readInt();
                    int iD5 = aso.d(i8);
                    if (iD5 == 1) {
                        iE2 = aso.e(parcel, i8);
                    } else if (iD5 != 2) {
                        aso.q(parcel, i8);
                    } else {
                        bmjVar = (bmj) aso.k(parcel, i8, bmj.CREATOR);
                    }
                }
                aso.p(parcel, iG8);
                return new bzu(iE2, bmjVar);
            case 8:
                int iG9 = aso.g(parcel);
                bmk bmkVar = null;
                while (parcel.dataPosition() < iG9) {
                    int i9 = parcel.readInt();
                    int iD6 = aso.d(i9);
                    if (iD6 == 1) {
                        iE = aso.e(parcel, i9);
                    } else if (iD6 == 2) {
                        bhoVar = (bho) aso.k(parcel, i9, bho.CREATOR);
                    } else if (iD6 != 3) {
                        aso.q(parcel, i9);
                    } else {
                        bmkVar = (bmk) aso.k(parcel, i9, bmk.CREATOR);
                    }
                }
                aso.p(parcel, iG9);
                return new bzv(iE, bhoVar, bmkVar);
            case 9:
                return new clm(parcel);
            case 10:
                int iG10 = aso.g(parcel);
                String strM8 = null;
                Rect rect = null;
                ArrayList arrayListO2 = null;
                String strM9 = null;
                ArrayList arrayListO3 = null;
                while (parcel.dataPosition() < iG10) {
                    int i10 = parcel.readInt();
                    int iD7 = aso.d(i10);
                    if (iD7 == 1) {
                        strM8 = aso.m(parcel, i10);
                    } else if (iD7 == 2) {
                        rect = (Rect) aso.k(parcel, i10, Rect.CREATOR);
                    } else if (iD7 == 3) {
                        arrayListO2 = aso.o(parcel, i10, Point.CREATOR);
                    } else if (iD7 == 4) {
                        strM9 = aso.m(parcel, i10);
                    } else if (iD7 != 5) {
                        aso.q(parcel, i10);
                    } else {
                        arrayListO3 = aso.o(parcel, i10, ecy.CREATOR);
                    }
                }
                aso.p(parcel, iG10);
                return new ecw(strM8, rect, arrayListO2, strM9, arrayListO3);
            case 11:
                int iG11 = aso.g(parcel);
                float fC = 0.0f;
                float fC2 = 0.0f;
                String strM10 = null;
                Rect rect2 = null;
                ArrayList arrayListO4 = null;
                String strM11 = null;
                ArrayList arrayListO5 = null;
                while (parcel.dataPosition() < iG11) {
                    int i11 = parcel.readInt();
                    switch (aso.d(i11)) {
                        case 1:
                            strM10 = aso.m(parcel, i11);
                            break;
                        case 2:
                            rect2 = (Rect) aso.k(parcel, i11, Rect.CREATOR);
                            break;
                        case 3:
                            arrayListO4 = aso.o(parcel, i11, Point.CREATOR);
                            break;
                        case 4:
                            strM11 = aso.m(parcel, i11);
                            break;
                        case 5:
                            fC = aso.c(parcel, i11);
                            break;
                        case 6:
                            fC2 = aso.c(parcel, i11);
                            break;
                        case 7:
                            arrayListO5 = aso.o(parcel, i11, eda.CREATOR);
                            break;
                        default:
                            aso.q(parcel, i11);
                            break;
                    }
                }
                aso.p(parcel, iG11);
                return new ecx(strM10, rect2, arrayListO4, strM11, fC, fC2, arrayListO5);
            case 12:
                int iG12 = aso.g(parcel);
                float fC3 = 0.0f;
                float fC4 = 0.0f;
                String strM12 = null;
                Rect rect3 = null;
                ArrayList arrayListO6 = null;
                String strM13 = null;
                ArrayList arrayListO7 = null;
                while (parcel.dataPosition() < iG12) {
                    int i12 = parcel.readInt();
                    switch (aso.d(i12)) {
                        case 1:
                            strM12 = aso.m(parcel, i12);
                            break;
                        case 2:
                            rect3 = (Rect) aso.k(parcel, i12, Rect.CREATOR);
                            break;
                        case 3:
                            arrayListO6 = aso.o(parcel, i12, Point.CREATOR);
                            break;
                        case 4:
                            strM13 = aso.m(parcel, i12);
                            break;
                        case 5:
                            arrayListO7 = aso.o(parcel, i12, ecx.CREATOR);
                            break;
                        case 6:
                            fC3 = aso.c(parcel, i12);
                            break;
                        case 7:
                            fC4 = aso.c(parcel, i12);
                            break;
                        default:
                            aso.q(parcel, i12);
                            break;
                    }
                }
                aso.p(parcel, iG12);
                return new ecy(strM12, rect3, arrayListO6, strM13, arrayListO7, fC3, fC4);
            case 13:
                int iG13 = aso.g(parcel);
                ArrayList arrayListO8 = null;
                while (parcel.dataPosition() < iG13) {
                    int i13 = parcel.readInt();
                    int iD8 = aso.d(i13);
                    if (iD8 == 1) {
                        strM2 = aso.m(parcel, i13);
                    } else if (iD8 != 2) {
                        aso.q(parcel, i13);
                    } else {
                        arrayListO8 = aso.o(parcel, i13, ecw.CREATOR);
                    }
                }
                aso.p(parcel, iG13);
                return new ecz(strM2, arrayListO8);
            default:
                int iG14 = aso.g(parcel);
                float fC5 = 0.0f;
                float fC6 = 0.0f;
                String strM14 = null;
                Rect rect4 = null;
                ArrayList arrayListO9 = null;
                while (parcel.dataPosition() < iG14) {
                    int i14 = parcel.readInt();
                    int iD9 = aso.d(i14);
                    if (iD9 == 1) {
                        strM14 = aso.m(parcel, i14);
                    } else if (iD9 == 2) {
                        rect4 = (Rect) aso.k(parcel, i14, Rect.CREATOR);
                    } else if (iD9 == 3) {
                        arrayListO9 = aso.o(parcel, i14, Point.CREATOR);
                    } else if (iD9 == 4) {
                        fC5 = aso.c(parcel, i14);
                    } else if (iD9 != 5) {
                        aso.q(parcel, i14);
                    } else {
                        fC6 = aso.c(parcel, i14);
                    }
                }
                aso.p(parcel, iG14);
                return new eda(strM14, rect4, arrayListO9, fC5, fC6);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new byk[i];
            case 1:
                return new byi[i];
            case 2:
                return new bym[i];
            case 3:
                return new byn[i];
            case 4:
                return new byo[i];
            case 5:
                return new bzn[i];
            case 6:
                return new bzs[i];
            case 7:
                return new bzu[i];
            case 8:
                return new bzv[i];
            case 9:
                return new clm[i];
            case 10:
                return new ecw[i];
            case 11:
                return new ecx[i];
            case 12:
                return new ecy[i];
            case 13:
                return new ecz[i];
            default:
                return new eda[i];
        }
    }
}
