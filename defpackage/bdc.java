package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bdc extends efb implements egj {
    public static final bdc a;
    private static volatile egp f;
    public String b = "";
    public String c = "";
    public int d;
    public long e;
    private int g;

    static {
        bdc bdcVar = new bdc();
        a = bdcVar;
        efb.registerDefaultInstance(bdc.class, bdcVar);
    }

    private bdc() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004ဂ\u0003", new Object[]{"g", "b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new bdc();
        }
        if (iOrdinal == 4) {
            return new asr((short[]) null, (byte[]) null, (char[]) null);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        egp egpVar = f;
        if (egpVar != null) {
            return egpVar;
        }
        synchronized (bdc.class) {
            eevVar = f;
            if (eevVar == null) {
                eevVar = new eev(a);
                f = eevVar;
            }
        }
        return eevVar;
    }
}
