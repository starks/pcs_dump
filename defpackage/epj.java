package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class epj {
    public final eqo a;
    public final Object b;

    public epj(Object obj) {
        this.b = obj;
        this.a = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            epj epjVar = (epj) obj;
            if (a.g(this.a, epjVar.a) && a.g(this.b, epjVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        if (this.b != null) {
            crt crtVarQ = clq.Q(this);
            crtVarQ.e("config", this.b);
            return crtVarQ.toString();
        }
        crt crtVarQ2 = clq.Q(this);
        crtVarQ2.e("error", this.a);
        return crtVarQ2.toString();
    }

    public epj(eqo eqoVar) {
        this.b = null;
        this.a = eqoVar;
        clq.A(!eqoVar.g(), "cannot use OK status: %s", eqoVar);
    }
}
