package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class frm {
    public final frn a;
    public final String b;
    public boolean c;
    public frk d;
    public final List e = new ArrayList();
    public boolean f;

    public frm(frn frnVar, String str) {
        this.a = frnVar;
        this.b = str;
    }

    public final void a() {
        byte[] bArr = frh.a;
        synchronized (this.a) {
            if (d()) {
                this.a.c(this);
            }
        }
    }

    public final void b(frk frkVar, long j) {
        frkVar.getClass();
        synchronized (this.a) {
            if (this.c) {
                if (frn.b.isLoggable(Level.FINE)) {
                    fwv.x(frkVar, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (e(frkVar, 0L, false)) {
                    this.a.c(this);
                }
            }
        }
    }

    public final void c() {
        byte[] bArr = frh.a;
        synchronized (this.a) {
            this.c = true;
            if (d()) {
                this.a.c(this);
            }
        }
    }

    public final boolean d() {
        if (this.d != null) {
            this.f = true;
        }
        int size = this.e.size() - 1;
        boolean z = false;
        while (size >= 0) {
            frk frkVar = (frk) this.e.get(size);
            if (frn.b.isLoggable(Level.FINE)) {
                fwv.x(frkVar, this, "canceled");
            }
            this.e.remove(size);
            size--;
            z = true;
        }
        return z;
    }

    public final boolean e(frk frkVar, long j, boolean z) {
        frm frmVar = frkVar.b;
        if (frmVar != this) {
            if (frmVar != null) {
                throw new IllegalStateException("task is in multiple queues");
            }
            frkVar.b = this;
        }
        long jG = fsc.g();
        long j2 = jG + j;
        int iIndexOf = this.e.indexOf(frkVar);
        if (iIndexOf != -1) {
            if (frkVar.c <= j2) {
                if (frn.b.isLoggable(Level.FINE)) {
                    fwv.x(frkVar, this, "already scheduled");
                }
                return false;
            }
            this.e.remove(iIndexOf);
        }
        frkVar.c = j2;
        if (frn.b.isLoggable(Level.FINE)) {
            long j3 = j2 - jG;
            fwv.x(frkVar, this, z ? "run again after ".concat(fwv.w(j3)) : "scheduled after ".concat(fwv.w(j3)));
        }
        Iterator it = this.e.iterator();
        int size = 0;
        while (true) {
            if (!it.hasNext()) {
                size = -1;
                break;
            }
            if (((frk) it.next()).c - jG > j) {
                break;
            }
            size++;
        }
        if (size == -1) {
            size = this.e.size();
        }
        this.e.add(size, frkVar);
        return size == 0;
    }

    public final String toString() {
        return this.b;
    }
}
