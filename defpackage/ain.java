package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Shader;
import com.google.android.apps.aicore.aidl.AIFeature;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ain {
    public static final Matrix a = new Matrix();
    Paint b;
    Paint c;
    final ail d;
    float e;
    float f;
    float g;
    float h;
    int i;
    String j;
    Boolean k;
    final nv l;
    private final Path m;
    private final Path n;
    private final Matrix o;
    private PathMeasure p;
    private int q;

    public ain() {
        this.o = new Matrix();
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = 0.0f;
        this.i = AIFeature.Id.ROSIE_ROBOT_TRANSLATE;
        this.j = null;
        this.k = null;
        this.l = new nv();
        this.d = new ail();
        this.m = new Path();
        this.n = new Path();
    }

    public final void a(ail ailVar, Matrix matrix, Canvas canvas, int i, int i2) {
        ailVar.a.set(matrix);
        ailVar.a.preConcat(ailVar.j);
        canvas.save();
        for (int i3 = 0; i3 < ailVar.b.size(); i3++) {
            vq vqVar = (vq) ailVar.b.get(i3);
            if (vqVar instanceof ail) {
                a((ail) vqVar, ailVar.a, canvas, i, i2);
            } else if (vqVar instanceof aim) {
                aim aimVar = (aim) vqVar;
                float f = i / this.g;
                float f2 = i2 / this.h;
                float fMin = Math.min(f, f2);
                Matrix matrix2 = ailVar.a;
                this.o.set(matrix2);
                this.o.postScale(f, f2);
                float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                matrix2.mapVectors(fArr);
                float fHypot = (float) Math.hypot(fArr[0], fArr[1]);
                float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                float f3 = fArr[0];
                float f4 = fArr[1];
                float f5 = fArr[2];
                float f6 = f3 * fArr[3];
                float f7 = f4 * f5;
                float fMax = Math.max(fHypot, fHypot2);
                float fAbs = fMax > 0.0f ? Math.abs(f6 - f7) / fMax : 0.0f;
                if (fAbs != 0.0f) {
                    Path path = this.m;
                    path.reset();
                    sb[] sbVarArr = aimVar.m;
                    if (sbVarArr != null) {
                        ul.m(sbVarArr, path);
                    }
                    Path path2 = this.m;
                    this.n.reset();
                    if (aimVar.m()) {
                        this.n.setFillType(aimVar.o == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                        this.n.addPath(path2, this.o);
                        canvas.clipPath(this.n);
                    } else {
                        aik aikVar = (aik) aimVar;
                        float f8 = aikVar.e;
                        if (f8 != 0.0f || aikVar.f != 1.0f) {
                            float f9 = aikVar.g;
                            float f10 = (f8 + f9) % 1.0f;
                            float f11 = (aikVar.f + f9) % 1.0f;
                            if (this.p == null) {
                                this.p = new PathMeasure();
                            }
                            this.p.setPath(this.m, false);
                            float length = this.p.getLength();
                            float f12 = f10 * length;
                            float f13 = f11 * length;
                            path2.reset();
                            if (f12 > f13) {
                                this.p.getSegment(f12, length, path2, true);
                                this.p.getSegment(0.0f, f13, path2, true);
                            } else {
                                this.p.getSegment(f12, f13, path2, true);
                            }
                            path2.rLineTo(0.0f, 0.0f);
                        }
                        this.n.addPath(path2, this.o);
                        if (aikVar.l.f()) {
                            ahn ahnVar = aikVar.l;
                            if (this.c == null) {
                                Paint paint = new Paint(1);
                                this.c = paint;
                                paint.setStyle(Paint.Style.FILL);
                            }
                            Paint paint2 = this.c;
                            if (ahnVar.c()) {
                                Shader shader = (Shader) ahnVar.b;
                                shader.setLocalMatrix(this.o);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(aikVar.d * 255.0f));
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(AIFeature.Id.ROSIE_ROBOT_TRANSLATE);
                                paint2.setColor(aiq.a(ahnVar.a, aikVar.d));
                            }
                            paint2.setColorFilter(null);
                            this.n.setFillType(aikVar.o == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            canvas.drawPath(this.n, paint2);
                        }
                        if (aikVar.k.f()) {
                            ahn ahnVar2 = aikVar.k;
                            if (this.b == null) {
                                Paint paint3 = new Paint(1);
                                this.b = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = this.b;
                            Paint.Join join = aikVar.i;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = aikVar.h;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(aikVar.j);
                            if (ahnVar2.c()) {
                                Shader shader2 = (Shader) ahnVar2.b;
                                shader2.setLocalMatrix(this.o);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(aikVar.c * 255.0f));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(AIFeature.Id.ROSIE_ROBOT_TRANSLATE);
                                paint4.setColor(aiq.a(ahnVar2.a, aikVar.c));
                            }
                            paint4.setColorFilter(null);
                            paint4.setStrokeWidth(aikVar.b * fAbs * fMin);
                            canvas.drawPath(this.n, paint4);
                        }
                    }
                }
            }
        }
        canvas.restore();
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.i;
    }

    public void setAlpha(float f) {
        setRootAlpha((int) (f * 255.0f));
    }

    public void setRootAlpha(int i) {
        this.i = i;
    }

    public ain(ain ainVar) {
        this.o = new Matrix();
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = 0.0f;
        this.i = AIFeature.Id.ROSIE_ROBOT_TRANSLATE;
        this.j = null;
        this.k = null;
        nv nvVar = new nv();
        this.l = nvVar;
        this.d = new ail(ainVar.d, nvVar);
        this.m = new Path(ainVar.m);
        this.n = new Path(ainVar.n);
        this.e = ainVar.e;
        this.f = ainVar.f;
        this.g = ainVar.g;
        this.h = ainVar.h;
        int i = ainVar.q;
        this.q = 0;
        this.i = ainVar.i;
        this.j = ainVar.j;
        String str = ainVar.j;
        if (str != null) {
            nvVar.put(str, this);
        }
        this.k = ainVar.k;
    }
}
