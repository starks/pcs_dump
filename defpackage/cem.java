package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cem {
    public final Context c;
    public final csg d;
    public final chi e;
    public final csg f;
    public final cgk g;
    public final fpv h = new fpv((byte[]) null);
    private final csg l;
    private final csg m;
    private final csg n;
    private static final Object i = new Object();
    private static final uq o = new uq(null);
    public static Context a = null;
    private static volatile cem j = null;
    private static volatile cem k = null;
    public static final csg b = clq.t(new bzh(2));

    public cem(Context context, csg csgVar, csg csgVar2, csg csgVar3, csg csgVar4, csg csgVar5) {
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        csgVar.getClass();
        csgVar2.getClass();
        csgVar3.getClass();
        csgVar4.getClass();
        csgVar5.getClass();
        csg csgVarT = clq.t(csgVar);
        csg csgVarT2 = clq.t(csgVar2);
        csg csgVarT3 = clq.t(new bsr(csgVar3, 5));
        csg csgVarT4 = clq.t(csgVar4);
        csg csgVarT5 = clq.t(csgVar5);
        this.c = applicationContext;
        this.l = csgVarT;
        this.m = csgVarT2;
        this.d = csgVarT3;
        this.n = csgVarT4;
        this.e = new chi(applicationContext, csgVarT, csgVarT4, csgVarT2);
        this.f = csgVarT5;
        this.g = new cgk(csgVarT3, csgVarT2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static cem a(Context context) {
        boolean z;
        Object applicationContext;
        cem cemVar = j;
        if (cemVar != null) {
            return cemVar;
        }
        Context applicationContext2 = context.getApplicationContext();
        try {
            applicationContext = applicationContext2.getApplicationContext();
        } catch (IllegalStateException unused) {
            z = false;
        }
        if (!(applicationContext instanceof ekj)) {
            throw new IllegalStateException("Given application context does not implement GeneratedComponentManager: ".concat(String.valueOf(String.valueOf(applicationContext.getClass()))));
        }
        try {
            ((cel) cel.class.cast(((ekj) applicationContext).aS())).f();
            z = true;
            synchronized (i) {
                if (j != null) {
                    return j;
                }
                boolean z2 = applicationContext2 instanceof cel;
                if (z2) {
                    ((cel) applicationContext2).f();
                }
                Object objA = new bsr(applicationContext2, 2).a();
                j = (cem) objA;
                if (!z && !z2) {
                    o.m(Level.CONFIG, ((cem) objA).c(), "Application doesn't implement PhenotypeApplication interface, falling back to globally set context. See go/phenotype-flag#process-stable-init for more info.", new Object[0]);
                }
                return (cem) objA;
            }
        } catch (ClassCastException e) {
            throw new IllegalStateException("Failed to get an entry point. Did you mark your interface with @SingletonEntryPoint?", e);
        }
    }

    public static void b(Context context) {
        synchronized (i) {
            if (a != null) {
                return;
            }
            try {
                a = context.getApplicationContext();
            } catch (NullPointerException unused) {
                d();
                o.m(Level.WARNING, (Executor) b.a(), "context.getApplicationContext() yielded NullPointerException", new Object[0]);
            }
        }
    }

    public static void d() {
        ceo.a();
        if (a == null && ceo.a == null) {
            ceo.a = new cen();
        }
    }

    public final dke c() {
        return (dke) this.l.a();
    }

    public final fcy e() {
        return (fcy) this.n.a();
    }

    public final brb f() {
        return (brb) this.m.a();
    }
}
