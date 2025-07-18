package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dut extends efb implements egj {
    public static final dut a;
    private static volatile egp d;
    public int b;
    public int c;

    static {
        dut dutVar = new dut();
        a = dutVar;
        efb.registerDefaultInstance(dut.class, dutVar);
    }

    private dut() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new dut();
        }
        if (iOrdinal == 4) {
            return new asr((short[][][]) null, (int[]) null);
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
        synchronized (dut.class) {
            eevVar = d;
            if (eevVar == null) {
                eevVar = new eev(a);
                d = eevVar;
            }
        }
        return eevVar;
    }
}
