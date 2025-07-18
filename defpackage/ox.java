package defpackage;

import java.util.ArrayList;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ox {
    pb a = null;
    public float b = 0.0f;
    boolean c = false;
    final ArrayList d = new ArrayList();
    boolean e = false;
    public ow f;

    public ox() {
    }

    public static final boolean n(pb pbVar) {
        return pbVar.l <= 1;
    }

    public final pb a() {
        return this.a;
    }

    public final pb b(boolean[] zArr, pb pbVar) {
        int iE = this.f.e();
        pb pbVar2 = null;
        float f = 0.0f;
        for (int i = 0; i < iE; i++) {
            float fB = this.f.b(i);
            if (fB < 0.0f) {
                pb pbVarF = this.f.f(i);
                if ((zArr == null || !zArr[pbVarF.c]) && pbVarF != pbVar && ((pbVarF.n == 3 || pbVarF.n == 4) && fB < f)) {
                    f = fB;
                    pbVar2 = pbVarF;
                }
            }
        }
        return pbVar2;
    }

    final void c(pb pbVar) {
        pb pbVar2 = this.a;
        if (pbVar2 != null) {
            this.f.k(pbVar2, -1.0f);
            this.a.d = -1;
            this.a = null;
        }
        float f = -this.f.c(pbVar, true);
        this.a = pbVar;
        if (f == 1.0f) {
            return;
        }
        this.b /= f;
        this.f.i(f);
    }

    public final void d(oy oyVar, pb pbVar, boolean z) {
        if (pbVar == null || !pbVar.g) {
            return;
        }
        this.b += pbVar.f * this.f.a(pbVar);
        this.f.c(pbVar, z);
        if (z) {
            pbVar.b(this);
        }
        if (this.f.e() == 0) {
            this.e = true;
            oyVar.f = true;
        }
    }

    public void e(oy oyVar, ox oxVar, boolean z) {
        this.b += oxVar.b * this.f.d(oxVar, z);
        if (z) {
            oxVar.a.b(this);
        }
        if (this.a == null || this.f.e() != 0) {
            return;
        }
        this.e = true;
        oyVar.f = true;
    }

    public boolean f() {
        return this.a == null && this.b == 0.0f && this.f.e() == 0;
    }

    public final void g(ox oxVar) {
        this.a = null;
        this.f.h();
        for (int i = 0; i < oxVar.f.e(); i++) {
            this.f.g(oxVar.f.f(i), oxVar.f.b(i), true);
        }
    }

    public final void h(oy oyVar, int i) {
        this.f.k(oyVar.b(i, "ep"), 1.0f);
        this.f.k(oyVar.b(i, "em"), -1.0f);
    }

    public final void i(pb pbVar, pb pbVar2, pb pbVar3, pb pbVar4, float f) {
        this.f.k(pbVar, -1.0f);
        this.f.k(pbVar2, 1.0f);
        this.f.k(pbVar3, f);
        this.f.k(pbVar4, -f);
    }

    public final void j(pb pbVar, pb pbVar2, pb pbVar3, int i) {
        boolean z;
        if (i != 0) {
            if (i < 0) {
                i = -i;
                z = true;
            } else {
                z = false;
            }
            this.b = i;
            if (z) {
                this.f.k(pbVar, 1.0f);
                this.f.k(pbVar2, -1.0f);
                this.f.k(pbVar3, -1.0f);
                return;
            }
        }
        this.f.k(pbVar, -1.0f);
        this.f.k(pbVar2, 1.0f);
        this.f.k(pbVar3, 1.0f);
    }

    public final void k(pb pbVar, pb pbVar2, pb pbVar3, int i) {
        boolean z;
        if (i != 0) {
            if (i < 0) {
                i = -i;
                z = true;
            } else {
                z = false;
            }
            this.b = i;
            if (z) {
                this.f.k(pbVar, 1.0f);
                this.f.k(pbVar2, -1.0f);
                this.f.k(pbVar3, 1.0f);
                return;
            }
        }
        this.f.k(pbVar, -1.0f);
        this.f.k(pbVar2, 1.0f);
        this.f.k(pbVar3, -1.0f);
    }

    public final void l(pb pbVar, pb pbVar2, pb pbVar3, pb pbVar4, float f) {
        this.f.k(pbVar3, 0.5f);
        this.f.k(pbVar4, 0.5f);
        this.f.k(pbVar, -0.5f);
        this.f.k(pbVar2, -0.5f);
        this.b = -f;
    }

    public pb m(boolean[] zArr) {
        return b(zArr, null);
    }

    public String toString() {
        String strConcat;
        boolean z;
        String strValueOf;
        String str;
        if (this.a == null) {
            strConcat = "0";
        } else {
            pb pbVar = this.a;
            Objects.toString(pbVar);
            strConcat = "".concat(String.valueOf(pbVar));
        }
        float f = this.b;
        String strConcat2 = strConcat.concat(" = ");
        if (f != 0.0f) {
            strConcat2 = strConcat2 + this.b;
            z = true;
        } else {
            z = false;
        }
        int iE = this.f.e();
        for (int i = 0; i < iE; i++) {
            pb pbVarF = this.f.f(i);
            if (pbVarF != null) {
                float fB = this.f.b(i);
                if (fB != 0.0f) {
                    String string = pbVarF.toString();
                    if (z) {
                        if (fB > 0.0f) {
                            strValueOf = String.valueOf(strConcat2);
                            str = " + ";
                        } else {
                            fB = -fB;
                            strValueOf = String.valueOf(strConcat2);
                            str = " - ";
                        }
                        strConcat2 = strValueOf.concat(str);
                    } else if (fB < 0.0f) {
                        fB = -fB;
                        strConcat2 = String.valueOf(strConcat2).concat("- ");
                    }
                    strConcat2 = fB == 1.0f ? String.valueOf(strConcat2).concat(String.valueOf(string)) : strConcat2 + fB + " " + string;
                    z = true;
                }
            }
        }
        return !z ? String.valueOf(strConcat2).concat("0.0") : strConcat2;
    }

    public ox(zw zwVar) {
        this.f = new ow(this, zwVar);
    }
}
