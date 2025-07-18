package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aul extends efb implements egj {
    public static final aul a;
    private static volatile egp d;
    public int b;
    public String c = "";

    static {
        aul aulVar = new aul();
        a = aulVar;
        efb.registerDefaultInstance(aul.class, aulVar);
    }

    private aul() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new aul();
        }
        if (iOrdinal == 4) {
            return new asr((char[][][]) null, (char[]) null);
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
        synchronized (aul.class) {
            eevVar = d;
            if (eevVar == null) {
                eevVar = new eev(a);
                d = eevVar;
            }
        }
        return eevVar;
    }
}
