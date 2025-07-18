package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dyy extends efb implements egj {
    public static final dyy a;
    private static volatile egp c;
    public egd b = egd.a;

    static {
        dyy dyyVar = new dyy();
        a = dyyVar;
        efb.registerDefaultInstance(dyy.class, dyyVar);
    }

    private dyy() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0001\u0000\u0000\u00022", new Object[]{"b", dyx.a});
        }
        if (iOrdinal == 3) {
            return new dyy();
        }
        if (iOrdinal == 4) {
            return new asr((float[][]) null, (char[]) null, (char[]) null);
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
        synchronized (dyy.class) {
            eevVar = c;
            if (eevVar == null) {
                eevVar = new eev(a);
                c = eevVar;
            }
        }
        return eevVar;
    }
}
