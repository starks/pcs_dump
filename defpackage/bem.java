package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bem extends efb implements egj {
    public static final bem a;
    private static volatile egp d;
    public int b = 0;
    public Object c;

    static {
        bem bemVar = new bem();
        a = bemVar;
        efb.registerDefaultInstance(bem.class, bemVar);
    }

    private bem() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0001\u0000\u0002\u0006\u0005\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"c", "b", bel.class, bej.class, bed.class, bei.class, bek.class});
        }
        if (iOrdinal == 3) {
            return new bem();
        }
        if (iOrdinal == 4) {
            return new asr((int[][]) null, (byte[]) null, (char[]) null);
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
        synchronized (bem.class) {
            eevVar = d;
            if (eevVar == null) {
                eevVar = new eev(a);
                d = eevVar;
            }
        }
        return eevVar;
    }
}
