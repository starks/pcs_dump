package com.google.android.apps.miphone.astrea.ai.service;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.apps.aicore.aidl.IAICoreService;
import defpackage.alm;
import defpackage.amk;
import defpackage.amp;
import defpackage.anc;
import defpackage.aoa;
import defpackage.ark;
import defpackage.cnx;
import defpackage.cxo;
import defpackage.cyz;
import defpackage.czl;
import defpackage.czn;
import defpackage.djy;
import defpackage.dke;
import defpackage.jt;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public class GenAiInferenceService extends anc {
    public static final czn a = czn.j("com/google/android/apps/miphone/astrea/ai/service/GenAiInferenceService");
    private static final cxo d = new cyz("com.google.android.as");
    public aoa b;
    public dke c;
    private final Object e = new Object();
    private amp f = null;

    private final djy e() {
        djy djyVar;
        synchronized (this.e) {
            amp ampVar = this.f;
            if (ampVar != null) {
                if (ampVar.e.isDone()) {
                    IAICoreService iAICoreService = null;
                    if (!ampVar.b.get() && ampVar.e.isDone()) {
                        try {
                            iAICoreService = (IAICoreService) cnx.H(ampVar.e);
                        } catch (ExecutionException unused) {
                        }
                    }
                    if (ampVar.b.get() || iAICoreService == null || !iAICoreService.asBinder().isBinderAlive() || !iAICoreService.asBinder().pingBinder()) {
                    }
                }
                djyVar = this.f.e;
            }
            f();
            dke dkeVar = this.c;
            aoa aoaVar = this.b;
            amp ampVar2 = new amp(this);
            ampVar2.e = cnx.G(jt.u(new ark(ampVar2, dkeVar, 1)), ((amk) aoaVar.b()).a(), TimeUnit.MILLISECONDS, dkeVar);
            this.f = ampVar2;
            djyVar = this.f.e;
        }
        return djyVar;
    }

    private final void f() {
        synchronized (this.e) {
            amp ampVar = this.f;
            if (ampVar == null) {
                return;
            }
            ampVar.a("Force disconnecting old connection either because the service is being destroyed or trying to reconnect.", false);
            this.f = null;
        }
    }

    private final boolean g() {
        return ((amk) this.b.b()).b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0081, code lost:
    
        return (com.google.android.apps.aicore.aidl.IAICoreService) r5.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0082, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0083, code lost:
    
        r5 = r5.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0089, code lost:
    
        if ((r5 instanceof java.lang.Error) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008d, code lost:
    
        if ((r5 instanceof java.lang.RuntimeException) != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0094, code lost:
    
        throw new defpackage.dkq(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0099, code lost:
    
        throw defpackage.djq.a(android.os.RemoteException.class, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a1, code lost:
    
        throw new defpackage.dja((java.lang.Error) r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a2, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a3, code lost:
    
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ae, code lost:
    
        throw defpackage.djq.a(android.os.RemoteException.class, r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.apps.aicore.aidl.IAICoreService c() {
        /*
            r5 = this;
            boolean r0 = r5.g()
            if (r0 == 0) goto Lb7
            cxo r0 = com.google.android.apps.miphone.astrea.ai.service.GenAiInferenceService.d
            android.content.pm.PackageManager r1 = r5.getPackageManager()
            int r2 = android.os.Binder.getCallingUid()
            java.lang.String[] r1 = r1.getPackagesForUid(r2)
            r1.getClass()
            r2 = 0
            r1 = r1[r2]
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto Laf
            djy r5 = r5.e()
            int r0 = defpackage.djq.a
            int r0 = defpackage.djp.b
            java.util.Set r0 = defpackage.djo.b
            java.util.Iterator r0 = r0.iterator()
        L2e:
            boolean r1 = r0.hasNext()
            java.lang.Class<android.os.RemoteException> r3 = android.os.RemoteException.class
            if (r1 == 0) goto L47
            java.lang.Object r1 = r0.next()
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            java.lang.Object r1 = r1.get()
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L2e
            goto L7b
        L47:
            java.lang.Class<java.lang.RuntimeException> r0 = java.lang.RuntimeException.class
            boolean r0 = r0.isAssignableFrom(r3)
            r1 = 1
            r0 = r0 ^ r1
            java.lang.String r4 = "Futures.getChecked exception type (%s) must not be a RuntimeException"
            defpackage.clq.A(r0, r4, r3)
            java.lang.Exception r0 = new java.lang.Exception     // Catch: java.lang.Throwable -> L5d
            r0.<init>()     // Catch: java.lang.Throwable -> L5d
            defpackage.djq.a(r3, r0)     // Catch: java.lang.Throwable -> L5d
            r2 = r1
        L5d:
            java.lang.String r0 = "Futures.getChecked exception type (%s) must be an accessible class with an accessible constructor whose parameters (if any) must be of type String and/or Throwable"
            defpackage.clq.A(r2, r0, r3)
            java.util.Set r0 = defpackage.djo.b
            int r0 = r0.size()
            r1 = 1000(0x3e8, float:1.401E-42)
            if (r0 <= r1) goto L71
            java.util.Set r0 = defpackage.djo.b
            r0.clear()
        L71:
            java.util.Set r0 = defpackage.djo.b
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r3)
            r0.add(r1)
        L7b:
            java.lang.Object r5 = r5.get()     // Catch: java.util.concurrent.ExecutionException -> L82 java.lang.InterruptedException -> La2
            com.google.android.apps.aicore.aidl.IAICoreService r5 = (com.google.android.apps.aicore.aidl.IAICoreService) r5
            return r5
        L82:
            r5 = move-exception
            java.lang.Throwable r5 = r5.getCause()
            boolean r0 = r5 instanceof java.lang.Error
            if (r0 != 0) goto L9a
            boolean r0 = r5 instanceof java.lang.RuntimeException
            if (r0 == 0) goto L95
            dkq r0 = new dkq
            r0.<init>(r5)
            throw r0
        L95:
            java.lang.Exception r5 = defpackage.djq.a(r3, r5)
            throw r5
        L9a:
            dja r0 = new dja
            java.lang.Error r5 = (java.lang.Error) r5
            r0.<init>(r5)
            throw r0
        La2:
            r5 = move-exception
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            java.lang.Exception r5 = defpackage.djq.a(r3, r5)
            throw r5
        Laf:
            android.os.RemoteException r5 = new android.os.RemoteException
            java.lang.String r0 = "Caller is not allow-listed for AICore service forwarding."
            r5.<init>(r0)
            throw r5
        Lb7:
            android.os.RemoteException r5 = new android.os.RemoteException
            java.lang.String r0 = "AICore service forwarding is currently disabled."
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.miphone.astrea.ai.service.GenAiInferenceService.c():com.google.android.apps.aicore.aidl.IAICoreService");
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        if (g()) {
            e();
            return new alm(this);
        }
        ((czl) ((czl) a.d()).i("com/google/android/apps/miphone/astrea/ai/service/GenAiInferenceService", "onBind", 69, "GenAiInferenceService.java")).p("AICore service forwarding is currently disabled.");
        return null;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        ((czl) ((czl) a.c()).i("com/google/android/apps/miphone/astrea/ai/service/GenAiInferenceService", "onUnbind", 81, "GenAiInferenceService.java")).p("onUnbind");
        f();
        return false;
    }
}
