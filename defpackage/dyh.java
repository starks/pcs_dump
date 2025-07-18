package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dyh extends efb implements egj {
    public static final dyh a;
    private static volatile egp d;
    public int b;
    public egd c = egd.a;

    static {
        dyh dyhVar = new dyh();
        a = dyhVar;
        efb.registerDefaultInstance(dyh.class, dyhVar);
    }

    private dyh() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0004\u00022", new Object[]{"b", "c", dyg.a});
        }
        if (iOrdinal == 3) {
            return new dyh();
        }
        if (iOrdinal == 4) {
            return new asr((byte[][]) null, (char[]) null, (char[]) null);
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
        synchronized (dyh.class) {
            eevVar = d;
            if (eevVar == null) {
                eevVar = new eev(a);
                d = eevVar;
            }
        }
        return eevVar;
    }
}
