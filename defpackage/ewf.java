package defpackage;

import com.google.android.apps.aicore.aidl.AIFeature;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ewf implements Runnable {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ewf(eyo eyoVar, int i, char[] cArr) {
        this.b = i;
        this.a = eyoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                ewn ewnVar = (ewn) ((euy) this.a).a;
                exw exwVar = ewnVar.j;
                ewnVar.t = null;
                ewnVar.j = null;
                exwVar.d(eqo.l.e("InternalSubchannel closed transport due to address change"));
                return;
            case 1:
                if (((ewn) this.a).o.a == emh.IDLE) {
                    ((ewn) this.a).c.a(2, "CONNECTING as requested");
                    ((ewn) this.a).b(emh.CONNECTING);
                    ((ewn) this.a).h();
                    return;
                }
                return;
            case 2:
                ((ewn) this.a).c.a(2, "Terminated");
                ewn ewnVar2 = (ewn) this.a;
                ewnVar2.u.a(ewnVar2);
                return;
            case 3:
                ewl ewlVar = (ewl) this.a;
                ewn ewnVar3 = ewlVar.c;
                ewnVar3.r = null;
                if (ewnVar3.p != null) {
                    clq.G(ewnVar3.n == null, "Unexpected non-null activeTransport");
                    ewl ewlVar2 = (ewl) this.a;
                    ewlVar2.a.d(ewlVar2.c.p);
                    return;
                }
                eui euiVar = ewnVar3.m;
                eui euiVar2 = ewlVar.a;
                if (euiVar == euiVar2) {
                    ewnVar3.n = euiVar2;
                    ((ewl) this.a).c.m = null;
                    ewn ewnVar4 = ((ewl) this.a).c;
                    ewnVar4.q = ewnVar4.g.a();
                    ((ewl) this.a).c.b(emh.READY);
                    return;
                }
                return;
            case 4:
                ewl ewlVar3 = (ewl) this.a;
                ewlVar3.c.k.remove(ewlVar3.a);
                if (((ewl) this.a).c.o.a == emh.SHUTDOWN && ((ewl) this.a).c.k.isEmpty()) {
                    ((ewl) this.a).c.e();
                    return;
                }
                return;
            case 5:
                synchronized (this.a) {
                    if (((ewq) this.a).j != 6) {
                        ((ewq) this.a).j = 6;
                    } else {
                        z = false;
                    }
                }
                if (z) {
                    ((ewq) this.a).k.n();
                    return;
                }
                return;
            case 6:
                synchronized (this.a) {
                    Object obj = this.a;
                    ((ewq) obj).e = null;
                    if (((ewq) obj).j == 2) {
                        Object obj2 = this.a;
                        ((ewq) obj2).j = 4;
                        ((ewq) obj2).d = ((ewq) obj2).b.schedule(((ewq) obj2).f, ((ewq) obj2).i, TimeUnit.NANOSECONDS);
                    } else {
                        Object obj3 = this.a;
                        if (((ewq) obj3).j == 3) {
                            ((ewq) obj3).e = ((ewq) obj3).b.schedule(((ewq) obj3).g, ((ewq) obj3).h - ((ewq) obj3).c.a(TimeUnit.NANOSECONDS), TimeUnit.NANOSECONDS);
                            ((ewq) this.a).j = 2;
                        }
                        z = false;
                    }
                }
                if (z) {
                    ((ewq) this.a).k.o();
                    return;
                }
                return;
            case 7:
                ((exm) this.a).f(true);
                return;
            case 8:
                ((exm) this.a).G.a(2, "Entering SHUTDOWN state");
                ((exm) this.a).p.a(emh.SHUTDOWN);
                return;
            case 9:
                exm exmVar = (exm) this.a;
                if (exmVar.t == null) {
                    return;
                }
                exmVar.j(true);
                exmVar.y.b(null);
                exmVar.G.a(2, "Entering IDLE state");
                exmVar.p.a(emh.IDLE);
                evz evzVar = exmVar.Q;
                Object[] objArr = {exmVar.x, exmVar.y};
                for (int i = 0; i < 2; i++) {
                    if (evzVar.a.contains(objArr[i])) {
                        exmVar.g();
                        return;
                    }
                }
                return;
            case 10:
                exm exmVar2 = ((exd) this.a).b;
                exmVar2.m.c();
                if (exmVar2.s) {
                    exmVar2.r.b();
                    return;
                }
                return;
            case 11:
                exi exiVar = (exi) this.a;
                if (exiVar.c.w == null) {
                    if (exiVar.a.get() == exm.e) {
                        ((exi) this.a).a.set(null);
                    }
                    ((exi) this.a).c.z.a(exm.b);
                    return;
                }
                return;
            case 12:
                ((exi) this.a).c.g();
                return;
            case 13:
                Object obj4 = this.a;
                Collection collection = ((exh) obj4).f.c.w;
                if (collection != null) {
                    collection.remove(obj4);
                    if (((exh) this.a).f.c.w.isEmpty()) {
                        exm exmVar3 = ((exh) this.a).f.c;
                        exmVar3.Q.c(exmVar3.x, false);
                        exm exmVar4 = ((exh) this.a).f.c;
                        exmVar4.w = null;
                        if (exmVar4.A.get()) {
                            ((exh) this.a).f.c.z.a(exm.b);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 14:
                ((esw) this.a).f.g(exm.c);
                return;
            case 15:
                eyo eyoVar = (eyo) this.a;
                eyoVar.l = null;
                eyoVar.i.d();
                ((eoi) this.a).d();
                return;
            case 16:
                eyo eyoVar2 = (eyo) this.a;
                eyoVar2.k = null;
                if (eyoVar2.i.f()) {
                    ((eoi) this.a).d();
                    return;
                }
                return;
            case 17:
                ((eoi) this.a).d();
                return;
            case 18:
                ((eys) this.a).a.c();
                return;
            case AIFeature.Type.IMAGE_DESCRIPTION /* 19 */:
                ezc ezcVar = (ezc) this.a;
                if (!ezcVar.e) {
                    ezcVar.f = null;
                    return;
                }
                long jA = ezcVar.a();
                Object obj5 = this.a;
                ezc ezcVar2 = (ezc) obj5;
                if (ezcVar2.d - jA > 0) {
                    ezcVar2.f = ezcVar2.a.schedule(new ewf(obj5, 20), ((ezc) this.a).d - jA, TimeUnit.NANOSECONDS);
                    return;
                }
                ezcVar2.e = false;
                ezcVar2.f = null;
                ezcVar2.c.run();
                return;
            default:
                Object obj6 = this.a;
                ((ezc) obj6).b.execute(new ewf(obj6, 19));
                return;
        }
    }

    public ewf(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
