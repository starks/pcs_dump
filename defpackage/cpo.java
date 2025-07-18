package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cpo {
    public final dki c;
    public final djl d;
    public final AtomicLong a = new AtomicLong(b(Integer.MIN_VALUE, Integer.MIN_VALUE));
    public final AtomicReference b = new AtomicReference(null);
    private final AtomicReference e = new AtomicReference(null);
    private final Executor f = new dkh(diy.a);

    public cpo(dir dirVar, Executor executor) {
        dki dkiVar = new dki();
        this.c = dkiVar;
        djl djlVar = new djl(dirVar, executor, 1);
        this.d = djlVar;
        dkiVar.c(djlVar, diy.a);
    }

    public static int a(long j) {
        return (int) (j >>> 32);
    }

    public static long b(int i, int i2) {
        return (i2 & 4294967295L) | (i << 32);
    }

    public final djy c() {
        long j;
        final int iA;
        if (this.c.isDone()) {
            return this.c;
        }
        do {
            j = this.a.get();
            iA = a(j);
        } while (!this.a.compareAndSet(j, b(iA, ((int) j) + 1)));
        final dki dkiVar = new dki();
        djy djyVar = (djy) this.e.getAndSet(dkiVar);
        dkiVar.f(djyVar == null ? cnx.F(cqt.a(new dir() { // from class: cpj
            @Override // defpackage.dir
            public final djy a() {
                return this.a.d(iA);
            }
        }), diy.a) : dhq.j(djyVar, Throwable.class, cqt.b(new dis() { // from class: cpk
            @Override // defpackage.dis
            public final djy a(Object obj) {
                return this.a.d(iA);
            }
        }), this.f));
        final cpm cpmVar = new cpm(this, iA);
        dkiVar.c(new Runnable() { // from class: cpl
            @Override // java.lang.Runnable
            public final void run() {
                cpm cpmVar2 = cpmVar;
                dki dkiVar2 = dkiVar;
                try {
                    Object objH = cnx.H(dkiVar2);
                    cpo cpoVar = this.a;
                    cpoVar.c.d(objH);
                    cpmVar2.f(cpoVar.c);
                } catch (Throwable unused) {
                    cpmVar2.f(dkiVar2);
                }
            }
        }, diy.a);
        return cpmVar;
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [dir, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final djy d(int i) {
        cpn cpnVar;
        if (a(this.a.get()) > i) {
            return cnx.A();
        }
        cpn cpnVar2 = new cpn(i);
        do {
            cpnVar = (cpn) this.b.get();
            if (cpnVar != null && cpnVar.a > i) {
                return cnx.A();
            }
        } while (!cnx.g(this.b, cpnVar, cpnVar2));
        if (a(this.a.get()) > i) {
            cpnVar2.cancel(true);
            cnx.g(this.b, cpnVar2, null);
            return cpnVar2;
        }
        djl djlVar = this.d;
        ?? r1 = djlVar.a;
        ?? r4 = djlVar.b;
        if (r1 == 0 || r4 == 0) {
            cpnVar2.f(this.c);
            return cpnVar2;
        }
        cpnVar2.f(cnx.F(cqt.a(r1), r4));
        return cpnVar2;
    }
}
