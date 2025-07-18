package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cao {
    public static final cat a;

    static {
        Uri uri = cap.a;
        a = caq.a();
    }

    public static long a(ContentResolver contentResolver) throws cas, NumberFormatException {
        Object obj;
        long j;
        Long lValueOf;
        cat catVar = a;
        cat.b(contentResolver);
        synchronized (catVar) {
            catVar.a(contentResolver);
            obj = catVar.d;
            HashMap map = catVar.c;
            j = 0;
            Object obj2 = 0L;
            if (map.containsKey("android_id")) {
                Object obj3 = map.get("android_id");
                if (obj3 != null) {
                    obj2 = obj3;
                }
            } else {
                obj2 = null;
            }
            lValueOf = (Long) obj2;
        }
        if (lValueOf != null) {
            return lValueOf.longValue();
        }
        String strC = catVar.c(contentResolver, "android_id");
        if (strC != null) {
            try {
                long j2 = Long.parseLong(strC);
                lValueOf = Long.valueOf(j2);
                j = j2;
            } catch (NumberFormatException unused) {
            }
        }
        synchronized (catVar) {
            HashMap map2 = catVar.c;
            if (obj == catVar.d) {
                map2.put("android_id", lValueOf);
                catVar.b.remove("android_id");
            }
        }
        return j;
    }
}
