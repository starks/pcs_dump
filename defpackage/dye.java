package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dye extends efb implements egj {
    public static final dye a;
    private static volatile egp d;
    public int b;
    public eiu c;

    static {
        dye dyeVar = new dye();
        a = dyeVar;
        efb.registerDefaultInstance(dye.class, dyeVar);
    }

    private dye() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new dye();
        }
        if (iOrdinal == 4) {
            return new asr((int[]) null, (short[]) null, (char[]) null);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        egp egpVar = d;
        if (egpVar != null) {
            return egpVar;
        }
        synchronized (dye.class) {
            eevVar = d;
            if (eevVar == null) {
                eevVar = new eev(a);
                d = eevVar;
            }
        }
        return eevVar;
    }
}
