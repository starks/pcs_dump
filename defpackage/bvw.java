package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class bvw extends akh implements bvx {
    public bvw() {
        super("com.google.android.gms.learning.internal.training.IInAppTrainer");
    }

    public static bvx asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.learning.internal.training.IInAppTrainer");
        return iInterfaceQueryLocalInterface instanceof bvx ? (bvx) iInterfaceQueryLocalInterface : new bvv(iBinder);
    }

    @Override // defpackage.akh
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        bpf bpdVar;
        bpf bpdVar2;
        bpf bpdVar3;
        bpf bpdVar4;
        bpf bpdVar5;
        bpf bpdVar6;
        bpf bpdVar7;
        bpf bpdVar8;
        bpf bpdVar9;
        bpf bpdVar10;
        bpf bpdVar11;
        bpf bpdVar12;
        bpf bpdVar13;
        bpf bpdVar14;
        bpf bpdVar15;
        bpf bpdVar16;
        bkj bkhVar = null;
        switch (i) {
            case 3:
                int i3 = parcel.readInt();
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    bkhVar = iInterfaceQueryLocalInterface instanceof bkj ? (bkj) iInterfaceQueryLocalInterface : new bkh(strongBinder);
                }
                enforceNoDataAvail(parcel);
                start(i3, bkhVar);
                parcel2.writeNoException();
                return true;
            case 4:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    bkhVar = iInterfaceQueryLocalInterface2 instanceof bkj ? (bkj) iInterfaceQueryLocalInterface2 : new bkh(strongBinder2);
                }
                enforceNoDataAvail(parcel);
                stop(bkhVar);
                parcel2.writeNoException();
                return true;
            case 5:
            default:
                return false;
            case 6:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 == null) {
                    bpdVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    bpdVar = iInterfaceQueryLocalInterface3 instanceof bpf ? (bpf) iInterfaceQueryLocalInterface3 : new bpd(strongBinder3);
                }
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 == null) {
                    bpdVar2 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    bpdVar2 = iInterfaceQueryLocalInterface4 instanceof bpf ? (bpf) iInterfaceQueryLocalInterface4 : new bpd(strongBinder4);
                }
                bqg bqgVar = (bqg) aki.a(parcel, bqg.CREATOR);
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    bkhVar = iInterfaceQueryLocalInterface5 instanceof bkj ? (bkj) iInterfaceQueryLocalInterface5 : new bkh(strongBinder5);
                }
                enforceNoDataAvail(parcel);
                boolean zInitV26 = initV26(bpdVar, bpdVar2, bqgVar, bkhVar);
                parcel2.writeNoException();
                parcel2.writeInt(zInitV26 ? 1 : 0);
                return true;
            case 7:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 == null) {
                    bpdVar3 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    bpdVar3 = iInterfaceQueryLocalInterface6 instanceof bpf ? (bpf) iInterfaceQueryLocalInterface6 : new bpd(strongBinder6);
                }
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 == null) {
                    bpdVar4 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    bpdVar4 = iInterfaceQueryLocalInterface7 instanceof bpf ? (bpf) iInterfaceQueryLocalInterface7 : new bpd(strongBinder7);
                }
                bqg bqgVar2 = (bqg) aki.a(parcel, bqg.CREATOR);
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    bkhVar = iInterfaceQueryLocalInterface8 instanceof bkj ? (bkj) iInterfaceQueryLocalInterface8 : new bkh(strongBinder8);
                }
                enforceNoDataAvail(parcel);
                boolean zInitW24 = initW24(bpdVar3, bpdVar4, bqgVar2, bkhVar);
                parcel2.writeNoException();
                parcel2.writeInt(zInitW24 ? 1 : 0);
                return true;
            case 8:
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 == null) {
                    bpdVar5 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    bpdVar5 = iInterfaceQueryLocalInterface9 instanceof bpf ? (bpf) iInterfaceQueryLocalInterface9 : new bpd(strongBinder9);
                }
                IBinder strongBinder10 = parcel.readStrongBinder();
                if (strongBinder10 == null) {
                    bpdVar6 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface10 = strongBinder10.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    bpdVar6 = iInterfaceQueryLocalInterface10 instanceof bpf ? (bpf) iInterfaceQueryLocalInterface10 : new bpd(strongBinder10);
                }
                bqg bqgVar3 = (bqg) aki.a(parcel, bqg.CREATOR);
                IBinder strongBinder11 = parcel.readStrongBinder();
                if (strongBinder11 != null) {
                    IInterface iInterfaceQueryLocalInterface11 = strongBinder11.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    bkhVar = iInterfaceQueryLocalInterface11 instanceof bkj ? (bkj) iInterfaceQueryLocalInterface11 : new bkh(strongBinder11);
                }
                enforceNoDataAvail(parcel);
                boolean zInitY2020W18 = initY2020W18(bpdVar5, bpdVar6, bqgVar3, bkhVar);
                parcel2.writeNoException();
                parcel2.writeInt(zInitY2020W18 ? 1 : 0);
                return true;
            case 9:
                IBinder strongBinder12 = parcel.readStrongBinder();
                if (strongBinder12 == null) {
                    bpdVar7 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface12 = strongBinder12.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    bpdVar7 = iInterfaceQueryLocalInterface12 instanceof bpf ? (bpf) iInterfaceQueryLocalInterface12 : new bpd(strongBinder12);
                }
                IBinder strongBinder13 = parcel.readStrongBinder();
                if (strongBinder13 == null) {
                    bpdVar8 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface13 = strongBinder13.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    bpdVar8 = iInterfaceQueryLocalInterface13 instanceof bpf ? (bpf) iInterfaceQueryLocalInterface13 : new bpd(strongBinder13);
                }
                bqg bqgVar4 = (bqg) aki.a(parcel, bqg.CREATOR);
                IBinder strongBinder14 = parcel.readStrongBinder();
                if (strongBinder14 != null) {
                    IInterface iInterfaceQueryLocalInterface14 = strongBinder14.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    bkhVar = iInterfaceQueryLocalInterface14 instanceof bkj ? (bkj) iInterfaceQueryLocalInterface14 : new bkh(strongBinder14);
                }
                enforceNoDataAvail(parcel);
                boolean zInitY2020W30 = initY2020W30(bpdVar7, bpdVar8, bqgVar4, bkhVar);
                parcel2.writeNoException();
                parcel2.writeInt(zInitY2020W30 ? 1 : 0);
                return true;
            case 10:
                IBinder strongBinder15 = parcel.readStrongBinder();
                if (strongBinder15 == null) {
                    bpdVar9 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface15 = strongBinder15.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    bpdVar9 = iInterfaceQueryLocalInterface15 instanceof bpf ? (bpf) iInterfaceQueryLocalInterface15 : new bpd(strongBinder15);
                }
                IBinder strongBinder16 = parcel.readStrongBinder();
                if (strongBinder16 == null) {
                    bpdVar10 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface16 = strongBinder16.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    bpdVar10 = iInterfaceQueryLocalInterface16 instanceof bpf ? (bpf) iInterfaceQueryLocalInterface16 : new bpd(strongBinder16);
                }
                bqg bqgVar5 = (bqg) aki.a(parcel, bqg.CREATOR);
                IBinder strongBinder17 = parcel.readStrongBinder();
                if (strongBinder17 != null) {
                    IInterface iInterfaceQueryLocalInterface17 = strongBinder17.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    bkhVar = iInterfaceQueryLocalInterface17 instanceof bkj ? (bkj) iInterfaceQueryLocalInterface17 : new bkh(strongBinder17);
                }
                enforceNoDataAvail(parcel);
                boolean zInitY2020W36 = initY2020W36(bpdVar9, bpdVar10, bqgVar5, bkhVar);
                parcel2.writeNoException();
                parcel2.writeInt(zInitY2020W36 ? 1 : 0);
                return true;
            case 11:
                IBinder strongBinder18 = parcel.readStrongBinder();
                if (strongBinder18 == null) {
                    bpdVar11 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface18 = strongBinder18.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    bpdVar11 = iInterfaceQueryLocalInterface18 instanceof bpf ? (bpf) iInterfaceQueryLocalInterface18 : new bpd(strongBinder18);
                }
                IBinder strongBinder19 = parcel.readStrongBinder();
                if (strongBinder19 == null) {
                    bpdVar12 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface19 = strongBinder19.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    bpdVar12 = iInterfaceQueryLocalInterface19 instanceof bpf ? (bpf) iInterfaceQueryLocalInterface19 : new bpd(strongBinder19);
                }
                bqg bqgVar6 = (bqg) aki.a(parcel, bqg.CREATOR);
                IBinder strongBinder20 = parcel.readStrongBinder();
                if (strongBinder20 != null) {
                    IInterface iInterfaceQueryLocalInterface20 = strongBinder20.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    bkhVar = iInterfaceQueryLocalInterface20 instanceof bkj ? (bkj) iInterfaceQueryLocalInterface20 : new bkh(strongBinder20);
                }
                enforceNoDataAvail(parcel);
                boolean zInitY2021W30 = initY2021W30(bpdVar11, bpdVar12, bqgVar6, bkhVar);
                parcel2.writeNoException();
                parcel2.writeInt(zInitY2021W30 ? 1 : 0);
                return true;
            case 12:
                IBinder strongBinder21 = parcel.readStrongBinder();
                if (strongBinder21 == null) {
                    bpdVar13 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface21 = strongBinder21.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    bpdVar13 = iInterfaceQueryLocalInterface21 instanceof bpf ? (bpf) iInterfaceQueryLocalInterface21 : new bpd(strongBinder21);
                }
                IBinder strongBinder22 = parcel.readStrongBinder();
                if (strongBinder22 == null) {
                    bpdVar14 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface22 = strongBinder22.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    bpdVar14 = iInterfaceQueryLocalInterface22 instanceof bpf ? (bpf) iInterfaceQueryLocalInterface22 : new bpd(strongBinder22);
                }
                bqg bqgVar7 = (bqg) aki.a(parcel, bqg.CREATOR);
                IBinder strongBinder23 = parcel.readStrongBinder();
                if (strongBinder23 != null) {
                    IInterface iInterfaceQueryLocalInterface23 = strongBinder23.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    bkhVar = iInterfaceQueryLocalInterface23 instanceof bkj ? (bkj) iInterfaceQueryLocalInterface23 : new bkh(strongBinder23);
                }
                enforceNoDataAvail(parcel);
                boolean zInitY2022W24 = initY2022W24(bpdVar13, bpdVar14, bqgVar7, bkhVar);
                parcel2.writeNoException();
                parcel2.writeInt(zInitY2022W24 ? 1 : 0);
                return true;
            case 13:
                IBinder strongBinder24 = parcel.readStrongBinder();
                if (strongBinder24 == null) {
                    bpdVar15 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface24 = strongBinder24.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    bpdVar15 = iInterfaceQueryLocalInterface24 instanceof bpf ? (bpf) iInterfaceQueryLocalInterface24 : new bpd(strongBinder24);
                }
                IBinder strongBinder25 = parcel.readStrongBinder();
                if (strongBinder25 == null) {
                    bpdVar16 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface25 = strongBinder25.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    bpdVar16 = iInterfaceQueryLocalInterface25 instanceof bpf ? (bpf) iInterfaceQueryLocalInterface25 : new bpd(strongBinder25);
                }
                bqg bqgVar8 = (bqg) aki.a(parcel, bqg.CREATOR);
                IBinder strongBinder26 = parcel.readStrongBinder();
                if (strongBinder26 != null) {
                    IInterface iInterfaceQueryLocalInterface26 = strongBinder26.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    bkhVar = iInterfaceQueryLocalInterface26 instanceof bkj ? (bkj) iInterfaceQueryLocalInterface26 : new bkh(strongBinder26);
                }
                enforceNoDataAvail(parcel);
                boolean zInitY2023W12 = initY2023W12(bpdVar15, bpdVar16, bqgVar8, bkhVar);
                parcel2.writeNoException();
                parcel2.writeInt(zInitY2023W12 ? 1 : 0);
                return true;
        }
    }
}
