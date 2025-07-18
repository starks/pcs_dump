package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bfa extends efb implements egj {
    public static final bfa a;
    private static volatile egp e;
    public int b;
    public bem c;
    public bew d;

    static {
        bfa bfaVar = new bfa();
        a = bfaVar;
        efb.registerDefaultInstance(bfa.class, bfaVar);
    }

    private bfa() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new bfa();
        }
        if (iOrdinal == 4) {
            return new asr((int[][]) null, (short[]) null);
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
        synchronized (bfa.class) {
            eevVar = e;
            if (eevVar == null) {
                eevVar = new eev(a);
                e = eevVar;
            }
        }
        return eevVar;
    }
}
