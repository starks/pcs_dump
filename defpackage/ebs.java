package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ebs extends efb implements egj {
    public static final ebs a;
    private static volatile egp e;
    public edl b;
    public String c = "";
    public edl d;
    private int f;

    static {
        ebs ebsVar = new ebs();
        a = ebsVar;
        efb.registerDefaultInstance(ebs.class, ebsVar);
    }

    private ebs() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ\u0003ဉ\u0001", new Object[]{"f", "b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new ebs();
        }
        if (iOrdinal == 4) {
            return new asr((char[][][]) null, (byte[]) null, (byte[]) null, (char[]) null);
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
        synchronized (ebs.class) {
            eevVar = e;
            if (eevVar == null) {
                eevVar = new eev(a);
                e = eevVar;
            }
        }
        return eevVar;
    }
}
