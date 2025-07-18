package defpackage;

import j$.util.Map;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aqo {
    public static final czn a = czn.j("com/google/android/apps/miphone/astrea/fl/brella/service/util/PolicyFinder");

    public static boolean a(String str, cdn cdnVar, cdn cdnVar2) {
        Map map = (Map) Map.EL.getOrDefault(cdnVar.c, str, cyu.a);
        java.util.Map map2 = (java.util.Map) Map.EL.getOrDefault(cdnVar2.c, str, cyu.a);
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            if (!((String) entry.getValue()).equals(map2.get(str2))) {
                ((czl) ((czl) a.e()).i("com/google/android/apps/miphone/astrea/fl/brella/service/util/PolicyFinder", "installedConfigMatchesQueryConfig", 95, "PolicyFinder.java")).z(str, str2, map.get(str2), map2.get(str2));
                return false;
            }
        }
        return true;
    }
}
