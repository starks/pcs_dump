package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cfb extends efb implements egj {
    public static final cfb a;
    private static volatile egp j;
    public int b;
    public String c = "";
    public eea d = eea.b;
    public String e = "";
    public efm f = emptyProtobufList();
    public efm g = efb.emptyProtobufList();
    public boolean h;
    public long i;

    static {
        cfb cfbVar = new cfb();
        a = cfbVar;
        efb.registerDefaultInstance(cfb.class, cfbVar);
    }

    private cfb() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0001\t\u0007\u0000\u0002\u0000\u0001ဈ\u0002\u0002ဈ\u0000\u0003ည\u0001\u0004\u001b\u0005\u001a\bဇ\u0003\tဂ\u0004", new Object[]{"b", "e", "c", "d", "f", cfd.class, "g", "h", "i"});
        }
        if (iOrdinal == 3) {
            return new cfb();
        }
        if (iOrdinal == 4) {
            return new asr((char[][]) null, (short[]) null, (byte[]) null);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        egp egpVar = j;
        if (egpVar != null) {
            return egpVar;
        }
        synchronized (cfb.class) {
            eevVar = j;
            if (eevVar == null) {
                eevVar = new eev(a);
                j = eevVar;
            }
        }
        return eevVar;
    }
}
