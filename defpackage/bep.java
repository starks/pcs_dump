package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bep extends efb implements egj {
    public static final bep a;
    private static volatile egp c;
    public efm b = emptyProtobufList();

    static {
        bep bepVar = new bep();
        a = bepVar;
        efb.registerDefaultInstance(bep.class, bepVar);
    }

    private bep() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", beo.class});
        }
        if (iOrdinal == 3) {
            return new bep();
        }
        if (iOrdinal == 4) {
            return new asr((boolean[]) null, (short[]) null);
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
        synchronized (bep.class) {
            eevVar = c;
            if (eevVar == null) {
                eevVar = new eev(a);
                c = eevVar;
            }
        }
        return eevVar;
    }
}
