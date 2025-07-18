package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dyp extends efb implements egj {
    public static final dyp a;
    private static volatile egp d;
    public int b = 0;
    public Object c;

    static {
        dyp dypVar = new dyp();
        a = dypVar;
        efb.registerDefaultInstance(dyp.class, dypVar);
    }

    private dyp() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000", new Object[]{"c", "b", dym.class, dyn.class, dyi.class, dyl.class, dyk.class, dyo.class, dyj.class});
        }
        if (iOrdinal == 3) {
            return new dyp();
        }
        if (iOrdinal == 4) {
            return new asr((short[][]) null, (char[]) null, (char[]) null);
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
        synchronized (dyp.class) {
            eevVar = d;
            if (eevVar == null) {
                eevVar = new eev(a);
                d = eevVar;
            }
        }
        return eevVar;
    }
}
