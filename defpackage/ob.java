package defpackage;

import android.graphics.PorterDuff;
import java.util.LinkedHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ob {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private final jt g;
    private final fsc h;

    public ob() {
        this(6);
    }

    public static int c(int i, PorterDuff.Mode mode) {
        return ((i + 31) * 31) + mode.hashCode();
    }

    protected static final void d(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
    }

    private static final void e(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
    }

    public final Object a(Object obj) {
        synchronized (this.g) {
            Object obj2 = ((LinkedHashMap) this.h.a).get(obj);
            if (obj2 != null) {
                this.e++;
                return obj2;
            }
            this.f++;
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b7, code lost:
    
        return r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r5, java.lang.Object r6) {
        /*
            r4 = this;
            r6.getClass()
            jt r0 = r4.g
            monitor-enter(r0)
            int r1 = r4.c     // Catch: java.lang.Throwable -> Lbb
            int r1 = r1 + 1
            r4.c = r1     // Catch: java.lang.Throwable -> Lbb
            int r1 = r4.b     // Catch: java.lang.Throwable -> Lbb
            e(r5, r6)     // Catch: java.lang.Throwable -> Lbb
            int r1 = r1 + 1
            r4.b = r1     // Catch: java.lang.Throwable -> Lbb
            fsc r1 = r4.h     // Catch: java.lang.Throwable -> Lbb
            java.lang.Object r1 = r1.a     // Catch: java.lang.Throwable -> Lbb
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1     // Catch: java.lang.Throwable -> Lbb
            java.lang.Object r6 = r1.put(r5, r6)     // Catch: java.lang.Throwable -> Lbb
            if (r6 == 0) goto L2a
            int r1 = r4.b     // Catch: java.lang.Throwable -> Lbb
            e(r5, r6)     // Catch: java.lang.Throwable -> Lbb
            int r1 = r1 + (-1)
            r4.b = r1     // Catch: java.lang.Throwable -> Lbb
        L2a:
            monitor-exit(r0)
            if (r6 == 0) goto L30
            d(r5, r6)
        L30:
            int r5 = r4.a
        L32:
            jt r0 = r4.g
            monitor-enter(r0)
            int r1 = r4.b     // Catch: java.lang.Throwable -> Lb8
            if (r1 < 0) goto L45
            fsc r1 = r4.h     // Catch: java.lang.Throwable -> Lb8
            boolean r1 = r1.as()     // Catch: java.lang.Throwable -> Lb8
            if (r1 == 0) goto L4a
            int r1 = r4.b     // Catch: java.lang.Throwable -> Lb8
            if (r1 == 0) goto L4a
        L45:
            java.lang.String r1 = "LruCache.sizeOf() is reporting inconsistent results!"
            defpackage.jt.w(r1)     // Catch: java.lang.Throwable -> Lb8
        L4a:
            int r1 = r4.b     // Catch: java.lang.Throwable -> Lb8
            if (r1 <= r5) goto Lb6
            fsc r1 = r4.h     // Catch: java.lang.Throwable -> Lb8
            boolean r1 = r1.as()     // Catch: java.lang.Throwable -> Lb8
            if (r1 == 0) goto L57
            goto Lb6
        L57:
            fsc r1 = r4.h     // Catch: java.lang.Throwable -> Lb8
            java.lang.Object r1 = r1.a     // Catch: java.lang.Throwable -> Lb8
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1     // Catch: java.lang.Throwable -> Lb8
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> Lb8
            r1.getClass()     // Catch: java.lang.Throwable -> Lb8
            boolean r2 = r1 instanceof java.util.List     // Catch: java.lang.Throwable -> Lb8
            r3 = 0
            if (r2 == 0) goto L78
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> Lb8
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> Lb8
            if (r2 == 0) goto L72
            goto L87
        L72:
            r2 = 0
            java.lang.Object r3 = r1.get(r2)     // Catch: java.lang.Throwable -> Lb8
            goto L87
        L78:
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> Lb8
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> Lb8
            if (r2 != 0) goto L83
            goto L87
        L83:
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> Lb8
        L87:
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> Lb8
            if (r3 != 0) goto L8d
            monitor-exit(r0)
            return r6
        L8d:
            java.lang.Object r1 = r3.getKey()     // Catch: java.lang.Throwable -> Lb8
            java.lang.Object r2 = r3.getValue()     // Catch: java.lang.Throwable -> Lb8
            fsc r3 = r4.h     // Catch: java.lang.Throwable -> Lb8
            r1.getClass()     // Catch: java.lang.Throwable -> Lb8
            java.lang.Object r3 = r3.a     // Catch: java.lang.Throwable -> Lb8
            java.util.LinkedHashMap r3 = (java.util.LinkedHashMap) r3     // Catch: java.lang.Throwable -> Lb8
            r3.remove(r1)     // Catch: java.lang.Throwable -> Lb8
            int r3 = r4.b     // Catch: java.lang.Throwable -> Lb8
            e(r1, r2)     // Catch: java.lang.Throwable -> Lb8
            int r3 = r3 + (-1)
            r4.b = r3     // Catch: java.lang.Throwable -> Lb8
            int r3 = r4.d     // Catch: java.lang.Throwable -> Lb8
            int r3 = r3 + 1
            r4.d = r3     // Catch: java.lang.Throwable -> Lb8
            monitor-exit(r0)
            d(r1, r2)
            goto L32
        Lb6:
            monitor-exit(r0)
            return r6
        Lb8:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        Lbb:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ob.b(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final String toString() {
        String str;
        synchronized (this.g) {
            int i = this.e;
            int i2 = this.f + i;
            str = "LruCache[maxSize=" + this.a + ",hits=" + this.e + ",misses=" + this.f + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
        }
        return str;
    }

    public ob(int i) {
        this.a = i;
        this.h = new fsc(0, (byte[]) null);
        this.g = new jt(null);
    }
}
