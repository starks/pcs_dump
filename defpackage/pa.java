package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pa extends ox {
    public int g;
    final oz h;
    private final int i;
    private pb[] j;
    private pb[] k;

    public pa(zw zwVar) {
        super(zwVar);
        this.i = 128;
        this.j = new pb[128];
        this.k = new pb[128];
        this.g = 0;
        this.h = new oz(this);
    }

    @Override // defpackage.ox
    public final void e(oy oyVar, ox oxVar, boolean z) {
        pb pbVar = oxVar.a;
        if (pbVar == null) {
            return;
        }
        ow owVar = oxVar.f;
        int iE = owVar.e();
        for (int i = 0; i < iE; i++) {
            pb pbVarF = owVar.f(i);
            float fB = owVar.b(i);
            oz ozVar = this.h;
            ozVar.a = pbVarF;
            if (ozVar.a(pbVar, fB)) {
                o(pbVarF);
            }
            this.b += oxVar.b * fB;
        }
        p(pbVar);
    }

    @Override // defpackage.ox
    public final boolean f() {
        return this.g == 0;
    }

    @Override // defpackage.ox
    public final pb m(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.g; i2++) {
            pb[] pbVarArr = this.j;
            pb pbVar = pbVarArr[i2];
            if (!zArr[pbVar.c]) {
                oz ozVar = this.h;
                ozVar.a = pbVar;
                int i3 = 8;
                if (i == -1) {
                    while (i3 >= 0) {
                        float f = ozVar.a.i[i3];
                        if (f > 0.0f) {
                            break;
                        }
                        if (f < 0.0f) {
                            i = i2;
                            break;
                        }
                        i3--;
                    }
                    i = -1;
                } else {
                    pb pbVar2 = pbVarArr[i];
                    while (true) {
                        if (i3 >= 0) {
                            float f2 = pbVar2.i[i3];
                            float f3 = ozVar.a.i[i3];
                            if (f3 == f2) {
                                i3--;
                            } else if (f3 < f2) {
                            }
                        }
                    }
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.j[i];
    }

    public final void o(pb pbVar) {
        int i;
        int i2 = this.g + 1;
        pb[] pbVarArr = this.j;
        int length = pbVarArr.length;
        if (i2 > length) {
            pb[] pbVarArr2 = (pb[]) Arrays.copyOf(pbVarArr, length + length);
            this.j = pbVarArr2;
            int length2 = pbVarArr2.length;
            this.k = (pb[]) Arrays.copyOf(pbVarArr2, length2 + length2);
        }
        pb[] pbVarArr3 = this.j;
        int i3 = this.g;
        pbVarArr3[i3] = pbVar;
        int i4 = i3 + 1;
        this.g = i4;
        if (i4 > 1 && pbVarArr3[i3].c > pbVar.c) {
            int i5 = 0;
            while (true) {
                i = this.g;
                if (i5 >= i) {
                    break;
                }
                this.k[i5] = this.j[i5];
                i5++;
            }
            Arrays.sort(this.k, 0, i, new it(2));
            for (int i6 = 0; i6 < this.g; i6++) {
                this.j[i6] = this.k[i6];
            }
        }
        pbVar.b = true;
        pbVar.a(this);
    }

    public final void p(pb pbVar) {
        int i = 0;
        while (i < this.g) {
            if (this.j[i] == pbVar) {
                while (true) {
                    int i2 = this.g - 1;
                    if (i >= i2) {
                        this.g = i2;
                        pbVar.b = false;
                        return;
                    } else {
                        pb[] pbVarArr = this.j;
                        int i3 = i + 1;
                        pbVarArr[i] = pbVarArr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // defpackage.ox
    public final String toString() {
        String str = " goal -> (" + this.b + ") : ";
        for (int i = 0; i < this.g; i++) {
            this.h.a = this.j[i];
            str = str + this.h + " ";
        }
        return str;
    }
}
