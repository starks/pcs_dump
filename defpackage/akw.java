package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akw extends anx {
    static final aoc a = new aoc("StatsLog__enabled", true);
    static final aoc b = new aoc("StatsLog__active_users_logger_enabled", false);
    static final aoe c = new aoe("StatsLog__active_users_logging_timeout_seconds", 120L);
    static final aod d = new aod("StatsLog__active_users_logging_max_delay_hours", 10);
    static final aoc e = new aoc("StatsLog__active_users_logger_non_persistent", false);
    static final aoe f = new aoe("StatsLog__active_users_logger_non_persistent_initial_delay", 0L);
    static final aoe g = new aoe("StatsLog__active_users_logger_non_persistent_period", 1L);
    static final aod h = new aod("StatsLog__active_users_logging_reschedule_limit", 5);
    public final aof i;

    public akw(aof aofVar) {
        this.i = aofVar;
    }

    @Override // defpackage.anx
    protected final /* bridge */ /* synthetic */ Object a() {
        aks aksVar = new aks(null);
        aksVar.a(false);
        aksVar.g(120L);
        aksVar.f(10);
        aksVar.b(false);
        aksVar.c(0L);
        aksVar.d(1L);
        aksVar.e(5);
        aksVar.a = vr.c(this.i, a).booleanValue();
        aksVar.i = (byte) (aksVar.i | 1);
        aksVar.a(vr.c(this.i, b).booleanValue());
        aksVar.g(vr.e(this.i, c).longValue());
        aksVar.f(vr.d(this.i, d).intValue());
        aksVar.b(vr.c(this.i, e).booleanValue());
        aksVar.c(vr.e(this.i, f).longValue());
        aksVar.d(vr.e(this.i, g).longValue());
        aksVar.e(vr.d(this.i, h).intValue());
        if (aksVar.i == -1) {
            return new akt(aksVar.a, aksVar.b, aksVar.c, aksVar.d, aksVar.e, aksVar.f, aksVar.g, aksVar.h);
        }
        StringBuilder sb = new StringBuilder();
        if ((aksVar.i & 1) == 0) {
            sb.append(" enabled");
        }
        if ((aksVar.i & 2) == 0) {
            sb.append(" activeUsersLoggerEnabled");
        }
        if ((aksVar.i & 4) == 0) {
            sb.append(" activeUsersLoggingTimeoutSeconds");
        }
        if ((aksVar.i & 8) == 0) {
            sb.append(" activeUsersLoggingMaxDelayHours");
        }
        if ((aksVar.i & 16) == 0) {
            sb.append(" activeUsersLoggerNonPersistent");
        }
        if ((aksVar.i & 32) == 0) {
            sb.append(" activeUsersLoggerNonPersistentInitialDelay");
        }
        if ((aksVar.i & 64) == 0) {
            sb.append(" activeUsersLoggerNonPersistentPeriod");
        }
        if ((aksVar.i & 128) == 0) {
            sb.append(" activeUsersLoggerRescheduleLimit");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
