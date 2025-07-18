package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fxb extends efb implements egj {
    public static final fxb a;
    private static volatile egp c;
    public egd b = egd.a;

    static {
        fxb fxbVar = new fxb();
        a = fxbVar;
        efb.registerDefaultInstance(fxb.class, fxbVar);
    }

    private fxb() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", fxa.a});
        }
        if (iOrdinal == 3) {
            return new fxb();
        }
        if (iOrdinal == 4) {
            return new asr((byte[][]) null, (boolean[]) null);
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
        synchronized (fxb.class) {
            eevVar = c;
            if (eevVar == null) {
                eevVar = new eev(a);
                c = eevVar;
            }
        }
        return eevVar;
    }
}
