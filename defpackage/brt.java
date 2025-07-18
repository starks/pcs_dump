package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class brt extends akh implements bru {
    public final String a;
    private final bug b;
    private final csm c;
    private final Object d;
    private boolean e;
    private final List f;
    private final fuu g;

    public brt(String str, bug bugVar, csm csmVar, Object obj, List list, fuu fuuVar) {
        this();
        this.e = false;
        this.a = str;
        this.b = bugVar;
        this.c = csmVar;
        this.d = obj;
        this.f = list;
        this.g = fuuVar;
        synchronized (obj) {
            list.add(this);
        }
    }

    @Override // defpackage.bru
    public final void a(bkj bkjVar) {
        d(new bks(bkjVar, 6, null));
    }

    @Override // defpackage.bru
    public final void b(brx brxVar, int i) {
        Object obj = this.d;
        long jA = this.c.a();
        synchronized (obj) {
            if (this.e) {
                try {
                    Log.w("ExmplStrChkngIterator", "next() called after close()");
                    brxVar.b(new Status(8, "next() called after close()"), 0L, this.c.a() - jA);
                } catch (RemoteException e) {
                    Log.w("ExmplStrChkngIterator", "Failed to call onIteratorNextFailure on AIDL callback", e);
                }
                return;
            }
            try {
                this.b.b(new brr(brxVar, i, this, this.c, jA));
            } catch (RemoteException | RuntimeException e2) {
                Log.w("ExmplStrChkngIterator", "Failed to call next() on app's iterator", e2);
                if (e2 instanceof RuntimeException) {
                    this.g.p(ccj.bB, this.a);
                }
                try {
                    brxVar.b(new Status(true != (e2 instanceof RemoteException) ? 10 : 8, csk.a(e2)), 0L, this.c.a() - jA);
                } catch (RemoteException e3) {
                    Log.w("ExmplStrChkngIterator", "Failed to call onIteratorNextFailure on AIDL callback", e3);
                }
                c();
            }
            return;
        }
    }

    public final void c() {
        d(new bkp(2));
    }

    public final void d(Runnable runnable) {
        synchronized (this.d) {
            if (this.e) {
                runnable.run();
                return;
            }
            try {
                try {
                    this.b.a();
                } catch (RemoteException | RuntimeException e) {
                    Log.w("ExmplStrChkngIterator", "Failed to call close() on app's iterator", e);
                    if (e instanceof RuntimeException) {
                        this.g.p(ccj.bH, this.a);
                    }
                }
            } finally {
                this.f.remove(this);
                this.e = true;
                runnable.run();
            }
        }
    }

    @Override // defpackage.akh
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        brx brvVar = null;
        bkj bkhVar = null;
        if (i == 2) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.learning.dynamite.proxy.IExampleStoreChunkingIteratorCallback");
                brvVar = iInterfaceQueryLocalInterface instanceof brx ? (brx) iInterfaceQueryLocalInterface : new brv(strongBinder);
            }
            int i3 = parcel.readInt();
            enforceNoDataAvail(parcel);
            b(brvVar, i3);
            return true;
        }
        if (i != 3) {
            return false;
        }
        IBinder strongBinder2 = parcel.readStrongBinder();
        if (strongBinder2 != null) {
            IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            bkhVar = iInterfaceQueryLocalInterface2 instanceof bkj ? (bkj) iInterfaceQueryLocalInterface2 : new bkh(strongBinder2);
        }
        enforceNoDataAvail(parcel);
        a(bkhVar);
        return true;
    }

    public brt() {
        super("com.google.android.gms.learning.dynamite.proxy.IExampleStoreChunkingIterator");
    }
}
