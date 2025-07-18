package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dz implements eg {
    final eg a;
    public int b = 0;
    public int c = -1;
    public int d = -1;

    public dz(eg egVar) {
        this.a = egVar;
    }

    @Override // defpackage.eg
    public final void a(int i, int i2) {
        throw null;
    }

    @Override // defpackage.eg
    public final void b(int i, int i2) {
        throw null;
    }

    public final void c() {
        int i = this.b;
        if (i == 0) {
            return;
        }
        if (i == 1) {
            this.a.a(this.c, this.d);
        } else if (i != 2) {
            eg egVar = this.a;
            ((dy) egVar).a.b.c(this.c, this.d, null);
        } else {
            this.a.b(this.c, this.d);
        }
        this.b = 0;
    }

    public final void d(int i, int i2) {
        c();
        ((dy) this.a).a.b.b(i, i2);
    }

    public final void e(int i, int i2) {
        int i3;
        int i4;
        int i5;
        if (this.b == 3 && i <= (i4 = this.d + (i3 = this.c)) && (i5 = i + 1) >= i3) {
            this.c = Math.min(i, i3);
            this.d = Math.max(i4, i5) - this.c;
        } else {
            c();
            this.c = i;
            this.d = 1;
            this.b = 3;
        }
    }
}
