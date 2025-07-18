package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class auj extends efb implements egj {
    public static final auj a;
    private static volatile egp d;
    public int b = 0;
    public Object c;

    static {
        auj aujVar = new auj();
        a = aujVar;
        efb.registerDefaultInstance(auj.class, aujVar);
    }

    private auj() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000", new Object[]{"c", "b", auk.class, aul.class, auo.class, aun.class, aui.class, aum.class, aup.class});
        }
        if (iOrdinal == 3) {
            return new auj();
        }
        if (iOrdinal == 4) {
            return new asr((float[][]) null, (char[]) null);
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
        synchronized (auj.class) {
            eevVar = d;
            if (eevVar == null) {
                eevVar = new eev(a);
                d = eevVar;
            }
        }
        return eevVar;
    }
}
