package defpackage;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dds extends ByteArrayOutputStream {
    public dds(int i) {
        super(i);
    }

    final int a() {
        return this.count;
    }

    final void b(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        if (this.count + iRemaining > this.buf.length) {
            this.buf = Arrays.copyOf(this.buf, this.count + iRemaining);
        }
        byteBuffer.get(this.buf, this.count, iRemaining);
        this.count += iRemaining;
    }

    final byte[] c() {
        return this.buf;
    }
}
