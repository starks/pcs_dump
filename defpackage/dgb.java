package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dgb extends efb implements egj {
    public static final dgb a;
    private static volatile egp m;
    public int b;
    public long c;
    public long d;
    public int e;
    public long f;
    public int g;
    public int h;
    public long i;
    public long j;
    public long k;
    public int l;

    static {
        dgb dgbVar = new dgb();
        a = dgbVar;
        efb.registerDefaultInstance(dgb.class, dgbVar);
    }

    private dgb() {
        emptyIntList();
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003᠌\u0002\u0004ဂ\u0003\u0005᠌\u0004\u0006᠌\u0005\u0007ဂ\u0006\bဂ\u0007\tဂ\b\n᠌\t", new Object[]{"b", "c", "d", "e", dfm.i, "f", "g", dfm.j, "h", dfm.g, "i", "j", "k", "l", dfm.h});
        }
        if (iOrdinal == 3) {
            return new dgb();
        }
        if (iOrdinal == 4) {
            return new asr((char[]) null, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        egp egpVar = m;
        if (egpVar != null) {
            return egpVar;
        }
        synchronized (dgb.class) {
            eevVar = m;
            if (eevVar == null) {
                eevVar = new eev(a);
                m = eevVar;
            }
        }
        return eevVar;
    }
}
