package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
class cty extends cwo implements Serializable {
    private static final long serialVersionUID = 1;
    final cuc b;
    final cuc c;
    final cro d;
    final cro e;
    final long f;
    final long g;
    final long h;
    final int i;
    final csm j;
    final csy k;
    transient csp l;
    final csu m;
    final cst n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cty(cuu cuuVar) {
        super(null);
        cuc cucVar = cuuVar.j;
        cuc cucVar2 = cuuVar.k;
        cro croVar = cuuVar.h;
        cro croVar2 = cuuVar.i;
        long j = cuuVar.n;
        long j2 = cuuVar.m;
        long j3 = cuuVar.l;
        csu csuVar = cuuVar.w;
        int i = cuuVar.g;
        cst cstVar = cuuVar.x;
        csm csmVar = cuuVar.q;
        csy csyVar = cuuVar.s;
        this.b = cucVar;
        this.c = cucVar2;
        this.d = croVar;
        this.e = croVar2;
        this.f = j;
        this.g = j2;
        this.h = j3;
        this.m = csuVar;
        this.i = i;
        this.n = cstVar;
        this.j = (csmVar == csm.a || csmVar == csv.b) ? null : csmVar;
        this.k = csyVar;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        csv csvVarC = c();
        csvVarC.d();
        clq.G(true, "refreshAfterWrite requires a LoadingCache");
        this.l = new ctx(new cuu(csvVarC, null));
    }

    private Object readResolve() {
        return this.l;
    }

    final csv c() {
        csv csvVar = new csv();
        cuc cucVar = csvVar.h;
        clq.J(cucVar == null, "Key strength was already set to %s", cucVar);
        cuc cucVar2 = this.b;
        cucVar2.getClass();
        csvVar.h = cucVar2;
        cuc cucVar3 = csvVar.i;
        clq.J(cucVar3 == null, "Value strength was already set to %s", cucVar3);
        cuc cucVar4 = this.c;
        cucVar4.getClass();
        csvVar.i = cucVar4;
        cro croVar = csvVar.m;
        clq.J(croVar == null, "key equivalence was already set to %s", croVar);
        cro croVar2 = this.d;
        croVar2.getClass();
        csvVar.m = croVar2;
        cro croVar3 = csvVar.n;
        clq.J(croVar3 == null, "value equivalence was already set to %s", croVar3);
        cro croVar4 = this.e;
        croVar4.getClass();
        csvVar.n = croVar4;
        int i = csvVar.e;
        clq.H(i == -1, "concurrency level was already set to %s", i);
        int i2 = this.i;
        clq.v(i2 > 0);
        csvVar.e = i2;
        clq.F(csvVar.r == null);
        cst cstVar = this.n;
        cstVar.getClass();
        csvVar.r = cstVar;
        csvVar.c = false;
        long j = this.f;
        if (j > 0) {
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            long j2 = csvVar.j;
            clq.I(j2 == -1, "expireAfterWrite was already set to %s ns", j2);
            csvVar.j = timeUnit.toNanos(j);
        }
        long j3 = this.g;
        if (j3 > 0) {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            long j4 = csvVar.k;
            clq.I(j4 == -1, "expireAfterAccess was already set to %s ns", j4);
            csvVar.k = timeUnit2.toNanos(j3);
        }
        if (this.m != csu.a) {
            csu csuVar = this.m;
            clq.F(csvVar.q == null);
            if (csvVar.c) {
                long j5 = csvVar.f;
                clq.I(j5 == -1, "weigher can not be combined with maximum size (%s provided)", j5);
            }
            csuVar.getClass();
            csvVar.q = csuVar;
            if (this.h != -1) {
                long j6 = csvVar.g;
                clq.I(j6 == -1, "maximum weight was already set to %s", j6);
                long j7 = csvVar.f;
                clq.I(j7 == -1, "maximum size was already set to %s", j7);
                clq.w(true, "maximum weight must not be negative");
                csvVar.g = 0L;
            }
        } else if (this.h != -1) {
            long j8 = csvVar.f;
            clq.I(j8 == -1, "maximum size was already set to %s", j8);
            long j9 = csvVar.g;
            clq.I(j9 == -1, "maximum weight was already set to %s", j9);
            clq.G(csvVar.q == null, "maximum size can not be combined with weigher");
            clq.w(true, "maximum size must not be negative");
            csvVar.f = 0L;
        }
        csm csmVar = this.j;
        if (csmVar != null) {
            clq.F(csvVar.o == null);
            csvVar.o = csmVar;
        }
        return csvVar;
    }

    @Override // defpackage.cwo
    protected final /* synthetic */ Object d() {
        return this.l;
    }
}
