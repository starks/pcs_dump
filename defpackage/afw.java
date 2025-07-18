package defpackage;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.google.android.apps.aicore.aidl.AIFeature;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afw {
    final RectF a = new RectF();
    final Paint b;
    final Paint c;
    final Paint d;
    float e;
    float f;
    public float g;
    float h;
    int[] i;
    int j;
    float k;
    float l;
    float m;
    boolean n;
    Path o;
    float p;
    public float q;
    public int r;
    public int s;
    int t;
    int u;

    public afw() {
        Paint paint = new Paint();
        this.b = paint;
        Paint paint2 = new Paint();
        this.c = paint2;
        Paint paint3 = new Paint();
        this.d = paint3;
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = 5.0f;
        this.p = 1.0f;
        this.t = AIFeature.Id.ROSIE_ROBOT_TRANSLATE;
        paint.setStrokeCap(Paint.Cap.SQUARE);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setAntiAlias(true);
        paint3.setColor(0);
    }

    final int a() {
        int length = this.i.length;
        return 0;
    }

    final int b() {
        return this.i[0];
    }

    final void c() {
        this.k = 0.0f;
        this.l = 0.0f;
        this.m = 0.0f;
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 0.0f;
    }

    public final void d(int i) {
        this.j = 0;
        this.u = this.i[0];
    }

    final void e(boolean z) {
        if (this.n != z) {
            this.n = z;
        }
    }

    public final void f(float f) {
        this.h = f;
        this.b.setStrokeWidth(f);
    }

    final void g() {
        this.k = this.e;
        this.l = this.f;
        this.m = this.g;
    }
}
