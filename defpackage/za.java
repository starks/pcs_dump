package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class za extends yw {
    public static final up b = new up(null);
    private final WeakReference d;
    private int e;
    private boolean f;
    private boolean g;
    private nd c = new nd();
    public yv a = yv.INITIALIZED;
    private final ArrayList h = new ArrayList();
    private final fui i = fjs.r(yv.INITIALIZED);

    public za(yz yzVar) {
        this.d = new WeakReference(yzVar);
    }

    private final yv f(yy yyVar) {
        nd ndVar = this.c;
        yv yvVar = null;
        ng ngVar = ndVar.c(yyVar) ? ((ng) ndVar.a.get(yyVar)).d : null;
        Object obj = ngVar != null ? ((ays) ngVar.b).a : null;
        if (!this.h.isEmpty()) {
            yvVar = (yv) this.h.get(r0.size() - 1);
        }
        return up.c(up.c(this.a, (yv) obj), yvVar);
    }

    private final void g(yv yvVar) {
        if (this.a == yvVar) {
            return;
        }
        yz yzVar = (yz) this.d.get();
        yv yvVar2 = this.a;
        yvVar2.getClass();
        yvVar.getClass();
        if (yvVar2 == yv.INITIALIZED && yvVar == yv.DESTROYED) {
            throw new IllegalStateException("State must be at least '" + yv.CREATED + "' to be moved to '" + yvVar + "' in component " + yzVar);
        }
        if (yvVar2 == yv.DESTROYED && yvVar2 != yvVar) {
            throw new IllegalStateException("State is '" + yv.DESTROYED + "' and cannot be moved to `" + yvVar + "` in component " + yzVar);
        }
        this.a = yvVar;
        if (this.f || this.e != 0) {
            this.g = true;
            return;
        }
        this.f = true;
        j();
        this.f = false;
        if (this.a == yv.DESTROYED) {
            this.c = new nd();
        }
    }

    private final void h() {
        this.h.remove(r1.size() - 1);
    }

    private final void i(yv yvVar) {
        this.h.add(yvVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
    
        r6.g = false;
        r6.i.k(r6.a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void j() {
        /*
            Method dump skipped, instructions count: 347
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.za.j():void");
    }

    private static final void k(String str) {
        if (!mz.a().c()) {
            throw new IllegalStateException(a.z(str, "Method ", " must be called on the main thread"));
        }
    }

    @Override // defpackage.yw
    public final yv a() {
        return this.a;
    }

    @Override // defpackage.yw
    public final void b(yy yyVar) {
        Object obj;
        yz yzVar;
        yyVar.getClass();
        k("addObserver");
        ays aysVar = new ays(yyVar, this.a == yv.DESTROYED ? yv.DESTROYED : yv.INITIALIZED);
        nd ndVar = this.c;
        ng ngVarA = ndVar.a(yyVar);
        if (ngVarA != null) {
            obj = ngVarA.b;
        } else {
            ndVar.a.put(yyVar, ndVar.d(yyVar, aysVar));
            obj = null;
        }
        if (((ays) obj) == null && (yzVar = (yz) this.d.get()) != null) {
            boolean z = this.e != 0 || this.f;
            yv yvVarF = f(yyVar);
            this.e++;
            while (((yv) aysVar.a).compareTo(yvVarF) < 0 && this.c.c(yyVar)) {
                i((yv) aysVar.a);
                yu yuVarA = yt.a((yv) aysVar.a);
                if (yuVarA == null) {
                    Object obj2 = aysVar.a;
                    Objects.toString(obj2);
                    throw new IllegalStateException("no event up from ".concat(String.valueOf(obj2)));
                }
                aysVar.c(yzVar, yuVarA);
                h();
                yvVarF = f(yyVar);
            }
            if (!z) {
                j();
            }
            this.e--;
        }
    }

    @Override // defpackage.yw
    public final void c(yy yyVar) {
        k("removeObserver");
        this.c.b(yyVar);
    }

    public final void d(yu yuVar) {
        yuVar.getClass();
        k("handleLifecycleEvent");
        g(yuVar.a());
    }

    public final void e(yv yvVar) {
        yvVar.getClass();
        k("setCurrentState");
        g(yvVar);
    }
}
