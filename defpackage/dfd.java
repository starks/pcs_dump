package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dfd extends efb implements egj {
    public static final dfd a;
    private static volatile egp e;
    public int b;
    public long c;
    public long d;

    static {
        dfd dfdVar = new dfd();
        a = dfdVar;
        efb.registerDefaultInstance(dfd.class, dfdVar);
    }

    private dfd() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဂ\u0002", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new dfd();
        }
        if (iOrdinal == 4) {
            return new asr((char[][]) null, (byte[]) null, (byte[]) null, (byte[]) null);
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
        synchronized (dfd.class) {
            eevVar = e;
            if (eevVar == null) {
                eevVar = new eev(a);
                e = eevVar;
            }
        }
        return eevVar;
    }
}
