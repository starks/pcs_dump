package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dkg implements Runnable {
    Runnable a;
    final /* synthetic */ dkh b;

    public dkg(dkh dkhVar) {
        this.b = dkhVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
    
        if (r1 == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
    
        r0 = java.lang.Thread.currentThread();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0047, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0049, code lost:
    
        r11.a.run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0054, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0056, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0058, code lost:
    
        defpackage.dkh.a.a().logp(java.util.logging.Level.SEVERE, "com.google.common.util.concurrent.SequentialExecutor$QueueWorker", "workOnQueue", "Exception while executing runnable " + java.lang.String.valueOf(r11.a), (java.lang.Throwable) r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007e, code lost:
    
        r11.a = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0081, code lost:
    
        r11.a = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0083, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:?, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0035 A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r11 = this;
            r0 = 0
            r1 = r0
        L2:
            r2 = 1
            dkh r3 = r11.b     // Catch: java.lang.Throwable -> L52
            java.util.Deque r3 = r3.b     // Catch: java.lang.Throwable -> L52
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L52
            if (r0 != 0) goto L27
            dkh r0 = r11.b     // Catch: java.lang.Throwable -> L84
            int r0 = r0.d     // Catch: java.lang.Throwable -> L84
            r4 = 4
            if (r0 != r4) goto L1c
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L84
            if (r1 == 0) goto L41
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: java.lang.Error -> L91
        L18:
            r0.interrupt()     // Catch: java.lang.Error -> L91
            goto L41
        L1c:
            dkh r0 = r11.b     // Catch: java.lang.Throwable -> L84
            long r5 = r0.c     // Catch: java.lang.Throwable -> L84
            r7 = 1
            long r5 = r5 + r7
            r0.c = r5     // Catch: java.lang.Throwable -> L84
            r0.d = r4     // Catch: java.lang.Throwable -> L84
        L27:
            dkh r0 = r11.b     // Catch: java.lang.Throwable -> L84
            java.util.Deque r0 = r0.b     // Catch: java.lang.Throwable -> L84
            java.lang.Object r0 = r0.poll()     // Catch: java.lang.Throwable -> L84
            java.lang.Runnable r0 = (java.lang.Runnable) r0     // Catch: java.lang.Throwable -> L84
            r11.a = r0     // Catch: java.lang.Throwable -> L84
            if (r0 != 0) goto L42
            dkh r0 = r11.b     // Catch: java.lang.Throwable -> L84
            r0.d = r2     // Catch: java.lang.Throwable -> L84
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L84
            if (r1 == 0) goto L41
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: java.lang.Error -> L91
            goto L18
        L41:
            return
        L42:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L84
            boolean r0 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L52
            r1 = r1 | r0
            r3 = 0
            java.lang.Runnable r0 = r11.a     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L56
            r0.run()     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L56
            r11.a = r3     // Catch: java.lang.Throwable -> L52
        L50:
            r0 = r2
            goto L2
        L52:
            r0 = move-exception
            goto L87
        L54:
            r0 = move-exception
            goto L81
        L56:
            r0 = move-exception
            r9 = r0
            djx r0 = defpackage.dkh.a     // Catch: java.lang.Throwable -> L54
            java.util.logging.Logger r4 = r0.a()     // Catch: java.lang.Throwable -> L54
            java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L54
            java.lang.String r6 = "com.google.common.util.concurrent.SequentialExecutor$QueueWorker"
            java.lang.String r7 = "workOnQueue"
            java.lang.Runnable r0 = r11.a     // Catch: java.lang.Throwable -> L54
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L54
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L54
            r8.<init>()     // Catch: java.lang.Throwable -> L54
            java.lang.String r10 = "Exception while executing runnable "
            r8.append(r10)     // Catch: java.lang.Throwable -> L54
            r8.append(r0)     // Catch: java.lang.Throwable -> L54
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L54
            r4.logp(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L54
            r11.a = r3     // Catch: java.lang.Throwable -> L52
            goto L50
        L81:
            r11.a = r3     // Catch: java.lang.Throwable -> L52
            throw r0     // Catch: java.lang.Throwable -> L52
        L84:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L84
            throw r0     // Catch: java.lang.Throwable -> L52
        L87:
            if (r1 == 0) goto L90
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch: java.lang.Error -> L91
            r1.interrupt()     // Catch: java.lang.Error -> L91
        L90:
            throw r0     // Catch: java.lang.Error -> L91
        L91:
            r0 = move-exception
            dkh r1 = r11.b
            java.util.Deque r1 = r1.b
            monitor-enter(r1)
            dkh r11 = r11.b     // Catch: java.lang.Throwable -> L9d
            r11.d = r2     // Catch: java.lang.Throwable -> L9d
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9d
            throw r0
        L9d:
            r0 = move-exception
            r11 = r0
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9d
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dkg.run():void");
    }

    public final String toString() {
        Runnable runnable = this.a;
        if (runnable != null) {
            return a.G(runnable, "SequentialExecutorWorker{running=", "}");
        }
        int i = this.b.d;
        return a.z(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "RUNNING" : "QUEUED" : "QUEUING" : "IDLE", "SequentialExecutorWorker{state=", "}");
    }
}
