package defpackage;

import android.util.SparseIntArray;

/* compiled from: PG */
/* loaded from: classes.dex */
public class iz {
    final SparseIntArray a = new SparseIntArray();
    final SparseIntArray b = new SparseIntArray();

    public static final int c(int i, int i2) {
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            i3++;
            if (i4 >= i) {
                break;
            }
            if (i3 == i2) {
                i5++;
                i3 = 0;
            } else if (i3 > i2) {
                i5++;
                i3 = 1;
            }
            i4++;
        }
        return i3 > i2 ? i5 + 1 : i5;
    }

    public final void a() {
        this.b.clear();
    }

    public final void b() {
        this.a.clear();
    }
}
