package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dym extends efb implements egj {
    public static final dym a;
    private static volatile egp c;
    public efi b = emptyIntList();

    static {
        dym dymVar = new dym();
        a = dymVar;
        efb.registerDefaultInstance(dym.class, dymVar);
    }

    private dym() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001'", new Object[]{"b"});
        }
        if (iOrdinal == 3) {
            return new dym();
        }
        if (iOrdinal == 4) {
            return new asr((boolean[]) null, (char[]) null, (char[]) null);
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
        synchronized (dym.class) {
            eevVar = c;
            if (eevVar == null) {
                eevVar = new eev(a);
                c = eevVar;
            }
        }
        return eevVar;
    }
}
