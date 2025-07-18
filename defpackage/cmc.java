package defpackage;

import android.graphics.Matrix;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cmc extends cjn {
    final /* synthetic */ cml a;

    public cmc(cml cmlVar) {
        this.a = cmlVar;
    }

    @Override // defpackage.cjn
    /* renamed from: a */
    public final Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
        this.a.A = f;
        return super.evaluate(f, matrix, matrix2);
    }

    @Override // defpackage.cjn, android.animation.TypeEvaluator
    public final /* bridge */ /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
        return evaluate(f, (Matrix) obj, (Matrix) obj2);
    }
}
