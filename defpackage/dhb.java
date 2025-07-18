package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dhb extends efb implements egj {
    public static final dhb a;
    private static volatile egp d;
    public int b = 0;
    public Object c;

    static {
        dhb dhbVar = new dhb();
        a = dhbVar;
        efb.registerDefaultInstance(dhb.class, dhbVar);
    }

    private dhb() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"c", "b", dha.class, dgz.class});
        }
        if (iOrdinal == 3) {
            return new dhb();
        }
        if (iOrdinal == 4) {
            return new asr((byte[]) null, (char[]) null, (short[]) null);
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
        synchronized (dhb.class) {
            eevVar = d;
            if (eevVar == null) {
                eevVar = new eev(a);
                d = eevVar;
            }
        }
        return eevVar;
    }
}
