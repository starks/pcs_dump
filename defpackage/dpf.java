package defpackage;

import j$.util.Objects;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dpf extends dte {
    public static final Set a = (Set) dso.a(new dng(10));
    public final dpb b;
    public final dpc c;
    public final dpd d;
    public final dpe e;
    public final dli f;
    public final dwt g;

    public dpf(dpb dpbVar, dpc dpcVar, dpd dpdVar, dli dliVar, dpe dpeVar, dwt dwtVar) {
        this.b = dpbVar;
        this.c = dpcVar;
        this.d = dpdVar;
        this.f = dliVar;
        this.e = dpeVar;
        this.g = dwtVar;
    }

    @Override // defpackage.dli
    public final boolean a() {
        return this.e != dpe.c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dpf)) {
            return false;
        }
        dpf dpfVar = (dpf) obj;
        return Objects.equals(dpfVar.b, this.b) && Objects.equals(dpfVar.c, this.c) && Objects.equals(dpfVar.d, this.d) && Objects.equals(dpfVar.f, this.f) && Objects.equals(dpfVar.e, this.e) && Objects.equals(dpfVar.g, this.g);
    }

    public final int hashCode() {
        return Objects.hash(dpf.class, this.b, this.c, this.d, this.f, this.e, this.g);
    }

    public final String toString() {
        return String.format("EciesParameters(curveType=%s, hashType=%s, pointFormat=%s, demParameters=%s, variant=%s, salt=%s)", this.b, this.c, this.d, this.f, this.e, this.g);
    }
}
