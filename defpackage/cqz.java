package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cqz extends efb implements egj {
    public static final cqz a;
    private static volatile egp h;
    public int b;
    public eea c = eea.b;
    public eea d;
    public cqy e;
    public cqv f;
    public eea g;

    static {
        cqz cqzVar = new cqz();
        a = cqzVar;
        efb.registerDefaultInstance(cqz.class, cqzVar);
    }

    private cqz() {
        eea eeaVar = eea.b;
        this.d = eeaVar;
        this.g = eeaVar;
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ည\u0004", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new cqz();
        }
        if (iOrdinal == 4) {
            return new asr((short[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        egp egpVar = h;
        if (egpVar != null) {
            return egpVar;
        }
        synchronized (cqz.class) {
            eevVar = h;
            if (eevVar == null) {
                eevVar = new eev(a);
                h = eevVar;
            }
        }
        return eevVar;
    }
}
