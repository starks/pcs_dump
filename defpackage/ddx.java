package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ddx extends ddy implements Serializable {
    private static final long serialVersionUID = 0;
    final long a;

    public ddx(long j) {
        this.a = j;
    }

    @Override // defpackage.ddy
    public final int a() {
        return (int) this.a;
    }

    @Override // defpackage.ddy
    public final int b() {
        return 64;
    }

    @Override // defpackage.ddy
    public final long c() {
        return this.a;
    }

    @Override // defpackage.ddy
    public final boolean d(ddy ddyVar) {
        return this.a == ddyVar.c();
    }

    @Override // defpackage.ddy
    public final byte[] e() {
        return new byte[]{(byte) this.a, (byte) (r0 >> 8), (byte) (r0 >> 16), (byte) (r0 >> 24), (byte) (r0 >> 32), (byte) (r0 >> 40), (byte) (r0 >> 48), (byte) (r0 >> 56)};
    }
}
