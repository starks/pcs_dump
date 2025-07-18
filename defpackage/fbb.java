package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fbb {
    final eoj a;
    final Object b;

    public fbb(eoj eojVar, Object obj) {
        this.a = eojVar;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            fbb fbbVar = (fbb) obj;
            if (a.g(this.a, fbbVar.a) && a.g(this.b, fbbVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        crt crtVarQ = clq.Q(this);
        crtVarQ.e("provider", this.a);
        crtVarQ.e("config", this.b);
        return crtVarQ.toString();
    }
}
