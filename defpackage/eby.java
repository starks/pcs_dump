package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eby extends efb implements egj {
    public static final eby a;
    private static volatile egp d;
    public int b = 0;
    public Object c;

    static {
        eby ebyVar = new eby();
        a = ebyVar;
        efb.registerDefaultInstance(eby.class, ebyVar);
    }

    private eby() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"c", "b", ebw.class, ebx.class, ebu.class});
        }
        if (iOrdinal == 3) {
            return new eby();
        }
        if (iOrdinal == 4) {
            return new asr((short[][][]) null, (byte[]) null, (byte[]) null, (char[]) null);
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
        synchronized (eby.class) {
            eevVar = d;
            if (eevVar == null) {
                eevVar = new eev(a);
                d = eevVar;
            }
        }
        return eevVar;
    }
}
