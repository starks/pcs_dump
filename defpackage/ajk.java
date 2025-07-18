package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajk extends efb implements egj {
    public static final ajk a;
    private static volatile egp w;
    public int b;
    public long c;
    public int d;
    public long f;
    public long g;
    public long h;
    public int i;
    public long j;
    public long k;
    public long l;
    public long n;
    public long o;
    public long p;
    public int r;
    public long s;
    public long t;
    public int u;
    public int v;
    public String e = "";
    public String m = "";
    public String q = "";

    static {
        ajk ajkVar = new ajk();
        a = ajkVar;
        efb.registerDefaultInstance(ajk.class, ajkVar);
    }

    private ajk() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0014\u0000\u0001\u0001\u0014\u0014\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007᠌\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဈ\n\fဂ\u000b\rဂ\f\u000eဂ\r\u000fဈ\u000e\u0010᠌\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013᠌\u0012\u0014᠌\u0013", new Object[]{"b", "c", "d", eim.a, "e", "f", "g", "h", "i", eim.b, "j", "k", "l", "m", "n", "o", "p", "q", "r", dfm.u, "s", "t", "u", dfm.o, "v", dfm.p});
        }
        if (iOrdinal == 3) {
            return new ajk();
        }
        if (iOrdinal == 4) {
            return new asr((byte[][][]) null, (byte[]) null, (byte[]) null);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        egp egpVar = w;
        if (egpVar != null) {
            return egpVar;
        }
        synchronized (ajk.class) {
            eevVar = w;
            if (eevVar == null) {
                eevVar = new eev(a);
                w = eevVar;
            }
        }
        return eevVar;
    }
}
