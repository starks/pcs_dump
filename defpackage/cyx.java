package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cyx extends cyj implements Serializable {
    private static final long serialVersionUID = 0;
    final cyj a;

    public cyx(cyj cyjVar) {
        this.a = cyjVar;
    }

    @Override // defpackage.cyj, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.a.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cyx) {
            return this.a.equals(((cyx) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString().concat(".reverse()");
    }
}
