package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fxd extends efb implements egj {
    public static final fxd a;
    private static volatile egp c;
    public efl b = emptyLongList();

    static {
        fxd fxdVar = new fxd();
        a = fxdVar;
        efb.registerDefaultInstance(fxd.class, fxdVar);
    }

    private fxd() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001%", new Object[]{"b"});
        }
        if (iOrdinal == 3) {
            return new fxd();
        }
        if (iOrdinal == 4) {
            return new asr((char[][]) null, (float[]) null);
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
        synchronized (fxd.class) {
            eevVar = c;
            if (eevVar == null) {
                eevVar = new eev(a);
                c = eevVar;
            }
        }
        return eevVar;
    }
}
