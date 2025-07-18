package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ebu extends efb implements egj {
    public static final ebu a;
    private static volatile egp c;
    public efm b = emptyProtobufList();

    static {
        ebu ebuVar = new ebu();
        a = ebuVar;
        efb.registerDefaultInstance(ebu.class, ebuVar);
    }

    private ebu() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", ebt.class});
        }
        if (iOrdinal == 3) {
            return new ebu();
        }
        if (iOrdinal == 4) {
            return new asr((int[][][]) null, (byte[]) null, (byte[]) null, (char[]) null);
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
        synchronized (ebu.class) {
            eevVar = c;
            if (eevVar == null) {
                eevVar = new eev(a);
                c = eevVar;
            }
        }
        return eevVar;
    }
}
