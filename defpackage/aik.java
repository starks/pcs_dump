package defpackage;

import android.graphics.Paint;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aik extends aim {
    public int[] a;
    float b;
    float c;
    float d;
    float e;
    float f;
    float g;
    Paint.Cap h;
    Paint.Join i;
    float j;
    ahn k;
    ahn l;

    public aik() {
        this.b = 0.0f;
        this.c = 1.0f;
        this.d = 1.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 0.0f;
        this.h = Paint.Cap.BUTT;
        this.i = Paint.Join.MITER;
        this.j = 4.0f;
    }

    float getFillAlpha() {
        return this.d;
    }

    int getFillColor() {
        return this.l.a;
    }

    float getStrokeAlpha() {
        return this.c;
    }

    int getStrokeColor() {
        return this.k.a;
    }

    float getStrokeWidth() {
        return this.b;
    }

    float getTrimPathEnd() {
        return this.f;
    }

    float getTrimPathOffset() {
        return this.g;
    }

    float getTrimPathStart() {
        return this.e;
    }

    @Override // defpackage.vq
    public final boolean k() {
        return this.l.d() || this.k.d();
    }

    @Override // defpackage.vq
    public final boolean l(int[] iArr) {
        return this.k.e(iArr) | this.l.e(iArr);
    }

    void setFillAlpha(float f) {
        this.d = f;
    }

    void setFillColor(int i) {
        this.l.a = i;
    }

    void setStrokeAlpha(float f) {
        this.c = f;
    }

    void setStrokeColor(int i) {
        this.k.a = i;
    }

    void setStrokeWidth(float f) {
        this.b = f;
    }

    void setTrimPathEnd(float f) {
        this.f = f;
    }

    void setTrimPathOffset(float f) {
        this.g = f;
    }

    void setTrimPathStart(float f) {
        this.e = f;
    }

    public aik(aik aikVar) {
        super(aikVar);
        this.b = 0.0f;
        this.c = 1.0f;
        this.d = 1.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 0.0f;
        this.h = Paint.Cap.BUTT;
        this.i = Paint.Join.MITER;
        this.j = 4.0f;
        int[] iArr = aikVar.a;
        this.a = null;
        this.k = aikVar.k;
        this.b = aikVar.b;
        this.c = aikVar.c;
        this.l = aikVar.l;
        this.o = aikVar.o;
        this.d = aikVar.d;
        this.e = aikVar.e;
        this.f = aikVar.f;
        this.g = aikVar.g;
        this.h = aikVar.h;
        this.i = aikVar.i;
        this.j = aikVar.j;
    }
}
