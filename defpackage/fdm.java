package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fdm {
    public final fvk a;
    int c;
    public int d;
    private int f;
    fdk[] b = new fdk[8];
    private int e = 4096;

    public fdm(fvk fvkVar) {
        this.d = r0.length - 1;
        this.a = fvkVar;
    }

    public final void a(fdk fdkVar) {
        int i;
        int i2 = fdkVar.h;
        int i3 = this.e;
        if (i2 > i3) {
            Arrays.fill(this.b, (Object) null);
            this.d = this.b.length - 1;
            this.c = 0;
            this.f = 0;
            return;
        }
        int i4 = (this.f + i2) - i3;
        if (i4 > 0) {
            int length = this.b.length - 1;
            int i5 = 0;
            while (true) {
                i = this.d;
                if (length < i || i4 <= 0) {
                    break;
                }
                int i6 = this.b[length].h;
                i4 -= i6;
                this.f -= i6;
                this.c--;
                i5++;
                length--;
            }
            fdk[] fdkVarArr = this.b;
            int i7 = i + 1;
            System.arraycopy(fdkVarArr, i7, fdkVarArr, i7 + i5, this.c);
            this.d += i5;
        }
        int i8 = this.c + 1;
        fdk[] fdkVarArr2 = this.b;
        int length2 = fdkVarArr2.length;
        if (i8 > length2) {
            fdk[] fdkVarArr3 = new fdk[length2 + length2];
            System.arraycopy(fdkVarArr2, 0, fdkVarArr3, length2, length2);
            this.d = this.b.length - 1;
            this.b = fdkVarArr3;
        }
        int i9 = this.d;
        this.d = i9 - 1;
        this.b[i9] = fdkVar;
        this.c++;
        this.f += i2;
    }

    final void b(fvn fvnVar) {
        c(fvnVar.b(), 127, 0);
        this.a.J(fvnVar);
    }

    final void c(int i, int i2, int i3) {
        if (i < i2) {
            this.a.P(i | i3);
            return;
        }
        this.a.P(i3 | i2);
        int i4 = i - i2;
        while (i4 >= 128) {
            this.a.P(128 | (i4 & 127));
            i4 >>>= 7;
        }
        this.a.P(i4);
    }
}
