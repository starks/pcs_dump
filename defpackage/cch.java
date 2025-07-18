package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cch extends efb implements egj {
    public static final cch a;
    private static volatile egp d;
    public String b = "";
    public String c = "";

    static {
        cch cchVar = new cch();
        a = cchVar;
        efb.registerDefaultInstance(cch.class, cchVar);
    }

    private cch() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new cch();
        }
        if (iOrdinal == 4) {
            return new asr((byte[]) null, (byte[]) null, (short[]) null, (byte[]) null);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        egp egpVar = d;
        if (egpVar != null) {
            return egpVar;
        }
        synchronized (cch.class) {
            eevVar = d;
            if (eevVar == null) {
                eevVar = new eev(a);
                d = eevVar;
            }
        }
        return eevVar;
    }
}
