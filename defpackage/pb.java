package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pb implements Comparable {
    public static int a = 1;
    public boolean b;
    public float f;
    int n;
    public int c = -1;
    int d = -1;
    public int e = 0;
    public boolean g = false;
    final float[] h = new float[9];
    final float[] i = new float[9];
    ox[] j = new ox[16];
    int k = 0;
    public int l = 0;
    boolean m = false;

    public pb(int i) {
        this.n = i;
    }

    public final void a(ox oxVar) {
        int i = 0;
        while (true) {
            int i2 = this.k;
            if (i >= i2) {
                ox[] oxVarArr = this.j;
                int length = oxVarArr.length;
                if (i2 >= length) {
                    this.j = (ox[]) Arrays.copyOf(oxVarArr, length + length);
                }
                ox[] oxVarArr2 = this.j;
                int i3 = this.k;
                oxVarArr2[i3] = oxVar;
                this.k = i3 + 1;
                return;
            }
            if (this.j[i] == oxVar) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void b(ox oxVar) {
        int i = this.k;
        int i2 = 0;
        while (i2 < i) {
            if (this.j[i2] == oxVar) {
                while (i2 < i - 1) {
                    ox[] oxVarArr = this.j;
                    int i3 = i2 + 1;
                    oxVarArr[i2] = oxVarArr[i3];
                    i2 = i3;
                }
                this.k--;
                return;
            }
            i2++;
        }
    }

    public final void c() {
        this.n = 5;
        this.e = 0;
        this.c = -1;
        this.d = -1;
        this.f = 0.0f;
        this.g = false;
        this.m = false;
        int i = this.k;
        for (int i2 = 0; i2 < i; i2++) {
            this.j[i2] = null;
        }
        this.k = 0;
        this.l = 0;
        this.b = false;
        Arrays.fill(this.i, 0.0f);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.c - ((pb) obj).c;
    }

    public final void d(oy oyVar, float f) {
        this.f = f;
        this.g = true;
        this.m = false;
        int i = this.k;
        this.d = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.j[i2].d(oyVar, this, false);
        }
        this.k = 0;
    }

    public final void e(oy oyVar, ox oxVar) {
        int i = this.k;
        for (int i2 = 0; i2 < i; i2++) {
            this.j[i2].e(oyVar, oxVar, false);
        }
        this.k = 0;
    }

    public final String toString() {
        return "" + this.c;
    }
}
