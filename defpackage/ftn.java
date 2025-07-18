package defpackage;

import java.io.IOException;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ftn implements fin {
    final /* synthetic */ ftv a;
    private final fty b;

    public ftn(ftv ftvVar, fty ftyVar) {
        this.a = ftvVar;
        this.b = ftyVar;
    }

    @Override // defpackage.fin
    public final /* bridge */ /* synthetic */ Object a() throws IOException {
        fta ftaVar = fta.c;
        fta ftaVar2 = fta.c;
        try {
            try {
            } catch (IOException e) {
                fta ftaVar3 = fta.b;
                this.a.c(ftaVar3, ftaVar3, e);
            }
            if (!this.b.a(true, this)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            while (this.b.a(false, this)) {
            }
            this.a.c(fta.a, fta.i, null);
            frh.r(this.b);
            return ffz.a;
        } catch (Throwable th) {
            this.a.c(ftaVar, ftaVar2, null);
            frh.r(this.b);
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c4, code lost:
    
        if (r12 == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c6, code lost:
    
        r12.i(defpackage.frh.b, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00cc, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(boolean r12, int r13, defpackage.fvm r14, int r15) throws java.io.EOFException {
        /*
            Method dump skipped, instructions count: 205
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ftn.b(boolean, int, fvm, int):void");
    }

    public final void c(boolean z, int i, int i2) {
        if (!z) {
            ftv ftvVar = this.a;
            ftvVar.j.b(new ftl(String.valueOf(ftvVar.e).concat(" ping"), ftvVar, i, i2), 0L);
            return;
        }
        ftv ftvVar2 = this.a;
        synchronized (ftvVar2) {
            if (i == 1) {
                ftvVar2.n++;
            } else if (i == 2) {
                ftvVar2.p++;
            } else if (i == 3) {
                ftvVar2.q++;
                ftvVar2.notifyAll();
            }
        }
    }

    public final void d(int i, fta ftaVar) {
        ftv ftvVar = this.a;
        if (!ftv.n(i)) {
            fuc fucVarB = ftvVar.b(i);
            if (fucVarB != null) {
                fucVarB.j(ftaVar);
                return;
            }
            return;
        }
        ftvVar.k.b(new ftr(ftvVar.e + "[" + i + "] onReset", ftvVar, i, ftaVar), 0L);
    }

    public final void e(int i, long j) {
        if (i == 0) {
            ftv ftvVar = this.a;
            synchronized (ftvVar) {
                ftvVar.v += j;
                ftvVar.notifyAll();
            }
            return;
        }
        fuc fucVarA = this.a.a(i);
        if (fucVarA != null) {
            synchronized (fucVarA) {
                fucVarA.d(j);
            }
        }
    }

    public final void f(fui fuiVar) {
        long jC;
        int i;
        fuc[] fucVarArr;
        fjx fjxVar = new fjx();
        ftv ftvVar = this.a;
        synchronized (ftvVar.w) {
            synchronized (ftvVar) {
                fui fuiVar2 = ftvVar.t;
                fui fuiVar3 = new fui();
                fuiVar3.e(fuiVar2);
                fuiVar3.e(fuiVar);
                fjxVar.a = fuiVar3;
                jC = ((fui) fjxVar.a).c() - fuiVar2.c();
                fucVarArr = null;
                if (jC == 0) {
                    jC = 0;
                } else if (!ftvVar.d.isEmpty()) {
                    fucVarArr = (fuc[]) ftvVar.d.values().toArray(new fuc[0]);
                }
                fui fuiVar4 = (fui) fjxVar.a;
                fuiVar4.getClass();
                ftvVar.t = fuiVar4;
                ftvVar.l.b(new ftj(ftvVar.e + " onSettings", ftvVar, fjxVar), 0L);
            }
            try {
                ftvVar.w.a((fui) fjxVar.a);
            } catch (IOException e) {
                ftvVar.d(e);
            }
        }
        if (fucVarArr != null) {
            for (fuc fucVar : fucVarArr) {
                synchronized (fucVar) {
                    fucVar.d(jC);
                }
            }
        }
    }

    public final void g(int i, fvn fvnVar) {
        int i2;
        Object[] array;
        fvnVar.b();
        ftv ftvVar = this.a;
        synchronized (ftvVar) {
            array = ftvVar.d.values().toArray(new fuc[0]);
            ftvVar.h = true;
        }
        for (fuc fucVar : (fuc[]) array) {
            if (fucVar.a > i && fucVar.l()) {
                fucVar.j(fta.h);
                this.a.b(fucVar.a);
            }
        }
    }

    public final void h(boolean z, int i, List list) {
        ftv ftvVar = this.a;
        if (ftv.n(i)) {
            ftvVar.k.b(new ftp(ftvVar.e + "[" + i + "] onHeaders", ftvVar, i, list, z), 0L);
            return;
        }
        synchronized (ftvVar) {
            fuc fucVarA = ftvVar.a(i);
            if (fucVarA != null) {
                fucVarA.i(frh.q(list), z);
                return;
            }
            if (ftvVar.h) {
                return;
            }
            if (i <= ftvVar.f) {
                return;
            }
            if ((i & 1) == ftvVar.g % 2) {
                return;
            }
            fuc fucVar = new fuc(i, ftvVar, false, z, frh.q(list));
            ftvVar.f = i;
            ftvVar.d.put(Integer.valueOf(i), fucVar);
            ftvVar.i.a().b(new ftk(ftvVar.e + "[" + i + "] onStream", ftvVar, fucVar), 0L);
        }
    }

    public final void i(int i, List list) {
        ftv ftvVar = this.a;
        synchronized (ftvVar) {
            Set set = ftvVar.y;
            Integer numValueOf = Integer.valueOf(i);
            if (set.contains(numValueOf)) {
                ftvVar.k(i, fta.b);
                return;
            }
            ftvVar.y.add(numValueOf);
            ftvVar.k.b(new ftq(ftvVar.e + "[" + i + "] onRequest", ftvVar, i, list), 0L);
        }
    }

    public final void j(fui fuiVar) {
        ftv ftvVar = this.a;
        ftvVar.j.b(new ftm(String.valueOf(ftvVar.e).concat(" applyAndAckSettings"), this, fuiVar), 0L);
    }
}
