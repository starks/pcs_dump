package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class auo extends efb implements egj {
    public static final auo a;
    private static volatile egp d;
    public int b;
    public String c = "";

    static {
        auo auoVar = new auo();
        a = auoVar;
        efb.registerDefaultInstance(auo.class, auoVar);
    }

    private auo() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new auo();
        }
        if (iOrdinal == 4) {
            return new asr((boolean[][][]) null, (char[]) null);
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
        synchronized (auo.class) {
            eevVar = d;
            if (eevVar == null) {
                eevVar = new eev(a);
                d = eevVar;
            }
        }
        return eevVar;
    }
}
