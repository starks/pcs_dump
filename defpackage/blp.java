package defpackage;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class blp {
    public static final int a = 4225;
    public static final Object b = new Object();
    public static final int c = 9;
    public static HandlerThread d;
    public static blp j;
    public final HashMap e;
    public final Context f;
    public volatile Handler g;
    public final bmz h;
    public final long i;
    private final blr k;
    private final long l;
    private volatile Executor m;

    public blp() {
    }

    public final void a(String str, String str2, int i, ServiceConnection serviceConnection, String str3, boolean z) {
        c(new blo(str, "com.google.android.gms", a, z), serviceConnection);
    }

    protected final bho b(blo bloVar, ServiceConnection serviceConnection, String str) {
        bho bhoVarC;
        synchronized (this.e) {
            blq blqVar = (blq) this.e.get(bloVar);
            if (blqVar == null) {
                blqVar = new blq(this, bloVar);
                blqVar.d(serviceConnection, serviceConnection);
                bhoVarC = blq.c(blqVar, str);
                this.e.put(bloVar, blqVar);
            } else {
                this.g.removeMessages(0, bloVar);
                if (blqVar.a(serviceConnection)) {
                    throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=" + bloVar.toString());
                }
                blqVar.d(serviceConnection, serviceConnection);
                int i = blqVar.b;
                if (i == 1) {
                    serviceConnection.onServiceConnected(blqVar.f, blqVar.d);
                } else if (i == 2) {
                    bhoVarC = blq.c(blqVar, str);
                }
                bhoVarC = null;
            }
            if (blqVar.c) {
                return bho.a;
            }
            if (bhoVarC == null) {
                bhoVarC = new bho(-1);
            }
            return bhoVarC;
        }
    }

    protected final void c(blo bloVar, ServiceConnection serviceConnection) {
        synchronized (this.e) {
            blq blqVar = (blq) this.e.get(bloVar);
            if (blqVar == null) {
                throw new IllegalStateException("Nonexistent connection status for service config: " + bloVar.toString());
            }
            if (!blqVar.a(serviceConnection)) {
                throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + bloVar.toString());
            }
            blqVar.a.remove(serviceConnection);
            if (blqVar.b()) {
                this.g.sendMessageDelayed(this.g.obtainMessage(0, bloVar), this.l);
            }
        }
    }

    public blp(Context context, Looper looper) {
        this();
        this.e = new HashMap();
        blr blrVar = new blr(this);
        this.k = blrVar;
        this.f = context.getApplicationContext();
        this.g = new bya(looper, blrVar);
        this.h = bmz.a();
        this.l = 5000L;
        this.i = 300000L;
        this.m = null;
    }
}
