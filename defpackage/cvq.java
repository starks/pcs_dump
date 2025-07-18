package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cvq extends cyj implements Serializable {
    private static final long serialVersionUID = 0;
    final crp a;
    final cyj b;

    public cvq(crp crpVar, cyj cyjVar) {
        this.a = crpVar;
        this.b = cyjVar;
    }

    @Override // defpackage.cyj, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        crp crpVar = this.a;
        return this.b.compare(crpVar.a(obj), crpVar.a(obj2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cvq) {
            cvq cvqVar = (cvq) obj;
            if (this.a.equals(cvqVar.a) && this.b.equals(cvqVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        crp crpVar = this.a;
        return this.b.toString() + ".onResultOf(" + crpVar.toString() + ")";
    }
}
