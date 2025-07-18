package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bev extends efb implements egj {
    public static final bev a;
    private static volatile egp e;
    public int b;
    public int c;
    public efm d = emptyProtobufList();

    static {
        bev bevVar = new bev();
        a = bevVar;
        efb.registerDefaultInstance(bev.class, bevVar);
    }

    private bev() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u001b", new Object[]{"b", "c", "d", ben.class});
        }
        if (iOrdinal == 3) {
            return new bev();
        }
        if (iOrdinal == 4) {
            return new asr((byte[][]) null, (short[]) null);
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
        synchronized (bev.class) {
            eevVar = e;
            if (eevVar == null) {
                eevVar = new eev(a);
                e = eevVar;
            }
        }
        return eevVar;
    }
}
