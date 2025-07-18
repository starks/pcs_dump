package defpackage;

import com.google.android.apps.aicore.aidl.AIFeature;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lm {
    int a = 0;
    int b;
    int c;
    int d;
    int e;

    static final int e(int i, int i2) {
        if (i > i2) {
            return 1;
        }
        return i == i2 ? 2 : 4;
    }

    public final void a(int i) {
        this.a = i | this.a;
    }

    public final void b() {
        this.a = 0;
    }

    public final void c(int i, int i2, int i3, int i4) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public final boolean d() {
        int i = this.a;
        if ((i & 7) != 0 && (e(this.d, this.b) & i) == 0) {
            return false;
        }
        if ((i & AIFeature.Id.CHROME_SUMMARIZATION_PER_LAYER_GEM) != 0 && ((e(this.d, this.c) << 4) & i) == 0) {
            return false;
        }
        if ((i & 1792) == 0 || ((e(this.e, this.b) << 8) & i) != 0) {
            return (i & 28672) == 0 || ((e(this.e, this.c) << 12) & i) != 0;
        }
        return false;
    }
}
