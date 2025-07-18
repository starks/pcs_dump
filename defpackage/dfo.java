package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dfo extends efb implements egj {
    public static final dfo a;
    private static volatile egp h;
    public int b;
    public Object d;
    public Object f;
    public int c = 0;
    public int e = 0;
    public String g = "";

    static {
        dfo dfoVar = new dfo();
        a = dfoVar;
        efb.registerDefaultInstance(dfo.class, dfoVar);
    }

    private dfo() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0002\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0001\u0004<\u0001\u0005ဈ\u0000\u0006<\u0001", new Object[]{"d", "c", "f", "e", "b", dfj.class, dfl.class, dfk.class, dff.class, "g", dfh.class});
        }
        if (iOrdinal == 3) {
            return new dfo();
        }
        if (iOrdinal == 4) {
            return new asr((float[][]) null, (byte[]) null, (byte[]) null, (byte[]) null);
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
        synchronized (dfo.class) {
            eevVar = h;
            if (eevVar == null) {
                eevVar = new eev(a);
                h = eevVar;
            }
        }
        return eevVar;
    }
}
