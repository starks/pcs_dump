package defpackage;

import java.util.ArrayList;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eab implements Runnable {
    private eaa a;
    private boolean b;
    private final ArrayList c = new ArrayList();
    private final BlockingQueue d = new LinkedBlockingQueue();

    public eab(eaa eaaVar) {
        this.a = eaaVar;
    }

    private final void b() {
        this.d.clear();
        c();
    }

    private final synchronized void c() {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((Runnable) arrayList.get(i)).run();
        }
        this.c.clear();
    }

    private final void d() {
        eaa eaaVarB;
        while (true) {
            synchronized (this) {
                if (this.b) {
                    b();
                    return;
                }
                eaa eaaVar = this.a;
                eaaVar.c();
                try {
                    eaaVarB = eaaVar.a();
                } catch (Exception e) {
                    eaaVarB = eaaVar.b(e);
                }
                synchronized (this) {
                    if (this.b) {
                        b();
                        return;
                    }
                    if (eaaVarB == eaaVar) {
                        return;
                    }
                    if (eaaVarB == null) {
                        e();
                        return;
                    } else {
                        eaaVar.d();
                        synchronized (this) {
                            this.a = eaaVarB;
                        }
                    }
                }
            }
        }
    }

    private final synchronized void e() {
        if (this.b) {
            return;
        }
        this.b = true;
    }

    public final synchronized void a(dzz dzzVar) {
        if (this.b) {
            return;
        }
        this.d.offer(dzzVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        eaa eaaVarB;
        d();
        while (true) {
            synchronized (this) {
                if (this.b) {
                    b();
                    return;
                }
                dzz dzzVar = (dzz) this.d.poll();
                if (dzzVar == null) {
                    c();
                    while (true) {
                        try {
                            dzzVar = (dzz) this.d.take();
                            break;
                        } catch (InterruptedException unused) {
                            synchronized (this) {
                                if (this.b) {
                                    b();
                                    return;
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    if (this.b) {
                        b();
                        return;
                    }
                    eaa eaaVar = this.a;
                    try {
                        dzzVar.getClass();
                        eaaVarB = dzzVar.a(eaaVar);
                    } catch (Exception e) {
                        eaaVarB = eaaVar.b(e);
                    }
                    synchronized (this) {
                        if (this.b) {
                            b();
                            return;
                        }
                    }
                    if (eaaVarB != eaaVar) {
                        eaaVar.d();
                        synchronized (this) {
                            this.a = eaaVarB;
                        }
                        d();
                    }
                }
            }
        }
    }
}
