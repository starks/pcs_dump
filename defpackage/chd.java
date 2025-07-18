package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class chd extends efb implements egj {
    public static final chd a;
    private static volatile egp h;
    public int b;
    public long f;
    public String c = "";
    public eea d = eea.b;
    public String e = "";
    public efm g = emptyProtobufList();

    static {
        chd chdVar = new chd();
        a = chdVar;
        efb.registerDefaultInstance(chd.class, chdVar);
    }

    private chd() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005\u001b", new Object[]{"b", "c", "d", "e", "f", "g", chf.class});
        }
        if (iOrdinal == 3) {
            return new chd();
        }
        if (iOrdinal == 4) {
            return new asr((boolean[][][]) null, (short[]) null, (byte[]) null);
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
        synchronized (chd.class) {
            eevVar = h;
            if (eevVar == null) {
                eevVar = new eev(a);
                h = eevVar;
            }
        }
        return eevVar;
    }
}
