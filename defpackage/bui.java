package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bui extends akh implements buj {
    private final String a;
    private final bsa b;
    private final AtomicBoolean c;
    private final long d;
    private final csm e;
    private final Object f;
    private final List g;
    private final brm h;
    private final fuu i;

    public bui(String str, bsa bsaVar, long j, csm csmVar, Object obj, List list, fuu fuuVar, brm brmVar) {
        this();
        this.c = new AtomicBoolean(false);
        this.a = str;
        this.b = bsaVar;
        this.d = j;
        this.e = csmVar;
        this.f = obj;
        this.g = list;
        this.i = fuuVar;
        this.h = brmVar;
    }

    @Override // defpackage.buj
    public final void a(Status status, long j) {
        if (this.c.getAndSet(true)) {
            Log.w("ExmplStrQryCallback", "Ignoring onStartQueryFailure, result already returned!");
            return;
        }
        csm csmVar = this.e;
        try {
            this.b.a(status, j, csmVar.a() - this.d);
        } catch (RemoteException e) {
            Log.w("ExmplStrQryCallback", "Failed to call onStartQueryFailure on AIDL callback", e);
        }
    }

    @Override // defpackage.buj
    public final void b(bug bugVar, long j) {
        brt brtVar;
        if (this.c.getAndSet(true)) {
            Log.w("ExmplStrQryCallback", "Ignoring onStartQuerySuccess, result already returned!");
            return;
        }
        if (this.h.b()) {
            bugVar = this.h.a(bugVar);
        }
        bug bugVar2 = bugVar;
        synchronized (this.f) {
            brtVar = new brt(this.a, bugVar2, this.e, this.f, this.g, this.i);
        }
        csm csmVar = this.e;
        try {
            try {
                this.b.b(brtVar, j, csmVar.a() - this.d);
            } catch (RemoteException e) {
                e = e;
                brtVar = brtVar;
                Log.w("ExmplStrQryCallback", "Failed to call onStartQuerySuccess on AIDL callback", e);
                brtVar.c();
            }
        } catch (RemoteException e2) {
            e = e2;
        }
    }

    @Override // defpackage.akh
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        bug bueVar;
        if (i == 2) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                bueVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.learning.internal.IExampleStoreIteratorV2");
                bueVar = iInterfaceQueryLocalInterface instanceof bug ? (bug) iInterfaceQueryLocalInterface : new bue(strongBinder);
            }
            long j = parcel.readLong();
            enforceNoDataAvail(parcel);
            b(bueVar, j);
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

    public bui() {
        super("com.google.android.gms.learning.internal.IExampleStoreQueryCallbackV2");
    }
}
