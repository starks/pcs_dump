package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fco {
    public int b;
    public int c;
    final /* synthetic */ fcr e;
    private final int f;
    private final fcn g;
    public final fvk a = new fvk();
    public boolean d = false;

    public fco(fcr fcrVar, int i, int i2, fcn fcnVar) {
        this.e = fcrVar;
        this.f = i;
        this.b = i2;
        this.g = fcnVar;
    }

    final int a(int i) {
        if (i <= 0 || Integer.MAX_VALUE - i >= this.b) {
            int i2 = this.b + i;
            this.b = i2;
            return i2;
        }
        throw new IllegalArgumentException("Window size overflow for stream: " + this.f);
    }

    final int b() {
        return Math.max(0, Math.min(this.b, (int) this.a.b)) - this.c;
    }

    final int c() {
        return Math.min(this.b, this.e.d.b);
    }

    final void d(fvk fvkVar, int i, boolean z) {
        do {
            int iMin = Math.min(i, this.e.b.d());
            int i2 = -iMin;
            this.e.d.a(i2);
            a(i2);
            try {
                boolean z2 = false;
                if (fvkVar.b == iMin && z) {
                    z2 = true;
                }
                this.e.b.f(z2, this.f, fvkVar, iMin);
                this.g.c(iMin);
                i -= iMin;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } while (i > 0);
    }

    final boolean e() {
        return this.a.b > 0;
    }

    final void f(int i, fcq fcqVar) {
        int iMin = Math.min(i, c());
        int i2 = 0;
        while (e() && iMin > 0) {
            fvk fvkVar = this.a;
            long j = iMin;
            long j2 = fvkVar.b;
            if (j >= j2) {
                int i3 = (int) j2;
                i2 += i3;
                d(fvkVar, i3, this.d);
            } else {
                i2 += iMin;
                d(fvkVar, iMin, false);
            }
            fcqVar.a++;
            iMin = Math.min(i - i2, c());
        }
    }
}
