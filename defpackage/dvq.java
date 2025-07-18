package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dvq extends efb implements egj {
    public static final dvq a;
    private static volatile egp e;
    public int b;
    public int c;
    public dvr d;

    static {
        dvq dvqVar = new dvq();
        a = dvqVar;
        efb.registerDefaultInstance(dvq.class, dvqVar);
    }

    private dvq() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003ဉ\u0000", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new dvq();
        }
        if (iOrdinal == 4) {
            return new asr((int[][]) null, (byte[]) null, (char[]) null, (byte[]) null);
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
        synchronized (dvq.class) {
            eevVar = e;
            if (eevVar == null) {
                eevVar = new eev(a);
                e = eevVar;
            }
        }
        return eevVar;
    }
}
