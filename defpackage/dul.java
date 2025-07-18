package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dul extends efb implements egj {
    public static final dul a;
    private static volatile egp f;
    public int b;
    public int c;
    public dum d;
    public eea e = eea.b;

    static {
        dul dulVar = new dul();
        a = dulVar;
        efb.registerDefaultInstance(dul.class, dulVar);
    }

    private dul() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new dul();
        }
        if (iOrdinal == 4) {
            return new asr((short[][]) null, (int[]) null);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        egp egpVar = f;
        if (egpVar != null) {
            return egpVar;
        }
        synchronized (dul.class) {
            eevVar = f;
            if (eevVar == null) {
                eevVar = new eev(a);
                f = eevVar;
            }
        }
        return eevVar;
    }
}
