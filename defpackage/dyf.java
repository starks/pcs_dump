package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dyf extends efb implements egj {
    public static final dyf a;
    private static volatile egp d;
    public dzi b;
    public efm c = emptyProtobufList();
    private int e;

    static {
        dyf dyfVar = new dyf();
        a = dyfVar;
        efb.registerDefaultInstance(dyf.class, dyfVar);
    }

    private dyf() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"e", "b", "c", dzk.class});
        }
        if (iOrdinal == 3) {
            return new dyf();
        }
        if (iOrdinal == 4) {
            return new asr((boolean[]) null, (short[]) null, (char[]) null);
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
        synchronized (dyf.class) {
            eevVar = d;
            if (eevVar == null) {
                eevVar = new eev(a);
                d = eevVar;
            }
        }
        return eevVar;
    }
}
