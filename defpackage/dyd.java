package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dyd extends efb implements egj {
    public static final dyd a;
    private static volatile egp c;
    public String b = "";

    static {
        dyd dydVar = new dyd();
        a = dydVar;
        efb.registerDefaultInstance(dyd.class, dydVar);
    }

    private dyd() {
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
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"b"});
        }
        if (iOrdinal == 3) {
            return new dyd();
        }
        if (iOrdinal == 4) {
            return new asr((short[]) null, (byte[]) null, (char[]) null, (byte[]) null);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        egp egpVar = c;
        if (egpVar != null) {
            return egpVar;
        }
        synchronized (dyd.class) {
            eevVar = c;
            if (eevVar == null) {
                eevVar = new eev(a);
                c = eevVar;
            }
        }
        return eevVar;
    }
}
