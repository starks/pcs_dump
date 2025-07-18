package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ftd {
    public final fvk b;
    public boolean d;
    public int g;
    public int h;
    public int i;
    public int a = 4096;
    public int c = Integer.MAX_VALUE;
    public int e = 4096;
    public ftb[] f = new ftb[8];

    public ftd(fvk fvkVar) {
        this.b = fvkVar;
        this.g = r2.length - 1;
    }

    public final void a() {
        ftb[] ftbVarArr = this.f;
        ffh.X(ftbVarArr, null, 0, ftbVarArr.length);
        this.g = this.f.length - 1;
        this.h = 0;
        this.i = 0;
    }

    public final void b(ftb ftbVar) {
        int i = ftbVar.i;
        int i2 = this.e;
        if (i > i2) {
            a();
            return;
        }
        e((this.i + i) - i2);
        int i3 = this.h + 1;
        ftb[] ftbVarArr = this.f;
        int length = ftbVarArr.length;
        if (i3 > length) {
            ftb[] ftbVarArr2 = new ftb[length + length];
            System.arraycopy(ftbVarArr, 0, ftbVarArr2, length, length);
            this.g = this.f.length - 1;
            this.f = ftbVarArr2;
        }
        int i4 = this.g;
        this.g = i4 - 1;
        this.f[i4] = ftbVar;
        this.h++;
        this.i += i;
    }

    public final void c(fvn fvnVar) {
        long j;
        fuf fufVar = fuf.a;
        int i = 0;
        long j2 = 0;
        for (int i2 = 0; i2 < fvnVar.b(); i2++) {
            j2 += fuf.c[frh.A(fvnVar.a(i2))];
        }
        if (((int) ((j2 + 7) >> 3)) >= fvnVar.b()) {
            d(fvnVar.b(), 127, 0);
            this.b.J(fvnVar);
            return;
        }
        fvk fvkVar = new fvk();
        int iB = fvnVar.b();
        long j3 = 0;
        int i3 = 0;
        while (i < iB) {
            int iA = frh.A(fvnVar.a(i));
            int i4 = fuf.b[iA];
            byte b = fuf.c[iA];
            long j4 = j3 << b;
            long j5 = i4;
            i3 += b;
            while (true) {
                j = j4 | j5;
                if (i3 >= 8) {
                    i3 -= 8;
                    fvkVar.P((int) (j >> i3));
                }
            }
            i++;
            j3 = j;
        }
        if (i3 > 0) {
            fvkVar.P((int) ((255 >>> i3) | (j3 << (8 - i3))));
        }
        fvn fvnVarU = fvkVar.u();
        d(fvnVarU.b(), 127, 128);
        this.b.J(fvnVarU);
    }

    public final void d(int i, int i2, int i3) {
        if (i < i2) {
            this.b.P(i | i3);
            return;
        }
        this.b.P(i3 | i2);
        int i4 = i - i2;
        while (i4 >= 128) {
            this.b.P(128 | (i4 & 127));
            i4 >>>= 7;
        }
        this.b.P(i4);
    }

    public final void e(int i) {
        int i2;
        if (i > 0) {
            int length = this.f.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.g;
                if (length < i2 || i <= 0) {
                    break;
                }
                ftb ftbVar = this.f[length];
                ftbVar.getClass();
                int i4 = this.i;
                ftbVar.getClass();
                int i5 = ftbVar.i;
                this.i = i4 - i5;
                this.h--;
                i3++;
                i -= i5;
                length--;
            }
            ftb[] ftbVarArr = this.f;
            int i6 = i2 + 1;
            System.arraycopy(ftbVarArr, i6, ftbVarArr, i6 + i3, this.h);
            ftb[] ftbVarArr2 = this.f;
            int i7 = this.g + 1;
            Arrays.fill(ftbVarArr2, i7, i7 + i3, (Object) null);
            this.g += i3;
        }
    }
}
