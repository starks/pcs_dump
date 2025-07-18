package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class enz extends eog {
    private final eoc a;

    public enz(eoc eocVar) {
        eocVar.getClass();
        this.a = eocVar;
    }

    @Override // defpackage.eog
    public final eoc a(eod eodVar) {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof enz) {
            return this.a.equals(((enz) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FixedResultPicker(" + this.a.toString() + ")";
    }
}
