package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ecn extends efb implements egj {
    public static final ecn a;
    private static volatile egp c;
    public int b = 0;
    private Object d;

    static {
        ecn ecnVar = new ecn();
        a = ecnVar;
        efb.registerDefaultInstance(ecn.class, ecnVar);
    }

    private ecn() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001<\u0000", new Object[]{"d", "b", ecm.class});
        }
        if (iOrdinal == 3) {
            return new ecn();
        }
        if (iOrdinal == 4) {
            return new asr((short[][]) null, (byte[]) null, (int[]) null);
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
        synchronized (ecn.class) {
            eevVar = c;
            if (eevVar == null) {
                eevVar = new eev(a);
                c = eevVar;
            }
        }
        return eevVar;
    }
}
