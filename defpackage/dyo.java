package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dyo extends efb implements egj {
    public static final dyo a;
    private static volatile egp c;
    public efm b = efb.emptyProtobufList();

    static {
        dyo dyoVar = new dyo();
        a = dyoVar;
        efb.registerDefaultInstance(dyo.class, dyoVar);
    }

    private dyo() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"b"});
        }
        if (iOrdinal == 3) {
            return new dyo();
        }
        if (iOrdinal == 4) {
            return new asr((int[]) null, (char[]) null, (short[]) null);
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
        synchronized (dyo.class) {
            eevVar = c;
            if (eevVar == null) {
                eevVar = new eev(a);
                c = eevVar;
            }
        }
        return eevVar;
    }
}
