package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bwr extends efb implements egj {
    public static final bwr a;
    private static volatile egp e;
    public int b;
    public int c;
    public dyf d;

    static {
        bwr bwrVar = new bwr();
        a = bwrVar;
        efb.registerDefaultInstance(bwr.class, bwrVar);
    }

    private bwr() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002ဉ\u0000", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new bwr();
        }
        if (iOrdinal == 4) {
            return new asr((boolean[][][]) null, (short[]) null);
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
        synchronized (bwr.class) {
            eevVar = e;
            if (eevVar == null) {
                eevVar = new eev(a);
                e = eevVar;
            }
        }
        return eevVar;
    }
}
