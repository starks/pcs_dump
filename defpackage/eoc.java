package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eoc {
    public static final eoc a = new eoc(null, eqo.b, false);
    public final eof b;
    public final eqo c;
    public final boolean d;
    private final ebz e = null;

    private eoc(eof eofVar, eqo eqoVar, boolean z) {
        this.b = eofVar;
        eqoVar.getClass();
        this.c = eqoVar;
        this.d = z;
    }

    public static eoc a(eqo eqoVar) {
        clq.w(!eqoVar.g(), "drop status shouldn't be OK");
        return new eoc(null, eqoVar, true);
    }

    public static eoc b(eqo eqoVar) {
        clq.w(!eqoVar.g(), "error status shouldn't be OK");
        return new eoc(null, eqoVar, false);
    }

    public static eoc c(eof eofVar) {
        return new eoc(eofVar, eqo.b, false);
    }

    public final boolean d() {
        return (this.b == null && this.c.g()) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof eoc)) {
            return false;
        }
        eoc eocVar = (eoc) obj;
        if (a.g(this.b, eocVar.b) && a.g(this.c, eocVar.c)) {
            ebz ebzVar = eocVar.e;
            if (a.g(null, null) && this.d == eocVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, null, Boolean.valueOf(this.d)});
    }

    public final String toString() {
        crt crtVarQ = clq.Q(this);
        crtVarQ.e("subchannel", this.b);
        crtVarQ.e("streamTracerFactory", null);
        crtVarQ.e("status", this.c);
        crt crtVarC = crtVarQ.c("drop", this.d);
        crtVarC.e("authority-override", null);
        return crtVarC.toString();
    }
}
