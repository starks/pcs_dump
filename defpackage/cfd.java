package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cfd extends efb implements egj {
    public static final cfd a;
    private static volatile egp f;
    public int b;
    public Object d;
    public int c = 0;
    public String e = "";

    static {
        cfd cfdVar = new cfd();
        a = cfdVar;
        efb.registerDefaultInstance(cfd.class, cfdVar);
    }

    private cfd() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0001\u0001\u0001\n\u0006\u0000\u0000\u0000\u00018\u0000\u0002:\u0000\u00033\u0000\u0004;\u0000\u0005=\u0000\nဈ\u0000", new Object[]{"d", "c", "b", "e"});
        }
        if (iOrdinal == 3) {
            return new cfd();
        }
        if (iOrdinal == 4) {
            return new asr((short[][]) null, (short[]) null, (byte[]) null);
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
        synchronized (cfd.class) {
            eevVar = f;
            if (eevVar == null) {
                eevVar = new eev(a);
                f = eevVar;
            }
        }
        return eevVar;
    }
}
