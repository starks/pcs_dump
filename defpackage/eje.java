package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eje extends efb implements egj {
    public static final eje a;
    private static volatile egp g;
    public int b;
    public int c;
    public String d = "";
    public long e;
    public long f;

    static {
        eje ejeVar = new eje();
        a = ejeVar;
        efb.registerDefaultInstance(eje.class, ejeVar);
    }

    private eje() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new eje();
        }
        if (iOrdinal == 4) {
            return new asr((char[][][]) null, (boolean[]) null);
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
        synchronized (eje.class) {
            eevVar = g;
            if (eevVar == null) {
                eevVar = new eev(a);
                g = eevVar;
            }
        }
        return eevVar;
    }
}
