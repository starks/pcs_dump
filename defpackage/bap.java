package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bap extends efb implements egj {
    public static final bap a;
    private static volatile egp c;
    public long b;

    static {
        bap bapVar = new bap();
        a = bapVar;
        efb.registerDefaultInstance(bap.class, bapVar);
    }

    private bap() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0002", new Object[]{"b"});
        }
        if (iOrdinal == 3) {
            return new bap();
        }
        if (iOrdinal == 4) {
            return new asr((boolean[][][]) null);
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
        synchronized (bap.class) {
            eevVar = c;
            if (eevVar == null) {
                eevVar = new eev(a);
                c = eevVar;
            }
        }
        return eevVar;
    }
}
