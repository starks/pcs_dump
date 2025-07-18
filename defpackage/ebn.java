package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ebn extends efb implements egj {
    public static final ebn a;
    private static volatile egp e;
    public Object c;
    public int b = 0;
    public eea d = eea.b;

    static {
        ebn ebnVar = new ebn();
        a = ebnVar;
        efb.registerDefaultInstance(ebn.class, ebnVar);
    }

    private ebn() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\n\u0002<\u0000\u0003<\u0000", new Object[]{"c", "b", "d", ehf.class, eek.class});
        }
        if (iOrdinal == 3) {
            return new ebn();
        }
        if (iOrdinal == 4) {
            return new asr((float[][]) null, (byte[]) null, (byte[]) null, (char[]) null);
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
        synchronized (ebn.class) {
            eevVar = e;
            if (eevVar == null) {
                eevVar = new eev(a);
                e = eevVar;
            }
        }
        return eevVar;
    }
}
