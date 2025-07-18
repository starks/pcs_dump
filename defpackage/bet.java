package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bet extends efb implements egj {
    public static final bet a;
    private static volatile egp e;
    public bep b;
    public efm c = emptyProtobufList();
    public int d;
    private int f;

    static {
        bet betVar = new bet();
        a = betVar;
        efb.registerDefaultInstance(bet.class, betVar);
    }

    private bet() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဌ\u0001", new Object[]{"f", "b", "c", bez.class, "d"});
        }
        if (iOrdinal == 3) {
            return new bet();
        }
        if (iOrdinal == 4) {
            return new asr((boolean[]) null, (int[]) null);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        egp egpVar = e;
        if (egpVar != null) {
            return egpVar;
        }
        synchronized (bet.class) {
            eevVar = e;
            if (eevVar == null) {
                eevVar = new eev(a);
                e = eevVar;
            }
        }
        return eevVar;
    }
}
