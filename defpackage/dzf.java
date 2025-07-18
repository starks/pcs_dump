package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dzf extends efb implements egj {
    public static final dzf a;
    private static volatile egp g;
    public Object c;
    public long d;
    public int f;
    public int b = 0;
    public eea e = eea.b;

    static {
        dzf dzfVar = new dzf();
        a = dzfVar;
        efb.registerDefaultInstance(dzf.class, dzfVar);
    }

    private dzf() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0006\u0001\u0000\u0002\u0007\u0006\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005\u0002\u0006\n\u0007\f", new Object[]{"c", "b", dzc.class, dyd.class, dyv.class, "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new dzf();
        }
        if (iOrdinal == 4) {
            return new asr((int[][][]) null, (char[]) null, (char[]) null);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        egp egpVar = g;
        if (egpVar != null) {
            return egpVar;
        }
        synchronized (dzf.class) {
            eevVar = g;
            if (eevVar == null) {
                eevVar = new eev(a);
                g = eevVar;
            }
        }
        return eevVar;
    }
}
