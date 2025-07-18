package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajn extends efb implements egj {
    public static final ajn a;
    private static volatile egp e;
    public int b;
    public int c;
    public int d;

    static {
        ajn ajnVar = new ajn();
        a = ajnVar;
        efb.registerDefaultInstance(ajn.class, ajnVar);
    }

    private ajn() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001", new Object[]{"b", "c", eim.d, "d"});
        }
        if (iOrdinal == 3) {
            return new ajn();
        }
        if (iOrdinal == 4) {
            return new asr((short[][][]) null, (byte[]) null, (byte[]) null);
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
        synchronized (ajn.class) {
            eevVar = e;
            if (eevVar == null) {
                eevVar = new eev(a);
                e = eevVar;
            }
        }
        return eevVar;
    }
}
