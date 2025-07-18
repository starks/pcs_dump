package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cfr extends efb implements egj {
    public static final efj a = new cfs(1);
    public static final cfr b;
    private static volatile egp n;
    public int c;
    public boolean e;
    public long g;
    public cfu k;
    public boolean l;
    public boolean m;
    public eea d = eea.b;
    public String f = "";
    public efm h = efb.emptyProtobufList();
    public efm i = efb.emptyProtobufList();
    public efi j = emptyIntList();

    static {
        cfr cfrVar = new cfr();
        b = cfrVar;
        efb.registerDefaultInstance(cfr.class, cfrVar);
    }

    private cfr() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(b, "\u0004\n\u0000\u0001\u0001\u000b\n\u0000\u0003\u0000\u0001ည\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005\u001a\u0006\u001a\u0007ࠬ\bဉ\u0004\nဇ\u0005\u000bဇ\u0006", new Object[]{"c", "d", "e", "f", "g", "h", "i", "j", dfm.n, "k", "l", "m"});
        }
        if (iOrdinal == 3) {
            return new cfr();
        }
        if (iOrdinal == 4) {
            return new asr((boolean[][]) null, (short[]) null, (byte[]) null);
        }
        if (iOrdinal == 5) {
            return b;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        egp egpVar = n;
        if (egpVar != null) {
            return egpVar;
        }
        synchronized (cfr.class) {
            eevVar = n;
            if (eevVar == null) {
                eevVar = new eev(b);
                n = eevVar;
            }
        }
        return eevVar;
    }
}
