package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bws extends efb implements egj {
    public static final bws a;
    private static volatile egp b;

    static {
        bws bwsVar = new bws();
        a = bwsVar;
        efb.registerDefaultInstance(bws.class, bwsVar);
    }

    private bws() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0000", null);
        }
        if (iOrdinal == 3) {
            return new bws();
        }
        if (iOrdinal == 4) {
            return new asr((float[][][]) null, (short[]) null);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        egp egpVar = b;
        if (egpVar != null) {
            return egpVar;
        }
        synchronized (bws.class) {
            eevVar = b;
            if (eevVar == null) {
                eevVar = new eev(a);
                b = eevVar;
            }
        }
        return eevVar;
    }
}
