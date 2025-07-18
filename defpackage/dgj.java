package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dgj extends efb implements egj {
    public static final dgj a;
    private static volatile egp c;
    public efm b = emptyProtobufList();

    static {
        dgj dgjVar = new dgj();
        a = dgjVar;
        efb.registerDefaultInstance(dgj.class, dgjVar);
    }

    private dgj() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", dgi.class});
        }
        if (iOrdinal == 3) {
            return new dgj();
        }
        if (iOrdinal == 4) {
            return new asr((short[][]) null, (char[]) null, (byte[]) null);
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
        synchronized (dgj.class) {
            eevVar = c;
            if (eevVar == null) {
                eevVar = new eev(a);
                c = eevVar;
            }
        }
        return eevVar;
    }
}
