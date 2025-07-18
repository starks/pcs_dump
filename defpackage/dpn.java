package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dpn extends dte {
    public final dpl a;
    public final dpk b;
    public final dpi c;
    public final dpm d;

    public dpn(dpl dplVar, dpk dpkVar, dpi dpiVar, dpm dpmVar) {
        this.a = dplVar;
        this.b = dpkVar;
        this.c = dpiVar;
        this.d = dpmVar;
    }

    @Override // defpackage.dli
    public final boolean a() {
        return this.d != dpm.c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dpn)) {
            return false;
        }
        dpn dpnVar = (dpn) obj;
        return this.a == dpnVar.a && this.b == dpnVar.b && this.c == dpnVar.c && this.d == dpnVar.d;
    }

    public final int hashCode() {
        return Objects.hash(dpn.class, this.a, this.b, this.c, this.d);
    }
}
