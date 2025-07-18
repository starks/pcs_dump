package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bdb extends efb implements egj {
    public static final bdb a;
    private static volatile egp d;
    public int b;
    public int c;

    static {
        bdb bdbVar = new bdb();
        a = bdbVar;
        efb.registerDefaultInstance(bdb.class, bdbVar);
    }

    private bdb() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new bdb();
        }
        if (iOrdinal == 4) {
            return new asr((byte[]) null, (char[]) null, (char[]) null);
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
        synchronized (bdb.class) {
            eevVar = d;
            if (eevVar == null) {
                eevVar = new eev(a);
                d = eevVar;
            }
        }
        return eevVar;
    }
}
