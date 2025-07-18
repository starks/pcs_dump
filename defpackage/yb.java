package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class yb {
    public static final yb a = new yb();
    private static final ya b = ya.a;

    private yb() {
    }

    public static final void a(ab abVar, String str) {
        abVar.getClass();
        xy xyVar = new xy(abVar, str);
        d(xyVar);
        ya yaVarB = b(abVar);
        if (yaVarB.b.contains(xz.DETECT_FRAGMENT_REUSE) && e(yaVarB, abVar.getClass(), xyVar.getClass())) {
            c(yaVarB, xyVar);
        }
    }

    public static final ya b(ab abVar) {
        while (abVar != null) {
            if (abVar.ab()) {
                abVar.B();
            }
            abVar = abVar.C;
        }
        return b;
    }

    public static final void c(ya yaVar, yg ygVar) {
        ab abVar = ygVar.a;
        String name = abVar.getClass().getName();
        yaVar.b.contains(xz.PENALTY_LOG);
        if (yaVar.b.contains(xz.PENALTY_DEATH)) {
            o oVar = new o(name, ygVar, 15);
            if (!abVar.ab()) {
                oVar.run();
                return;
            }
            Handler handler = abVar.B().l.d;
            if (fjs.c(handler.getLooper(), Looper.myLooper())) {
                oVar.run();
            } else {
                handler.post(oVar);
            }
        }
    }

    public static final void d(yg ygVar) {
        if (ax.X(3)) {
            ygVar.a.getClass().getName();
        }
    }

    public static final boolean e(ya yaVar, Class cls, Class cls2) {
        Set set = (Set) yaVar.c.get(cls.getName());
        if (set == null) {
            return true;
        }
        return (fjs.c(cls2.getSuperclass(), yg.class) || !ffh.O(set, cls2.getSuperclass())) && !set.contains(cls2);
    }
}
