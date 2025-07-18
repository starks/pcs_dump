package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class csj implements Serializable, csg {
    private static final long serialVersionUID = 0;
    public final Object a;

    public csj(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.csg
    public final Object a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof csj) {
            return a.g(this.a, ((csj) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        return "Suppliers.ofInstance(" + this.a.toString() + ")";
    }
}
