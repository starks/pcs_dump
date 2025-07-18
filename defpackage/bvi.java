package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class bvi extends akh implements bvj {
    public bvi() {
        super("com.google.android.gms.learning.internal.training.IBrellaInvocation");
    }

    public static bvj asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.learning.internal.training.IBrellaInvocation");
        return iInterfaceQueryLocalInterface instanceof bvj ? (bvj) iInterfaceQueryLocalInterface : new bvh(iBinder);
    }

    @Override // defpackage.akh
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        bpf bpdVar;
        bpf bpdVar2;
        bkj bkhVar;
        bvl bvkVar = null;
        bvo bvmVar = null;
        bkj bkhVar2 = null;
        if (i == 2) {
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
            bpy bpyVar = (bpy) aki.a(parcel, bpy.CREATOR);
            IBinder strongBinder3 = parcel.readStrongBinder();
            if (strongBinder3 == null) {
                bkhVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                bkhVar = iInterfaceQueryLocalInterface3 instanceof bkj ? (bkj) iInterfaceQueryLocalInterface3 : new bkh(strongBinder3);
            }
            IBinder strongBinder4 = parcel.readStrongBinder();
            if (strongBinder4 != null) {
                IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.learning.internal.training.IBrellaInvocationCallback");
                bvkVar = iInterfaceQueryLocalInterface4 instanceof bvl ? (bvl) iInterfaceQueryLocalInterface4 : new bvk(strongBinder4);
            }
            bvl bvlVar = bvkVar;
            enforceNoDataAvail(parcel);
            runInBackgroundProcess(bpdVar, bpdVar2, bpyVar, bkhVar, bvlVar);
        } else if (i == 3) {
            IBinder strongBinder5 = parcel.readStrongBinder();
            if (strongBinder5 != null) {
                IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                bkhVar2 = iInterfaceQueryLocalInterface5 instanceof bkj ? (bkj) iInterfaceQueryLocalInterface5 : new bkh(strongBinder5);
            }
            enforceNoDataAvail(parcel);
            cancel(bkhVar2);
        } else {
            if (i != 4) {
                return false;
            }
            String string = parcel.readString();
            IBinder strongBinder6 = parcel.readStrongBinder();
            if (strongBinder6 != null) {
                IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.learning.internal.training.IHttpUrlConnectionFactory");
                bvmVar = iInterfaceQueryLocalInterface6 instanceof bvo ? (bvo) iInterfaceQueryLocalInterface6 : new bvm(strongBinder6);
            }
            enforceNoDataAvail(parcel);
            addHttpUrlConnectionFactory(string, bvmVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
