package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dyj extends efb implements egj {
    public static final dyj a;
    private static volatile egp c;
    public efm b = emptyProtobufList();

    static {
        dyj dyjVar = new dyj();
        a = dyjVar;
        efb.registerDefaultInstance(dyj.class, dyjVar);
    }

    private dyj() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001c", new Object[]{"b"});
        }
        if (iOrdinal == 3) {
            return new dyj();
        }
        if (iOrdinal == 4) {
            return new asr((byte[]) null, (byte[]) null, (short[]) null, (char[]) null);
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
        synchronized (dyj.class) {
            eevVar = c;
            if (eevVar == null) {
                eevVar = new eev(a);
                c = eevVar;
            }
        }
        return eevVar;
    }
}
