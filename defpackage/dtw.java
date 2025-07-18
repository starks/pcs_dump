package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dtw extends efb implements egj {
    public static final dtw a;
    private static volatile egp f;
    public int b;
    public int c;
    public dty d;
    public eea e = eea.b;

    static {
        dtw dtwVar = new dtw();
        a = dtwVar;
        efb.registerDefaultInstance(dtw.class, dtwVar);
    }

    private dtw() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new dtw();
        }
        if (iOrdinal == 4) {
            return new asr((int[][][]) null, (byte[]) null, (short[]) null);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        egp egpVar = f;
        if (egpVar != null) {
            return egpVar;
        }
        synchronized (dtw.class) {
            eevVar = f;
            if (eevVar == null) {
                eevVar = new eev(a);
                f = eevVar;
            }
        }
        return eevVar;
    }
}
