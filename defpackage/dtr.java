package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dtr extends efb implements egj {
    public static final dtr a;
    private static volatile egp f;
    public int b;
    public int c;
    public dtt d;
    public dur e;

    static {
        dtr dtrVar = new dtr();
        a = dtrVar;
        efb.registerDefaultInstance(dtr.class, dtrVar);
    }

    private dtr() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new dtr();
        }
        if (iOrdinal == 4) {
            return new asr((boolean[][]) null, (byte[]) null, (short[]) null);
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
        synchronized (dtr.class) {
            eevVar = f;
            if (eevVar == null) {
                eevVar = new eev(a);
                f = eevVar;
            }
        }
        return eevVar;
    }
}
