package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bcz extends efb implements egj {
    public static final bcz a;
    private static volatile egp e;
    public int b;
    public long c;
    public eea d = eea.b;

    static {
        bcz bczVar = new bcz();
        a = bczVar;
        efb.registerDefaultInstance(bcz.class, bczVar);
    }

    private bcz() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ည\u0001", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new bcz();
        }
        if (iOrdinal == 4) {
            return new asr((byte[]) null, (byte[]) null, (byte[]) null);
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
        synchronized (bcz.class) {
            eevVar = e;
            if (eevVar == null) {
                eevVar = new eev(a);
                e = eevVar;
            }
        }
        return eevVar;
    }
}
