package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bcr extends efb implements egj {
    public static final bcr a;
    private static volatile egp e;
    public bcl b;
    public bck c;
    public bcg d;
    private int f;

    static {
        bcr bcrVar = new bcr();
        a = bcrVar;
        efb.registerDefaultInstance(bcr.class, bcrVar);
    }

    private bcr() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"f", "b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new bcr();
        }
        if (iOrdinal == 4) {
            return new asr((boolean[][][]) null, (byte[]) null);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        egp egpVar = e;
        if (egpVar != null) {
            return egpVar;
        }
        synchronized (bcr.class) {
            eevVar = e;
            if (eevVar == null) {
                eevVar = new eev(a);
                e = eevVar;
            }
        }
        return eevVar;
    }
}
