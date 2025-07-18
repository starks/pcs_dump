package defpackage;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class emk extends emr implements Closeable {
    public final ems a;
    public ScheduledFuture b;
    private final emr h;
    private ArrayList i;
    private eml j;
    private Throwable k;
    private boolean l;

    public emk(emr emrVar) {
        super(emrVar, emrVar.f);
        this.a = emrVar.b();
        this.h = new emr(this, this.f);
    }

    @Override // defpackage.emr
    public final emr a() {
        return this.h.a();
    }

    @Override // defpackage.emr
    public final ems b() {
        return this.a;
    }

    @Override // defpackage.emr
    public final Throwable c() {
        if (i()) {
            return this.k;
        }
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        j(null);
    }

    @Override // defpackage.emr
    public final void d(eml emlVar, Executor executor) {
        n(executor, "executor");
        e(new emn(executor, emlVar, this));
    }

    public final void e(emn emnVar) {
        synchronized (this) {
            if (i()) {
                emnVar.a();
            } else {
                ArrayList arrayList = this.i;
                if (arrayList == null) {
                    ArrayList arrayList2 = new ArrayList();
                    this.i = arrayList2;
                    arrayList2.add(emnVar);
                    emk emkVar = this.e;
                    if (emkVar != null) {
                        this.j = new emj(this, 0);
                        emkVar.e(new emn(emm.a, this.j, this));
                    }
                } else {
                    arrayList.add(emnVar);
                }
            }
        }
    }

    @Override // defpackage.emr
    public final void f(emr emrVar) {
        this.h.f(emrVar);
    }

    @Override // defpackage.emr
    public final void g(eml emlVar) {
        h(emlVar, this);
    }

    public final void h(eml emlVar, emr emrVar) {
        synchronized (this) {
            ArrayList arrayList = this.i;
            if (arrayList != null) {
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    emn emnVar = (emn) this.i.get(size);
                    if (emnVar.a == emlVar && emnVar.b == emrVar) {
                        this.i.remove(size);
                        break;
                    }
                }
                if (this.i.isEmpty()) {
                    emk emkVar = this.e;
                    if (emkVar != null) {
                        emkVar.h(this.j, emkVar);
                    }
                    this.j = null;
                    this.i = null;
                }
            }
        }
    }

    @Override // defpackage.emr
    public final boolean i() {
        synchronized (this) {
            if (this.l) {
                return true;
            }
            if (!super.i()) {
                return false;
            }
            j(super.c());
            return true;
        }
    }

    public final void j(Throwable th) {
        int i;
        boolean z;
        ScheduledFuture scheduledFuture;
        synchronized (this) {
            if (this.l) {
                z = false;
                scheduledFuture = null;
            } else {
                z = true;
                this.l = true;
                scheduledFuture = this.b;
                if (scheduledFuture != null) {
                    this.b = null;
                } else {
                    scheduledFuture = null;
                }
                this.k = th;
            }
        }
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        if (z) {
            synchronized (this) {
                ArrayList arrayList = this.i;
                if (arrayList == null) {
                    return;
                }
                eml emlVar = this.j;
                this.j = null;
                this.i = null;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    emn emnVar = (emn) arrayList.get(i2);
                    if (emnVar.b == this) {
                        emnVar.a();
                    }
                }
                int size2 = arrayList.size();
                for (i = 0; i < size2; i++) {
                    emn emnVar2 = (emn) arrayList.get(i);
                    if (emnVar2.b != this) {
                        emnVar2.a();
                    }
                }
                emk emkVar = this.e;
                if (emkVar != null) {
                    emkVar.h(emlVar, emkVar);
                }
            }
        }
    }

    public emk(emr emrVar, ems emsVar) {
        super(emrVar, emrVar.f);
        this.a = emsVar;
        this.h = new emr(this, this.f);
    }
}
