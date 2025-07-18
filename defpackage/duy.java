package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class duy extends efb implements egj {
    public static final duy a;
    private static volatile egp e;
    public int b;
    public int c;
    public int d;

    static {
        duy duyVar = new duy();
        a = duyVar;
        efb.registerDefaultInstance(duy.class, duyVar);
    }

    private duy() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new duy();
        }
        if (iOrdinal == 4) {
            return new asr((boolean[][][]) null, (int[]) null);
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
        synchronized (duy.class) {
            eevVar = e;
            if (eevVar == null) {
                eevVar = new eev(a);
                e = eevVar;
            }
        }
        return eevVar;
    }
}
