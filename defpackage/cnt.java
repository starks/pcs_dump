package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cnt implements cnv {
    private final cnv a;
    private final float b;

    public cnt(float f, cnv cnvVar) {
        while (cnvVar instanceof cnt) {
            cnvVar = ((cnt) cnvVar).a;
            f += ((cnt) cnvVar).b;
        }
        this.a = cnvVar;
        this.b = f;
    }

    @Override // defpackage.cnv
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.a.a(rectF) + this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cnt)) {
            return false;
        }
        cnt cntVar = (cnt) obj;
        return this.a.equals(cntVar.a) && this.b == cntVar.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b)});
    }
}
