package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eiu extends efb implements egj {
    public static final eiu a;
    private static volatile egp e;
    public int b;
    public int c;
    public int d;

    static {
        eiu eiuVar = new eiu();
        a = eiuVar;
        efb.registerDefaultInstance(eiu.class, eiuVar);
    }

    private eiu() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new eiu();
        }
        if (iOrdinal == 4) {
            return new asr((char[][]) null, (boolean[]) null);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        egp egpVar = e;
        if (egpVar != null) {
            return egpVar;
        }
        synchronized (eiu.class) {
            eevVar = e;
            if (eevVar == null) {
                eevVar = new eev(a);
                e = eevVar;
            }
        }
        return eevVar;
    }
}
