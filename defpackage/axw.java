package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class axw extends efb implements egj {
    public static final axw a;
    private static volatile egp c;
    public eea b = eea.b;

    static {
        axw axwVar = new axw();
        a = axwVar;
        efb.registerDefaultInstance(axw.class, axwVar);
    }

    private axw() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"b"});
        }
        if (iOrdinal == 3) {
            return new axw();
        }
        if (iOrdinal == 4) {
            return new asr((byte[][]) null);
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
        synchronized (axw.class) {
            eevVar = c;
            if (eevVar == null) {
                eevVar = new eev(a);
                c = eevVar;
            }
        }
        return eevVar;
    }
}
