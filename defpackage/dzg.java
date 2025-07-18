package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dzg extends efb implements egj {
    public static final dzg a;
    private static volatile egp d;
    public String b = "";
    public eek c;
    private int e;

    static {
        dzg dzgVar = new dzg();
        a = dzgVar;
        efb.registerDefaultInstance(dzg.class, dzgVar);
    }

    private dzg() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"e", "b", "c"});
        }
        if (iOrdinal == 3) {
            return new dzg();
        }
        if (iOrdinal == 4) {
            return new asr((boolean[][][]) null, (char[]) null, (char[]) null);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        egp egpVar = d;
        if (egpVar != null) {
            return egpVar;
        }
        synchronized (dzg.class) {
            eevVar = d;
            if (eevVar == null) {
                eevVar = new eev(a);
                d = eevVar;
            }
        }
        return eevVar;
    }
}
