package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dtu extends efb implements egj {
    public static final dtu a;
    private static volatile egp e;
    public int b;
    public dtv c;
    public int d;

    static {
        dtu dtuVar = new dtu();
        a = dtuVar;
        efb.registerDefaultInstance(dtu.class, dtuVar);
    }

    private dtu() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new dtu();
        }
        if (iOrdinal == 4) {
            return new asr((char[][][]) null, (byte[]) null, (short[]) null);
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
        synchronized (dtu.class) {
            eevVar = e;
            if (eevVar == null) {
                eevVar = new eev(a);
                e = eevVar;
            }
        }
        return eevVar;
    }
}
