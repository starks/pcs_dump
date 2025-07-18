package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ddy {
    private static final char[] a = "0123456789abcdef".toCharArray();
    public static final /* synthetic */ int b = 0;

    public abstract int a();

    public abstract int b();

    public abstract long c();

    public abstract boolean d(ddy ddyVar);

    public abstract byte[] e();

    public final boolean equals(Object obj) {
        if (obj instanceof ddy) {
            ddy ddyVar = (ddy) obj;
            if (b() == ddyVar.b() && d(ddyVar)) {
                return true;
            }
        }
        return false;
    }

    public byte[] f() {
        return e();
    }

    public final int hashCode() {
        if (b() >= 32) {
            return a();
        }
        byte[] bArrF = f();
        int i = bArrF[0] & 255;
        for (int i2 = 1; i2 < bArrF.length; i2++) {
            i |= (bArrF[i2] & 255) << (i2 * 8);
        }
        return i;
    }

    public final String toString() {
        byte[] bArrF = f();
        int length = bArrF.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (byte b2 : bArrF) {
            char[] cArr = a;
            sb.append(cArr[(b2 >> 4) & 15]);
            sb.append(cArr[b2 & 15]);
        }
        return sb.toString();
    }
}
