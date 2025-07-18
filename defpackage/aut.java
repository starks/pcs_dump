package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aut extends anx {
    static final aoc a = new aoc("AstreaNetworkUsageLog__enable_network_usage_log", false);
    static final aoc b = new aoc("AstreaNetworkUsageLog__reject_unknown_requests", false);
    public final aof c;

    public aut(aof aofVar) {
        this.c = aofVar;
    }

    @Override // defpackage.anx
    protected final /* bridge */ /* synthetic */ Object a() {
        auq auqVar = new auq(null);
        auqVar.a(false);
        auqVar.a(vr.c(this.c, a).booleanValue());
        boolean zBooleanValue = vr.c(this.c, b).booleanValue();
        auqVar.b = zBooleanValue;
        int i = auqVar.c | 2;
        auqVar.c = (byte) i;
        if (i == 3) {
            return new aur(auqVar.a, zBooleanValue);
        }
        StringBuilder sb = new StringBuilder();
        if ((auqVar.c & 1) == 0) {
            sb.append(" networkUsageLogEnabled");
        }
        if ((auqVar.c & 2) == 0) {
            sb.append(" rejectUnknownRequests");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
