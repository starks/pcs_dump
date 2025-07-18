package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class are extends anx {
    public static final aoc a = new aoc("PlatformLogging__enable_platform_logging", true);
    public static final aoc b = new aoc("PlatformLogging__enable_metric_wise_populations", false);
    public final aof c;

    public are(aof aofVar) {
        this.c = aofVar;
    }

    @Override // defpackage.anx
    protected final /* bridge */ /* synthetic */ Object a() {
        auq auqVar = new auq(null, null);
        auqVar.c(false);
        auqVar.b(false);
        auqVar.c(vr.c(this.c, a).booleanValue());
        auqVar.b(vr.c(this.c, b).booleanValue());
        if (auqVar.c == 3) {
            return new ard(auqVar.b, auqVar.a);
        }
        StringBuilder sb = new StringBuilder();
        if ((auqVar.c & 1) == 0) {
            sb.append(" enablePlatformLogging");
        }
        if ((auqVar.c & 2) == 0) {
            sb.append(" enableMetricWisePopulations");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
