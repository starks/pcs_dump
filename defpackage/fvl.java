package defpackage;

import java.nio.channels.WritableByteChannel;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface fvl extends WritableByteChannel, fwd {
    void J(fvn fvnVar);

    void K(byte[] bArr);

    void M(byte[] bArr, int i);

    void P(int i);

    void Q(long j);

    void S(int i);

    void U(int i);

    @Override // defpackage.fwd, java.io.Flushable
    void flush();

    fvk p();

    fvl t(String str);
}
