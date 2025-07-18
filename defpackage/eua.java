package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eua {
    public String a = "unknown-authority";
    public elp b = elp.a;
    public String c;
    public eng d;

    public final boolean equals(Object obj) {
        if (!(obj instanceof eua)) {
            return false;
        }
        eua euaVar = (eua) obj;
        if (this.a.equals(euaVar.a) && this.b.equals(euaVar.b)) {
            String str = euaVar.c;
            if (a.g(null, null) && a.g(this.d, euaVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, this.d});
    }
}
