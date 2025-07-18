package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class buf extends akh implements bug {
    public buf() {
        super("com.google.android.gms.learning.internal.IExampleStoreIteratorV2");
    }

    @Override // defpackage.akh
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        bud bubVar;
        if (i == 2) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                bubVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.learning.internal.IExampleStoreIteratorCallbackV2");
                bubVar = iInterfaceQueryLocalInterface instanceof bud ? (bud) iInterfaceQueryLocalInterface : new bub(strongBinder);
            }
            enforceNoDataAvail(parcel);
            b(bubVar);
        } else if (i == 3) {
            int i3 = parcel.readInt();
            enforceNoDataAvail(parcel);
            c(i3);
        } else {
            if (i != 4) {
                return false;
            }
            a();
        }
        parcel2.writeNoException();
        return true;
    }
}
