package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ayd extends efb implements egj {
    public static final ayd a;
    private static volatile egp d;
    public axo b;
    public axp c;
    private int e;

    static {
        ayd aydVar = new ayd();
        a = aydVar;
        efb.registerDefaultInstance(ayd.class, aydVar);
    }

    private ayd() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဉ\u0001", new Object[]{"e", "b", "c"});
        }
        if (iOrdinal == 3) {
            return new ayd();
        }
        if (iOrdinal == 4) {
            return new asr((char[][][]) null);
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
        synchronized (ayd.class) {
            eevVar = d;
            if (eevVar == null) {
                eevVar = new eev(a);
                d = eevVar;
            }
        }
        return eevVar;
    }
}
