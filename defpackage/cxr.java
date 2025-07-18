package defpackage;

import java.util.Arrays;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cxr extends cxm {
    private final Comparator e;

    public cxr(Comparator comparator) {
        comparator.getClass();
        this.e = comparator;
    }

    @Override // defpackage.cxm, defpackage.cws, defpackage.cwt
    public final /* synthetic */ void c(Object obj) {
        super.c(obj);
    }

    @Override // defpackage.cxm
    /* renamed from: g */
    public final /* synthetic */ cxm c(Object obj) {
        super.c(obj);
        return this;
    }

    @Override // defpackage.cxm
    public final /* synthetic */ cxm h(cxm cxmVar) {
        super.h(cxmVar);
        return this;
    }

    @Override // defpackage.cxm
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final cxt i() {
        cyw cywVar;
        Object[] objArrCopyOf = this.a;
        int i = this.b;
        Comparator comparator = this.e;
        if (i == 0) {
            cywVar = cxt.x(comparator);
        } else {
            dcr.n(objArrCopyOf, i);
            Arrays.sort(objArrCopyOf, 0, i, comparator);
            int i2 = 1;
            for (int i3 = 1; i3 < i; i3++) {
                Object obj = objArrCopyOf[i3];
                if (comparator.compare(obj, objArrCopyOf[i2 - 1]) != 0) {
                    objArrCopyOf[i2] = obj;
                    i2++;
                }
            }
            Arrays.fill(objArrCopyOf, i2, i, (Object) null);
            if (i2 < (objArrCopyOf.length >> 1)) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i2);
            }
            cywVar = new cyw(cxc.l(objArrCopyOf, i2), comparator);
        }
        this.b = cywVar.size();
        this.c = true;
        return cywVar;
    }

    public final void m(Object obj) {
        super.c(obj);
    }

    public final void n(Object... objArr) {
        super.j(objArr);
    }
}
