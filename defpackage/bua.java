package defpackage;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bua {
    private final buj a;
    private final csm b;
    private final long c;

    public bua(buj bujVar) {
        this.a = bujVar;
        csm csmVar = crc.a;
        this.b = csmVar;
        this.c = csmVar.a();
    }

    public final void a(int i, String str) {
        try {
            this.a.a(new Status(i, str), this.b.a() - this.c);
        } catch (RemoteException e) {
            Log.w("brella.ExampleStoreSvc", "onStartQueryFailure AIDL call failed, ignoring", e);
        }
    }

    public final void b(bqd bqdVar) {
        long jA = this.b.a() - this.c;
        bty btyVar = new bty(bqdVar, this.b);
        try {
            this.a.b(btyVar, jA);
        } catch (RemoteException e) {
            Log.w("brella.ExampleStoreSvc", "onStartQuerySuccess AIDL call failed, closing iterator", e);
            btyVar.a();
        }
    }
}
