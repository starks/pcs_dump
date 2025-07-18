package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class oz {
    pb a;
    final /* synthetic */ pa b;

    public oz(pa paVar) {
        this.b = paVar;
    }

    public final boolean a(pb pbVar, float f) {
        boolean z = true;
        if (!this.a.b) {
            for (int i = 0; i < 9; i++) {
                float f2 = pbVar.i[i];
                if (f2 != 0.0f) {
                    float f3 = f2 * f;
                    if (Math.abs(f3) < 1.0E-4f) {
                        f3 = 0.0f;
                    }
                    this.a.i[i] = f3;
                } else {
                    this.a.i[i] = 0.0f;
                }
            }
            return true;
        }
        for (int i2 = 0; i2 < 9; i2++) {
            float[] fArr = this.a.i;
            float f4 = fArr[i2] + (pbVar.i[i2] * f);
            fArr[i2] = f4;
            if (Math.abs(f4) < 1.0E-4f) {
                this.a.i[i2] = 0.0f;
            } else {
                z = false;
            }
        }
        if (z) {
            this.b.p(this.a);
        }
        return false;
    }

    public final String toString() {
        String str = "[ ";
        if (this.a != null) {
            for (int i = 0; i < 9; i++) {
                str = str + this.a.i[i] + " ";
            }
        }
        return str + "] " + this.a;
    }
}
