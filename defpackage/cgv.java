package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cgv {
    @Deprecated
    public static final cgr a(String str, String str2, String str3, Set set, boolean z) {
        return new cgr("com.google.android.gms.learning", "__phenotype_server_token", "", new cga(true, set, new cgs(0), new cgt(String.class, 5)), false);
    }

    public static final cgr b(String str, double d, String str2, Set set, boolean z) {
        return new cgr("com.google.android.gms.learning", str, Double.valueOf(d), new cga(true, set, new cgs(2), new cgt(Double.class, 0)), true);
    }

    public static final cgr c(String str, long j, String str2, Set set, boolean z) {
        return new cgr("com.google.android.gms.learning", str, Long.valueOf(j), new cga(true, set, new cgs(1), new cgt(Long.class, 1)), true);
    }

    public static final cgr d(String str, String str2, String str3, Set set, boolean z) {
        return new cgr("com.google.android.gms.learning", str, str2, new cga(true, set, new cgs(4), new cgt(String.class, 5)), true);
    }

    public static final cgr e(String str, boolean z, String str2, Set set, boolean z2) {
        return new cgr(str2, str, Boolean.valueOf(z), new cga(true, set, new cgs(3), new cgt(Boolean.class, 4)), true);
    }

    public static final cgr f(String str, cgu cguVar, String str2, String str3, Set set, boolean z) {
        return new cgr("com.google.android.gms.learning", str, new cga(true, set, new cgt(cguVar, 2), new cgt(cguVar, 3)), str2);
    }
}
