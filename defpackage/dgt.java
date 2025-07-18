package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dgt extends efb implements egj {
    public static final dgt a;
    private static volatile egp f;
    public int b;
    public int c = 0;
    public Object d;
    public long e;

    static {
        dgt dgtVar = new dgt();
        a = dgtVar;
        efb.registerDefaultInstance(dgt.class, dgtVar);
    }

    private dgt() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0001\u0001\u0002\u0005\u0004\u0000\u0000\u0000\u0002ဂ\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"d", "c", "b", "e", dgq.class, dgr.class, dgs.class});
        }
        if (iOrdinal == 3) {
            return new dgt();
        }
        if (iOrdinal == 4) {
            return new asr((short[][][]) null, (char[]) null, (byte[]) null);
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
        synchronized (dgt.class) {
            eevVar = f;
            if (eevVar == null) {
                eevVar = new eev(a);
                f = eevVar;
            }
        }
        return eevVar;
    }
}
