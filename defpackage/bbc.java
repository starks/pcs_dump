package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bbc extends efb implements egj {
    public static final bbc a;
    private static volatile egp f;
    public int b;
    public eea c = eea.b;
    public eea d = eea.b;
    public long e;

    static {
        bbc bbcVar = new bbc();
        a = bbcVar;
        efb.registerDefaultInstance(bbc.class, bbcVar);
    }

    private bbc() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0004ဂ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new bbc();
        }
        if (iOrdinal == 4) {
            return new asr((int[]) null, (byte[]) null);
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
        synchronized (bbc.class) {
            eevVar = f;
            if (eevVar == null) {
                eevVar = new eev(a);
                f = eevVar;
            }
        }
        return eevVar;
    }
}
