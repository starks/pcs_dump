package j$.desugar.sun.nio.fs;

import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class g {
    public static /* synthetic */ String a(Collection collection) {
        StringBuilder sb = new StringBuilder();
        Iterator it = collection.iterator();
        if (it.hasNext()) {
            while (true) {
                sb.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb.append((CharSequence) "/");
            }
        }
        return sb.toString();
    }

    public static List b(Object[] objArr) {
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            obj.getClass();
            arrayList.add(obj);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static Set c(Object[] objArr) {
        HashSet hashSet = new HashSet(objArr.length);
        for (Object obj : objArr) {
            obj.getClass();
            if (!hashSet.add(obj)) {
                throw new IllegalArgumentException("duplicate element: " + obj);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    private static char d(String str, int i) {
        if (i < str.length()) {
            return str.charAt(i);
        }
        return (char) 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x00f5, code lost:
    
        r3 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x010a, code lost:
    
        if (r7 != ']') goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x010c, code lost:
    
        r1.append("]]");
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x011c, code lost:
    
        throw new java.util.regex.PatternSyntaxException("Missing ']", r17, r3 - 1);
     */
    /* JADX WARN: Removed duplicated region for block: B:138:0x00fd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x00d7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static java.lang.String e(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 389
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.desugar.sun.nio.fs.g.e(java.lang.String):java.lang.String");
    }

    public static FileChannel f(FileChannel fileChannel) {
        return e.d(fileChannel);
    }
}
