package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cjg {
    public final String a;
    public final cpo b;
    public final Object c;
    public List d;
    public final cjd e;
    public final clq f;
    private final djy g;
    private final cpo h;
    private final cji i;
    private final int j;
    private final fpf k;

    public cjg(cjd cjdVar, cji cjiVar, djy djyVar, byte[] bArr) {
        this(cjdVar, cjiVar, djyVar);
    }

    public final djy a() {
        djy djyVarA;
        csf.b(crc.a);
        if (this.h.c.isDone()) {
            djyVarA = this.e.a();
        } else {
            cqg cqgVarZ = clq.Z("Get ".concat(String.valueOf(this.a)), 1);
            try {
                djy djyVarJ = dij.j(this.h.c(), cqt.b(new bbk(this, 15)), diy.a);
                cqgVarZ.a(djyVarJ);
                cqgVarZ.close();
                djyVarA = djyVarJ;
            } catch (Throwable th) {
                try {
                    cqgVarZ.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        this.i.a();
        cji cjiVar = this.i;
        cnx.D(this.g);
        cjiVar.b();
        return cnx.D(djyVarA);
    }

    public final djy b(crp crpVar, Executor executor) {
        return c(cqt.b(new bbk(crpVar, 13)), executor);
    }

    public final djy c(dis disVar, Executor executor) {
        csf.b(crc.a);
        cqg cqgVarZ = clq.Z("Update ".concat(String.valueOf(this.a)), 1);
        try {
            djy djyVarC = this.h.c();
            this.k.f(new cjb(djyVarC, 3), diy.a);
            djy djyVarF = this.k.f(cqt.a(new cje(this, djyVarC, disVar, executor, 0)), diy.a);
            djyVarF.getClass();
            if (!djyVarC.isDone()) {
                if (djyVarF.isDone()) {
                    cnx.K(djyVarF, djyVarC);
                } else {
                    djl djlVar = new djl(djyVarF, djyVarC, 0);
                    djyVarF.c(djlVar, diy.a);
                    djyVarC.c(djlVar, diy.a);
                }
            }
            this.i.a();
            cji cjiVar = this.i;
            cnx.D(this.g);
            cjiVar.c();
            djy djyVarN = clq.n(djyVarF);
            cqgVarZ.a(djyVarN);
            cqgVarZ.close();
            return djyVarN;
        } finally {
        }
    }

    public final void d(dis disVar) {
        synchronized (this.c) {
            this.d.add(disVar);
        }
    }

    public cjg(cjd cjdVar, cji cjiVar, djy djyVar) {
        this.h = new cpo(new cjf(this), diy.a);
        this.c = new Object();
        this.d = new ArrayList();
        this.e = cjdVar;
        this.i = cjiVar;
        this.g = djyVar;
        this.a = cjdVar.a;
        this.b = new cpo(new cjb(cjdVar, 0), diy.a);
        this.k = new fpf((short[]) null);
        this.j = dhf.b;
        this.f = new clq(null, null, null, null, null);
        d(new bbk(this, 14));
    }
}
