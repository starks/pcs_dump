package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bkf implements Handler.Callback {
    public static final Status a = new Status(4, "Sign-out occurred while this API call was in progress.");
    public static final Status b = new Status(4, "The user must be signed in to make this API call.");
    public static final Object c = new Object();
    private static bkf r;
    public final Context h;
    public final bhs i;
    public final Handler n;
    public volatile boolean o;
    public final fpf q;
    private bmo s;
    private bmp t;
    public final long d = 5000;
    public final long e = 120000;
    public long f = 10000;
    public boolean g = false;
    public final AtomicInteger j = new AtomicInteger(1);
    public final AtomicInteger k = new AtomicInteger(0);
    public final Map l = new ConcurrentHashMap(5, 0.75f, 1);
    public final bju p = null;
    public final Set m = new nx();
    private final Set u = new nx();

    private bkf(Context context, Looper looper, bhs bhsVar) {
        this.o = true;
        this.h = context;
        bya byaVar = new bya(looper, this);
        this.n = byaVar;
        this.i = bhsVar;
        this.q = new fpf(bhsVar);
        PackageManager packageManager = context.getPackageManager();
        if (bnd.b == null) {
            bnd.b = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (bnd.b.booleanValue()) {
            this.o = false;
        }
        byaVar.sendMessage(byaVar.obtainMessage(6));
    }

    public static Status a(bjr bjrVar, bho bhoVar) {
        Object obj = bjrVar.a.b;
        return new Status(bhoVar, "API: " + ((String) obj) + " is not available on this device. Connection failed with: " + String.valueOf(bhoVar));
    }

    public static bkf b(Context context) {
        bkf bkfVar;
        HandlerThread handlerThread;
        synchronized (c) {
            if (r == null) {
                synchronized (blp.b) {
                    handlerThread = blp.d;
                    if (handlerThread == null) {
                        blp.d = new HandlerThread("GoogleApiHandler", 9);
                        blp.d.start();
                        handlerThread = blp.d;
                    }
                }
                r = new bkf(context.getApplicationContext(), handlerThread.getLooper(), bhs.a);
            }
            bkfVar = r;
        }
        return bkfVar;
    }

    private final bkb e(biz bizVar) {
        Map map = this.l;
        bjr bjrVar = bizVar.e;
        bkb bkbVar = (bkb) map.get(bjrVar);
        if (bkbVar == null) {
            bkbVar = new bkb(this, bizVar);
            this.l.put(bjrVar, bkbVar);
        }
        if (bkbVar.o()) {
            this.u.add(bjrVar);
        }
        bkbVar.d();
        return bkbVar;
    }

    private final bmp f() {
        if (this.t == null) {
            this.t = new bmx(this.h, bmq.a);
        }
        return this.t;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void g() {
        /*
            r3 = this;
            bmo r0 = r3.s
            if (r0 == 0) goto L2b
            int r1 = r0.a
            if (r1 > 0) goto L21
            boolean r1 = r3.g
            if (r1 == 0) goto Ld
            goto L28
        Ld:
            bml r1 = defpackage.bml.a()
            bmm r1 = r1.a
            fpf r1 = r3.q
            r2 = 203400000(0xc1fa340, float:1.2298041E-31)
            int r1 = r1.i(r2)
            r2 = -1
            if (r1 == r2) goto L21
            if (r1 != 0) goto L28
        L21:
            bmp r1 = r3.f()
            r1.a(r0)
        L28:
            r0 = 0
            r3.s = r0
        L2b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bkf.g():void");
    }

    public final void c(bho bhoVar, int i) {
        if (d(bhoVar, i)) {
            return;
        }
        Handler handler = this.n;
        handler.sendMessage(handler.obtainMessage(5, i, 0, bhoVar));
    }

    final boolean d(bho bhoVar, int i) throws Resources.NotFoundException {
        Context context = this.h;
        if (bnh.A(context)) {
            return false;
        }
        bhs bhsVar = this.i;
        PendingIntent pendingIntentB = bhoVar.b() ? bhoVar.d : bhsVar.b(context, bhoVar.c, null);
        if (pendingIntentB == null) {
            return false;
        }
        int i2 = bhoVar.c;
        Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
        intent.putExtra("pending_intent", pendingIntentB);
        intent.putExtra("failing_client_id", i);
        intent.putExtra("notify_manager", true);
        bhsVar.c(context, i2, PendingIntent.getActivity(context, 0, intent, 167772160));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:91:0x0226  */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean handleMessage(android.os.Message r9) {
        /*
            Method dump skipped, instructions count: 872
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bkf.handleMessage(android.os.Message):boolean");
    }
}
