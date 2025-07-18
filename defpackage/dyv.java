package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dyv extends efb implements egj {
    public static final dyv a;
    private static volatile egp f;
    public Object c;
    public dyy e;
    private int g;
    public int b = 0;
    public String d = "";

    static {
        dyv dyvVar = new dyv();
        a = dyvVar;
        efb.registerDefaultInstance(dyv.class, dyvVar);
    }

    private dyv() {
        eea eeaVar = eea.b;
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0005\u0001\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001Ȉ\u0003<\u0000\u0004<\u0000\u0006ဉ\u0000\u0007<\u0000", new Object[]{"c", "b", "g", "d", dzj.class, dzh.class, "e", dyc.class});
        }
        if (iOrdinal == 3) {
            return new dyv();
        }
        if (iOrdinal == 4) {
            return new asr((boolean[][]) null, (char[]) null, (char[]) null);
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
        synchronized (dyv.class) {
            eevVar = f;
            if (eevVar == null) {
                eevVar = new eev(a);
                f = eevVar;
            }
        }
        return eevVar;
    }
}
