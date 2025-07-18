package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dvl extends efb implements egj {
    public static final dvl a;
    private static volatile egp e;
    public int b;
    public int c;
    public dvm d;

    static {
        dvl dvlVar = new dvl();
        a = dvlVar;
        efb.registerDefaultInstance(dvl.class, dvlVar);
    }

    private dvl() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new dvl();
        }
        if (iOrdinal == 4) {
            return new asr((float[]) null, (byte[]) null, (char[]) null, (byte[]) null);
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
        synchronized (dvl.class) {
            eevVar = e;
            if (eevVar == null) {
                eevVar = new eev(a);
                e = eevVar;
            }
        }
        return eevVar;
    }
}
