package defpackage;

import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class czk extends czt implements dab {
    protected czk(Level level) {
        super(level);
    }

    @Override // defpackage.czt
    protected final ddg a() {
        return dde.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10, types: [dam] */
    /* JADX WARN: Type inference failed for: r10v11, types: [daj] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7, types: [daj] */
    /* JADX WARN: Type inference failed for: r4v14, types: [daj] */
    @Override // defpackage.czt
    protected final boolean b(czx czxVar) {
        int iA;
        int i;
        czg czgVar;
        ?? r10;
        dbg dbgVarJ = j();
        int iB = dbgVarJ.b();
        int i2 = 0;
        while (true) {
            if (i2 >= iB) {
                break;
            }
            if (dbgVarJ.c(i2).a != "eye3tag") {
                i2++;
            } else if (dbgVarJ.d(czr.a) == null && dbgVarJ.d(czr.i) == null) {
                n(czr.i, dao.SMALL);
            }
        }
        czs czsVar = this.c;
        if (czsVar != null) {
            if (czxVar != null) {
                daj dajVarB = czj.b(czsVar, czxVar, this.b);
                czs czsVar2 = this.c;
                czy czyVar = czg.a;
                if (((Integer) czsVar2.d(czr.b)) == null) {
                    czgVar = null;
                } else {
                    czg czgVar2 = (czg) czg.a.b(czxVar, czsVar2);
                    AtomicLong atomicLong = czgVar2.b;
                    czgVar = czgVar2;
                    if (atomicLong.incrementAndGet() < r5.intValue()) {
                        czgVar = czg.c;
                    }
                }
                daj dajVarC = daj.c(dajVarB, czgVar);
                czs czsVar3 = this.c;
                czy czyVar2 = dam.a;
                Integer num = (Integer) czsVar3.d(czr.c);
                if (num == null || num.intValue() <= 0) {
                    r10 = 0;
                } else {
                    r10 = (dam) dam.a.b(czxVar, czsVar3);
                    if ((((Random) dam.b.get()).nextInt(num.intValue()) == 0 ? r10.e.incrementAndGet() : r10.e.get()) <= 0) {
                        r10 = dam.c;
                    }
                }
                daj dajVarC2 = daj.c(dajVarC, r10);
                this.d = dajVarC2;
                if (dajVarC2 == daj.c) {
                    return false;
                }
            }
            dao daoVar = (dao) this.c.d(czr.i);
            if (daoVar != null) {
                dae daeVar = czr.i;
                czs czsVar4 = this.c;
                if (czsVar4 != null && (iA = czsVar4.a(daeVar)) >= 0) {
                    int i3 = iA + iA;
                    int i4 = i3 + 2;
                    while (true) {
                        i = czsVar4.b;
                        if (i4 >= i + i) {
                            break;
                        }
                        Object obj = czsVar4.a[i4];
                        if (!obj.equals(daeVar)) {
                            Object[] objArr = czsVar4.a;
                            objArr[i3] = obj;
                            objArr[i3 + 1] = objArr[i4 + 1];
                            i3 += 2;
                        }
                        i4 += 2;
                    }
                    czsVar4.b = i - ((i4 - i3) >> 1);
                    while (i3 < i4) {
                        czsVar4.a[i3] = null;
                        i3++;
                    }
                }
                Throwable th = (Throwable) j().d(czr.a);
                int i5 = daoVar.f;
                ddm ddmVar = ddj.a;
                if (i5 <= 0 && i5 != -1) {
                    throw new IllegalArgumentException("invalid maximum depth: 0");
                }
                n(czr.a, new czz(th, daoVar, ddj.a.b(czt.class, i5)));
            }
        }
        return true;
    }
}
