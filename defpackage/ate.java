package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ate extends efb implements egj {
    public static final ate a;
    private static volatile egp q;
    public int b;
    public long c;
    public long d;
    public String e = "";
    public String f = "";
    public long g;
    public long h;
    public int i;
    public long j;
    public int k;
    public int l;
    public long m;
    public long n;
    public long o;
    public int p;

    static {
        ate ateVar = new ate();
        a = ateVar;
        efb.registerDefaultInstance(ate.class, ateVar);
    }

    private ate() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007᠌\u0006\bဂ\u0007\t᠌\b\n᠌\t\u000bဂ\n\fဂ\u000b\rဂ\f\u000e᠌\r", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", aoz.l, "j", "k", aoz.m, "l", aoz.j, "m", "n", "o", "p", aoz.k});
        }
        if (iOrdinal == 3) {
            return new ate();
        }
        if (iOrdinal == 4) {
            return new asr((byte[][]) null, (char[]) null);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        egp egpVar = q;
        if (egpVar != null) {
            return egpVar;
        }
        synchronized (ate.class) {
            eevVar = q;
            if (eevVar == null) {
                eevVar = new eev(a);
                q = eevVar;
            }
        }
        return eevVar;
    }
}
