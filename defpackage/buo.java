package defpackage;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class buo extends akh implements bup {
    public buo() {
        super("com.google.android.gms.learning.internal.IInAppExampleStoreProxy");
    }

    public static bup asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.learning.internal.IInAppExampleStoreProxy");
        return iInterfaceQueryLocalInterface instanceof bup ? (bup) iInterfaceQueryLocalInterface : new bun(iBinder);
    }

    @Override // defpackage.akh
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        bpf bpdVar;
        switch (i) {
            case 1:
                IBinder strongBinder = parcel.readStrongBinder();
                bum bukVar = null;
                if (strongBinder == null) {
                    bpdVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    bpdVar = iInterfaceQueryLocalInterface instanceof bpf ? (bpf) iInterfaceQueryLocalInterface : new bpd(strongBinder);
                }
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.learning.internal.IExampleStoreV2");
                    bukVar = iInterfaceQueryLocalInterface2 instanceof bum ? (bum) iInterfaceQueryLocalInterface2 : new buk(strongBinder2);
                }
                enforceNoDataAvail(parcel);
                init(bpdVar, bukVar);
                parcel2.writeNoException();
                return true;
            case 2:
                onDestroy();
                parcel2.writeNoException();
                return true;
            case 3:
                Intent intent = (Intent) aki.a(parcel, Intent.CREATOR);
                enforceNoDataAvail(parcel);
                IBinder iBinderOnBind = onBind(intent);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(iBinderOnBind);
                return true;
            case 4:
                int i3 = parcel.readInt();
                enforceNoDataAvail(parcel);
                onTrimMemory(i3);
                parcel2.writeNoException();
                return true;
            case 5:
                Intent intent2 = (Intent) aki.a(parcel, Intent.CREATOR);
                enforceNoDataAvail(parcel);
                boolean zOnUnbind = onUnbind(intent2);
                parcel2.writeNoException();
                parcel2.writeInt(zOnUnbind ? 1 : 0);
                return true;
            case 6:
                Intent intent3 = (Intent) aki.a(parcel, Intent.CREATOR);
                enforceNoDataAvail(parcel);
                onRebind(intent3);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
