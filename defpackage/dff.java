package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dff extends efb implements egj {
    public static final dff a;
    private static volatile egp e;
    public int b;
    public int c;
    public int d;

    static {
        dff dffVar = new dff();
        a = dffVar;
        efb.registerDefaultInstance(dff.class, dffVar);
    }

    private dff() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"b", "c", aoz.u, "d", dfm.b});
        }
        if (iOrdinal == 3) {
            return new dff();
        }
        if (iOrdinal == 4) {
            return new asr((int[][]) null, (byte[]) null, (byte[]) null, (byte[]) null);
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
        synchronized (dff.class) {
            eevVar = e;
            if (eevVar == null) {
                eevVar = new eev(a);
                e = eevVar;
            }
        }
        return eevVar;
    }
}
