package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ecq extends efb implements egj {
    public static final ecq a;
    private static volatile egp d;
    public int b = 0;
    public Object c;

    static {
        ecq ecqVar = new ecq();
        a = ecqVar;
        efb.registerDefaultInstance(ecq.class, ecqVar);
    }

    private ecq() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"c", "b", ecp.class, ecn.class});
        }
        if (iOrdinal == 3) {
            return new ecq();
        }
        if (iOrdinal == 4) {
            return new asr((char[][]) null, (byte[]) null, (int[]) null);
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
        synchronized (ecq.class) {
            eevVar = d;
            if (eevVar == null) {
                eevVar = new eev(a);
                d = eevVar;
            }
        }
        return eevVar;
    }
}
