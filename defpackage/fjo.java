package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fjo {
    private static final Object[] a = new Object[0];

    public static final Object[] a(Collection collection) {
        int size = collection.size();
        if (size == 0) {
            return a;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return a;
        }
        Object[] objArrCopyOf = new Object[size];
        int i = 0;
        while (true) {
            objArrCopyOf[i] = it.next();
            i++;
            if (i >= objArrCopyOf.length) {
                if (!it.hasNext()) {
                    return objArrCopyOf;
                }
                int i2 = ((i * 3) + 1) >>> 1;
                if (i2 <= i) {
                    i2 = 2147483645;
                    if (i >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i2);
            } else if (!it.hasNext()) {
                Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, i);
                objArrCopyOf2.getClass();
                return objArrCopyOf2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object[] b(java.util.Collection r4, java.lang.Object[] r5) throws java.lang.NegativeArraySizeException {
        /*
            int r0 = r4.size()
            r1 = 0
            r2 = 0
            if (r0 != 0) goto Lc
            int r4 = r5.length
            if (r4 <= 0) goto L1b
            goto L19
        Lc:
            java.util.Iterator r4 = r4.iterator()
            boolean r3 = r4.hasNext()
            if (r3 != 0) goto L1c
            int r4 = r5.length
            if (r4 <= 0) goto L1b
        L19:
            r5[r2] = r1
        L1b:
            return r5
        L1c:
            int r3 = r5.length
            if (r0 > r3) goto L21
            r0 = r5
            goto L32
        L21:
            java.lang.Class r3 = r5.getClass()
            java.lang.Class r3 = r3.getComponentType()
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r3, r0)
            r0.getClass()
            java.lang.Object[] r0 = (java.lang.Object[]) r0
        L32:
            java.lang.Object r3 = r4.next()
            r0[r2] = r3
            int r2 = r2 + 1
            int r3 = r0.length
            if (r2 < r3) goto L5d
            boolean r3 = r4.hasNext()
            if (r3 != 0) goto L44
            return r0
        L44:
            int r3 = r2 * 3
            int r3 = r3 + 1
            int r3 = r3 >>> 1
            if (r3 > r2) goto L58
            r3 = 2147483645(0x7ffffffd, float:NaN)
            if (r2 >= r3) goto L52
            goto L58
        L52:
            java.lang.OutOfMemoryError r4 = new java.lang.OutOfMemoryError
            r4.<init>()
            throw r4
        L58:
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r3)
            goto L32
        L5d:
            boolean r3 = r4.hasNext()
            if (r3 != 0) goto L32
            if (r0 != r5) goto L68
            r5[r2] = r1
            return r5
        L68:
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r0, r2)
            r4.getClass()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fjo.b(java.util.Collection, java.lang.Object[]):java.lang.Object[]");
    }
}
