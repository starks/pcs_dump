package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bea extends efb implements egj {
    public static final bea a;
    private static volatile egp e;
    public int b;
    public efi c = emptyIntList();
    public int d;

    static {
        bea beaVar = new bea();
        a = beaVar;
        efb.registerDefaultInstance(bea.class, beaVar);
    }

    private bea() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0000\u0001\u0004\u0003\u0000\u0001\u0000\u0001\f\u0003,\u0004\u0004", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new bea();
        }
        if (iOrdinal == 4) {
            return new asr((char[][]) null, (byte[]) null, (char[]) null);
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
        synchronized (bea.class) {
            eevVar = e;
            if (eevVar == null) {
                eevVar = new eev(a);
                e = eevVar;
            }
        }
        return eevVar;
    }
}
