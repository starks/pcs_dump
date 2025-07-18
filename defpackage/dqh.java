package defpackage;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dqh implements dkw {
    private static final byte[] a = new byte[0];
    private final dqj b;
    private final dqf c;
    private final int d;
    private final byte[] e;
    private final exo f;
    private final fsc g;

    public dqh(exo exoVar, dqj dqjVar, fsc fscVar, dqf dqfVar, int i, dwt dwtVar) {
        this.f = exoVar;
        this.b = dqjVar;
        this.g = fscVar;
        this.c = dqfVar;
        this.d = i;
        this.e = dwtVar.c();
    }

    @Override // defpackage.dkw
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        byte[] bArr3 = this.e;
        int length2 = bArr3.length + this.d;
        if (length < length2) {
            throw new GeneralSecurityException("Ciphertext is too short.");
        }
        if (!dsp.c(bArr3, bArr)) {
            throw new GeneralSecurityException("Invalid ciphertext (output prefix mismatch)");
        }
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArr4 = bArr2;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, this.e.length, length2);
        exo exoVar = this.f;
        dqj dqjVar = this.b;
        fsc fscVar = this.g;
        dqf dqfVar = this.c;
        dqg dqgVarB = dqg.b(dql.a, bArrCopyOfRange, dqjVar.b(bArrCopyOfRange, exoVar), dqjVar, fscVar, dqfVar, bArr4);
        byte[] bArr5 = a;
        return dqgVarB.a.c(dqgVarB.b, dqgVarB.a(), bArr, length2, bArr5);
    }
}
