package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ecj extends efb implements egj {
    public static final ecj a;
    private static volatile egp d;
    public int b = 0;
    public Object c;

    static {
        ecj ecjVar = new ecj();
        a = ecjVar;
        efb.registerDefaultInstance(ecj.class, ecjVar);
    }

    private ecj() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"c", "b", eci.class, ecf.class});
        }
        if (iOrdinal == 3) {
            return new ecj();
        }
        if (iOrdinal == 4) {
            return new asr((boolean[][][]) null, (boolean[]) null);
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
        synchronized (ecj.class) {
            eevVar = d;
            if (eevVar == null) {
                eevVar = new eev(a);
                d = eevVar;
            }
        }
        return eevVar;
    }
}
