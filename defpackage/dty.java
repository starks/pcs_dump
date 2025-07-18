package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dty extends efb implements egj {
    public static final dty a;
    private static volatile egp c;
    public int b;

    static {
        dty dtyVar = new dty();
        a = dtyVar;
        efb.registerDefaultInstance(dty.class, dtyVar);
    }

    private dty() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"b"});
        }
        if (iOrdinal == 3) {
            return new dty();
        }
        if (iOrdinal == 4) {
            return new asr((float[][][]) null, (byte[]) null, (short[]) null);
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
        synchronized (dty.class) {
            eevVar = c;
            if (eevVar == null) {
                eevVar = new eev(a);
                c = eevVar;
            }
        }
        return eevVar;
    }
}
