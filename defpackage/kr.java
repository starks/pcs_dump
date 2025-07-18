package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kr {
    public int a = 0;
    public int b = 0;
    public int c = Integer.MIN_VALUE;
    public int d = Integer.MIN_VALUE;
    public int e = 0;
    public int f = 0;
    public boolean g = false;
    public boolean h = false;

    public final void a(int i, int i2) {
        this.c = i;
        this.d = i2;
        this.h = true;
        boolean z = this.g;
        boolean z2 = i2 == Integer.MIN_VALUE;
        boolean z3 = i == Integer.MIN_VALUE;
        if (true != (true != z ? z3 : z2)) {
            this.a = true != z ? i : i2;
        }
        if (true == z) {
            z2 = z3;
        }
        if (true != z2) {
            if (true != z) {
                i = i2;
            }
            this.b = i;
        }
    }
}
