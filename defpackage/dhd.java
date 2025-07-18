package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dhd extends efb implements egj {
    public static final dhd a;
    private static volatile egp j;
    public int b;
    public Object d;
    public long g;
    public long h;
    public long i;
    public int c = 0;
    public String e = "";
    public String f = "";

    static {
        dhd dhdVar = new dhd();
        a = dhdVar;
        efb.registerDefaultInstance(dhd.class, dhdVar);
    }

    private dhd() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\n\u0001\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000", new Object[]{"d", "c", "b", "e", "f", "g", "h", "i", dhc.class, dhb.class, dgx.class, dgt.class, dgp.class});
        }
        if (iOrdinal == 3) {
            return new dhd();
        }
        if (iOrdinal == 4) {
            return new asr((byte[]) null, (short[]) null, (char[]) null);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        egp egpVar = j;
        if (egpVar != null) {
            return egpVar;
        }
        synchronized (dhd.class) {
            eevVar = j;
            if (eevVar == null) {
                eevVar = new eev(a);
                j = eevVar;
            }
        }
        return eevVar;
    }
}
