package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dge extends efb implements egj {
    public static final dge a;
    private static volatile egp c;
    public efm b = emptyProtobufList();

    static {
        dge dgeVar = new dge();
        a = dgeVar;
        efb.registerDefaultInstance(dge.class, dgeVar);
    }

    private dge() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", dgd.class});
        }
        if (iOrdinal == 3) {
            return new dge();
        }
        if (iOrdinal == 4) {
            return new asr((int[]) null, (short[]) null, (byte[]) null);
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
        synchronized (dge.class) {
            eevVar = c;
            if (eevVar == null) {
                eevVar = new eev(a);
                c = eevVar;
            }
        }
        return eevVar;
    }
}
