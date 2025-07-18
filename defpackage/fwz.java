package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fwz extends efb implements egj {
    public static final fwz a;
    private static volatile egp d;
    public int b = 0;
    public Object c;

    static {
        fwz fwzVar = new fwz();
        a = fwzVar;
        efb.registerDefaultInstance(fwz.class, fwzVar);
    }

    private fwz() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"c", "b", fww.class, fxc.class, fxd.class});
        }
        if (iOrdinal == 3) {
            return new fwz();
        }
        if (iOrdinal == 4) {
            return new asr((int[][][]) null, (boolean[]) null);
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
        synchronized (fwz.class) {
            eevVar = d;
            if (eevVar == null) {
                eevVar = new eev(a);
                d = eevVar;
            }
        }
        return eevVar;
    }
}
