package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dfp extends efb implements egj {
    public static final dfp a;
    private static volatile egp f;
    public int b;
    public long c;
    public long d;
    public long e;

    static {
        dfp dfpVar = new dfp();
        a = dfpVar;
        efb.registerDefaultInstance(dfp.class, dfpVar);
    }

    private dfp() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0002\u0006\u0003\u0000\u0000\u0000\u0002ဂ\u0001\u0005ဂ\u0004\u0006ဂ\u0005", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new dfp();
        }
        if (iOrdinal == 4) {
            return new asr((boolean[][][]) null, (byte[]) null, (byte[]) null, (byte[]) null);
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
        synchronized (dfp.class) {
            eevVar = f;
            if (eevVar == null) {
                eevVar = new eev(a);
                f = eevVar;
            }
        }
        return eevVar;
    }
}
