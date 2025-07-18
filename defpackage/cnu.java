package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cnu implements cnv {
    private final float a;

    public cnu(float f) {
        this.a = f;
    }

    @Override // defpackage.cnv
    public final float a(RectF rectF) {
        return un.G(this.a, Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cnu) && this.a == ((cnu) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }
}
