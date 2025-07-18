package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class bvz extends akh implements bwa {
    public bvz() {
        super("com.google.android.gms.learning.internal.training.IInAppTrainerCanceller");
    }

    public static bwa asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.learning.internal.training.IInAppTrainerCanceller");
        return iInterfaceQueryLocalInterface instanceof bwa ? (bwa) iInterfaceQueryLocalInterface : new bvy(iBinder);
    }

    @Override // defpackage.akh
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        bpf bpdVar;
        bpf bpdVar2;
        bkj bkhVar = null;
        if (i == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                bpdVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                bpdVar = iInterfaceQueryLocalInterface instanceof bpf ? (bpf) iInterfaceQueryLocalInterface : new bpd(strongBinder);
            }
            IBinder strongBinder2 = parcel.readStrongBinder();
            if (strongBinder2 == null) {
                bpdVar2 = null;
            } else {
                IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                bpdVar2 = iInterfaceQueryLocalInterface2 instanceof bpf ? (bpf) iInterfaceQueryLocalInterface2 : new bpd(strongBinder2);
            }
            IBinder strongBinder3 = parcel.readStrongBinder();
            if (strongBinder3 != null) {
                IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                bkhVar = iInterfaceQueryLocalInterface3 instanceof bkj ? (bkj) iInterfaceQueryLocalInterface3 : new bkh(strongBinder3);
            }
            enforceNoDataAvail(parcel);
            boolean zInit = init(bpdVar, bpdVar2, bkhVar);
            parcel2.writeNoException();
            int i3 = aki.a;
            parcel2.writeInt(zInit ? 1 : 0);
        } else {
            if (i != 2) {
                return false;
            }
            int i4 = parcel.readInt();
            IBinder strongBinder4 = parcel.readStrongBinder();
            if (strongBinder4 != null) {
                IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                bkhVar = iInterfaceQueryLocalInterface4 instanceof bkj ? (bkj) iInterfaceQueryLocalInterface4 : new bkh(strongBinder4);
            }
            enforceNoDataAvail(parcel);
            cancelJobsByType(i4, bkhVar);
            parcel2.writeNoException();
        }
        return true;
    }
}
