package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ccm extends efb implements egj {
    public static final ccm a;
    private static volatile egp e;
    public int b;
    public int c;
    public eek d;

    static {
        ccm ccmVar = new ccm();
        a = ccmVar;
        efb.registerDefaultInstance(ccm.class, ccmVar);
    }

    private ccm() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002ဉ\u0000", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new ccm();
        }
        if (iOrdinal == 4) {
            return new asr((int[]) null, (int[]) null, (byte[]) null);
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
        synchronized (ccm.class) {
            eevVar = e;
            if (eevVar == null) {
                eevVar = new eev(a);
                e = eevVar;
            }
        }
        return eevVar;
    }
}
