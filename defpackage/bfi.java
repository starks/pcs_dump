package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bfi extends efb implements egj {
    public static final bfi a;
    private static volatile egp c;
    public bew b;
    private int d;

    static {
        bfi bfiVar = new bfi();
        a = bfiVar;
        efb.registerDefaultInstance(bfi.class, bfiVar);
    }

    private bfi() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"d", "b"});
        }
        if (iOrdinal == 3) {
            return new bfi();
        }
        if (iOrdinal == 4) {
            return new asr((byte[][][]) null, (short[]) null);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        egp egpVar = c;
        if (egpVar != null) {
            return egpVar;
        }
        synchronized (bfi.class) {
            eevVar = c;
            if (eevVar == null) {
                eevVar = new eev(a);
                c = eevVar;
            }
        }
        return eevVar;
    }
}
