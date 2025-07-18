package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class auq {
    public boolean a;
    public boolean b;
    public byte c;

    public auq() {
    }

    public final void a(boolean z) {
        this.a = z;
        this.c = (byte) (this.c | 1);
    }

    public final void b(boolean z) {
        this.a = z;
        this.c = (byte) (this.c | 2);
    }

    public final void c(boolean z) {
        this.b = z;
        this.c = (byte) (this.c | 1);
    }

    public auq(byte[] bArr) {
        this();
    }

    public auq(byte[] bArr, byte[] bArr2) {
        this();
    }
}
