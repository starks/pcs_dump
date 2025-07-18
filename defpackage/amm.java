package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amm extends anx {
    static final aoc a = new aoc("PcsAi__enable_genai_inference_service", false);
    static final aoe b = new aoe("PcsAi__genai_service_connection_timeout_ms", 2000L);
    public final aof c;

    public amm(aof aofVar) {
        this.c = aofVar;
    }

    @Override // defpackage.anx
    protected final /* bridge */ /* synthetic */ Object a() {
        amj amjVar = new amj(null);
        amjVar.a(false);
        amjVar.a(vr.c(this.c, a).booleanValue());
        long jLongValue = vr.e(this.c, b).longValue();
        amjVar.b = jLongValue;
        int i = amjVar.c | 2;
        amjVar.c = (byte) i;
        if (i == 3) {
            return new amk(amjVar.a, jLongValue);
        }
        StringBuilder sb = new StringBuilder();
        if ((amjVar.c & 1) == 0) {
            sb.append(" genAiInferenceServiceEnabled");
        }
        if ((amjVar.c & 2) == 0) {
            sb.append(" genAiServiceConnectionTimeoutMs");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
