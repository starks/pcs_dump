package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bei extends efb implements egj {
    public static final bei a;
    private static volatile egp e;
    public int b = 0;
    public Object c;
    public int d;

    static {
        bei beiVar = new bei();
        a = beiVar;
        efb.registerDefaultInstance(bei.class, beiVar);
    }

    private bei() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"c", "b", "d", beh.class, bee.class, bef.class});
        }
        if (iOrdinal == 3) {
            return new bei();
        }
        if (iOrdinal == 4) {
            return new asr((float[][]) null, (byte[]) null, (char[]) null);
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
        synchronized (bei.class) {
            eevVar = e;
            if (eevVar == null) {
                eevVar = new eev(a);
                e = eevVar;
            }
        }
        return eevVar;
    }
}
