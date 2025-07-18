package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bxw {
    private String a;
    private byte b;
    private int c;
    private int d;

    public bxw() {
    }

    public final bxx a() {
        if (this.b == 1 && this.a != null && this.c != 0 && this.d != 0) {
            return new bxx(this.a, this.c, this.d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" fileOwner");
        }
        if (this.b == 0) {
            sb.append(" hasDifferentDmaOwner");
        }
        if (this.c == 0) {
            sb.append(" fileChecks");
        }
        if (this.d == 0) {
            sb.append(" filePurpose");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(int i) {
        this.c = i;
    }

    public final void c() {
        this.a = "";
    }

    public final void d(int i) {
        this.d = 1;
    }

    public final void e() {
        this.b = (byte) 1;
    }

    public bxw(byte[] bArr) {
        this();
    }
}
