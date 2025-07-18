package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cck extends efb implements egj {
    public static final cck a;
    private static volatile egp h;
    public int b;
    public eek c;
    public boolean d;
    public boolean e;
    public boolean f;
    public edp g;

    static {
        cck cckVar = new cck();
        a = cckVar;
        efb.registerDefaultInstance(cck.class, cckVar);
    }

    private cck() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0007\u0003\u0007\u0004\u0007\u0005ဉ\u0001", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new cck();
        }
        if (iOrdinal == 4) {
            return new asr((short[]) null, (int[]) null, (byte[]) null);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        egp egpVar = h;
        if (egpVar != null) {
            return egpVar;
        }
        synchronized (cck.class) {
            eevVar = h;
            if (eevVar == null) {
                eevVar = new eev(a);
                h = eevVar;
            }
        }
        return eevVar;
    }
}
