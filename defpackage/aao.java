package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aao extends zx {
    public static final zz a = new aan(0);
    public final od b = new od();
    public boolean c = false;

    public final void a() {
        this.c = false;
    }

    public final aal b() {
        return (aal) oe.a(this.b, 54321);
    }

    @Override // defpackage.zx
    protected final void c() {
        int iB = this.b.b();
        for (int i = 0; i < iB; i++) {
            ((aal) this.b.c(i)).l();
        }
        od odVar = this.b;
        int i2 = odVar.d;
        Object[] objArr = odVar.c;
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = null;
        }
        odVar.d = 0;
        odVar.a = false;
    }
}
