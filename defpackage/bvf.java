package defpackage;

import android.content.Context;
import android.os.RemoteException;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bvf extends bvn {
    private static final fwl a = null;
    private static boolean b = false;
    private static boolean c = false;
    private final Context d;

    public bvf(Context context) {
        this.d = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
    
        if (r3 != (-1)) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
    
        new defpackage.ekf(r6, (byte[]) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0055, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final defpackage.fwl g(android.content.Context r6) {
        /*
            java.lang.Class<bvf> r0 = defpackage.bvf.class
            monitor-enter(r0)
            boolean r1 = defpackage.bvf.b     // Catch: java.lang.Throwable -> L6e
            r2 = 0
            if (r1 == 0) goto La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6e
            return r2
        La:
            r1 = 1
            defpackage.bvf.b = r1     // Catch: java.lang.Throwable -> L6e
            int r3 = defpackage.fwn.a     // Catch: java.lang.Throwable -> L5b java.lang.Throwable -> L6e
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L5b java.lang.Throwable -> L6e
            r3.<init>()     // Catch: java.lang.Throwable -> L5b java.lang.Throwable -> L6e
            java.util.List r4 = defpackage.fwn.c(r6)     // Catch: java.lang.Throwable -> L5b java.lang.Throwable -> L6e
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L5b java.lang.Throwable -> L6e
        L1c:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L5b java.lang.Throwable -> L6e
            if (r5 == 0) goto L2e
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L5b java.lang.Throwable -> L6e
            fwm r5 = (defpackage.fwm) r5     // Catch: java.lang.Throwable -> L5b java.lang.Throwable -> L6e
            fwn r5 = r5.a     // Catch: java.lang.Throwable -> L5b java.lang.Throwable -> L6e
            r3.add(r5)     // Catch: java.lang.Throwable -> L5b java.lang.Throwable -> L6e
            goto L1c
        L2e:
            java.util.List r3 = j$.util.DesugarCollections.unmodifiableList(r3)     // Catch: java.lang.Throwable -> L5b java.lang.Throwable -> L6e
            bwv r4 = new bwv     // Catch: java.lang.Throwable -> L5b java.lang.Throwable -> L6e
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L5b java.lang.Throwable -> L6e
            java.util.Iterator r1 = r3.iterator()     // Catch: java.lang.Throwable -> L5b java.lang.Throwable -> L6e
            r3 = 0
        L3c:
            boolean r5 = r1.hasNext()     // Catch: java.lang.Throwable -> L5b java.lang.Throwable -> L6e
            if (r5 == 0) goto L59
            java.lang.Object r5 = r1.next()     // Catch: java.lang.Throwable -> L5b java.lang.Throwable -> L6e
            boolean r5 = r4.a(r5)     // Catch: java.lang.Throwable -> L5b java.lang.Throwable -> L6e
            if (r5 == 0) goto L56
            r1 = -1
            if (r3 != r1) goto L50
            goto L59
        L50:
            ekf r1 = new ekf     // Catch: java.lang.Throwable -> L5b java.lang.Throwable -> L6e
            r1.<init>(r6, r2)     // Catch: java.lang.Throwable -> L5b java.lang.Throwable -> L6e
            throw r2     // Catch: java.lang.Throwable -> L5b java.lang.Throwable -> L6e
        L56:
            int r3 = r3 + 1
            goto L3c
        L59:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6e
            return r2
        L5b:
            r6 = move-exception
            java.lang.String r1 = "brella.CrntHttpUrlFctry"
            r3 = 5
            boolean r1 = android.util.Log.isLoggable(r1, r3)     // Catch: java.lang.Throwable -> L6e
            if (r1 == 0) goto L6c
            java.lang.String r1 = "brella.CrntHttpUrlFctry"
            java.lang.String r3 = "failed to load Cronet engine"
            android.util.Log.w(r1, r3, r6)     // Catch: java.lang.Throwable -> L6e
        L6c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6e
            return r2
        L6e:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6e
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvf.g(android.content.Context):fwl");
    }

    @Override // defpackage.bvo
    public final bpf a(String str) throws RemoteException {
        try {
            g(this.d);
            throw new RemoteException("failed to initialize CronetEngine");
        } catch (IOException e) {
            throw new RemoteException("unexpected IOException: ".concat(String.valueOf(e.getMessage())));
        }
    }

    @Override // defpackage.bvo
    public final void b(boolean z) {
        synchronized (bvf.class) {
            c = z;
        }
    }

    @Override // defpackage.bvo
    public final boolean c() {
        return true;
    }

    @Override // defpackage.bvo
    public final boolean d() {
        g(this.d);
        return false;
    }

    @Override // defpackage.bvo
    public final boolean e() {
        return false;
    }

    @Override // defpackage.bvo
    public final boolean f() {
        return false;
    }
}
