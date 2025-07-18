package defpackage;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dej extends ddo {
    private final MessageDigest a;
    private final int b;
    private boolean c;

    public dej(MessageDigest messageDigest, int i) {
        this.a = messageDigest;
        this.b = i;
    }

    private final void h() {
        clq.G(!this.c, "Cannot re-use a Hasher after calling hash() on it");
    }

    @Override // defpackage.ddo
    protected final void c(ByteBuffer byteBuffer) {
        h();
        this.a.update(byteBuffer);
    }

    @Override // defpackage.ddo
    protected final void f() {
        h();
        this.a.update((byte) 0);
    }

    @Override // defpackage.ddo
    protected final void g(byte[] bArr, int i) {
        h();
        this.a.update(bArr, 0, i);
    }

    @Override // defpackage.dea
    public final ddy l() {
        h();
        this.c = true;
        if (this.b == this.a.getDigestLength()) {
            byte[] bArrDigest = this.a.digest();
            int i = ddy.b;
            return new ddw(bArrDigest);
        }
        MessageDigest messageDigest = this.a;
        byte[] bArrCopyOf = Arrays.copyOf(messageDigest.digest(), this.b);
        int i2 = ddy.b;
        return new ddw(bArrCopyOf);
    }
}
