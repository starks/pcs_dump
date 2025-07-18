package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dum extends efb implements egj {
    public static final dum a;
    private static volatile egp g;
    public int b;
    public int c;
    public duk d;
    public eea e = eea.b;
    public eea f = eea.b;

    static {
        dum dumVar = new dum();
        a = dumVar;
        efb.registerDefaultInstance(dum.class, dumVar);
    }

    private dum() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new dum();
        }
        if (iOrdinal == 4) {
            return new asr((int[][]) null, (int[]) null);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        egp egpVar = g;
        if (egpVar != null) {
            return egpVar;
        }
        synchronized (dum.class) {
            eevVar = g;
            if (eevVar == null) {
                eevVar = new eev(a);
                g = eevVar;
            }
        }
        return eevVar;
    }
}
