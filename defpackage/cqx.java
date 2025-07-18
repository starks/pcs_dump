package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cqx extends efb implements egj {
    public static final cqx a;
    private static volatile egp e;
    public int b;
    public int c;
    public long d;

    static {
        cqx cqxVar = new cqx();
        a = cqxVar;
        efb.registerDefaultInstance(cqx.class, cqxVar);
    }

    private cqx() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001", new Object[]{"b", "c", aoz.r, "d"});
        }
        if (iOrdinal == 3) {
            return new cqx();
        }
        if (iOrdinal == 4) {
            return new asr((byte[]) null, (char[]) null, (byte[]) null, (byte[]) null);
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
        synchronized (cqx.class) {
            eevVar = e;
            if (eevVar == null) {
                eevVar = new eev(a);
                e = eevVar;
            }
        }
        return eevVar;
    }
}
