package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eir extends efb implements egj {
    public static final eir a;
    private static volatile egp d;
    public int b;
    public eiq c;

    static {
        eir eirVar = new eir();
        a = eirVar;
        efb.registerDefaultInstance(eir.class, eirVar);
    }

    private eir() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0000", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new eir();
        }
        if (iOrdinal == 4) {
            return new asr((byte[][]) null, (float[]) null);
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
        synchronized (eir.class) {
            eevVar = d;
            if (eevVar == null) {
                eevVar = new eev(a);
                d = eevVar;
            }
        }
        return eevVar;
    }
}
