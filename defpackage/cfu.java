package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cfu extends efb implements egj {
    public static final cfu a;
    private static volatile egp d;
    public String b = "";
    public long c;
    private int e;

    static {
        cfu cfuVar = new cfu();
        a = cfuVar;
        efb.registerDefaultInstance(cfu.class, cfuVar);
    }

    private cfu() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"e", "b", "c"});
        }
        if (iOrdinal == 3) {
            return new cfu();
        }
        if (iOrdinal == 4) {
            return new asr((byte[][][]) null, (short[]) null, (byte[]) null);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        egp egpVar = d;
        if (egpVar != null) {
            return egpVar;
        }
        synchronized (cfu.class) {
            eevVar = d;
            if (eevVar == null) {
                eevVar = new eev(a);
                d = eevVar;
            }
        }
        return eevVar;
    }
}
