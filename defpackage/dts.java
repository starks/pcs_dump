package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dts extends efb implements egj {
    public static final dts a;
    private static volatile egp e;
    public int b;
    public dtu c;
    public dus d;

    static {
        dts dtsVar = new dts();
        a = dtsVar;
        efb.registerDefaultInstance(dts.class, dtsVar);
    }

    private dts() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new dts();
        }
        if (iOrdinal == 4) {
            return new asr((float[][]) null, (byte[]) null, (short[]) null);
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
        synchronized (dts.class) {
            eevVar = e;
            if (eevVar == null) {
                eevVar = new eev(a);
                e = eevVar;
            }
        }
        return eevVar;
    }
}
