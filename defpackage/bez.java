package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bez extends efb implements egj {
    public static final bez a;
    private static volatile egp e;
    public String b = "";
    public String c = "";
    public String d = "";
    private int f;

    static {
        bez bezVar = new bez();
        a = bezVar;
        efb.registerDefaultInstance(bez.class, bezVar);
    }

    private bez() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002", new Object[]{"f", "b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new bez();
        }
        if (iOrdinal == 4) {
            return new asr((short[][]) null, (short[]) null);
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
        synchronized (bez.class) {
            eevVar = e;
            if (eevVar == null) {
                eevVar = new eev(a);
                e = eevVar;
            }
        }
        return eevVar;
    }
}
