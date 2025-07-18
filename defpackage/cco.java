package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cco extends efb implements egj {
    public static final cco a;
    private static volatile egp s;
    public int b;
    public Object d;
    public int g;
    public ehf h;
    public ehf i;
    public ehf j;
    public ehf k;
    public ehf l;
    public cck n;
    public int o;
    public boolean q;
    public int c = 0;
    public String e = "";
    public String f = "";
    public String m = "";
    public eea p = eea.b;
    public eea r = eea.b;

    static {
        cco ccoVar = new cco();
        a = ccoVar;
        efb.registerDefaultInstance(cco.class, ccoVar);
    }

    private cco() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0010\u0001\u0001\u0001\u0011\u0010\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0004\u0004<\u0000\u0005ဉ\u0000\u0006ဉ\u0001\u0007ဉ\u0002\bဉ\u0003\tဉ\u0004\nȈ\u000bဉ\u0005\r<\u0000\u000e\f\u000f\n\u0010\u0007\u0011\n", new Object[]{"d", "c", "b", "e", "f", "g", ccg.class, "h", "i", "j", "k", "l", "m", "n", cci.class, "o", "p", "q", "r"});
        }
        if (iOrdinal == 3) {
            return new cco();
        }
        if (iOrdinal == 4) {
            return new asr((boolean[]) null, (int[]) null, (byte[]) null);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        egp egpVar = s;
        if (egpVar != null) {
            return egpVar;
        }
        synchronized (cco.class) {
            eevVar = s;
            if (eevVar == null) {
                eevVar = new eev(a);
                s = eevVar;
            }
        }
        return eevVar;
    }
}
