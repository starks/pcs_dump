package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anh extends anx {
    static final aoc a = new aoc("PcsAttestationMeasurement__enable_attestation_measurement", false);
    static final aoc b = new aoc("PcsAttestationMeasurement__schedule_attestation_job", false);
    static final aoc c = new aoc("PcsAttestationMeasurement__enable_random_jitter", false);
    static final aoe d = new aoe("PcsAttestationMeasurement__minimum_jitter_delay_s", 0L);
    static final aoe e = new aoe("PcsAttestationMeasurement__maximum_jitter_delay_s", 59L);
    static final aoe f = new aoe("PcsAttestationMeasurement__delay_seconds_from_hour", 5L);
    static final aoc g = new aoc("PcsAttestationMeasurement__enable_content_binding_as_challenge", false);
    public final aof h;

    public anh(aof aofVar) {
        this.h = aofVar;
    }

    @Override // defpackage.anx
    protected final /* bridge */ /* synthetic */ Object a() {
        anf anfVar = new anf(null);
        anfVar.a(false);
        anfVar.b(false);
        anfVar.a(vr.c(this.h, a).booleanValue());
        anfVar.b(vr.c(this.h, b).booleanValue());
        anfVar.c = vr.c(this.h, c).booleanValue();
        anfVar.h = (byte) (anfVar.h | 4);
        anfVar.d = vr.e(this.h, d).longValue();
        anfVar.h = (byte) (anfVar.h | 8);
        anfVar.e = vr.e(this.h, e).longValue();
        anfVar.h = (byte) (anfVar.h | 16);
        anfVar.f = vr.e(this.h, f).longValue();
        anfVar.h = (byte) (anfVar.h | 32);
        boolean zBooleanValue = vr.c(this.h, g).booleanValue();
        anfVar.g = zBooleanValue;
        int i = anfVar.h | 64;
        anfVar.h = (byte) i;
        if (i == 127) {
            return new ang(anfVar.a, anfVar.b, anfVar.c, anfVar.d, anfVar.e, anfVar.f, zBooleanValue);
        }
        StringBuilder sb = new StringBuilder();
        if ((anfVar.h & 1) == 0) {
            sb.append(" enableAttestationMeasurement");
        }
        if ((anfVar.h & 2) == 0) {
            sb.append(" scheduleAttestationJob");
        }
        if ((anfVar.h & 4) == 0) {
            sb.append(" enableRandomJitter");
        }
        if ((anfVar.h & 8) == 0) {
            sb.append(" minDelaySeconds");
        }
        if ((anfVar.h & 16) == 0) {
            sb.append(" maxDelaySeconds");
        }
        if ((anfVar.h & 32) == 0) {
            sb.append(" delaySeconds");
        }
        if ((anfVar.h & 64) == 0) {
            sb.append(" enableContentBindingAsChallenge");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
