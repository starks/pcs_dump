package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dvf extends efb implements egj {
    public static final dvf a;
    private static volatile egp g;
    public int b;
    public dvc c;
    public int d;
    public int e;
    public int f;

    static {
        dvf dvfVar = new dvf();
        a = dvfVar;
        efb.registerDefaultInstance(dvf.class, dvfVar);
    }

    private dvf() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new dvf();
        }
        if (iOrdinal == 4) {
            return new asr((short[]) null, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        egp egpVar = g;
        if (egpVar != null) {
            return egpVar;
        }
        synchronized (dvf.class) {
            eevVar = g;
            if (eevVar == null) {
                eevVar = new eev(a);
                g = eevVar;
            }
        }
        return eevVar;
    }
}
