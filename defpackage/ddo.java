package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class ddo extends ddq {
    public ddo() {
        ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
    }

    @Override // defpackage.ddq, defpackage.dea
    public final dea a(ByteBuffer byteBuffer) {
        c(byteBuffer);
        return this;
    }

    @Override // defpackage.ddq, defpackage.dea
    public final dea b(byte[] bArr) {
        bArr.getClass();
        g(bArr, bArr.length);
        return this;
    }

    protected void c(ByteBuffer byteBuffer) {
        throw null;
    }

    @Override // defpackage.dea
    public final void d() {
        f();
    }

    @Override // defpackage.ddq, defpackage.dea
    public final dea e(byte[] bArr, int i) {
        clq.E(0, i, bArr.length);
        g(bArr, i);
        return this;
    }

    protected abstract void f();

    protected void g(byte[] bArr, int i) {
        throw null;
    }
}
