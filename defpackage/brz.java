package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class brz extends akh implements bsa {
    final /* synthetic */ long a;
    final /* synthetic */ dki b;
    final /* synthetic */ bxq c;

    public brz() {
        super("com.google.android.gms.learning.dynamite.proxy.IExampleStoreChunkingQueryCallback");
    }

    @Override // defpackage.bsa
    public final void a(Status status, long j, long j2) {
        cix cixVar = this.c.j;
        if (cixVar != null) {
            ((AtomicLong) cixVar.b).addAndGet(((csm) cixVar.d).a() - this.a);
            ((AtomicLong) this.c.j.a).addAndGet(j);
            ((AtomicLong) this.c.j.c).addAndGet(j2);
        }
        this.c.c.h("Could not acquire iterator: ".concat(String.valueOf(String.valueOf(status))));
        this.b.d(new crv(null, status));
    }

    @Override // defpackage.bsa
    public final void b(bru bruVar, long j, long j2) {
        cix cixVar = this.c.j;
        if (cixVar != null) {
            ((AtomicLong) cixVar.b).addAndGet(((csm) cixVar.d).a() - this.a);
            ((AtomicLong) this.c.j.a).addAndGet(j);
            ((AtomicLong) this.c.j.c).addAndGet(j2);
        }
        this.b.d(new crv(bruVar, null));
    }

    @Override // defpackage.akh
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        bru brsVar;
        if (i == 2) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                brsVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.learning.dynamite.proxy.IExampleStoreChunkingIterator");
                brsVar = iInterfaceQueryLocalInterface instanceof bru ? (bru) iInterfaceQueryLocalInterface : new brs(strongBinder);
            }
            long j = parcel.readLong();
            long j2 = parcel.readLong();
            enforceNoDataAvail(parcel);
            b(brsVar, j, j2);
        } else {
            if (i != 3) {
                return false;
            }
            Status status = (Status) aki.a(parcel, Status.CREATOR);
            long j3 = parcel.readLong();
            long j4 = parcel.readLong();
            enforceNoDataAvail(parcel);
            a(status, j3, j4);
        }
        parcel2.writeNoException();
        return true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public brz(bxq bxqVar, long j, dki dkiVar) {
        this();
        this.a = j;
        this.b = dkiVar;
        this.c = bxqVar;
    }
}
