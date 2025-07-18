package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cft extends efb implements egj {
    public static final efj a = new cfs(0);
    public static final cft b;
    private static volatile egp m;
    public int c;
    public boolean e;
    public cfu j;
    public boolean k;
    public boolean l;
    public eea d = eea.b;
    public String f = "";
    public efm g = efb.emptyProtobufList();
    public efm h = efb.emptyProtobufList();
    public efi i = emptyIntList();

    static {
        cft cftVar = new cft();
        b = cftVar;
        efb.registerDefaultInstance(cft.class, cftVar);
    }

    private cft() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(b, "\u0004\t\u0000\u0001\u0001\u000b\t\u0000\u0003\u0000\u0001ည\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004\u001a\u0005\u001a\u0007ࠬ\bဉ\u0003\nဇ\u0004\u000bဇ\u0005", new Object[]{"c", "d", "e", "f", "g", "h", "i", dfm.n, "j", "k", "l"});
        }
        if (iOrdinal == 3) {
            return new cft();
        }
        if (iOrdinal == 4) {
            return new asr((float[][]) null, (short[]) null, (byte[]) null);
        }
        if (iOrdinal == 5) {
            return b;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        egp egpVar = m;
        if (egpVar != null) {
            return egpVar;
        }
        synchronized (cft.class) {
            eevVar = m;
            if (eevVar == null) {
                eevVar = new eev(b);
                m = eevVar;
            }
        }
        return eevVar;
    }
}
