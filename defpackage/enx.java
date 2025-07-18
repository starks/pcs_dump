package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class enx {
    public final List a;
    public final elp b;
    public final Object[][] c;

    public enx(List list, elp elpVar, Object[][] objArr) {
        list.getClass();
        this.a = list;
        elpVar.getClass();
        this.b = elpVar;
        objArr.getClass();
        this.c = objArr;
    }

    public final String toString() {
        crt crtVarQ = clq.Q(this);
        crtVarQ.e("addrs", this.a);
        crtVarQ.e("attrs", this.b);
        crtVarQ.e("customOptions", Arrays.deepToString(this.c));
        return crtVarQ.toString();
    }
}
