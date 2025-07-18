package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Shader;
import android.util.SparseArray;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahn {
    public int a;
    public final Object b;
    public final Object c;

    public ahn(Shader shader, ColorStateList colorStateList, int i) {
        this.b = shader;
        this.c = colorStateList;
        this.a = i;
    }

    public static final float b(float f) {
        double dSignum = Math.signum(f);
        float fAbs = Math.abs(f);
        return (float) (dSignum * Math.sqrt(fAbs + fAbs));
    }

    public static final long h(long j, long j2) {
        return j == 0 ? j2 : ((j / 4) * 3) + (j2 / 4);
    }

    public final void a(long j, float f) {
        int i = (this.a + 1) % 20;
        this.a = i;
        ((long[]) this.b)[i] = j;
        ((float[]) this.c)[i] = f;
    }

    public final boolean c() {
        return this.b != null;
    }

    public final boolean d() {
        Object obj;
        return this.b == null && (obj = this.c) != null && ((ColorStateList) obj).isStateful();
    }

    public final boolean e(int[] iArr) {
        if (!d()) {
            return false;
        }
        ColorStateList colorStateList = (ColorStateList) this.c;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (colorForState == this.a) {
            return false;
        }
        this.a = colorForState;
        return true;
    }

    public final boolean f() {
        return c() || this.a != 0;
    }

    public final kb g(int i) {
        kb kbVar = (kb) ((SparseArray) this.c).get(i);
        if (kbVar != null) {
            return kbVar;
        }
        kb kbVar2 = new kb();
        ((SparseArray) this.c).put(i, kbVar2);
        return kbVar2;
    }

    public ahn() {
        long[] jArr = new long[20];
        this.b = jArr;
        this.c = new float[20];
        this.a = 0;
        Arrays.fill(jArr, Long.MIN_VALUE);
    }

    public ahn(byte[] bArr) {
        this.c = new SparseArray();
        this.a = 0;
        this.b = Collections.newSetFromMap(new IdentityHashMap());
    }
}
