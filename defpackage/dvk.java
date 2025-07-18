package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dvk extends efb implements egj {
    public static final dvk a;
    private static volatile egp c;
    public String b = "";

    static {
        dvk dvkVar = new dvk();
        a = dvkVar;
        efb.registerDefaultInstance(dvk.class, dvkVar);
    }

    private dvk() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"b"});
        }
        if (iOrdinal == 3) {
            return new dvk();
        }
        if (iOrdinal == 4) {
            return new asr((boolean[]) null, (byte[]) null, (char[]) null, (byte[]) null);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        egp egpVar = c;
        if (egpVar != null) {
            return egpVar;
        }
        synchronized (dvk.class) {
            eevVar = c;
            if (eevVar == null) {
                eevVar = new eev(a);
                c = eevVar;
            }
        }
        return eevVar;
    }
}
