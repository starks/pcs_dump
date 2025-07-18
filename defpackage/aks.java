package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aks {
    public boolean a;
    public boolean b;
    public long c;
    public int d;
    public boolean e;
    public long f;
    public long g;
    public int h;
    public byte i;

    public aks() {
    }

    public final void a(boolean z) {
        this.b = z;
        this.i = (byte) (this.i | 2);
    }

    public final void b(boolean z) {
        this.e = z;
        this.i = (byte) (this.i | 16);
    }

    public final void c(long j) {
        this.f = j;
        this.i = (byte) (this.i | 32);
    }

    public final void d(long j) {
        this.g = j;
        this.i = (byte) (this.i | 64);
    }

    public final void e(int i) {
        this.h = i;
        this.i = (byte) (this.i | Byte.MIN_VALUE);
    }

    public final void f(int i) {
        this.d = i;
        this.i = (byte) (this.i | 8);
    }

    public final void g(long j) {
        this.c = j;
        this.i = (byte) (this.i | 4);
    }

    public aks(byte[] bArr) {
        this();
    }
}
