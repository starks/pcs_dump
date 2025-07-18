package defpackage;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class bwc extends akh implements bwd {
    public bwc() {
        super("com.google.android.gms.learning.internal.training.IInAppTrainingService");
    }

    public static bwd asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.learning.internal.training.IInAppTrainingService");
        return iInterfaceQueryLocalInterface instanceof bwd ? (bwd) iInterfaceQueryLocalInterface : new bwb(iBinder);
    }

    @Override // defpackage.akh
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        bpf bpdVar = null;
        bve bvdVar = null;
        bvo bvmVar = null;
        switch (i) {
            case 1:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    bpdVar = iInterfaceQueryLocalInterface instanceof bpf ? (bpf) iInterfaceQueryLocalInterface : new bpd(strongBinder);
                }
                enforceNoDataAvail(parcel);
                onCreate(bpdVar);
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
                int i4 = parcel.readInt();
                int i5 = parcel.readInt();
                enforceNoDataAvail(parcel);
                int iOnStartCommand = onStartCommand(intent2, i4, i5);
                parcel2.writeNoException();
                parcel2.writeInt(iOnStartCommand);
                return true;
            case 6:
                Intent intent3 = (Intent) aki.a(parcel, Intent.CREATOR);
                enforceNoDataAvail(parcel);
                boolean zOnUnbind = onUnbind(intent3);
                parcel2.writeNoException();
                parcel2.writeInt(zOnUnbind ? 1 : 0);
                return true;
            case 7:
                Intent intent4 = (Intent) aki.a(parcel, Intent.CREATOR);
                enforceNoDataAvail(parcel);
                onRebind(intent4);
                parcel2.writeNoException();
                return true;
            case 8:
                setPRFSdkImpl();
                parcel2.writeNoException();
                return true;
            case 9:
                String string = parcel.readString();
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.learning.internal.training.IHttpUrlConnectionFactory");
                    bvmVar = iInterfaceQueryLocalInterface2 instanceof bvo ? (bvo) iInterfaceQueryLocalInterface2 : new bvm(strongBinder2);
                }
                enforceNoDataAvail(parcel);
                addHttpUrlConnectionFactory(string, bvmVar);
                parcel2.writeNoException();
                return true;
            case 10:
                String string2 = parcel.readString();
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.learning.internal.http.IHttpRequestHandleFactory");
                    bvdVar = iInterfaceQueryLocalInterface3 instanceof bve ? (bve) iInterfaceQueryLocalInterface3 : new bvd(strongBinder3);
                }
                enforceNoDataAvail(parcel);
                addHttpRequestHandleFactory(string2, bvdVar);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
