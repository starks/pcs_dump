package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class bsr implements csg {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ bsr(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [csg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [csg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [csg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [csg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [csg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v27, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v28, types: [csg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v35, types: [csg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v50, types: [csg, java.lang.Object] */
    @Override // defpackage.csg
    public final Object a() {
        int i = 7;
        int i2 = 0;
        switch (this.b) {
            case 0:
                return Boolean.valueOf(((AtomicBoolean) this.a).get());
            case 1:
                Object obj = this.a;
                Context context = (Context) obj;
                ceu.f(context);
                return new bnz(obj, uo.n(context));
            case 2:
                Context context2 = cem.a;
                dpa dpaVar = new dpa(null, null);
                dpaVar.f = this.a;
                dpaVar.f.getClass();
                if (dpaVar.c == null) {
                    dpaVar.c = cem.b;
                }
                if (dpaVar.b == null) {
                    dpaVar.b = clq.t(new bsr(dpaVar.f, 3));
                }
                if (dpaVar.d == null) {
                    dpaVar.d = new bsr(dpaVar, 6);
                }
                if (dpaVar.e == null) {
                    Object obj2 = dpaVar.f;
                    ArrayList arrayList = new ArrayList();
                    Collections.addAll(arrayList, new cho(new fpf((Context) obj2)), new chs());
                    dpaVar.e = clq.t(new bsr(arrayList, 4));
                }
                if (dpaVar.a == null) {
                    dpaVar.a = new bsr(dpaVar, i);
                }
                return new cem((Context) dpaVar.f, dpaVar.c, dpaVar.b, dpaVar.d, dpaVar.e, dpaVar.a);
            case 3:
                Context context3 = cem.a;
                return new brb(new byw((Context) this.a));
            case 4:
                Context context4 = cem.a;
                return new fcy((List) this.a);
            case 5:
                Context context5 = cem.a;
                return (cgm) ((cru) this.a.a()).b();
            case 6:
                return cru.d(new cgm(((dpa) this.a).c));
            case 7:
                Object obj3 = ((dpa) this.a).f;
                Context context6 = cem.a;
                try {
                    return cru.d(((Context) obj3).getPackageManager().getApplicationInfo("com.google.android.gms", 0));
                } catch (PackageManager.NameNotFoundException unused) {
                    return crd.a;
                }
            case 8:
                int i3 = ceu.d;
                return ceh.a((Context) this.a);
            case 9:
                Object obj4 = this.a;
                chi chiVar = (chi) obj4;
                dke dkeVar = (dke) chiVar.e.a();
                dkeVar.getClass();
                brb brbVar = (brb) chiVar.d.a();
                brbVar.getClass();
                djy djyVarI = dij.i(dhq.i(djr.q(brbVar.y()), cfe.class, new bre(i), dkeVar), new arl(obj4, 17), dkeVar);
                djyVarI.c(new chg(djyVarI, i2), dkeVar);
                return djyVarI;
            default:
                dke dkeVar2 = (dke) this.a.a();
                dkeVar2.getClass();
                return dkeVar2.schedule(new chh(0), 10000L, TimeUnit.MILLISECONDS);
        }
    }
}
