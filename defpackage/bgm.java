package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bgm {
    final egi a;

    public bgm() {
        this.a = null;
    }

    public final boolean equals(Object obj) {
        egi egiVar;
        if (this == obj) {
            return true;
        }
        return (obj instanceof bgm) && (egiVar = this.a) != null && egiVar.equals(((bgm) obj).a);
    }

    public final int hashCode() {
        aso.C(!bgr.b.equals(this));
        if (bgr.a.equals(this)) {
            return 0;
        }
        egi egiVar = this.a;
        aso.F(egiVar);
        return egiVar.hashCode();
    }

    public final String toString() {
        if (bgr.b.equals(this)) {
            return "$use_sticky_dims$";
        }
        if (bgr.a.equals(this)) {
            return "$no_dims$";
        }
        egi egiVar = this.a;
        aso.F(egiVar);
        return egiVar.toString();
    }

    public bgm(egi egiVar) {
        this.a = egiVar;
    }
}
