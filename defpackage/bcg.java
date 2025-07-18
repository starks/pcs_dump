package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bcg extends efb implements egj {
    public static final bcg a;
    private static volatile egp c;
    public efm b = emptyProtobufList();

    static {
        bcg bcgVar = new bcg();
        a = bcgVar;
        efb.registerDefaultInstance(bcg.class, bcgVar);
    }

    private bcg() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001c", new Object[]{"b"});
        }
        if (iOrdinal == 3) {
            return new bcg();
        }
        if (iOrdinal == 4) {
            return new asr((int[][]) null, (byte[]) null);
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
        synchronized (bcg.class) {
            eevVar = c;
            if (eevVar == null) {
                eevVar = new eev(a);
                c = eevVar;
            }
        }
        return eevVar;
    }
}
