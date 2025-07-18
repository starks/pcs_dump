package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bas extends efb implements egj {
    public static final bas a;
    private static volatile egp d;
    public eea b = eea.b;
    public bay c;
    private int e;

    static {
        bas basVar = new bas();
        a = basVar;
        efb.registerDefaultInstance(bas.class, basVar);
    }

    private bas() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002ဉ\u0000", new Object[]{"e", "b", "c"});
        }
        if (iOrdinal == 3) {
            return new bas();
        }
        if (iOrdinal == 4) {
            return new asr((char[]) null, (byte[]) null);
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
        synchronized (bas.class) {
            eevVar = d;
            if (eevVar == null) {
                eevVar = new eev(a);
                d = eevVar;
            }
        }
        return eevVar;
    }
}
