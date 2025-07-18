package defpackage;

import android.graphics.Matrix;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ail extends vq {
    final Matrix a;
    final ArrayList b;
    float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    final Matrix j;
    int k;
    public int[] l;
    public String m;

    public ail() {
        this.a = new Matrix();
        this.b = new ArrayList();
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = new Matrix();
        this.m = null;
    }

    public String getGroupName() {
        return this.m;
    }

    public Matrix getLocalMatrix() {
        return this.j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.e;
    }

    public float getRotation() {
        return this.c;
    }

    public float getScaleX() {
        return this.f;
    }

    public float getScaleY() {
        return this.g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.i;
    }

    @Override // defpackage.vq
    public final boolean k() {
        for (int i = 0; i < this.b.size(); i++) {
            if (((vq) this.b.get(i)).k()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.vq
    public final boolean l(int[] iArr) {
        boolean zL = false;
        for (int i = 0; i < this.b.size(); i++) {
            zL |= ((vq) this.b.get(i)).l(iArr);
        }
        return zL;
    }

    public final void m() {
        this.j.reset();
        this.j.postTranslate(-this.d, -this.e);
        this.j.postScale(this.f, this.g);
        this.j.postRotate(this.c, 0.0f, 0.0f);
        this.j.postTranslate(this.h + this.d, this.i + this.e);
    }

    public void setPivotX(float f) {
        if (f != this.d) {
            this.d = f;
            m();
        }
    }

    public void setPivotY(float f) {
        if (f != this.e) {
            this.e = f;
            m();
        }
    }

    public void setRotation(float f) {
        if (f != this.c) {
            this.c = f;
            m();
        }
    }

    public void setScaleX(float f) {
        if (f != this.f) {
            this.f = f;
            m();
        }
    }

    public void setScaleY(float f) {
        if (f != this.g) {
            this.g = f;
            m();
        }
    }

    public void setTranslateX(float f) {
        if (f != this.h) {
            this.h = f;
            m();
        }
    }

    public void setTranslateY(float f) {
        if (f != this.i) {
            this.i = f;
            m();
        }
    }

    public ail(ail ailVar, nv nvVar) {
        aim aijVar;
        this.a = new Matrix();
        this.b = new ArrayList();
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        Matrix matrix = new Matrix();
        this.j = matrix;
        this.m = null;
        this.c = ailVar.c;
        this.d = ailVar.d;
        this.e = ailVar.e;
        this.f = ailVar.f;
        this.g = ailVar.g;
        this.h = ailVar.h;
        this.i = ailVar.i;
        int[] iArr = ailVar.l;
        this.l = null;
        String str = ailVar.m;
        this.m = str;
        int i = ailVar.k;
        this.k = 0;
        if (str != null) {
            nvVar.put(str, this);
        }
        matrix.set(ailVar.j);
        ArrayList arrayList = ailVar.b;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            Object obj = arrayList.get(i2);
            if (obj instanceof ail) {
                this.b.add(new ail((ail) obj, nvVar));
            } else {
                if (obj instanceof aik) {
                    aijVar = new aik((aik) obj);
                } else if (obj instanceof aij) {
                    aijVar = new aij((aij) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.b.add(aijVar);
                Object obj2 = aijVar.n;
                if (obj2 != null) {
                    nvVar.put(obj2, aijVar);
                }
            }
        }
    }
}
