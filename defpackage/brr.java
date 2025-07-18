package defpackage;

import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class brr extends buc {
    public final brx a;
    public final csm b;
    public final AtomicLong c;
    private final int e;
    private final brt g;
    private final AtomicBoolean f = new AtomicBoolean(false);
    public final AtomicLong d = new AtomicLong(0);

    public brr(brx brxVar, int i, brt brtVar, csm csmVar, long j) {
        this.a = brxVar;
        this.e = i;
        this.g = brtVar;
        this.b = csmVar;
        this.c = new AtomicLong(j);
    }

    private final void c(byte[] bArr, brq brqVar) throws TransactionTooLargeException {
        boolean z;
        if (this.f.getAndSet(true)) {
            Log.w("ExmplStrItrCallback", "Ignoring onIteratorNextSuccess, result already returned!");
            return;
        }
        try {
            if (bArr == null) {
                brqVar.a(null, true);
                return;
            }
            if (bArr.length <= this.e) {
                brqVar.a(bArr, true);
                return;
            }
            int i = 0;
            while (true) {
                int length = bArr.length;
                if (i >= length) {
                    return;
                }
                int i2 = this.e + i;
                if (i2 >= length) {
                    z = true;
                } else {
                    length = i2;
                    z = false;
                }
                brqVar.a(Arrays.copyOfRange(bArr, i, length), z);
                i += this.e;
            }
        } catch (TransactionTooLargeException e) {
            Log.w("ExmplStrItrCallback", "Failed to return app's result over AIDL callback", e);
            try {
                this.a.b(new Status(8, "TransactionTooLargeException"), 0L, 0L);
            } catch (RemoteException unused) {
                Log.w("ExmplStrItrCallback", "Failed to return app's result over AIDL callback", e);
            }
            this.g.c();
            throw e;
        } catch (RemoteException e2) {
            Log.w("ExmplStrItrCallback", "Failed to return app's result over AIDL callback", e2);
            this.g.c();
        }
    }

    @Override // defpackage.bud
    public final void a(Status status, long j) {
        if (this.f.getAndSet(true)) {
            Log.w("ExmplStrItrCallback", "Ignoring onIteratorNextFailure, result already returned!");
            return;
        }
        try {
            this.a.b(status, j, this.b.a() - this.c.get());
        } catch (RemoteException e) {
            Log.w("ExmplStrItrCallback", "Failed to call onIteratorNextFailure on AIDL callback", e);
            this.g.c();
        }
    }

    @Override // defpackage.bud
    public final void b(bpf bpfVar, bpf bpfVar2, long j) throws TransactionTooLargeException {
        c(bpfVar == null ? null : (byte[]) bpe.a(bpfVar), new brq(this, bpfVar2 != null ? (byte[]) bpe.a(bpfVar2) : null, j));
    }
}
