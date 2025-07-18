package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class brw extends akh implements brx {
    public final List a;
    public final AtomicInteger b;
    public final AtomicLong c;
    public dki d;
    public final /* synthetic */ bxp e;

    public brw() {
        super("com.google.android.gms.learning.dynamite.proxy.IExampleStoreChunkingIteratorCallback");
    }

    @Override // defpackage.brx
    public final void a(byte[] bArr, boolean z, byte[] bArr2, long j, long j2) {
        cix cixVar = this.e.b.j;
        if (cixVar != null) {
            ((AtomicLong) cixVar.b).addAndGet(((csm) cixVar.d).a() - this.c.get());
            ((AtomicLong) this.e.b.j.a).addAndGet(j);
            ((AtomicLong) this.e.b.j.c).addAndGet(j2);
        }
        if (bArr == null) {
            this.d.d(new crv(null, null));
            return;
        }
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        if (!z || !this.a.isEmpty()) {
            this.a.add(bArr);
            int iAddAndGet = this.b.addAndGet(bArr.length);
            if (z) {
                bArr = new byte[iAddAndGet];
                int i = 0;
                for (byte[] bArr3 : this.a) {
                    int length = bArr3.length;
                    System.arraycopy(bArr3, 0, bArr, i, length);
                    i += length;
                }
                this.e.a.set(true);
                this.a.clear();
            } else {
                bArr = null;
            }
        }
        if (bArr != null) {
            this.d.d(new crv(new exo(eea.r(bArr), bArr2), null));
            return;
        }
        cix cixVar2 = this.e.b.j;
        if (cixVar2 != null) {
            this.c.set(((csm) cixVar2.d).a());
        }
    }

    @Override // defpackage.brx
    public final void b(Status status, long j, long j2) {
        cix cixVar = this.e.b.j;
        if (cixVar != null) {
            ((AtomicLong) cixVar.a).addAndGet(j);
            ((AtomicLong) this.e.b.j.c).addAndGet(j2);
            cix cixVar2 = this.e.b.j;
            ((AtomicLong) cixVar2.b).addAndGet(((csm) cixVar2.d).a() - this.c.get());
        }
        this.d.d(new crv(null, status));
    }

    @Override // defpackage.akh
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 3) {
            Status status = (Status) aki.a(parcel, Status.CREATOR);
            long j = parcel.readLong();
            long j2 = parcel.readLong();
            enforceNoDataAvail(parcel);
            b(status, j, j2);
        } else {
            if (i != 4) {
                return false;
            }
            byte[] bArrCreateByteArray = parcel.createByteArray();
            boolean zE = aki.e(parcel);
            byte[] bArrCreateByteArray2 = parcel.createByteArray();
            long j3 = parcel.readLong();
            long j4 = parcel.readLong();
            enforceNoDataAvail(parcel);
            a(bArrCreateByteArray, zE, bArrCreateByteArray2, j3, j4);
        }
        parcel2.writeNoException();
        return true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public brw(bxp bxpVar) {
        this();
        this.e = bxpVar;
        this.a = DesugarCollections.synchronizedList(new ArrayList());
        this.b = new AtomicInteger(0);
        this.c = new AtomicLong(0L);
    }
}
