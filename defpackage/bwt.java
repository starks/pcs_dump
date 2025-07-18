package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bwt extends efb implements egj {
    public static final bwt a;
    private static volatile egp d;
    public int b;
    public eek c;

    static {
        bwt bwtVar = new bwt();
        a = bwtVar;
        efb.registerDefaultInstance(bwt.class, bwtVar);
    }

    private bwt() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new bwt();
        }
        if (iOrdinal == 4) {
            return new asr((byte[]) null, (byte[]) null, (short[]) null);
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
        synchronized (bwt.class) {
            eevVar = d;
            if (eevVar == null) {
                eevVar = new eev(a);
                d = eevVar;
            }
        }
        return eevVar;
    }
}
