package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fxc extends efb implements egj {
    public static final fxc a;
    private static volatile egp c;
    public efh b = emptyFloatList();

    static {
        fxc fxcVar = new fxc();
        a = fxcVar;
        efb.registerDefaultInstance(fxc.class, fxcVar);
    }

    private fxc() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001$", new Object[]{"b"});
        }
        if (iOrdinal == 3) {
            return new fxc();
        }
        if (iOrdinal == 4) {
            return new asr((byte[]) null, (byte[][]) null);
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
        synchronized (fxc.class) {
            eevVar = c;
            if (eevVar == null) {
                eevVar = new eev(a);
                c = eevVar;
            }
        }
        return eevVar;
    }
}
