package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cfk extends efb implements egj {
    public static final cfk a;
    private static volatile egp g;
    public long e;
    private int h;
    public egd f = egd.a;
    public String b = "";
    public eea c = eea.b;
    public String d = "";

    static {
        cfk cfkVar = new cfk();
        a = cfkVar;
        efb.registerDefaultInstance(cfk.class, cfkVar);
    }

    private cfk() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0001\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u00052", new Object[]{"h", "b", "c", "d", "e", "f", cfj.a});
        }
        if (iOrdinal == 3) {
            return new cfk();
        }
        if (iOrdinal == 4) {
            return new asr((int[][]) null, (short[]) null, (byte[]) null);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        egp egpVar = g;
        if (egpVar != null) {
            return egpVar;
        }
        synchronized (cfk.class) {
            eevVar = g;
            if (eevVar == null) {
                eevVar = new eev(a);
                g = eevVar;
            }
        }
        return eevVar;
    }
}
