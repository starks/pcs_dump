package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class crq implements Serializable, crp {
    private static final long serialVersionUID = 0;
    private final Object a = null;

    @Override // defpackage.crp
    public final Object a(Object obj) {
        return null;
    }

    @Override // defpackage.crp
    public final boolean equals(Object obj) {
        if (!(obj instanceof crq)) {
            return false;
        }
        Object obj2 = ((crq) obj).a;
        return a.g(null, null);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return "Functions.constant(null)";
    }
}
