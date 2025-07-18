package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ben extends efb implements egj {
    public static final ben a;
    private static volatile egp e;
    public int b;
    public String c = "";
    public efm d = efb.emptyProtobufList();

    static {
        ben benVar = new ben();
        a = benVar;
        efb.registerDefaultInstance(ben.class, benVar);
    }

    private ben() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ለ\u0000\u0002Ț", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new ben();
        }
        if (iOrdinal == 4) {
            return new asr((char[]) null, (byte[]) null, (byte[]) null, (char[]) null);
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
        synchronized (ben.class) {
            eevVar = e;
            if (eevVar == null) {
                eevVar = new eev(a);
                e = eevVar;
            }
        }
        return eevVar;
    }
}
