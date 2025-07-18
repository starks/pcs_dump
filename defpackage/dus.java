package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dus extends efb implements egj {
    public static final dus a;
    private static volatile egp f;
    public int b;
    public dut c;
    public int d;
    public int e;

    static {
        dus dusVar = new dus();
        a = dusVar;
        efb.registerDefaultInstance(dus.class, dusVar);
    }

    private dus() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\u000b", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new dus();
        }
        if (iOrdinal == 4) {
            return new asr((char[][][]) null, (int[]) null);
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
        synchronized (dus.class) {
            eevVar = f;
            if (eevVar == null) {
                eevVar = new eev(a);
                f = eevVar;
            }
        }
        return eevVar;
    }
}
