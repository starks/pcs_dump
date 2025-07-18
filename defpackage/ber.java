package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ber extends efb implements egj {
    public static final ber a;
    private static volatile egp e;
    public String b = "";
    public efm c = emptyProtobufList();
    public int d;
    private int f;

    static {
        ber berVar = new ber();
        a = berVar;
        efb.registerDefaultInstance(ber.class, berVar);
    }

    private ber() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ለ\u0000\u0002\u001b\u0003ဌ\u0001", new Object[]{"f", "b", "c", ben.class, "d"});
        }
        if (iOrdinal == 3) {
            return new ber();
        }
        if (iOrdinal == 4) {
            return new asr((short[]) null, (int[]) null);
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
        synchronized (ber.class) {
            eevVar = e;
            if (eevVar == null) {
                eevVar = new eev(a);
                e = eevVar;
            }
        }
        return eevVar;
    }
}
