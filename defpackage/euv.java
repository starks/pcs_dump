package defpackage;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class euv implements etw {
    private eqo a;
    private euu b;
    private long c;
    public volatile boolean d;
    public ety e;
    public etw f;
    private long h;
    public List g = new ArrayList();
    private List i = new ArrayList();

    private final void a(Runnable runnable) {
        clq.G(this.e != null, "May only be called after start");
        synchronized (this) {
            if (this.d) {
                runnable.run();
            } else {
                this.g.add(runnable);
            }
        }
    }

    @Override // defpackage.etw
    public final elp B() {
        throw null;
    }

    @Override // defpackage.etw
    public void c(ewa ewaVar) {
        synchronized (this) {
            if (this.e == null) {
                return;
            }
            if (this.f != null) {
                ewaVar.b("buffered_nanos", Long.valueOf(this.h - this.c));
                this.f.c(ewaVar);
            } else {
                ewaVar.b("buffered_nanos", Long.valueOf(System.nanoTime() - this.c));
                ewaVar.a("waiting_for_connection");
            }
        }
    }

    @Override // defpackage.etw
    public void d(eqo eqoVar) {
        boolean z = true;
        clq.G(this.e != null, "May only be called after start");
        eqoVar.getClass();
        synchronized (this) {
            if (this.f == null) {
                s(eyf.a);
                this.a = eqoVar;
                z = false;
            }
        }
        if (z) {
            a(new cfz((Object) this, (Object) eqoVar, 17, (byte[]) null));
            return;
        }
        q();
        b();
        this.e.a(eqoVar, etx.PROCESSED, new epc());
    }

    @Override // defpackage.etw
    public final void e() {
        clq.G(this.e != null, "May only be called after start");
        a(new chg(this, 18, null));
    }

    @Override // defpackage.fbi
    public final void f() {
        clq.G(this.e != null, "May only be called after start");
        if (this.d) {
            this.f.f();
        } else {
            a(new chg(this, 17, null));
        }
    }

    @Override // defpackage.fbi
    public final void g() {
        clq.G(this.e == null, "May only be called before start");
        this.i.add(new chg(this, 15, null));
    }

    @Override // defpackage.fbi
    public final void h(int i) {
        clq.G(this.e != null, "May only be called after start");
        if (this.d) {
            this.f.h(i);
        } else {
            a(new sp(this, i, 7, null));
        }
    }

    @Override // defpackage.fbi
    public final void i(eme emeVar) {
        clq.G(this.e == null, "May only be called before start");
        this.i.add(new cfz((Object) this, (Object) emeVar, 13, (byte[]) null));
    }

    @Override // defpackage.etw
    public final void j(ems emsVar) {
        clq.G(this.e == null, "May only be called before start");
        this.i.add(new cfz((Object) this, (Object) emsVar, 15, (byte[]) null));
    }

    @Override // defpackage.fbi
    public final void k(InputStream inputStream) {
        clq.G(this.e != null, "May only be called after start");
        if (this.d) {
            this.f.k(inputStream);
        } else {
            a(new cfz(this, inputStream, 16, (short[]) null));
        }
    }

    @Override // defpackage.fbi
    public final boolean l() {
        if (this.d) {
            return this.f.l();
        }
        return false;
    }

    @Override // defpackage.etw
    public final void m(emu emuVar) {
        clq.G(this.e == null, "May only be called before start");
        emuVar.getClass();
        this.i.add(new cfz((Object) this, (Object) emuVar, 14, (byte[]) null));
    }

    @Override // defpackage.etw
    public final void n(int i) {
        clq.G(this.e == null, "May only be called before start");
        this.i.add(new sp(this, i, 8, null));
    }

    @Override // defpackage.etw
    public final void o(int i) {
        clq.G(this.e == null, "May only be called before start");
        this.i.add(new sp(this, i, 9, null));
    }

    @Override // defpackage.etw
    public final void p(ety etyVar) {
        eqo eqoVar;
        boolean z;
        clq.G(this.e == null, "already started");
        synchronized (this) {
            eqoVar = this.a;
            z = this.d;
            if (!z) {
                euu euuVar = new euu(etyVar);
                this.b = euuVar;
                etyVar = euuVar;
            }
            this.e = etyVar;
            this.c = System.nanoTime();
        }
        if (eqoVar != null) {
            etyVar.a(eqoVar, etx.PROCESSED, new epc());
        } else if (z) {
            r(etyVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0054, code lost:
    
        r0 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005c, code lost:
    
        if (r0.hasNext() == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005e, code lost:
    
        ((java.lang.Runnable) r0.next()).run();
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q() {
        /*
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            monitor-enter(r5)
            java.util.List r1 = r5.g     // Catch: java.lang.Throwable -> L6d
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L6d
            if (r1 == 0) goto L4f
            r0 = 0
            r5.g = r0     // Catch: java.lang.Throwable -> L6d
            r1 = 1
            r5.d = r1     // Catch: java.lang.Throwable -> L6d
            euu r2 = r5.b     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L6d
            if (r2 == 0) goto L4e
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
        L1e:
            monitor-enter(r2)
            java.util.List r3 = r2.c     // Catch: java.lang.Throwable -> L4b
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L4b
            if (r3 == 0) goto L2d
            r2.c = r0     // Catch: java.lang.Throwable -> L4b
            r2.b = r1     // Catch: java.lang.Throwable -> L4b
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4b
            return
        L2d:
            java.util.List r3 = r2.c     // Catch: java.lang.Throwable -> L4b
            r2.c = r5     // Catch: java.lang.Throwable -> L4b
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4b
            java.util.Iterator r5 = r3.iterator()
        L36:
            boolean r4 = r5.hasNext()
            if (r4 == 0) goto L46
            java.lang.Object r4 = r5.next()
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            r4.run()
            goto L36
        L46:
            r3.clear()
            r5 = r3
            goto L1e
        L4b:
            r5 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4b
            throw r5
        L4e:
            return
        L4f:
            java.util.List r1 = r5.g     // Catch: java.lang.Throwable -> L6d
            r5.g = r0     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L6d
            java.util.Iterator r0 = r1.iterator()
        L58:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L68
            java.lang.Object r2 = r0.next()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            goto L58
        L68:
            r1.clear()
            r0 = r1
            goto L5
        L6d:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L6d
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.euv.q():void");
    }

    public final void r(ety etyVar) {
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.i = null;
        this.f.p(etyVar);
    }

    public final void s(etw etwVar) {
        etw etwVar2 = this.f;
        clq.J(etwVar2 == null, "realStream already set to %s", etwVar2);
        this.f = etwVar;
        this.h = System.nanoTime();
    }

    protected void b() {
    }
}
