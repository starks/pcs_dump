package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class apt extends akh implements apu {
    public apt() {
        super("com.google.android.apps.miphone.astrea.fl.brella.api.IStartQueryCallback");
    }

    @Override // defpackage.akh
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        apo apnVar;
        if (i == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                apnVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.apps.miphone.astrea.fl.brella.api.IExampleStoreIterator");
                apnVar = iInterfaceQueryLocalInterface instanceof apo ? (apo) iInterfaceQueryLocalInterface : new apn(strongBinder);
            }
            enforceNoDataAvail(parcel);
            c(apnVar);
        } else if (i == 2) {
            a();
        } else {
            if (i != 3) {
                return false;
            }
            int i3 = parcel.readInt();
            enforceNoDataAvail(parcel);
            b(i3);
        }
        parcel2.writeNoException();
        return true;
    }
}
