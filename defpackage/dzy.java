package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dzy extends efb implements egj {
    public static final dzy a;
    private static volatile egp e;
    public int b = 0;
    public Object c;
    public edc d;
    private int f;

    static {
        dzy dzyVar = new dzy();
        a = dzyVar;
        efb.registerDefaultInstance(dzy.class, dzyVar);
    }

    private dzy() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0001\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002ဉ\u0000", new Object[]{"c", "b", "f", ede.class, "d"});
        }
        if (iOrdinal == 3) {
            return new dzy();
        }
        if (iOrdinal == 4) {
            return new asr((short[][]) null, (byte[]) null, (byte[]) null, (char[]) null);
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
        synchronized (dzy.class) {
            eevVar = e;
            if (eevVar == null) {
                eevVar = new eev(a);
                e = eevVar;
            }
        }
        return eevVar;
    }
}
