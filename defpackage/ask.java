package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ask extends efb implements egj {
    public static final ask a;
    private static volatile egp e;
    public int b;
    public String c = "";
    public efm d = efb.emptyProtobufList();

    static {
        ask askVar = new ask();
        a = askVar;
        efb.registerDefaultInstance(ask.class, askVar);
    }

    private ask() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001a", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new ask();
        }
        if (iOrdinal == 4) {
            return new asr((char[]) null, (short[]) null);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        egp egpVar = e;
        if (egpVar != null) {
            return egpVar;
        }
        synchronized (ask.class) {
            eevVar = e;
            if (eevVar == null) {
                eevVar = new eev(a);
                e = eevVar;
            }
        }
        return eevVar;
    }
}
