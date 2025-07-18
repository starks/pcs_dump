package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eut implements exw {
    public final equ b;
    public Runnable c;
    public Runnable d;
    public Runnable e;
    public exv f;
    private final Executor j;
    private final eno i = eno.a(eut.class, null);
    public final Object a = new Object();
    public Collection g = new LinkedHashSet();
    public volatile exo h = new exo((Object) null, (Object) null);

    public eut(Executor executor, equ equVar) {
        this.j = executor;
        this.b = equVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
    
        r3 = new defpackage.eus(r2, r0, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
    
        if (r0.a.g() == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
    
        if (r4 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        if (r4.d() == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
    
        r3.b = r4.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
    
        r2.g.add(r3);
        r4 = r2.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005f, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0060, code lost:
    
        r0 = r2.g.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0066, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0068, code lost:
    
        if (r0 != 1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006a, code lost:
    
        r2.b.b(r2.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0071, code lost:
    
        r4 = r6.length;
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0073, code lost:
    
        if (r0 >= r4) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0075, code lost:
    
        r1 = r6[r0];
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0080, code lost:
    
        return r3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11, types: [etw] */
    /* JADX WARN: Type inference failed for: r3v4, types: [evg] */
    /* JADX WARN: Type inference failed for: r3v5, types: [etw] */
    /* JADX WARN: Type inference failed for: r3v7, types: [eus, java.lang.Object] */
    @Override // defpackage.etz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.etw a(defpackage.epg r3, defpackage.epc r4, defpackage.elt r5, defpackage.emb[] r6) {
        /*
            r2 = this;
            eod r0 = new eod     // Catch: java.lang.Throwable -> L8a
            eyh r1 = new eyh     // Catch: java.lang.Throwable -> L8a
            r1.<init>()     // Catch: java.lang.Throwable -> L8a
            r0.<init>(r3, r4, r5, r1)     // Catch: java.lang.Throwable -> L8a
            exo r3 = r2.h     // Catch: java.lang.Throwable -> L8a
        Lc:
            java.lang.Object r4 = r3.a     // Catch: java.lang.Throwable -> L8a
            if (r4 == 0) goto L18
            evg r3 = new evg     // Catch: java.lang.Throwable -> L8a
            eqo r4 = (defpackage.eqo) r4     // Catch: java.lang.Throwable -> L8a
            r3.<init>(r4, r6)     // Catch: java.lang.Throwable -> L8a
            goto L7b
        L18:
            java.lang.Object r4 = r3.b     // Catch: java.lang.Throwable -> L8a
            if (r4 == 0) goto L37
            eog r4 = (defpackage.eog) r4     // Catch: java.lang.Throwable -> L8a
            eoc r4 = r4.a(r0)     // Catch: java.lang.Throwable -> L8a
            elt r5 = r0.a     // Catch: java.lang.Throwable -> L8a
            boolean r1 = r5.g()     // Catch: java.lang.Throwable -> L8a
            etz r1 = defpackage.evt.c(r4, r1)     // Catch: java.lang.Throwable -> L8a
            if (r1 == 0) goto L38
            epg r3 = r0.c     // Catch: java.lang.Throwable -> L8a
            epc r4 = r0.b     // Catch: java.lang.Throwable -> L8a
            etw r3 = r1.a(r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L8a
            goto L7b
        L37:
            r4 = 0
        L38:
            java.lang.Object r5 = r2.a     // Catch: java.lang.Throwable -> L8a
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L8a
            exo r1 = r2.h     // Catch: java.lang.Throwable -> L87
            if (r3 != r1) goto L84
            eus r3 = new eus     // Catch: java.lang.Throwable -> L87
            r3.<init>(r2, r0, r6)     // Catch: java.lang.Throwable -> L87
            elt r0 = r0.a     // Catch: java.lang.Throwable -> L87
            boolean r0 = r0.g()     // Catch: java.lang.Throwable -> L87
            if (r0 == 0) goto L58
            if (r4 == 0) goto L58
            boolean r0 = r4.d()     // Catch: java.lang.Throwable -> L87
            if (r0 == 0) goto L58
            eqo r4 = r4.c     // Catch: java.lang.Throwable -> L87
            r3.b = r4     // Catch: java.lang.Throwable -> L87
        L58:
            java.util.Collection r4 = r2.g     // Catch: java.lang.Throwable -> L87
            r4.add(r3)     // Catch: java.lang.Throwable -> L87
            java.lang.Object r4 = r2.a     // Catch: java.lang.Throwable -> L87
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L87
            java.util.Collection r0 = r2.g     // Catch: java.lang.Throwable -> L81
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L81
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L81
            r4 = 1
            if (r0 != r4) goto L71
            equ r4 = r2.b     // Catch: java.lang.Throwable -> L87
            java.lang.Runnable r0 = r2.c     // Catch: java.lang.Throwable -> L87
            r4.b(r0)     // Catch: java.lang.Throwable -> L87
        L71:
            int r4 = r6.length     // Catch: java.lang.Throwable -> L87
            r0 = 0
        L73:
            if (r0 >= r4) goto L7a
            r1 = r6[r0]     // Catch: java.lang.Throwable -> L87
            int r0 = r0 + 1
            goto L73
        L7a:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L87
        L7b:
            equ r2 = r2.b
            r2.a()
            return r3
        L81:
            r3 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L81
            throw r3     // Catch: java.lang.Throwable -> L87
        L84:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L87
            r3 = r1
            goto Lc
        L87:
            r3 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L87
            throw r3     // Catch: java.lang.Throwable -> L8a
        L8a:
            r3 = move-exception
            equ r2 = r2.b
            r2.a()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eut.a(epg, epc, elt, emb[]):etw");
    }

    final void b(eog eogVar) {
        Runnable runnable;
        synchronized (this.a) {
            this.h = new exo(eogVar, this.h.a);
            if (eogVar != null && f()) {
                ArrayList arrayList = new ArrayList(this.g);
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    eus eusVar = (eus) arrayList.get(i);
                    eoc eocVarA = eogVar.a(eusVar.a);
                    elt eltVar = eusVar.a.a;
                    if (eltVar.g() && eocVarA.d()) {
                        eusVar.b = eocVarA.c;
                    }
                    etz etzVarC = evt.c(eocVarA, eltVar.g());
                    if (etzVarC != null) {
                        Executor executor = this.j;
                        Executor executor2 = eltVar.c;
                        Runnable runnableA = eus.a(eusVar, etzVarC);
                        if (runnableA != null) {
                            if (executor2 != null) {
                                executor = executor2;
                            }
                            executor.execute(runnableA);
                        }
                        arrayList2.add(eusVar);
                    }
                }
                synchronized (this.a) {
                    if (f()) {
                        this.g.removeAll(arrayList2);
                        if (this.g.isEmpty()) {
                            this.g = new LinkedHashSet();
                        }
                        if (!f()) {
                            this.b.b(this.d);
                            if (this.h.a != null && (runnable = this.e) != null) {
                                this.b.b(runnable);
                                this.e = null;
                            }
                        }
                        this.b.a();
                    }
                }
            }
        }
    }

    @Override // defpackage.enu
    public final eno c() {
        return this.i;
    }

    @Override // defpackage.exw
    public final void d(eqo eqoVar) {
        Runnable runnable;
        synchronized (this.a) {
            if (this.h.a != null) {
                return;
            }
            this.h = new exo(this.h.b, eqoVar);
            this.b.b(new cfz((Object) this, (Object) eqoVar, 12, (byte[]) null));
            if (!f() && (runnable = this.e) != null) {
                this.b.b(runnable);
                this.e = null;
            }
            this.b.a();
        }
    }

    @Override // defpackage.exw
    public final void e(eqo eqoVar) {
        throw null;
    }

    public final boolean f() {
        boolean z;
        synchronized (this.a) {
            z = !this.g.isEmpty();
        }
        return z;
    }

    @Override // defpackage.exw
    public final void g(exv exvVar) {
        throw null;
    }
}
