package defpackage;

import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eyc extends OutputStream {
    final /* synthetic */ eye a;

    public eyc(eye eyeVar) {
        this.a = eyeVar;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        write(new byte[]{(byte) i}, 0, 1);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        this.a.g(bArr, i, i2);
    }
}
