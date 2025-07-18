package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ayi extends efb implements egj {
    public static final ayi a;
    private static volatile egp f;
    public int b;
    public ayb c;
    public aya d;
    public axz e;

    static {
        ayi ayiVar = new ayi();
        a = ayiVar;
        efb.registerDefaultInstance(ayi.class, ayiVar);
    }

    private ayi() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new ayi();
        }
        if (iOrdinal == 4) {
            return new asr((int[][][]) null);
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
        synchronized (ayi.class) {
            eevVar = f;
            if (eevVar == null) {
                eevVar = new eev(a);
                f = eevVar;
            }
        }
        return eevVar;
    }
}
