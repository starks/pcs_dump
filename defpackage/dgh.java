package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dgh extends efb implements egj {
    public static final dgh a;
    private static volatile egp f;
    public int b;
    public int c = 0;
    public Object d;
    public long e;

    static {
        dgh dghVar = new dgh();
        a = dghVar;
        efb.registerDefaultInstance(dgh.class, dghVar);
    }

    private dgh() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဂ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"d", "c", "b", "e", dgf.class, dgg.class, dge.class, dgc.class});
        }
        if (iOrdinal == 3) {
            return new dgh();
        }
        if (iOrdinal == 4) {
            return new asr((char[]) null, (short[]) null, (byte[]) null);
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
        synchronized (dgh.class) {
            eevVar = f;
            if (eevVar == null) {
                eevVar = new eev(a);
                f = eevVar;
            }
        }
        return eevVar;
    }
}
