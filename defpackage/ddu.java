package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class ddu extends ddq {
    private final ByteBuffer a;

    protected ddu() {
        clq.v(true);
        this.a = ByteBuffer.allocate(23).order(ByteOrder.LITTLE_ENDIAN);
    }

    private final void i() {
        this.a.flip();
        while (this.a.remaining() >= 16) {
            g(this.a);
        }
        this.a.compact();
    }

    private final void j() {
        if (this.a.remaining() < 8) {
            i();
        }
    }

    private final void k(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() <= this.a.remaining()) {
            this.a.put(byteBuffer);
            j();
            return;
        }
        int iPosition = 16 - this.a.position();
        for (int i = 0; i < iPosition; i++) {
            this.a.put(byteBuffer.get());
        }
        i();
        while (byteBuffer.remaining() >= 16) {
            g(byteBuffer);
        }
        this.a.put(byteBuffer);
    }

    @Override // defpackage.ddq, defpackage.dea
    public final dea a(ByteBuffer byteBuffer) {
        ByteOrder byteOrderOrder = byteBuffer.order();
        try {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            k(byteBuffer);
            return this;
        } finally {
            byteBuffer.order(byteOrderOrder);
        }
    }

    @Override // defpackage.dea
    public final void d() {
        this.a.put((byte) 0);
        j();
    }

    @Override // defpackage.ddq, defpackage.dea
    public final dea e(byte[] bArr, int i) {
        k(ByteBuffer.wrap(bArr, 0, i).order(ByteOrder.LITTLE_ENDIAN));
        return this;
    }

    protected abstract ddy f();

    protected abstract void g(ByteBuffer byteBuffer);

    protected void h(ByteBuffer byteBuffer) {
        throw null;
    }

    @Override // defpackage.dea
    public final ddy l() {
        i();
        this.a.flip();
        if (this.a.remaining() > 0) {
            h(this.a);
            ByteBuffer byteBuffer = this.a;
            byteBuffer.position(byteBuffer.limit());
        }
        return f();
    }
}
