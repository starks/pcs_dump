package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class coi {
    private final coq[] a = new coq[4];
    private final Matrix[] b = new Matrix[4];
    private final Matrix[] c = new Matrix[4];
    private final PointF d = new PointF();
    private final Path e = new Path();
    private final Path f = new Path();
    private final coq g = new coq();
    private final float[] h = new float[2];
    private final float[] i = new float[2];
    private final Path j = new Path();
    private final Path k = new Path();
    private boolean l = true;

    public coi() {
        for (int i = 0; i < 4; i++) {
            this.a[i] = new coq();
            this.b[i] = new Matrix();
            this.c[i] = new Matrix();
        }
    }

    static final cnv a(int i, cof cofVar) {
        return i != 1 ? i != 2 ? i != 3 ? cofVar.c : cofVar.b : cofVar.e : cofVar.d;
    }

    private final boolean c(Path path, int i) {
        this.k.reset();
        this.a[i].c(this.b[i], this.k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.k.computeBounds(rectF, true);
        path.op(this.k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }

    private static final float d(int i) {
        return ((i + 1) % 4) * 90;
    }

    public final void b(cof cofVar, float[] fArr, float f, RectF rectF, fuu fuuVar, Path path) {
        char c;
        char c2;
        path.rewind();
        this.e.rewind();
        this.f.rewind();
        this.f.addRect(rectF, Path.Direction.CW);
        coh cohVar = new coh(cofVar, f, rectF, fuuVar, path);
        int i = 0;
        while (i < 4) {
            cnv cnvVarA = fArr == null ? a(i, cohVar.a) : new cnu(fArr[i]);
            cof cofVar2 = cohVar.a;
            (i != 1 ? i != 2 ? i != 3 ? cofVar2.k : cofVar2.j : cofVar2.m : cofVar2.l).a(this.a[i], cohVar.d, cnvVarA.a(cohVar.c));
            float fD = d(i);
            this.b[i].reset();
            RectF rectF2 = cohVar.c;
            PointF pointF = this.d;
            if (i == 1) {
                pointF.set(rectF2.right, rectF2.bottom);
            } else if (i == 2) {
                pointF.set(rectF2.left, rectF2.bottom);
            } else if (i != 3) {
                pointF.set(rectF2.right, rectF2.top);
            } else {
                pointF.set(rectF2.left, rectF2.top);
            }
            Matrix matrix = this.b[i];
            PointF pointF2 = this.d;
            matrix.setTranslate(pointF2.x, pointF2.y);
            this.b[i].preRotate(fD);
            float[] fArr2 = this.h;
            coq coqVar = this.a[i];
            fArr2[0] = coqVar.b;
            fArr2[1] = coqVar.c;
            this.b[i].mapPoints(fArr2);
            float fD2 = d(i);
            this.c[i].reset();
            Matrix matrix2 = this.c[i];
            float[] fArr3 = this.h;
            matrix2.setTranslate(fArr3[0], fArr3[1]);
            this.c[i].preRotate(fD2);
            i++;
        }
        int i2 = 0;
        while (i2 < 4) {
            float[] fArr4 = this.h;
            coq coqVar2 = this.a[i2];
            fArr4[0] = 0.0f;
            fArr4[1] = coqVar2.a;
            this.b[i2].mapPoints(fArr4);
            if (i2 == 0) {
                Path path2 = cohVar.b;
                float[] fArr5 = this.h;
                path2.moveTo(fArr5[0], fArr5[1]);
            } else {
                Path path3 = cohVar.b;
                float[] fArr6 = this.h;
                path3.lineTo(fArr6[0], fArr6[1]);
            }
            this.a[i2].c(this.b[i2], cohVar.b);
            fuu fuuVar2 = cohVar.e;
            if (fuuVar2 != null) {
                coq coqVar3 = this.a[i2];
                Matrix matrix3 = this.b[i2];
                ((coa) fuuVar2.a).d.set(i2, false);
                ((coa) fuuVar2.a).b[i2] = coqVar3.a(matrix3);
            }
            int i3 = i2 + 1;
            float[] fArr7 = this.h;
            coq coqVar4 = this.a[i2];
            fArr7[0] = coqVar4.b;
            fArr7[1] = coqVar4.c;
            this.b[i2].mapPoints(fArr7);
            float[] fArr8 = this.i;
            int i4 = i3 % 4;
            coq coqVar5 = this.a[i4];
            fArr8[0] = 0.0f;
            fArr8[1] = coqVar5.a;
            this.b[i4].mapPoints(fArr8);
            float f2 = this.h[0];
            float[] fArr9 = this.i;
            float fMax = Math.max(((float) Math.hypot(f2 - fArr9[0], r9[1] - fArr9[1])) - 0.001f, 0.0f);
            RectF rectF3 = cohVar.c;
            float[] fArr10 = this.h;
            coq coqVar6 = this.a[i2];
            fArr10[0] = coqVar6.b;
            fArr10[1] = coqVar6.c;
            this.b[i2].mapPoints(fArr10);
            if (i2 == 1 || i2 == 3) {
                Math.abs(rectF3.centerX() - this.h[0]);
            } else {
                Math.abs(rectF3.centerY() - this.h[1]);
            }
            this.g.e();
            cof cofVar3 = cohVar.a;
            if (i2 != 1) {
                c = 2;
                if (i2 != 2) {
                    c2 = 3;
                    if (i2 != 3) {
                        cnx cnxVar = cofVar3.g;
                    } else {
                        cnx cnxVar2 = cofVar3.f;
                    }
                } else {
                    c2 = 3;
                    cnx cnxVar3 = cofVar3.i;
                }
            } else {
                c = 2;
                c2 = 3;
                cnx cnxVar4 = cofVar3.h;
            }
            this.g.d(fMax, 0.0f);
            this.j.reset();
            this.g.c(this.c[i2], this.j);
            if (this.l && (c(this.j, i2) || c(this.j, i4))) {
                Path path4 = this.j;
                path4.op(path4, this.f, Path.Op.DIFFERENCE);
                float[] fArr11 = this.h;
                fArr11[0] = 0.0f;
                fArr11[1] = this.g.a;
                this.c[i2].mapPoints(fArr11);
                Path path5 = this.e;
                float[] fArr12 = this.h;
                path5.moveTo(fArr12[0], fArr12[1]);
                this.g.c(this.c[i2], this.e);
            } else {
                this.g.c(this.c[i2], cohVar.b);
            }
            fuu fuuVar3 = cohVar.e;
            if (fuuVar3 != null) {
                coq coqVar7 = this.g;
                Matrix matrix4 = this.c[i2];
                ((coa) fuuVar3.a).d.set(i2 + 4, false);
                ((coa) fuuVar3.a).c[i2] = coqVar7.a(matrix4);
            }
            i2 = i3;
        }
        path.close();
        this.e.close();
        if (this.e.isEmpty()) {
            return;
        }
        path.op(this.e, Path.Op.UNION);
    }
}
