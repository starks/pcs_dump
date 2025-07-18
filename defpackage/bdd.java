package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bdd extends efb implements egj {
    public static final bdd a;
    private static volatile egp d;
    public int b = 0;
    public Object c;

    static {
        bdd bddVar = new bdd();
        a = bddVar;
        efb.registerDefaultInstance(bdd.class, bddVar);
    }

    private bdd() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"c", "b", dhe.class, bdb.class, bcz.class, bda.class});
        }
        if (iOrdinal == 3) {
            return new bdd();
        }
        if (iOrdinal == 4) {
            return new asr((char[]) null, (char[]) null, (char[]) null);
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
        synchronized (bdd.class) {
            eevVar = d;
            if (eevVar == null) {
                eevVar = new eev(a);
                d = eevVar;
            }
        }
        return eevVar;
    }
}
