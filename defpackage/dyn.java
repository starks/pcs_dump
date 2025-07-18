package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dyn extends efb implements egj {
    public static final dyn a;
    private static volatile egp c;
    public efl b = emptyLongList();

    static {
        dyn dynVar = new dyn();
        a = dynVar;
        efb.registerDefaultInstance(dyn.class, dynVar);
    }

    private dyn() {
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
            return new dyn();
        }
        if (iOrdinal == 4) {
            return new asr((byte[]) null, (short[]) null, (short[]) null);
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
        synchronized (dyn.class) {
            eevVar = c;
            if (eevVar == null) {
                eevVar = new eev(a);
                c = eevVar;
            }
        }
        return eevVar;
    }
}
