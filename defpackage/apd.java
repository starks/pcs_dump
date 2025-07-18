package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class apd extends efb implements egj {
    public static final apd a;
    private static volatile egp n;
    public int b;
    public int c;
    public int e;
    public long g;
    public int k;
    public int m;
    public String d = "";
    public String f = "";
    public String h = "";
    public String i = "";
    public String j = "";
    public eea l = eea.b;

    static {
        apd apdVar = new apd();
        a = apdVar;
        efb.registerDefaultInstance(apd.class, apdVar);
    }

    private apd() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003င\u0002\u0004ဈ\u0003\u0005ဂ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\t᠌\b\nည\t\u000b᠌\n", new Object[]{"b", "c", aoz.a, "d", "e", "f", "g", "h", "i", "j", "k", aoz.d, "l", "m", aoz.c});
        }
        if (iOrdinal == 3) {
            return new apd();
        }
        if (iOrdinal == 4) {
            return new asr((byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        egp egpVar = n;
        if (egpVar != null) {
            return egpVar;
        }
        synchronized (apd.class) {
            eevVar = n;
            if (eevVar == null) {
                eevVar = new eev(a);
                n = eevVar;
            }
        }
        return eevVar;
    }
}
