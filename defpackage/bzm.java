package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bzm implements biv {
    public static final bzm a = new bzm();
    private final boolean b = false;
    private final boolean c = false;
    private final String d = null;
    private final boolean e = false;
    private final boolean h = false;
    private final String f = null;
    private final String g = null;
    private final Long i = null;
    private final Long j = null;

    private bzm() {
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bzm)) {
            return false;
        }
        bzm bzmVar = (bzm) obj;
        boolean z = bzmVar.b;
        boolean z2 = bzmVar.c;
        String str = bzmVar.d;
        if (a.g(null, null)) {
            boolean z3 = bzmVar.e;
            boolean z4 = bzmVar.h;
            String str2 = bzmVar.f;
            if (a.g(null, null)) {
                String str3 = bzmVar.g;
                if (a.g(null, null)) {
                    Long l = bzmVar.i;
                    if (a.g(null, null)) {
                        Long l2 = bzmVar.j;
                        if (a.g(null, null)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{false, false, null, false, false, null, null, null, null});
    }
}
