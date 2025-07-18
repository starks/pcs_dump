package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class epm {
    public final eqq a;
    public final elp b;
    public final epj c;

    public epm(eqq eqqVar, elp elpVar, epj epjVar) {
        this.a = eqqVar;
        elpVar.getClass();
        this.b = elpVar;
        this.c = epjVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof epm)) {
            return false;
        }
        epm epmVar = (epm) obj;
        return a.g(this.a, epmVar.a) && a.g(this.b, epmVar.b) && a.g(this.c, epmVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public final String toString() {
        crt crtVarQ = clq.Q(this);
        crtVarQ.e("addressesOrError", this.a.toString());
        crtVarQ.e("attributes", this.b);
        crtVarQ.e("serviceConfigOrError", this.c);
        return crtVarQ.toString();
    }
}
