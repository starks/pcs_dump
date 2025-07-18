package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ecf extends efb implements egj {
    public static final ecf a;
    private static volatile egp c;
    public int b = 0;
    private Object d;

    static {
        ecf ecfVar = new ecf();
        a = ecfVar;
        efb.registerDefaultInstance(ecf.class, ecfVar);
    }

    private ecf() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"d", "b", ecd.class, ecc.class, ece.class});
        }
        if (iOrdinal == 3) {
            return new ecf();
        }
        if (iOrdinal == 4) {
            return new asr((char[]) null, (char[]) null, (int[]) null);
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
        synchronized (ecf.class) {
            eevVar = c;
            if (eevVar == null) {
                eevVar = new eev(a);
                c = eevVar;
            }
        }
        return eevVar;
    }
}
