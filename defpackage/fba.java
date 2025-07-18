package defpackage;

import java.util.Arrays;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fba {
    public final String a;
    public final Map b;

    public fba(String str, Map map) {
        str.getClass();
        this.a = str;
        map.getClass();
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof fba) {
            fba fbaVar = (fba) obj;
            if (this.a.equals(fbaVar.a) && this.b.equals(fbaVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        crt crtVarQ = clq.Q(this);
        crtVarQ.e("policyName", this.a);
        crtVarQ.e("rawConfigValue", this.b);
        return crtVarQ.toString();
    }
}
