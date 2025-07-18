package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bcq extends efb implements egj {
    public static final bcq a;
    private static volatile egp f;
    public eea b = eea.b;
    public int c;
    public boolean d;
    public int e;

    static {
        bcq bcqVar = new bcq();
        a = bcqVar;
        efb.registerDefaultInstance(bcq.class, bcqVar);
    }

    private bcq() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0000\u0001\u0005\u0004\u0000\u0000\u0000\u0001\n\u0002\f\u0004\u0007\u0005\u0004", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new bcq();
        }
        if (iOrdinal == 4) {
            return new asr((int[][][]) null, (byte[]) null);
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
        synchronized (bcq.class) {
            eevVar = f;
            if (eevVar == null) {
                eevVar = new eev(a);
                f = eevVar;
            }
        }
        return eevVar;
    }
}
