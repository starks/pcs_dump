package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class coq {

    @Deprecated
    public float a;

    @Deprecated
    public float b;

    @Deprecated
    public float c;

    @Deprecated
    public float d;

    @Deprecated
    public float e;
    public final List f = new ArrayList();
    private final List g = new ArrayList();

    public coq() {
        e();
    }

    private final void g(float f) {
        float f2 = this.d;
        if (f2 == f) {
            return;
        }
        float f3 = ((f - f2) + 360.0f) % 360.0f;
        if (f3 <= 180.0f) {
            float f4 = this.b;
            float f5 = this.c;
            com comVar = new com(f4, f5, f4, f5);
            comVar.e = this.d;
            comVar.f = f3;
            this.g.add(new cok(comVar));
            this.d = f;
        }
    }

    final cop a(Matrix matrix) {
        g(this.e);
        return new coj(new ArrayList(this.g), new Matrix(matrix));
    }

    public final void b(cop copVar, float f, float f2) {
        g(f);
        this.g.add(copVar);
        this.d = f2;
    }

    public final void c(Matrix matrix, Path path) {
        int size = this.f.size();
        for (int i = 0; i < size; i++) {
            ((coo) this.f.get(i)).a(matrix, path);
        }
    }

    public final void d(float f, float f2) {
        con conVar = new con();
        conVar.a = f;
        conVar.b = f2;
        this.f.add(conVar);
        col colVar = new col(conVar, this.b, this.c);
        b(colVar, colVar.a() + 270.0f, colVar.a() + 270.0f);
        this.b = f;
        this.c = f2;
    }

    public final void e() {
        f(0.0f, 270.0f, 0.0f);
    }

    public final void f(float f, float f2, float f3) {
        this.a = f;
        this.b = 0.0f;
        this.c = f;
        this.d = f2;
        this.e = (f2 + f3) % 360.0f;
        this.f.clear();
        this.g.clear();
    }
}
