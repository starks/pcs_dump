package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dvh extends efb implements egj {
    public static final dvh a;
    private static volatile egp f;
    public String b = "";
    public int c;
    public int d;
    public int e;

    static {
        dvh dvhVar = new dvh();
        a = dvhVar;
        efb.registerDefaultInstance(dvh.class, dvhVar);
    }

    private dvh() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new dvh();
        }
        if (iOrdinal == 4) {
            return new asr((short[]) null, (char[]) null, (byte[]) null, (char[]) null);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        egp egpVar = f;
        if (egpVar != null) {
            return egpVar;
        }
        synchronized (dvh.class) {
            eevVar = f;
            if (eevVar == null) {
                eevVar = new eev(a);
                f = eevVar;
            }
        }
        return eevVar;
    }
}
