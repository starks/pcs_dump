package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aee extends aef {
    private final afq a;

    public aee(afb afbVar, String str) {
        super(afbVar, str);
        this.a = afbVar.j(str);
    }

    @Override // defpackage.afa
    public final int a() {
        m();
        return 0;
    }

    @Override // defpackage.afa
    public final long b(int i) {
        m();
        uq.l(21, "no row");
        throw new ffn();
    }

    @Override // defpackage.afa
    public final String c(int i) {
        m();
        uq.l(21, "no row");
        throw new ffn();
    }

    @Override // defpackage.afa, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
        o();
    }

    @Override // defpackage.afa
    public final String d(int i) {
        m();
        uq.l(21, "no row");
        throw new ffn();
    }

    @Override // defpackage.afa
    public final void e(int i, byte[] bArr) {
        m();
        this.a.a(i, bArr);
    }

    @Override // defpackage.afa
    public final void f(int i, long j) {
        m();
        this.a.c(i, j);
    }

    @Override // defpackage.afa
    public final void g(int i) {
        m();
        this.a.d(10);
    }

    @Override // defpackage.afa
    public final void h(int i, String str) {
        m();
        this.a.e(i, str);
    }

    @Override // defpackage.afa
    public final boolean j(int i) {
        m();
        uq.l(21, "no row");
        throw new ffn();
    }

    @Override // defpackage.afa
    public final boolean k() {
        m();
        this.a.f();
        return false;
    }

    @Override // defpackage.afa
    public final byte[] l(int i) {
        m();
        uq.l(21, "no row");
        throw new ffn();
    }

    @Override // defpackage.afa
    public final void i() {
    }
}
