package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cce extends efb implements egj {
    public static final cce a;
    private static volatile egp c;
    public efm b = emptyProtobufList();

    static {
        cce cceVar = new cce();
        a = cceVar;
        efb.registerDefaultInstance(cce.class, cceVar);
    }

    private cce() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", dfa.class});
        }
        if (iOrdinal == 3) {
            return new cce();
        }
        if (iOrdinal == 4) {
            return new asr((char[]) null, (byte[]) null, (short[]) null);
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
        synchronized (cce.class) {
            eevVar = c;
            if (eevVar == null) {
                eevVar = new eev(a);
                c = eevVar;
            }
        }
        return eevVar;
    }
}
