package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class crd extends cru {
    public static final crd a = new crd();
    private static final long serialVersionUID = 0;

    private crd() {
    }

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.cru
    public final Object a() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // defpackage.cru
    public final Object b() {
        return null;
    }

    @Override // defpackage.cru
    public final boolean c() {
        return false;
    }

    @Override // defpackage.cru
    public final boolean equals(Object obj) {
        return obj == this;
    }

    @Override // defpackage.cru
    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
