package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class emi {
    public final emh a;
    public final eqo b;

    public emi(emh emhVar, eqo eqoVar) {
        emhVar.getClass();
        this.a = emhVar;
        eqoVar.getClass();
        this.b = eqoVar;
    }

    public static emi a(emh emhVar) {
        clq.w(emhVar != emh.TRANSIENT_FAILURE, "state is TRANSIENT_ERROR. Use forError() instead");
        return new emi(emhVar, eqo.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof emi)) {
            return false;
        }
        emi emiVar = (emi) obj;
        return this.a.equals(emiVar.a) && this.b.equals(emiVar.b);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public final String toString() {
        if (this.b.g()) {
            return this.a.toString();
        }
        emh emhVar = this.a;
        eqo eqoVar = this.b;
        return emhVar.toString() + "(" + eqoVar.toString() + ")";
    }
}
