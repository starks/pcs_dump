package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bcm extends efb implements egj {
    public static final bcm a;
    private static volatile egp f;
    public int b;
    public bbx c;
    public bca d;
    public bcb e;

    static {
        bcm bcmVar = new bcm();
        a = bcmVar;
        efb.registerDefaultInstance(bcm.class, bcmVar);
    }

    private bcm() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new bcm();
        }
        if (iOrdinal == 4) {
            return new asr((short[][][]) null, (byte[]) null);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        egp egpVar = f;
        if (egpVar != null) {
            return egpVar;
        }
        synchronized (bcm.class) {
            eevVar = f;
            if (eevVar == null) {
                eevVar = new eev(a);
                f = eevVar;
            }
        }
        return eevVar;
    }
}
