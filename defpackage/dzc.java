package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dzc extends efb implements egj {
    public static final dzc a;
    private static volatile egp b;
    private egd c = egd.a;

    static {
        dzc dzcVar = new dzc();
        a = dzcVar;
        efb.registerDefaultInstance(dzc.class, dzcVar);
    }

    private dzc() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0003\u0003\u0001\u0001\u0000\u0000\u00032", new Object[]{"c", dzb.a});
        }
        if (iOrdinal == 3) {
            return new dzc();
        }
        if (iOrdinal == 4) {
            return new asr((char[][][]) null, (char[]) null, (char[]) null);
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
        synchronized (dzc.class) {
            eevVar = b;
            if (eevVar == null) {
                eevVar = new eev(a);
                b = eevVar;
            }
        }
        return eevVar;
    }
}
