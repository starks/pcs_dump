package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ass {
    public boolean a;
    public int b;
    public boolean c;
    public byte d;

    public ass() {
    }

    public final void a(int i) {
        this.b = i;
        this.d = (byte) (this.d | 2);
    }

    public final void b(boolean z) {
        this.a = z;
        this.d = (byte) (this.d | 1);
    }

    public final void c(boolean z) {
        this.c = z;
        this.d = (byte) (this.d | 4);
    }

    public ass(byte[] bArr) {
        this();
    }
}
