package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.database.CursorWindow;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.apps.aicore.aidl.AIFeature;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bji implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public bji(int i) {
        this.a = i;
    }

    public static void a(blm blmVar, Parcel parcel, int i) {
        int iC = bnh.c(parcel);
        bnh.j(parcel, 1, blmVar.c);
        bnh.j(parcel, 2, blmVar.d);
        bnh.j(parcel, 3, blmVar.e);
        bnh.s(parcel, 4, blmVar.f);
        bnh.o(parcel, 5, blmVar.g);
        bnh.v(parcel, 6, blmVar.h, i);
        bnh.l(parcel, 7, blmVar.i);
        bnh.r(parcel, 8, blmVar.j, i);
        bnh.v(parcel, 10, blmVar.k, i);
        bnh.v(parcel, 11, blmVar.l, i);
        bnh.f(parcel, 12, blmVar.m);
        bnh.j(parcel, 13, blmVar.n);
        bnh.f(parcel, 14, blmVar.o);
        bnh.s(parcel, 15, blmVar.p);
        bnh.e(parcel, iC);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        long jH = 0;
        int iE = 0;
        int iE2 = 0;
        int iE3 = 0;
        boolean zR = false;
        int iE4 = 0;
        int iE5 = 0;
        int iE6 = 0;
        int i = 0;
        int iE7 = 0;
        String strM = null;
        byte[] bArrS = null;
        byk[] bykVarArr = null;
        Bundle bundleI = null;
        ArrayList arrayListO = null;
        Account account = null;
        Bundle bundleI2 = null;
        String strM2 = null;
        switch (this.a) {
            case 0:
                int iG = aso.g(parcel);
                PendingIntent pendingIntent = null;
                bho bhoVar = null;
                while (parcel.dataPosition() < iG) {
                    int i2 = parcel.readInt();
                    int iD = aso.d(i2);
                    if (iD == 1) {
                        iE = aso.e(parcel, i2);
                    } else if (iD == 2) {
                        strM = aso.m(parcel, i2);
                    } else if (iD == 3) {
                        pendingIntent = (PendingIntent) aso.k(parcel, i2, PendingIntent.CREATOR);
                    } else if (iD != 4) {
                        aso.q(parcel, i2);
                    } else {
                        bhoVar = (bho) aso.k(parcel, i2, bho.CREATOR);
                    }
                }
                aso.p(parcel, iG);
                return new Status(iE, strM, pendingIntent, bhoVar);
            case 1:
                int iG2 = aso.g(parcel);
                while (parcel.dataPosition() < iG2) {
                    int i3 = parcel.readInt();
                    int iD2 = aso.d(i3);
                    if (iD2 == 1) {
                        iE7 = aso.e(parcel, i3);
                    } else if (iD2 != 2) {
                        aso.q(parcel, i3);
                    } else {
                        strM2 = aso.m(parcel, i3);
                    }
                }
                aso.p(parcel, iG2);
                return new Scope(iE7, strM2);
            case 2:
                int iG3 = aso.g(parcel);
                int iE8 = 0;
                int iE9 = 0;
                String[] strArrV = null;
                CursorWindow[] cursorWindowArr = null;
                Bundle bundleI3 = null;
                while (parcel.dataPosition() < iG3) {
                    int i4 = parcel.readInt();
                    int iD3 = aso.d(i4);
                    if (iD3 == 1) {
                        strArrV = aso.v(parcel, i4);
                    } else if (iD3 == 2) {
                        cursorWindowArr = (CursorWindow[]) aso.u(parcel, i4, CursorWindow.CREATOR);
                    } else if (iD3 == 3) {
                        iE9 = aso.e(parcel, i4);
                    } else if (iD3 == 4) {
                        bundleI3 = aso.i(parcel, i4);
                    } else if (iD3 != 1000) {
                        aso.q(parcel, i4);
                    } else {
                        iE8 = aso.e(parcel, i4);
                    }
                }
                aso.p(parcel, iG3);
                DataHolder dataHolder = new DataHolder(iE8, strArrV, cursorWindowArr, iE9, bundleI3);
                dataHolder.c = new Bundle();
                int i5 = 0;
                while (true) {
                    String[] strArr = dataHolder.b;
                    if (i5 < strArr.length) {
                        dataHolder.c.putInt(strArr[i5], i5);
                        i5++;
                    } else {
                        dataHolder.g = new int[dataHolder.d.length];
                        int numRows = 0;
                        while (true) {
                            CursorWindow[] cursorWindowArr2 = dataHolder.d;
                            if (i >= cursorWindowArr2.length) {
                                return dataHolder;
                            }
                            dataHolder.g[i] = numRows;
                            numRows += dataHolder.d[i].getNumRows() - (numRows - cursorWindowArr2[i].getStartPosition());
                            i++;
                        }
                    }
                }
            case 3:
                int iG4 = aso.g(parcel);
                bhq[] bhqVarArr = null;
                blk blkVar = null;
                while (parcel.dataPosition() < iG4) {
                    int i6 = parcel.readInt();
                    int iD4 = aso.d(i6);
                    if (iD4 == 1) {
                        bundleI2 = aso.i(parcel, i6);
                    } else if (iD4 == 2) {
                        bhqVarArr = (bhq[]) aso.u(parcel, i6, bhq.CREATOR);
                    } else if (iD4 == 3) {
                        iE6 = aso.e(parcel, i6);
                    } else if (iD4 != 4) {
                        aso.q(parcel, i6);
                    } else {
                        blkVar = (blk) aso.k(parcel, i6, blk.CREATOR);
                    }
                }
                aso.p(parcel, iG4);
                return new blj(bundleI2, bhqVarArr, iE6, blkVar);
            case 4:
                int iG5 = aso.g(parcel);
                boolean zR2 = false;
                boolean zR3 = false;
                int iE10 = 0;
                bmm bmmVar = null;
                int[] iArrT = null;
                int[] iArrT2 = null;
                while (parcel.dataPosition() < iG5) {
                    int i7 = parcel.readInt();
                    switch (aso.d(i7)) {
                        case 1:
                            bmmVar = (bmm) aso.k(parcel, i7, bmm.CREATOR);
                            break;
                        case 2:
                            zR2 = aso.r(parcel, i7);
                            break;
                        case 3:
                            zR3 = aso.r(parcel, i7);
                            break;
                        case 4:
                            iArrT = aso.t(parcel, i7);
                            break;
                        case 5:
                            iE10 = aso.e(parcel, i7);
                            break;
                        case 6:
                            iArrT2 = aso.t(parcel, i7);
                            break;
                        default:
                            aso.q(parcel, i7);
                            break;
                    }
                }
                aso.p(parcel, iG5);
                return new blk(bmmVar, zR2, zR3, iArrT, iE10, iArrT2);
            case 5:
                int iG6 = aso.g(parcel);
                Scope[] scopeArr = blm.a;
                Bundle bundle = new Bundle();
                bhq[] bhqVarArr2 = blm.b;
                bhq[] bhqVarArr3 = bhqVarArr2;
                int iE11 = 0;
                int iE12 = 0;
                int iE13 = 0;
                boolean zR4 = false;
                int iE14 = 0;
                boolean zR5 = false;
                String strM3 = null;
                IBinder iBinderJ = null;
                Account account2 = null;
                String strM4 = null;
                while (parcel.dataPosition() < iG6) {
                    int i8 = parcel.readInt();
                    switch (aso.d(i8)) {
                        case 1:
                            iE11 = aso.e(parcel, i8);
                            break;
                        case 2:
                            iE12 = aso.e(parcel, i8);
                            break;
                        case 3:
                            iE13 = aso.e(parcel, i8);
                            break;
                        case 4:
                            strM3 = aso.m(parcel, i8);
                            break;
                        case 5:
                            iBinderJ = aso.j(parcel, i8);
                            break;
                        case 6:
                            scopeArr = (Scope[]) aso.u(parcel, i8, Scope.CREATOR);
                            break;
                        case 7:
                            bundle = aso.i(parcel, i8);
                            break;
                        case 8:
                            account2 = (Account) aso.k(parcel, i8, Account.CREATOR);
                            break;
                        case 9:
                        default:
                            aso.q(parcel, i8);
                            break;
                        case 10:
                            bhqVarArr2 = (bhq[]) aso.u(parcel, i8, bhq.CREATOR);
                            break;
                        case 11:
                            bhqVarArr3 = (bhq[]) aso.u(parcel, i8, bhq.CREATOR);
                            break;
                        case 12:
                            zR4 = aso.r(parcel, i8);
                            break;
                        case 13:
                            iE14 = aso.e(parcel, i8);
                            break;
                        case 14:
                            zR5 = aso.r(parcel, i8);
                            break;
                        case 15:
                            strM4 = aso.m(parcel, i8);
                            break;
                    }
                }
                aso.p(parcel, iG6);
                return new blm(iE11, iE12, iE13, strM3, iBinderJ, scopeArr, bundle, account2, bhqVarArr2, bhqVarArr3, zR4, iE14, zR5, strM4);
            case 6:
                int iG7 = aso.g(parcel);
                int iE15 = -1;
                long jH2 = 0;
                long jH3 = 0;
                int iE16 = 0;
                int iE17 = 0;
                int iE18 = 0;
                int iE19 = 0;
                String strM5 = null;
                String strM6 = null;
                while (parcel.dataPosition() < iG7) {
                    int i9 = parcel.readInt();
                    switch (aso.d(i9)) {
                        case 1:
                            iE16 = aso.e(parcel, i9);
                            break;
                        case 2:
                            iE17 = aso.e(parcel, i9);
                            break;
                        case 3:
                            iE18 = aso.e(parcel, i9);
                            break;
                        case 4:
                            jH2 = aso.h(parcel, i9);
                            break;
                        case 5:
                            jH3 = aso.h(parcel, i9);
                            break;
                        case 6:
                            strM5 = aso.m(parcel, i9);
                            break;
                        case 7:
                            strM6 = aso.m(parcel, i9);
                            break;
                        case 8:
                            iE19 = aso.e(parcel, i9);
                            break;
                        case 9:
                            iE15 = aso.e(parcel, i9);
                            break;
                        default:
                            aso.q(parcel, i9);
                            break;
                    }
                }
                aso.p(parcel, iG7);
                return new bme(iE16, iE17, iE18, jH2, jH3, strM5, strM6, iE19, iE15);
            case 7:
                int iG8 = aso.g(parcel);
                int iE20 = 0;
                GoogleSignInAccount googleSignInAccount = null;
                while (parcel.dataPosition() < iG8) {
                    int i10 = parcel.readInt();
                    int iD5 = aso.d(i10);
                    if (iD5 == 1) {
                        iE5 = aso.e(parcel, i10);
                    } else if (iD5 == 2) {
                        account = (Account) aso.k(parcel, i10, Account.CREATOR);
                    } else if (iD5 == 3) {
                        iE20 = aso.e(parcel, i10);
                    } else if (iD5 != 4) {
                        aso.q(parcel, i10);
                    } else {
                        googleSignInAccount = (GoogleSignInAccount) aso.k(parcel, i10, GoogleSignInAccount.CREATOR);
                    }
                }
                aso.p(parcel, iG8);
                return new bmj(iE5, account, iE20, googleSignInAccount);
            case 8:
                int iG9 = aso.g(parcel);
                int iE21 = 0;
                boolean zR6 = false;
                boolean zR7 = false;
                IBinder iBinderJ2 = null;
                bho bhoVar2 = null;
                while (parcel.dataPosition() < iG9) {
                    int i11 = parcel.readInt();
                    int iD6 = aso.d(i11);
                    if (iD6 == 1) {
                        iE21 = aso.e(parcel, i11);
                    } else if (iD6 == 2) {
                        iBinderJ2 = aso.j(parcel, i11);
                    } else if (iD6 == 3) {
                        bhoVar2 = (bho) aso.k(parcel, i11, bho.CREATOR);
                    } else if (iD6 == 4) {
                        zR6 = aso.r(parcel, i11);
                    } else if (iD6 != 5) {
                        aso.q(parcel, i11);
                    } else {
                        zR7 = aso.r(parcel, i11);
                    }
                }
                aso.p(parcel, iG9);
                return new bmk(iE21, iBinderJ2, bhoVar2, zR6, zR7);
            case 9:
                int iG10 = aso.g(parcel);
                int iE22 = 0;
                boolean zR8 = false;
                boolean zR9 = false;
                int iE23 = 0;
                int iE24 = 0;
                while (parcel.dataPosition() < iG10) {
                    int i12 = parcel.readInt();
                    int iD7 = aso.d(i12);
                    if (iD7 == 1) {
                        iE22 = aso.e(parcel, i12);
                    } else if (iD7 == 2) {
                        zR8 = aso.r(parcel, i12);
                    } else if (iD7 == 3) {
                        zR9 = aso.r(parcel, i12);
                    } else if (iD7 == 4) {
                        iE23 = aso.e(parcel, i12);
                    } else if (iD7 != 5) {
                        aso.q(parcel, i12);
                    } else {
                        iE24 = aso.e(parcel, i12);
                    }
                }
                aso.p(parcel, iG10);
                return new bmm(iE22, zR8, zR9, iE23, iE24);
            case 10:
                int iG11 = aso.g(parcel);
                while (parcel.dataPosition() < iG11) {
                    int i13 = parcel.readInt();
                    int iD8 = aso.d(i13);
                    if (iD8 == 1) {
                        iE4 = aso.e(parcel, i13);
                    } else if (iD8 != 2) {
                        aso.q(parcel, i13);
                    } else {
                        arrayListO = aso.o(parcel, i13, bme.CREATOR);
                    }
                }
                aso.p(parcel, iG11);
                return new bmo(iE4, arrayListO);
            case 11:
                int iG12 = aso.g(parcel);
                while (parcel.dataPosition() < iG12) {
                    int i14 = parcel.readInt();
                    if (aso.d(i14) != 2) {
                        aso.q(parcel, i14);
                    } else {
                        bundleI = aso.i(parcel, i14);
                    }
                }
                aso.p(parcel, iG12);
                return new bnj(bundleI);
            case 12:
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) parcel.readParcelable(ParcelFileDescriptor.class.getClassLoader());
                Parcelable parcelable = parcel.readParcelable(getClass().getClassLoader());
                clq.v((parcelFileDescriptor == null) == (parcelable == null));
                return new bnq(parcelFileDescriptor, parcelable);
            case 13:
                int iG13 = aso.g(parcel);
                int iE25 = 0;
                String strM7 = null;
                String strM8 = null;
                bqi bqiVar = null;
                byte[] bArrS2 = null;
                while (parcel.dataPosition() < iG13) {
                    int i15 = parcel.readInt();
                    int iD9 = aso.d(i15);
                    if (iD9 == 1) {
                        strM7 = aso.m(parcel, i15);
                    } else if (iD9 == 2) {
                        strM8 = aso.m(parcel, i15);
                    } else if (iD9 == 3) {
                        iE25 = aso.e(parcel, i15);
                    } else if (iD9 == 4) {
                        bqiVar = (bqi) aso.k(parcel, i15, bqi.CREATOR);
                    } else if (iD9 != 5) {
                        aso.q(parcel, i15);
                    } else {
                        bArrS2 = aso.s(parcel, i15);
                    }
                }
                aso.p(parcel, iG13);
                return new bpy(strM7, strM8, iE25, bqiVar, bArrS2);
            case 14:
                int iG14 = aso.g(parcel);
                int iE26 = 0;
                String strM9 = null;
                byte[] bArrS3 = null;
                byte[] bArrS4 = null;
                byte[] bArrS5 = null;
                while (parcel.dataPosition() < iG14) {
                    int i16 = parcel.readInt();
                    int iD10 = aso.d(i16);
                    if (iD10 == 1) {
                        strM9 = aso.m(parcel, i16);
                    } else if (iD10 == 2) {
                        bArrS3 = aso.s(parcel, i16);
                    } else if (iD10 == 3) {
                        iE26 = aso.e(parcel, i16);
                    } else if (iD10 == 4) {
                        bArrS4 = aso.s(parcel, i16);
                    } else if (iD10 != 5) {
                        aso.q(parcel, i16);
                    } else {
                        bArrS5 = aso.s(parcel, i16);
                    }
                }
                aso.p(parcel, iG14);
                return new bqb(strM9, bArrS3, iE26, bArrS4, bArrS5);
            case 15:
                int iG15 = aso.g(parcel);
                long jH4 = 0;
                int iE27 = 0;
                boolean zR10 = false;
                int iE28 = 0;
                String strM10 = null;
                String strM11 = null;
                Uri uri = null;
                bqi bqiVar2 = null;
                Uri uri2 = null;
                bqp bqpVar = null;
                byte[] bArrS6 = null;
                Uri uri3 = null;
                Bundle bundleI4 = null;
                byte[] bArrS7 = null;
                while (parcel.dataPosition() < iG15) {
                    int i17 = parcel.readInt();
                    switch (aso.d(i17)) {
                        case 1:
                            strM10 = aso.m(parcel, i17);
                            break;
                        case 2:
                            iE27 = aso.e(parcel, i17);
                            break;
                        case 3:
                            zR10 = aso.r(parcel, i17);
                            break;
                        case 4:
                            strM11 = aso.m(parcel, i17);
                            break;
                        case 5:
                            iE28 = aso.e(parcel, i17);
                            break;
                        case 6:
                            uri = (Uri) aso.k(parcel, i17, Uri.CREATOR);
                            break;
                        case 7:
                        case 8:
                        default:
                            aso.q(parcel, i17);
                            break;
                        case 9:
                            bqiVar2 = (bqi) aso.k(parcel, i17, bqi.CREATOR);
                            break;
                        case 10:
                            jH4 = aso.h(parcel, i17);
                            break;
                        case 11:
                            uri2 = (Uri) aso.k(parcel, i17, Uri.CREATOR);
                            break;
                        case 12:
                            bqpVar = (bqp) aso.k(parcel, i17, bqp.CREATOR);
                            break;
                        case 13:
                            bArrS6 = aso.s(parcel, i17);
                            break;
                        case 14:
                            uri3 = (Uri) aso.k(parcel, i17, Uri.CREATOR);
                            break;
                        case 15:
                            bundleI4 = aso.i(parcel, i17);
                            break;
                        case 16:
                            bArrS7 = aso.s(parcel, i17);
                            break;
                    }
                }
                aso.p(parcel, iG15);
                return new bqg(strM10, iE27, zR10, strM11, iE28, uri, bqiVar2, jH4, uri2, bqpVar, bArrS6, uri3, bundleI4, bArrS7);
            case 16:
                int iG16 = aso.g(parcel);
                boolean zR11 = false;
                boolean zR12 = false;
                while (parcel.dataPosition() < iG16) {
                    int i18 = parcel.readInt();
                    int iD11 = aso.d(i18);
                    if (iD11 == 1) {
                        zR = aso.r(parcel, i18);
                    } else if (iD11 == 2) {
                        zR11 = aso.r(parcel, i18);
                    } else if (iD11 != 3) {
                        aso.q(parcel, i18);
                    } else {
                        zR12 = aso.r(parcel, i18);
                    }
                }
                aso.p(parcel, iG16);
                return new bqi(zR, zR11, zR12);
            case 17:
                int iG17 = aso.g(parcel);
                while (parcel.dataPosition() < iG17) {
                    int i19 = parcel.readInt();
                    int iD12 = aso.d(i19);
                    if (iD12 == 1) {
                        iE3 = aso.e(parcel, i19);
                    } else if (iD12 != 2) {
                        aso.q(parcel, i19);
                    } else {
                        jH = aso.h(parcel, i19);
                    }
                }
                aso.p(parcel, iG17);
                return new bqp(iE3, jH);
            case 18:
                int iG18 = aso.g(parcel);
                String[] strArrV2 = null;
                while (parcel.dataPosition() < iG18) {
                    int i20 = parcel.readInt();
                    int iD13 = aso.d(i20);
                    if (iD13 == 2) {
                        iE2 = aso.e(parcel, i20);
                    } else if (iD13 == 3) {
                        bykVarArr = (byk[]) aso.u(parcel, i20, byk.CREATOR);
                    } else if (iD13 != 4) {
                        aso.q(parcel, i20);
                    } else {
                        strArrV2 = aso.v(parcel, i20);
                    }
                }
                aso.p(parcel, iG18);
                return new byd(iE2, bykVarArr, strArrV2);
            case AIFeature.Type.IMAGE_DESCRIPTION /* 19 */:
                int iG19 = aso.g(parcel);
                long jH5 = 0;
                boolean zR13 = false;
                String strM12 = null;
                String strM13 = null;
                byd[] bydVarArr = null;
                byte[] bArrS8 = null;
                while (parcel.dataPosition() < iG19) {
                    int i21 = parcel.readInt();
                    switch (aso.d(i21)) {
                        case 2:
                            strM12 = aso.m(parcel, i21);
                            break;
                        case 3:
                            strM13 = aso.m(parcel, i21);
                            break;
                        case 4:
                            bydVarArr = (byd[]) aso.u(parcel, i21, byd.CREATOR);
                            break;
                        case 5:
                            zR13 = aso.r(parcel, i21);
                            break;
                        case 6:
                            bArrS8 = aso.s(parcel, i21);
                            break;
                        case 7:
                            jH5 = aso.h(parcel, i21);
                            break;
                        default:
                            aso.q(parcel, i21);
                            break;
                    }
                }
                aso.p(parcel, iG19);
                return new bye(strM12, strM13, bydVarArr, zR13, bArrS8, jH5);
            default:
                int iG20 = aso.g(parcel);
                while (parcel.dataPosition() < iG20) {
                    int i22 = parcel.readInt();
                    if (aso.d(i22) != 2) {
                        aso.q(parcel, i22);
                    } else {
                        bArrS = aso.s(parcel, i22);
                    }
                }
                aso.p(parcel, iG20);
                return new byf(bArrS);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new Status[i];
            case 1:
                return new Scope[i];
            case 2:
                return new DataHolder[i];
            case 3:
                return new blj[i];
            case 4:
                return new blk[i];
            case 5:
                return new blm[i];
            case 6:
                return new bme[i];
            case 7:
                return new bmj[i];
            case 8:
                return new bmk[i];
            case 9:
                return new bmm[i];
            case 10:
                return new bmo[i];
            case 11:
                return new bnj[i];
            case 12:
                return new bnq[i];
            case 13:
                return new bpy[i];
            case 14:
                return new bqb[i];
            case 15:
                return new bqg[i];
            case 16:
                return new bqi[i];
            case 17:
                return new bqp[i];
            case 18:
                return new byd[i];
            case AIFeature.Type.IMAGE_DESCRIPTION /* 19 */:
                return new bye[i];
            default:
                return new byf[i];
        }
    }
}
