package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class asu extends anx {
    static final aoc a = new aoc("PcsHttp__enable_on_ready_handler", true);
    static final aod b = new aod("PcsHttp__ipc_streaming_throttle_ms", 4000);
    static final aoc c;
    public final aof d;

    static {
        int i = sj.a;
        c = new aoc("PcsHttp__write_to_pfd", true);
    }

    public asu(aof aofVar) {
        this.d = aofVar;
    }

    @Override // defpackage.anx
    protected final /* bridge */ /* synthetic */ Object a() {
        ass assVar = new ass(null);
        assVar.b(true);
        assVar.a(4000);
        assVar.c(false);
        assVar.b(vr.c(this.d, a).booleanValue());
        assVar.a(vr.d(this.d, b).intValue());
        assVar.c(vr.c(this.d, c).booleanValue());
        if (assVar.d == 7) {
            return new ast(assVar.a, assVar.b, assVar.c);
        }
        StringBuilder sb = new StringBuilder();
        if ((1 & assVar.d) == 0) {
            sb.append(" onReadyHandlerEnabled");
        }
        if ((assVar.d & 2) == 0) {
            sb.append(" ipcStreamingThrottleMs");
        }
        if ((assVar.d & 4) == 0) {
            sb.append(" writeToPfd");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
