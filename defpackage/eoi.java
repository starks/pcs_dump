package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class eoi {
    public static final elo a = new elo("internal:health-checking-config");
    public static final enw b = new enw("internal:health-check-consumer-listener", null);
    public static final enw c = new enw("internal:disable-subchannel-reconnect", Boolean.FALSE);
    public static final elo d = new elo("internal:has-health-check-producer-listener");
    public static final elo e = new elo("io.grpc.IS_PETIOLE_POLICY");
    private int f;

    public eqo a(eoe eoeVar) {
        throw null;
    }

    public abstract void b(eqo eqoVar);

    public void c(eoe eoeVar) {
        int i = this.f;
        this.f = i + 1;
        if (i == 0) {
            a(eoeVar);
        }
        this.f = 0;
    }

    public abstract void e();

    public void d() {
    }
}
