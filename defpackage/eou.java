package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eou extends eox {
    private final eov e;

    public eou(eov eovVar) {
        super("grpc-status-details-bin", false, eovVar);
        clq.D(true, "Binary header is named %s. It must end with %s", "grpc-status-details-bin", "-bin");
        clq.w(true, "empty key name");
        this.e = eovVar;
    }

    @Override // defpackage.eox
    public final Object a(byte[] bArr) {
        return this.e.a(bArr);
    }

    @Override // defpackage.eox
    public final byte[] b(Object obj) {
        return this.e.b(obj);
    }
}
