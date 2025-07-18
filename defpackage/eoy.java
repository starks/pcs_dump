package defpackage;

import java.io.ByteArrayInputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eoy extends eox {
    private final eow e;

    public eoy(String str, eow eowVar) {
        super(str, false, eowVar);
        clq.D(str.endsWith("-bin"), "Binary header is named %s. It must end with %s", str, "-bin");
        clq.w(str.length() > 4, "empty key name");
        this.e = eowVar;
    }

    @Override // defpackage.eox
    public final Object a(byte[] bArr) {
        return this.e.b(new ByteArrayInputStream(bArr));
    }

    @Override // defpackage.eox
    public final byte[] b(Object obj) {
        return epc.i(this.e.a(obj));
    }

    @Override // defpackage.eox
    public final boolean d() {
        return true;
    }
}
