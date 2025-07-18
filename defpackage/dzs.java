package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dzs extends efb implements egj {
    public static final dzs a;
    private static volatile egp d;
    public egd b = egd.a;
    public dzp c;
    private int e;

    static {
        dzs dzsVar = new dzs();
        a = dzsVar;
        efb.registerDefaultInstance(dzs.class, dzsVar);
    }

    private dzs() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u00012\u0002ဉ\u0000", new Object[]{"e", "b", dzr.a, "c"});
        }
        if (iOrdinal == 3) {
            return new dzs();
        }
        if (iOrdinal == 4) {
            return new asr((byte[][]) null, (byte[]) null, (byte[]) null, (char[]) null);
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
        synchronized (dzs.class) {
            eevVar = d;
            if (eevVar == null) {
                eevVar = new eev(a);
                d = eevVar;
            }
        }
        return eevVar;
    }
}
