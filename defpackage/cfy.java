package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cfy extends efb implements egj {
    public static final cfy a;
    private static volatile egp c;
    public egd b = egd.a;

    static {
        cfy cfyVar = new cfy();
        a = cfyVar;
        efb.registerDefaultInstance(cfy.class, cfyVar);
    }

    private cfy() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0002\u0002\u0001\u0001\u0000\u0000\u00022", new Object[]{"b", cfx.a});
        }
        if (iOrdinal == 3) {
            return new cfy();
        }
        if (iOrdinal == 4) {
            return new asr((boolean[]) null, (short[]) null, (byte[]) null);
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
        synchronized (cfy.class) {
            eevVar = c;
            if (eevVar == null) {
                eevVar = new eev(a);
                c = eevVar;
            }
        }
        return eevVar;
    }
}
