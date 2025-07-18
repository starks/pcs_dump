package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class asj extends efb implements egj {
    public static final asj a;
    private static volatile egp d;
    public int b = 0;
    public Object c;

    static {
        asj asjVar = new asj();
        a = asjVar;
        efb.registerDefaultInstance(asj.class, asjVar);
    }

    private asj() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"c", "b", asq.class, asp.class});
        }
        if (iOrdinal == 3) {
            return new asj();
        }
        if (iOrdinal == 4) {
            return new asr((int[]) null, (char[]) null);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        egp egpVar = d;
        if (egpVar != null) {
            return egpVar;
        }
        synchronized (asj.class) {
            eevVar = d;
            if (eevVar == null) {
                eevVar = new eev(a);
                d = eevVar;
            }
        }
        return eevVar;
    }
}
