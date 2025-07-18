package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bao {
    private volatile boolean a;
    private final bba b;
    private fsc c;

    public bao(bba bbaVar) {
        this.b = bbaVar;
    }

    private final void d() {
        if (this.a) {
            return;
        }
        dpr.a();
        this.c = new fsc(drr.a.c());
        this.a = true;
    }

    public final /* bridge */ /* synthetic */ csd a(byte[] bArr) throws GeneralSecurityException, IOException {
        d();
        dks dksVarB = bba.b();
        byte[] bArr2 = new byte[0];
        try {
            fsc fscVar = new fsc(new ByteArrayInputStream(bArr));
            try {
                Object obj = fscVar.a;
                een eenVar = een.a;
                egr egrVar = egr.a;
                dup dupVar = (dup) efb.parseFrom(dup.a, (InputStream) obj, een.a);
                if (dupVar == null || dupVar.c.d() == 0) {
                    throw new GeneralSecurityException("empty keyset");
                }
                try {
                    dvg dvgVar = (dvg) efb.parseFrom(dvg.a, dksVarB.a(dupVar.c.x(), bArr2), een.a);
                    dle.f(dvgVar);
                    return new csd(this.b, dle.b(dvgVar), true);
                } catch (efp unused) {
                    throw new GeneralSecurityException("invalid keyset, corrupted key material");
                }
            } finally {
                ((InputStream) fscVar.a).close();
            }
        } catch (IOException unused2) {
            throw new GeneralSecurityException("Parse keyset failed");
        }
    }

    public final /* bridge */ /* synthetic */ csd b(byte[] bArr) throws GeneralSecurityException {
        d();
        try {
            een eenVar = een.a;
            egr egrVar = egr.a;
            dvg dvgVar = (dvg) efb.parseFrom(dvg.a, bArr, een.a);
            dle.g(dvgVar);
            return new csd(this.b, dle.b(dvgVar), false);
        } catch (efp unused) {
            throw new GeneralSecurityException("invalid keyset");
        }
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, java.util.List] */
    public final /* bridge */ /* synthetic */ csd c() {
        d();
        fsc fscVar = this.c;
        Object objS = fscVar.a;
        if (objS == null) {
            objS = cnx.s(fscVar.aa().toByteArray());
        }
        ceg cegVar = new ceg((char[]) null);
        dlb dlbVar = new dlb((dli) objS);
        dlbVar.e = dlc.a;
        dlbVar.a();
        if (dlbVar.f != null) {
            throw new IllegalStateException("Entry has already been added to a KeysetHandle.Builder");
        }
        if (dlbVar.a) {
            cegVar.h();
        }
        bba bbaVar = this.b;
        dlbVar.f = cegVar;
        cegVar.b.add(dlbVar);
        return new csd(bbaVar, cegVar.g(), true);
    }
}
