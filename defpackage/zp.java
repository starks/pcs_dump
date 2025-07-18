package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class zp implements yx {
    private final /* synthetic */ int a;
    private final Object b;

    public zp(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, yr] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object, yr] */
    @Override // defpackage.yx
    public final void g(yz yzVar, yu yuVar) {
        yr[] yrVarArr;
        int i = this.a;
        if (i == 0) {
            if (yuVar != yu.ON_CREATE) {
                Objects.toString(yuVar);
                throw new IllegalStateException("Next event must be ON_CREATE, it was ".concat(yuVar.toString()));
            }
            yzVar.E().c(this);
            ((zt) this.b).b();
            return;
        }
        if (i != 1) {
            this.b.a();
            this.b.a();
            return;
        }
        new up();
        int i2 = 0;
        while (true) {
            yrVarArr = (yr[]) this.b;
            if (i2 >= yrVarArr.length) {
                break;
            }
            yrVarArr[i2].a();
            i2++;
        }
        for (yr yrVar : yrVarArr) {
            yrVar.a();
        }
    }
}
