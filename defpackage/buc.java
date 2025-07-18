package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class buc extends akh implements bud {
    public buc() {
        super("com.google.android.gms.learning.internal.IExampleStoreIteratorCallbackV2");
    }

    @Override // defpackage.akh
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        bpf bpdVar;
        if (i == 2) {
            IBinder strongBinder = parcel.readStrongBinder();
            bpf bpdVar2 = null;
            if (strongBinder == null) {
                bpdVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                bpdVar = iInterfaceQueryLocalInterface instanceof bpf ? (bpf) iInterfaceQueryLocalInterface : new bpd(strongBinder);
            }
            IBinder strongBinder2 = parcel.readStrongBinder();
            if (strongBinder2 != null) {
                IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                bpdVar2 = iInterfaceQueryLocalInterface2 instanceof bpf ? (bpf) iInterfaceQueryLocalInterface2 : new bpd(strongBinder2);
            }
            long j = parcel.readLong();
            enforceNoDataAvail(parcel);
            b(bpdVar, bpdVar2, j);
        } else {
            if (i != 3) {
                return false;
            }
            Status status = (Status) aki.a(parcel, Status.CREATOR);
            long j2 = parcel.readLong();
            enforceNoDataAvail(parcel);
            a(status, j2);
        }
        parcel2.writeNoException();
        return true;
    }
}
