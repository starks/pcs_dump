package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dzp extends efb implements egj {
    public static final dzp a;
    private static volatile egp c;
    public efm b = emptyProtobufList();

    static {
        dzp dzpVar = new dzp();
        a = dzpVar;
        efb.registerDefaultInstance(dzp.class, dzpVar);
    }

    private dzp() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", dzt.class});
        }
        if (iOrdinal == 3) {
            return new dzp();
        }
        if (iOrdinal == 4) {
            return new asr((boolean[]) null, (byte[]) null, (byte[]) null, (char[]) null);
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
        synchronized (dzp.class) {
            eevVar = c;
            if (eevVar == null) {
                eevVar = new eev(a);
                c = eevVar;
            }
        }
        return eevVar;
    }
}
