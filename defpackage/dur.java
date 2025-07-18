package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dur extends efb implements egj {
    public static final dur a;
    private static volatile egp f;
    public int b;
    public int c;
    public dut d;
    public eea e = eea.b;

    static {
        dur durVar = new dur();
        a = durVar;
        efb.registerDefaultInstance(dur.class, durVar);
    }

    private dur() {
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
            return new dur();
        }
        if (iOrdinal == 4) {
            return new asr((byte[][][]) null, (int[]) null);
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
        synchronized (dur.class) {
            eevVar = f;
            if (eevVar == null) {
                eevVar = new eev(a);
                f = eevVar;
            }
        }
        return eevVar;
    }
}
