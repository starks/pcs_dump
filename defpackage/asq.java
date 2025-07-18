package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class asq extends efb implements egj {
    public static final asq a;
    private static volatile egp e;
    public int b;
    public int c;
    public efm d = emptyProtobufList();

    static {
        asq asqVar = new asq();
        a = asqVar;
        efb.registerDefaultInstance(asq.class, asqVar);
    }

    private asq() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u001b", new Object[]{"b", "c", "d", ask.class});
        }
        if (iOrdinal == 3) {
            return new asq();
        }
        if (iOrdinal == 4) {
            return new asr((int[]) null, (short[]) null);
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
        synchronized (asq.class) {
            eevVar = e;
            if (eevVar == null) {
                eevVar = new eev(a);
                e = eevVar;
            }
        }
        return eevVar;
    }
}
