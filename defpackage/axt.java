package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class axt extends efb implements egj {
    public static final axt a;
    private static volatile egp e;
    public ayd b;
    public String c = "";
    public int d;
    private int f;

    static {
        axt axtVar = new axt();
        a = axtVar;
        efb.registerDefaultInstance(axt.class, axtVar);
    }

    private axt() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001Ϫ\u0003\u0000\u0000\u0000\u0001ဉ\u0000ϩȈϪ\f", new Object[]{"f", "b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new axt();
        }
        if (iOrdinal == 4) {
            return new asr((int[]) null);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        egp egpVar = e;
        if (egpVar != null) {
            return egpVar;
        }
        synchronized (axt.class) {
            eevVar = e;
            if (eevVar == null) {
                eevVar = new eev(a);
                e = eevVar;
            }
        }
        return eevVar;
    }
}
