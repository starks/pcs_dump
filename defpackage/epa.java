package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class epa extends eox {
    private final epb e;

    public epa(String str, boolean z, epb epbVar) {
        super(str, z, epbVar);
        clq.D(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
        epbVar.getClass();
        this.e = epbVar;
    }

    @Override // defpackage.eox
    public final Object a(byte[] bArr) {
        return this.e.a(bArr);
    }

    @Override // defpackage.eox
    public final byte[] b(Object obj) {
        byte[] bArrB = this.e.b(obj);
        bArrB.getClass();
        return bArrB;
    }
}
