package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dhc extends efb implements egj {
    public static final dhc a;
    private static volatile egp b;

    static {
        dhc dhcVar = new dhc();
        a = dhcVar;
        efb.registerDefaultInstance(dhc.class, dhcVar);
    }

    private dhc() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0000", null);
        }
        if (iOrdinal == 3) {
            return new dhc();
        }
        if (iOrdinal == 4) {
            return new asr((short[]) null, (char[]) null, (short[]) null);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        egp egpVar = b;
        if (egpVar != null) {
            return egpVar;
        }
        synchronized (dhc.class) {
            eevVar = b;
            if (eevVar == null) {
                eevVar = new eev(a);
                b = eevVar;
            }
        }
        return eevVar;
    }
}
