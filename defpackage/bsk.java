package defpackage;

import android.view.MenuItem;
import com.google.android.gms.learning.dynamite.training.BrellaInvocationImpl;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class bsk implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ bsk(BrellaInvocationImpl brellaInvocationImpl, bpz bpzVar, bqm bqmVar, bpy bpyVar, int i) {
        this.e = i;
        this.a = brellaInvocationImpl;
        this.b = bpzVar;
        this.c = bqmVar;
        this.d = bpyVar;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.view.MenuItem, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [bqm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v19, types: [fbe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [bpz, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i = this.e;
        if (i == 0) {
            Object obj = this.d;
            ?? r1 = this.c;
            ((BrellaInvocationImpl) this.a).b(this.b, r1, (bpy) obj);
            return;
        }
        if (i == 1) {
            Object obj2 = this.b;
            if (obj2 != null) {
                ((ey) this.d).a.f = true;
                ((ff) ((cgm) obj2).c).i(false);
                ((ey) this.d).a.f = false;
            }
            ?? r0 = this.a;
            if (r0.isEnabled() && r0.hasSubMenu()) {
                ((ff) this.c).z(r0, 4);
                return;
            }
            return;
        }
        if (i == 2) {
            ((czl) ((czl) cev.a.a((Level) this.c).h((Throwable) this.b)).i("com/google/android/libraries/phenotype/client/Phlogger", "logInternal", 49, "Phlogger.java")).u((String) this.d, (Object[]) this.a);
            return;
        }
        if (i == 3) {
            Object obj3 = this.d;
            Object obj4 = this.a;
            ((esu) this.c).f((eqo) this.b, (etx) obj4, (epc) obj3);
            return;
        }
        if (i == 4) {
            Object obj5 = this.d;
            Object obj6 = this.c;
            ((euu) this.a).a.a((eqo) this.b, (etx) obj6, (epc) obj5);
            return;
        }
        if (i == 5) {
            ((ezv) this.a).A = true;
            Object obj7 = this.d;
            Object obj8 = this.c;
            ((ezv) this.a).w.a((eqo) this.b, (etx) obj8, (epc) obj7);
            return;
        }
        synchronized (this.c) {
            if (((fbd) this.d).b == 0) {
                try {
                    this.b.b(this.a);
                    ((fbf) this.c).b.remove(this.b);
                    if (((fbf) this.c).b.isEmpty()) {
                        ((fbf) this.c).c.shutdown();
                        ((fbf) this.c).c = null;
                    }
                } catch (Throwable th) {
                    ((fbf) this.c).b.remove(this.b);
                    if (((fbf) this.c).b.isEmpty()) {
                        ((fbf) this.c).c.shutdown();
                        ((fbf) this.c).c = null;
                    }
                    throw th;
                }
            }
        }
    }

    public bsk(esu esuVar, eqo eqoVar, etx etxVar, epc epcVar, int i) {
        this.e = i;
        this.b = eqoVar;
        this.a = etxVar;
        this.d = epcVar;
        this.c = esuVar;
    }

    public bsk(ey eyVar, cgm cgmVar, MenuItem menuItem, ff ffVar, int i) {
        this.e = i;
        this.d = eyVar;
        this.b = cgmVar;
        this.a = menuItem;
        this.c = ffVar;
    }

    public bsk(fbf fbfVar, fbd fbdVar, fbe fbeVar, Object obj, int i) {
        this.e = i;
        this.d = fbdVar;
        this.b = fbeVar;
        this.a = obj;
        this.c = fbfVar;
    }

    public bsk(Object obj, eqo eqoVar, etx etxVar, epc epcVar, int i) {
        this.e = i;
        this.b = eqoVar;
        this.c = etxVar;
        this.d = epcVar;
        this.a = obj;
    }

    public /* synthetic */ bsk(Level level, Throwable th, String str, Object[] objArr, int i) {
        this.e = i;
        this.c = level;
        this.b = th;
        this.d = str;
        this.a = objArr;
    }
}
