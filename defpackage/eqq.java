package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eqq {
    private final eqo a;
    private final Object b;

    public eqq(eqo eqoVar, Object obj) {
        this.a = eqoVar;
        this.b = obj;
    }

    public static eqq b(eqo eqoVar) {
        eqoVar.getClass();
        eqq eqqVar = new eqq(eqoVar, null);
        clq.A(!eqoVar.g(), "cannot use OK status: %s", eqoVar);
        return eqqVar;
    }

    public final eqo a() {
        eqo eqoVar = this.a;
        return eqoVar == null ? eqo.b : eqoVar;
    }

    public final Object c() {
        if (this.a == null) {
            return this.b;
        }
        throw new IllegalStateException("No value present.");
    }

    public final boolean d() {
        return this.a == null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof eqq)) {
            return false;
        }
        eqq eqqVar = (eqq) obj;
        if (d() == eqqVar.d()) {
            return d() ? a.g(this.b, eqqVar.b) : a.g(this.a, eqqVar.a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        crt crtVarQ = clq.Q(this);
        eqo eqoVar = this.a;
        if (eqoVar == null) {
            crtVarQ.e("value", this.b);
        } else {
            crtVarQ.e("error", eqoVar);
        }
        return crtVarQ.toString();
    }
}
