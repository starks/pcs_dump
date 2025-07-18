package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akk extends efb implements egj {
    public static final akk a;
    private static volatile egp d;
    public int b;
    public int c;
    private int e;

    static {
        akk akkVar = new akk();
        a = akkVar;
        efb.registerDefaultInstance(akk.class, akkVar);
    }

    private akk() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001", new Object[]{"e", "b", "c"});
        }
        if (iOrdinal == 3) {
            return new akk();
        }
        if (iOrdinal == 4) {
            return new asr((int[][][]) null, (byte[]) null, (byte[]) null);
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
        synchronized (akk.class) {
            eevVar = d;
            if (eevVar == null) {
                eevVar = new eev(a);
                d = eevVar;
            }
        }
        return eevVar;
    }
}
