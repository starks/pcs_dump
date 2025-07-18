package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dfv extends efb implements egj {
    public static final dfv a;
    private static volatile egp s;
    public int b;
    public int c;
    public String d = "";
    public long e;
    public long f;
    public long g;
    public int h;
    public int i;
    public int j;
    public dfq k;
    public dez l;
    public String m;
    public dgb n;
    public dfp o;
    public String p;
    public int q;
    public int r;

    static {
        dfv dfvVar = new dfv();
        a = dfvVar;
        efb.registerDefaultInstance(dfv.class, dfvVar);
    }

    private dfv() {
        emptyProtobufList();
        this.m = "";
        this.p = "";
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0010\u0000\u0001\u0001\u0015\u0010\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0006င\u0005\u0007င\u0006\t᠌\b\nဉ\t\fဉ\u000b\rဂ\u0004\u000fဈ\f\u0010ဉ\r\u0011ဉ\u000e\u0012ဈ\u000f\u0013᠌\u0010\u0015᠌\u0012", new Object[]{"b", "c", dfm.f, "d", "e", "f", "h", "i", "j", dfm.e, "k", "l", "g", "m", "n", "o", "p", "q", dfm.c, "r", dfm.d});
        }
        if (iOrdinal == 3) {
            return new dfv();
        }
        if (iOrdinal == 4) {
            return new asr((int[][][]) null, (byte[]) null, (byte[]) null, (byte[]) null);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        egp egpVar = s;
        if (egpVar != null) {
            return egpVar;
        }
        synchronized (dfv.class) {
            eevVar = s;
            if (eevVar == null) {
                eevVar = new eev(a);
                s = eevVar;
            }
        }
        return eevVar;
    }
}
