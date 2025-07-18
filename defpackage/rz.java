package defpackage;

import android.graphics.Insets;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rz {
    public static final rz a = new rz(0, 0, 0, 0);
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    private rz(int i, int i2, int i3, int i4) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public static rz b(rz rzVar, rz rzVar2) {
        return c(Math.max(rzVar.b, rzVar2.b), Math.max(rzVar.c, rzVar2.c), Math.max(rzVar.d, rzVar2.d), Math.max(rzVar.e, rzVar2.e));
    }

    public static rz c(int i, int i2, int i3, int i4) {
        if (i == 0) {
            i = 0;
            if (i2 == 0) {
                if (i3 != 0) {
                    i2 = 0;
                } else {
                    if (i4 == 0) {
                        return a;
                    }
                    i2 = 0;
                    i3 = 0;
                }
            }
        }
        return new rz(i, i2, i3, i4);
    }

    public static rz d(Insets insets) {
        return c(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets a() {
        return Insets.of(this.b, this.c, this.d, this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        rz rzVar = (rz) obj;
        return this.e == rzVar.e && this.b == rzVar.b && this.d == rzVar.d && this.c == rzVar.c;
    }

    public final int hashCode() {
        return (((((this.b * 31) + this.c) * 31) + this.d) * 31) + this.e;
    }

    public final String toString() {
        return "Insets{left=" + this.b + ", top=" + this.c + ", right=" + this.d + ", bottom=" + this.e + '}';
    }
}
