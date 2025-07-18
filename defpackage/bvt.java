package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bvt extends akh implements bvu {
    final /* synthetic */ bqn a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public bvt(bqn bqnVar) {
        this();
        this.a = bqnVar;
    }

    @Override // defpackage.bvu
    public final int a() {
        return 1;
    }

    @Override // defpackage.bvu
    public final void b(bqg bqgVar, boolean z, List list, bkj bkjVar) {
        this.a.c(bqgVar, z, list, new brb(bkjVar));
    }

    @Override // defpackage.akh
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        bkj bkhVar;
        if (i == 2) {
            parcel2.writeNoException();
            parcel2.writeInt(1);
        } else {
            if (i != 3) {
                return false;
            }
            bqg bqgVar = (bqg) aki.a(parcel, bqg.CREATOR);
            boolean zE = aki.e(parcel);
            ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(bqb.CREATOR);
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                bkhVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                bkhVar = iInterfaceQueryLocalInterface instanceof bkj ? (bkj) iInterfaceQueryLocalInterface : new bkh(strongBinder);
            }
            enforceNoDataAvail(parcel);
            b(bqgVar, zE, arrayListCreateTypedArrayList, bkhVar);
        }
        return true;
    }

    public bvt() {
        super("com.google.android.gms.learning.internal.training.IInAppResultHandler");
    }
}
