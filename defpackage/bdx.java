package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bdx extends efb implements egj {
    public static final bdx a;
    private static volatile egp h;
    public int c;
    public String b = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";

    static {
        bdx bdxVar = new bdx();
        a = bdxVar;
        efb.registerDefaultInstance(bdx.class, bdxVar);
    }

    private bdx() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0000\u0001\u0007\u0006\u0000\u0000\u0000\u0001Ȉ\u0003\f\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new bdx();
        }
        if (iOrdinal == 4) {
            return new asr((byte[][]) null, (byte[]) null, (char[]) null);
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
        synchronized (bdx.class) {
            eevVar = h;
            if (eevVar == null) {
                eevVar = new eev(a);
                h = eevVar;
            }
        }
        return eevVar;
    }
}
