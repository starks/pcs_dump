package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class duc extends efb implements egj {
    public static final duc a;
    private static volatile egp d;
    public int b;
    public int c;

    static {
        duc ducVar = new duc();
        a = ducVar;
        efb.registerDefaultInstance(duc.class, ducVar);
    }

    private duc() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"c", "b"});
        }
        if (iOrdinal == 3) {
            return new duc();
        }
        if (iOrdinal == 4) {
            return new asr((float[]) null, (int[]) null);
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
        synchronized (duc.class) {
            eevVar = d;
            if (eevVar == null) {
                eevVar = new eev(a);
                d = eevVar;
            }
        }
        return eevVar;
    }
}
