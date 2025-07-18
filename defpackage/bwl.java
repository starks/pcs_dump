package defpackage;

import android.content.Context;
import java.io.Closeable;
import java.security.NoSuchAlgorithmException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bwl implements Closeable, bqm {
    public static final /* synthetic */ int c = 0;
    private static final dfw d;
    final bga a;
    public final cbu b;
    private final bpz e;
    private final bgr f;
    private final String g;
    private final dfa h;
    private final bgk i;
    private final Set j;
    private final cbi k;
    private final fuu l;

    static {
        asr asrVar = (asr) dfw.a.createBuilder();
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        dfw dfwVar = (dfw) asrVar.a;
        dfwVar.b |= 1;
        dfwVar.c = 173000;
        d = (dfw) asrVar.z();
    }

    public bwl(Context context, bpz bpzVar, cbu cbuVar, fuu fuuVar) {
        this.e = bpzVar;
        this.b = cbuVar;
        this.l = fuuVar;
        String packageName = context.getPackageName();
        this.g = packageName;
        if (bpzVar.bD()) {
            List list = bga.n;
            this.a = new bfv(context, "BRELLA", null).a(bgw.c).c();
        } else if (bpzVar.bA()) {
            List list2 = bga.n;
            this.a = new bfv(context, "BRELLA", null).a(bgw.b).c();
        } else {
            List list3 = bga.n;
            this.a = new bfv(context, "BRELLA", null).c();
        }
        this.k = new cbi(context, new cbd(new bwn()));
        if (!bpzVar.aC()) {
            this.f = null;
            this.h = null;
            this.i = null;
            this.j = null;
            return;
        }
        bgr bgrVar = new bgr(this.a, "BRELLA_COUNTERS", bpzVar.D(), bnc.a);
        this.f = bgrVar;
        bga bgaVar = bgrVar.e;
        bgrVar.d.writeLock().lock();
        try {
            bgrVar.f = true;
            bgrVar.d.writeLock().unlock();
            asr asrVar = (asr) dfb.a.createBuilder();
            if (!asrVar.a.isMutable()) {
                asrVar.B();
            }
            dfb.a((dfb) asrVar.a);
            if (packageName != null) {
                if (!asrVar.a.isMutable()) {
                    asrVar.B();
                }
                dfb dfbVar = (dfb) asrVar.a;
                dfbVar.b |= 1;
                dfbVar.c = packageName;
            }
            asr asrVar2 = (asr) dfa.a.createBuilder();
            dfw dfwVar = d;
            if (!asrVar2.a.isMutable()) {
                asrVar2.B();
            }
            dfa dfaVar = (dfa) asrVar2.a;
            dfwVar.getClass();
            dfaVar.f = dfwVar;
            dfaVar.b |= 1024;
            if (!asrVar2.a.isMutable()) {
                asrVar2.B();
            }
            dfa dfaVar2 = (dfa) asrVar2.a;
            dfb dfbVar2 = (dfb) asrVar.z();
            dfbVar2.getClass();
            dfaVar2.c = dfbVar2;
            dfaVar2.b |= 1;
            this.h = (dfa) asrVar2.z();
            this.i = new bgk(bpzVar.C());
            this.j = new HashSet(bpzVar.ax());
        } catch (Throwable th) {
            bgrVar.d.writeLock().unlock();
            throw th;
        }
    }

    private final void e(int i, String str) {
        asr asrVar = (asr) dfd.a.createBuilder();
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        long j = i;
        dfd dfdVar = (dfd) asrVar.a;
        dfdVar.b |= 1;
        dfdVar.c = j;
        asr asrVar2 = (asr) dfa.a.createBuilder();
        if (!asrVar2.a.isMutable()) {
            asrVar2.B();
        }
        dfa dfaVar = (dfa) asrVar2.a;
        dfd dfdVar2 = (dfd) asrVar.z();
        dfdVar2.getClass();
        dfaVar.e = dfdVar2;
        dfaVar.b |= 64;
        m(asrVar2, this.g);
    }

    private final void m(asr asrVar, String str) {
        dfw dfwVar = d;
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        dfa dfaVar = (dfa) asrVar.a;
        dfa dfaVar2 = dfa.a;
        dfwVar.getClass();
        dfaVar.f = dfwVar;
        dfaVar.b |= 1024;
        dfb dfbVar = ((dfa) asrVar.a).c;
        if (dfbVar == null) {
            dfbVar = dfb.a;
        }
        asr asrVar2 = (asr) dfbVar.toBuilder();
        if (!asrVar2.a.isMutable()) {
            asrVar2.B();
        }
        dfb.a((dfb) asrVar2.a);
        if (str != null) {
            dfb dfbVar2 = ((dfa) asrVar.a).c;
            if (dfbVar2 == null) {
                dfbVar2 = dfb.a;
            }
            if (dfbVar2.c.isEmpty()) {
                if (!asrVar2.a.isMutable()) {
                    asrVar2.B();
                }
                dfb dfbVar3 = (dfb) asrVar2.a;
                dfbVar3.b |= 1;
                dfbVar3.c = str;
            }
        }
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        dfa dfaVar3 = (dfa) asrVar.a;
        dfb dfbVar4 = (dfb) asrVar2.z();
        dfbVar4.getClass();
        dfaVar3.c = dfbVar4;
        dfaVar3.b |= 1;
        dfa dfaVar4 = (dfa) asrVar.z();
        bfx bfxVarF = this.a.f(dfaVar4);
        bfxVarF.m = this.k;
        bfxVarF.c();
        fuu fuuVar = this.l;
        if (fuuVar != null) {
            bwm.a((Context) fuuVar.a, dfaVar4);
        }
    }

    public final void a(String str, dfa dfaVar, long j) {
        Object objA;
        bgr bgrVar = this.f;
        if (bgrVar == null) {
            return;
        }
        if (dfaVar == null) {
            dfaVar = this.h;
        }
        bgk bgkVar = this.j.contains(str) ? bgr.m : this.i;
        fuu fuuVar = new fuu(bgrVar);
        bgrVar.d.writeLock().lock();
        try {
            bgh bghVar = (bgh) bgrVar.j.get(str);
            if (bghVar == null) {
                Object obj = fuuVar.a;
                cfp cfpVar = new cfp((bgr) obj, str, bgkVar, 1);
                ((bgr) obj).d.writeLock().lock();
                try {
                    objA = cfpVar.a();
                    ((bgr) obj).j.put(str, objA);
                    ((bgr) obj).d.writeLock().unlock();
                } catch (Throwable th) {
                    ((bgr) obj).d.writeLock().unlock();
                    throw th;
                }
            } else {
                try {
                    bgi bgiVar = (bgi) bghVar;
                    if (!bgkVar.equals(bgiVar.g)) {
                        throw new IllegalArgumentException("alias mismatch: " + str);
                    }
                    objA = bgiVar;
                } catch (ClassCastException e) {
                    throw new IllegalArgumentException("another type of counter exists with name: " + str, e);
                }
            }
            bgrVar.d.writeLock().unlock();
            final bgp bgpVar = (bgp) objA;
            bgm bgmVar = (dfaVar == null || dfaVar == eel.a) ? bgr.a : new bgm(dfaVar);
            long j2 = bgpVar.g.a;
            long j3 = j / j2;
            if (bgmVar == null) {
                bgmVar = bgr.a;
            }
            final long j4 = j2 * j3;
            crp crpVar = new crp() { // from class: bgg
                public final /* synthetic */ long c = 1;

                @Override // defpackage.crp
                public final Object a(Object obj2) {
                    long j5 = j4;
                    bgm bgmVar2 = (bgm) obj2;
                    bgh bghVar2 = bgpVar;
                    synchronized (bghVar2.b) {
                        nz nzVar = (nz) bghVar2.c.get(bgmVar2);
                        if (nzVar == null) {
                            nzVar = new nz();
                            bghVar2.c.put(bgmVar2, nzVar);
                        }
                        int i = bghVar2.d;
                        bgr bgrVar2 = bghVar2.f;
                        boolean z = false;
                        if (i >= bgrVar2.c && !bgrVar2.f) {
                            return false;
                        }
                        bghVar2.d = i + 1;
                        long[] jArr = (long[]) nzVar.c(j5);
                        if (jArr == null) {
                            nzVar.f(j5, new long[]{1});
                        } else {
                            jArr[0] = jArr[0] + 1;
                        }
                        if (bghVar2.f.f && bghVar2.d >= bghVar2.e) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    }
                }
            };
            aso.F(bgmVar);
            if (bgr.b.equals(bgmVar)) {
                bgmVar = bgpVar.f.k;
            }
            ReentrantReadWriteLock.ReadLock lock = bgpVar.f.d.readLock();
            lock.lock();
            try {
                if (!bgpVar.f.l.contains(bgmVar)) {
                    lock.unlock();
                    ReentrantReadWriteLock.WriteLock writeLock = bgpVar.f.d.writeLock();
                    writeLock.lock();
                    lock.lock();
                    try {
                        bgpVar.f.l.add(bgmVar);
                        writeLock.unlock();
                    } catch (Throwable th2) {
                        writeLock.unlock();
                        throw th2;
                    }
                }
                boolean zBooleanValue = ((Boolean) crpVar.a(bgmVar)).booleanValue();
                Future future = bgpVar.f.h;
                if (zBooleanValue) {
                    bgpVar.f.b();
                }
                int i = bgpVar.f.g;
            } finally {
                lock.unlock();
            }
        } catch (Throwable th3) {
            bgrVar.d.writeLock().unlock();
            throw th3;
        }
    }

    @Override // defpackage.bqm
    public final bqj b(bql bqlVar, dfa dfaVar) {
        return new bwk(this, bqlVar.name(), dfaVar, this.b.b(), 0);
    }

    @Override // defpackage.bqm
    public final dfa c(dfa dfaVar) {
        dfa dfaVar2 = this.h;
        if (dfaVar2 == null) {
            return dfaVar;
        }
        asr asrVar = (asr) dfaVar2.toBuilder();
        asrVar.C(dfaVar);
        return (dfa) asrVar.z();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws NoSuchAlgorithmException {
        d();
    }

    @Override // defpackage.bqm
    public final void d() throws NoSuchAlgorithmException {
        bgr bgrVar = this.f;
        if (bgrVar != null) {
            bgrVar.b();
        }
    }

    @Override // defpackage.bqm
    public final void f(bqk bqkVar, dfa dfaVar, long j) {
        a(bqkVar.name(), dfaVar, j);
    }

    @Override // defpackage.bqm
    public final void g(dyw dywVar, dfa dfaVar, long j) {
        a(dywVar.name(), dfaVar, j);
    }

    @Override // defpackage.bqm
    public final void h(ccd ccdVar) {
        if (this.e.bb() && this.e.ba()) {
            e(ccdVar.a(), null);
        }
    }

    @Override // defpackage.bqm
    public final void i(ccd ccdVar, String str) {
        throw null;
    }

    @Override // defpackage.bqm
    public final void j(dfa dfaVar) {
        if (dfaVar == null) {
            return;
        }
        m((asr) dfaVar.toBuilder(), this.g);
    }

    @Override // defpackage.bqm
    public final void k(int i) {
        if (this.e.bb()) {
            e(ccj.a(i), null);
        }
    }

    @Override // defpackage.bqm
    public final void l(int i, String str) {
        throw null;
    }
}
