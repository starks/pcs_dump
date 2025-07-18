package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ede extends efb implements egj {
    public static final ede a;
    private static volatile egp c;
    public edd b;
    private int d;

    static {
        ede edeVar = new ede();
        a = edeVar;
        efb.registerDefaultInstance(ede.class, edeVar);
    }

    private ede() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"d", "b"});
        }
        if (iOrdinal == 3) {
            return new ede();
        }
        if (iOrdinal == 4) {
            return new asr((float[][][]) null, (boolean[]) null);
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
        synchronized (ede.class) {
            eevVar = c;
            if (eevVar == null) {
                eevVar = new eev(a);
                c = eevVar;
            }
        }
        return eevVar;
    }
}
