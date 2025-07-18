package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bam extends anx {
    static final aoc a = new aoc("ProtectedDownload__enabled", false);
    static final aoc b = new aoc("ProtectedDownload__enable_attestation", false);
    static final aoc c = new aoc("ProtectedDownload__enable_virtual_machines", false);
    public final aof d;

    public bam(aof aofVar) {
        this.d = aofVar;
    }

    @Override // defpackage.anx
    protected final /* bridge */ /* synthetic */ Object a() {
        return new bak(vr.c(this.d, a).booleanValue(), vr.c(this.d, b).booleanValue(), vr.c(this.d, c).booleanValue());
    }
}
