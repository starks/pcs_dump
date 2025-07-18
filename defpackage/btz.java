package defpackage;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class btz implements bqc {
    private final bty a;
    private final bud b;
    private final csm c;
    private final long d;

    public btz(bty btyVar, bud budVar, csm csmVar) {
        this.a = btyVar;
        this.b = budVar;
        this.c = csmVar;
        this.d = csmVar.a();
    }

    @Override // defpackage.bqc
    public final void a(int i, String str) {
        try {
            this.b.a(new Status(i, str), this.c.a() - this.d);
        } catch (RemoteException e) {
            Log.w("brella.ExampleStoreSvc", "onIteratorNextFailure AIDL call failed, closing iterator", e);
            this.a.a();
        }
    }

    @Override // defpackage.bqc
    public final void b(byte[] bArr, byte[] bArr2) {
        long jA = this.c.a() - this.d;
        try {
            bud budVar = this.b;
            bpe bpeVar = null;
            bpe bpeVar2 = bArr == null ? null : new bpe(bArr);
            if (bArr2 != null) {
                bpeVar = new bpe(bArr2);
            }
            budVar.b(bpeVar2, bpeVar, jA);
        } catch (RemoteException e) {
            Log.w("brella.ExampleStoreSvc", "onIteratorNextSuccess AIDL call failed, closing iterator", e);
            this.a.a();
        }
    }
}
