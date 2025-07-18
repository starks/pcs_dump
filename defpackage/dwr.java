package defpackage;

import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dwr implements dlh {
    private static final byte[] a = {0};
    private final dtn b;
    private final int c;
    private final byte[] d;
    private final byte[] e;

    public dwr(dsq dsqVar) {
        this.b = new dwo(dsqVar.d.U());
        this.c = dsqVar.a.b;
        this.d = dsqVar.b.c();
        if (dsqVar.a.c.equals(dss.c)) {
            this.e = Arrays.copyOf(a, 1);
        } else {
            this.e = new byte[0];
        }
    }

    @Override // defpackage.dlh
    public final byte[] a(byte[] bArr) {
        byte[] bArr2 = this.e;
        return bArr2.length > 0 ? dcr.al(this.d, this.b.a(dcr.al(bArr, bArr2), this.c)) : dcr.al(this.d, this.b.a(bArr, this.c));
    }

    public dwr(dsx dsxVar) {
        String strValueOf = String.valueOf(String.valueOf(dsxVar.a.d));
        this.b = new dwq("HMAC".concat(strValueOf), new SecretKeySpec(dsxVar.d.U(), "HMAC"));
        this.c = dsxVar.a.b;
        this.d = dsxVar.b.c();
        if (dsxVar.a.c.equals(dta.c)) {
            this.e = Arrays.copyOf(a, 1);
        } else {
            this.e = new byte[0];
        }
    }

    public dwr(dtn dtnVar, int i) {
        this.b = dtnVar;
        this.c = i;
        this.d = new byte[0];
        this.e = new byte[0];
        dtnVar.a(new byte[0], i);
    }
}
