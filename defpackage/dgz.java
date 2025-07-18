package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dgz extends efb implements egj {
    public static final dgz a;
    private static volatile egp e;
    public int b;
    public int c;
    public int d;

    static {
        dgz dgzVar = new dgz();
        a = dgzVar;
        efb.registerDefaultInstance(dgz.class, dgzVar);
    }

    private dgz() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"b", "c", dfm.l, "d", dfm.m});
        }
        if (iOrdinal == 3) {
            return new dgz();
        }
        if (iOrdinal == 4) {
            return new asr((short[]) null, (byte[]) null, (short[]) null);
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
        synchronized (dgz.class) {
            eevVar = e;
            if (eevVar == null) {
                eevVar = new eev(a);
                e = eevVar;
            }
        }
        return eevVar;
    }
}
