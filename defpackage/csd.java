package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class csd {
    public final boolean a;
    public final Object b;
    public final Object c;

    public csd(bba bbaVar, dle dleVar, boolean z) {
        this.b = bbaVar;
        this.c = dleVar;
        this.a = z;
    }

    public static csd b(char c) {
        return new csd(new cry(new crh(c), 0));
    }

    public static csd c(String str) {
        int i = 1;
        clq.w(str.length() != 0, "The separator may not be the empty string.");
        return str.length() == 1 ? b(str.charAt(0)) : new csd(new cry(str, i));
    }

    private final dle l() {
        return (dle) (this.a ? ((dle) this.c).c() : this.c);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [csc, java.lang.Object] */
    public final csd a() {
        return new csd((csc) this.c, true, (crl) this.b);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [csc, java.lang.Object] */
    public final csd d() {
        crl crlVar = crk.b;
        crlVar.getClass();
        return new csd((csc) this.c, this.a, crlVar);
    }

    public final Iterable e(CharSequence charSequence) {
        charSequence.getClass();
        return new csb(this, charSequence);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [csc, java.lang.Object] */
    public final Iterator f(CharSequence charSequence) {
        return this.c.a(this, charSequence);
    }

    public final String g() {
        dle dleVarL = l();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(128);
        if (dleVarL.a() != 1) {
            throw new IllegalArgumentException("Expected exactly 1 key.");
        }
        byteBufferAllocate.put((byte) 4);
        for (dld dldVar : dleVarL.b) {
            if (dldVar != null && dldVar.b) {
                if (dldVar.d != dla.a) {
                    throw new IllegalStateException("Keyset has primary which isn't enabled");
                }
                Object obj = dldVar.c;
                if (obj instanceof dpq) {
                    byteBufferAllocate.put(((dpq) obj).b.c());
                } else {
                    if (!(obj instanceof dph)) {
                        throw new IllegalArgumentException("Unexpected key type: ".concat(String.valueOf(String.valueOf(obj.getClass()))));
                    }
                    ECPoint eCPoint = ((dph) obj).b;
                    if (eCPoint == null) {
                        throw new IllegalArgumentException("Invalid eciesPublicKey. ECPoint is null.");
                    }
                    bba.a(byteBufferAllocate, eCPoint.getAffineX());
                    bba.a(byteBufferAllocate, eCPoint.getAffineY());
                }
                byteBufferAllocate.flip();
                int i = ded.b;
                return ((ddp) deb.a).b(byteBufferAllocate.remaining()).a(byteBufferAllocate).l().toString();
            }
        }
        throw new IllegalStateException("Keyset has no valid primary");
    }

    public final boolean h() {
        return this.a;
    }

    public final byte[] i(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (!this.a) {
            throw new GeneralSecurityException("cannot decrypt without a private key");
        }
        return ((dkw) ((dle) this.c).e(dsj.a, dkw.class)).a(bArr, bArr2);
    }

    public final byte[] j(byte[] bArr, byte[] bArr2) {
        return ((dkx) l().e(dsj.a, dkx.class)).a(bArr, bArr2);
    }

    public final byte[] k() throws GeneralSecurityException, IOException {
        dle dleVarL = l();
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            fsc fscVar = new fsc(byteArrayOutputStream);
            dle.g(dleVarL.a);
            try {
                dleVarL.a.writeTo((OutputStream) fscVar.a);
                ((OutputStream) fscVar.a).close();
                return byteArrayOutputStream.toByteArray();
            } catch (Throwable th) {
                ((OutputStream) fscVar.a).close();
                throw th;
            }
        } catch (IOException unused) {
            throw new GeneralSecurityException("Serialize keyset failed");
        }
    }

    private csd(csc cscVar, boolean z, crl crlVar) {
        this.c = cscVar;
        this.a = z;
        this.b = crlVar;
    }

    private csd(csc cscVar) {
        this(cscVar, false, crj.a);
    }
}
