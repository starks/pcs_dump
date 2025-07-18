package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fcw {
    private final String[] a;

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    public fcw(ekf ekfVar) {
        ?? r2 = ekfVar.a;
        this.a = (String[]) r2.toArray(new String[r2.size()]);
    }

    public final int a() {
        return this.a.length >> 1;
    }

    public final String b(int i) {
        int i2 = i + i;
        if (i2 < 0) {
            return null;
        }
        String[] strArr = this.a;
        if (i2 >= strArr.length) {
            return null;
        }
        return strArr[i2];
    }

    public final String c(int i) {
        int i2 = i + i + 1;
        if (i2 < 0) {
            return null;
        }
        String[] strArr = this.a;
        if (i2 >= strArr.length) {
            return null;
        }
        return strArr[i2];
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int iA = a();
        for (int i = 0; i < iA; i++) {
            sb.append(b(i));
            sb.append(": ");
            sb.append(c(i));
            sb.append("\n");
        }
        return sb.toString();
    }
}
