package defpackage;

import java.util.Arrays;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ow {
    private static final float c = 0.001f;
    protected final zw b;
    private final ox d;
    int a = 0;
    private int e = 8;
    private int[] f = new int[8];
    private int[] g = new int[8];
    private float[] h = new float[8];
    private int i = -1;
    private int j = -1;
    private boolean k = false;

    public ow(ox oxVar, zw zwVar) {
        this.d = oxVar;
        this.b = zwVar;
    }

    public final float a(pb pbVar) {
        int i = this.i;
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            if (this.f[i] == pbVar.c) {
                return this.h[i];
            }
            i = this.g[i];
        }
        return 0.0f;
    }

    public final float b(int i) {
        int i2 = this.i;
        for (int i3 = 0; i2 != -1 && i3 < this.a; i3++) {
            if (i3 == i) {
                return this.h[i2];
            }
            i2 = this.g[i2];
        }
        return 0.0f;
    }

    public final float c(pb pbVar, boolean z) {
        int i = this.i;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.a) {
            if (this.f[i] == pbVar.c) {
                if (i == this.i) {
                    this.i = this.g[i];
                } else {
                    int[] iArr = this.g;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    pbVar.b(this.d);
                }
                pbVar.l--;
                this.a--;
                this.f[i] = -1;
                if (this.k) {
                    this.j = i;
                }
                return this.h[i];
            }
            i2++;
            i3 = i;
            i = this.g[i];
        }
        return 0.0f;
    }

    public final float d(ox oxVar, boolean z) {
        float fA = a(oxVar.a);
        c(oxVar.a, z);
        ow owVar = oxVar.f;
        int iE = owVar.e();
        for (int i = 0; i < iE; i++) {
            pb pbVarF = owVar.f(i);
            g(pbVarF, owVar.a(pbVarF) * fA, z);
        }
        return fA;
    }

    public final int e() {
        return this.a;
    }

    public final pb f(int i) {
        int i2 = this.i;
        for (int i3 = 0; i2 != -1 && i3 < this.a; i3++) {
            if (i3 == i) {
                return ((pb[]) this.b.c)[this.f[i2]];
            }
            i2 = this.g[i2];
        }
        return null;
    }

    public final void g(pb pbVar, float f, boolean z) {
        if (f <= -0.001f || f >= c) {
            int i = this.i;
            if (i == -1) {
                this.i = 0;
                this.h[0] = f;
                this.f[0] = pbVar.c;
                this.g[0] = -1;
                pbVar.l++;
                pbVar.a(this.d);
                this.a++;
                if (this.k) {
                    return;
                }
                int i2 = this.j + 1;
                this.j = i2;
                int length = this.f.length;
                if (i2 >= length) {
                    this.k = true;
                    this.j = length - 1;
                    return;
                }
                return;
            }
            int i3 = -1;
            for (int i4 = 0; i != -1 && i4 < this.a; i4++) {
                int i5 = this.f[i];
                int i6 = pbVar.c;
                if (i5 == i6) {
                    float[] fArr = this.h;
                    float f2 = fArr[i] + f;
                    if (f2 > -0.001f && f2 < c) {
                        f2 = 0.0f;
                    }
                    fArr[i] = f2;
                    if (f2 == 0.0f) {
                        if (i == this.i) {
                            this.i = this.g[i];
                        } else {
                            int[] iArr = this.g;
                            iArr[i3] = iArr[i];
                        }
                        if (z) {
                            pbVar.b(this.d);
                        }
                        if (this.k) {
                            this.j = i;
                        }
                        pbVar.l--;
                        this.a--;
                        return;
                    }
                    return;
                }
                if (i5 < i6) {
                    i3 = i;
                }
                i = this.g[i];
            }
            int length2 = this.j;
            int i7 = length2 + 1;
            if (this.k) {
                int[] iArr2 = this.f;
                if (iArr2[length2] != -1) {
                    length2 = iArr2.length;
                }
            } else {
                length2 = i7;
            }
            int length3 = this.f.length;
            if (length2 >= length3 && this.a < length3) {
                int i8 = 0;
                while (true) {
                    int[] iArr3 = this.f;
                    if (i8 >= iArr3.length) {
                        break;
                    }
                    if (iArr3[i8] == -1) {
                        length2 = i8;
                        break;
                    }
                    i8++;
                }
            }
            int length4 = this.f.length;
            if (length2 >= length4) {
                int i9 = this.e;
                int i10 = i9 + i9;
                this.e = i10;
                this.k = false;
                this.j = length4 - 1;
                this.h = Arrays.copyOf(this.h, i10);
                this.f = Arrays.copyOf(this.f, this.e);
                this.g = Arrays.copyOf(this.g, this.e);
                length2 = length4;
            }
            this.f[length2] = pbVar.c;
            this.h[length2] = f;
            if (i3 != -1) {
                int[] iArr4 = this.g;
                iArr4[length2] = iArr4[i3];
                iArr4[i3] = length2;
            } else {
                this.g[length2] = this.i;
                this.i = length2;
            }
            pbVar.l++;
            pbVar.a(this.d);
            this.a++;
            if (!this.k) {
                this.j++;
            }
            int i11 = this.j;
            int length5 = this.f.length;
            if (i11 >= length5) {
                this.k = true;
                this.j = length5 - 1;
            }
        }
    }

    public final void h() {
        int i = this.i;
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            pb pbVar = ((pb[]) this.b.c)[this.f[i]];
            if (pbVar != null) {
                pbVar.b(this.d);
            }
            i = this.g[i];
        }
        this.i = -1;
        this.j = -1;
        this.k = false;
        this.a = 0;
    }

    public final void i(float f) {
        int i = this.i;
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            float[] fArr = this.h;
            fArr[i] = fArr[i] / f;
            i = this.g[i];
        }
    }

    public final void j() {
        int i = this.i;
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            float[] fArr = this.h;
            fArr[i] = -fArr[i];
            i = this.g[i];
        }
    }

    public final void k(pb pbVar, float f) {
        if (f == 0.0f) {
            c(pbVar, true);
            return;
        }
        int i = this.i;
        if (i == -1) {
            this.i = 0;
            this.h[0] = f;
            this.f[0] = pbVar.c;
            this.g[0] = -1;
            pbVar.l++;
            pbVar.a(this.d);
            this.a++;
            if (this.k) {
                return;
            }
            int i2 = this.j + 1;
            this.j = i2;
            int length = this.f.length;
            if (i2 >= length) {
                this.k = true;
                this.j = length - 1;
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.a; i4++) {
            int i5 = this.f[i];
            int i6 = pbVar.c;
            if (i5 == i6) {
                this.h[i] = f;
                return;
            }
            if (i5 < i6) {
                i3 = i;
            }
            i = this.g[i];
        }
        int length2 = this.j;
        int i7 = length2 + 1;
        if (this.k) {
            int[] iArr = this.f;
            if (iArr[length2] != -1) {
                length2 = iArr.length;
            }
        } else {
            length2 = i7;
        }
        int length3 = this.f.length;
        if (length2 >= length3 && this.a < length3) {
            int i8 = 0;
            while (true) {
                int[] iArr2 = this.f;
                if (i8 >= iArr2.length) {
                    break;
                }
                if (iArr2[i8] == -1) {
                    length2 = i8;
                    break;
                }
                i8++;
            }
        }
        int length4 = this.f.length;
        if (length2 >= length4) {
            int i9 = this.e;
            int i10 = i9 + i9;
            this.e = i10;
            this.k = false;
            this.j = length4 - 1;
            this.h = Arrays.copyOf(this.h, i10);
            this.f = Arrays.copyOf(this.f, this.e);
            this.g = Arrays.copyOf(this.g, this.e);
            length2 = length4;
        }
        this.f[length2] = pbVar.c;
        this.h[length2] = f;
        if (i3 != -1) {
            int[] iArr3 = this.g;
            iArr3[length2] = iArr3[i3];
            iArr3[i3] = length2;
        } else {
            this.g[length2] = this.i;
            this.i = length2;
        }
        pbVar.l++;
        pbVar.a(this.d);
        int i11 = this.a + 1;
        this.a = i11;
        if (!this.k) {
            this.j++;
        }
        int length5 = this.f.length;
        if (i11 >= length5) {
            this.k = true;
        }
        if (this.j >= length5) {
            this.k = true;
            this.j = length5 - 1;
        }
    }

    public final boolean l(pb pbVar) {
        int i = this.i;
        if (i != -1) {
            for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
                if (this.f[i] == pbVar.c) {
                    return true;
                }
                i = this.g[i];
            }
        }
        return false;
    }

    public final String toString() {
        int i = this.i;
        String strConcat = "";
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            String str = strConcat.concat(" -> ") + this.h[i] + " : ";
            pb pbVar = ((pb[]) this.b.c)[this.f[i]];
            Objects.toString(pbVar);
            String strValueOf = String.valueOf(pbVar);
            i = this.g[i];
            strConcat = str.concat(strValueOf);
        }
        return strConcat;
    }
}
