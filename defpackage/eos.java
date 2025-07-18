package defpackage;

import java.nio.charset.StandardCharsets;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eos extends eox {
    private final eot e;

    public eos(String str, eot eotVar) {
        super(str, false, eotVar);
        clq.D(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
        eotVar.getClass();
        this.e = eotVar;
    }

    @Override // defpackage.eox
    public final Object a(byte[] bArr) {
        return this.e.a(new String(bArr, StandardCharsets.US_ASCII));
    }

    @Override // defpackage.eox
    public final byte[] b(Object obj) {
        return this.e.b(obj).getBytes(StandardCharsets.US_ASCII);
    }
}
