package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bjr {
    public final fcy a;
    private final int b;
    private final biv c;
    private final String d;

    public bjr(fcy fcyVar, biv bivVar, String str) {
        this.a = fcyVar;
        this.c = bivVar;
        this.d = str;
        this.b = Arrays.hashCode(new Object[]{fcyVar, bivVar, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bjr)) {
            return false;
        }
        bjr bjrVar = (bjr) obj;
        return a.g(this.a, bjrVar.a) && a.g(this.c, bjrVar.c) && a.g(this.d, bjrVar.d);
    }

    public final int hashCode() {
        return this.b;
    }
}
