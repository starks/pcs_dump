package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dzj extends efb implements egj {
    public static final dzj a;
    private static volatile egp b;

    static {
        dzj dzjVar = new dzj();
        a = dzjVar;
        efb.registerDefaultInstance(dzj.class, dzjVar);
    }

    private dzj() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0000", null);
        }
        if (iOrdinal == 3) {
            return new dzj();
        }
        if (iOrdinal == 4) {
            return new asr((char[]) null, (byte[]) null, (byte[]) null, (char[]) null, (char[]) null);
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
        synchronized (dzj.class) {
            eevVar = b;
            if (eevVar == null) {
                eevVar = new eev(a);
                b = eevVar;
            }
        }
        return eevVar;
    }
}
