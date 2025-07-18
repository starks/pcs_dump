package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class edd extends efb implements egj {
    public static final edd a;
    private static volatile egp d;
    public int b;
    public int c;
    private int e;

    static {
        edd eddVar = new edd();
        a = eddVar;
        efb.registerDefaultInstance(edd.class, eddVar);
    }

    private edd() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0004\u0005\u0002\u0000\u0000\u0000\u0004င\u0000\u0005င\u0001", new Object[]{"e", "b", "c"});
        }
        if (iOrdinal == 3) {
            return new edd();
        }
        if (iOrdinal == 4) {
            return new asr((boolean[][][]) null, (byte[]) null, (int[]) null);
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
        synchronized (edd.class) {
            eevVar = d;
            if (eevVar == null) {
                eevVar = new eev(a);
                d = eevVar;
            }
        }
        return eevVar;
    }
}
