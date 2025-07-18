package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aon extends anx {
    public static final aoc a = new aoc("PcsCommon__enable_heartbeat_job", false);
    public final aof b;

    public aon(aof aofVar) {
        this.b = aofVar;
    }

    @Override // defpackage.anx
    protected final /* bridge */ /* synthetic */ Object a() {
        bfl bflVar = new bfl(null, null, null);
        bflVar.c(false);
        bflVar.c(vr.c(this.b, a).booleanValue());
        if (bflVar.b == 1) {
            return new aom(bflVar.a);
        }
        throw new IllegalStateException("Missing required properties: enableHeartBeatJob");
    }
}
