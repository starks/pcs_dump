package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oe {
    public static final Object a = new Object();

    public static final Object a(od odVar, int i) {
        Object obj;
        int iA = of.a(odVar.b, odVar.d, i);
        if (iA < 0 || (obj = odVar.c[iA]) == a) {
            return null;
        }
        return obj;
    }

    public static final void b(od odVar) {
        int i = odVar.d;
        int[] iArr = odVar.b;
        Object[] objArr = odVar.c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != a) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        odVar.a = false;
        odVar.d = i2;
    }
}
