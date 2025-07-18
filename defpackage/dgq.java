package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dgq extends efb implements egj {
    public static final dgq a;
    private static volatile egp b;

    static {
        dgq dgqVar = new dgq();
        a = dgqVar;
        efb.registerDefaultInstance(dgq.class, dgqVar);
    }

    private dgq() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0000", null);
        }
        if (iOrdinal == 3) {
            return new dgq();
        }
        if (iOrdinal == 4) {
            return new asr((char[][][]) null, (char[]) null, (byte[]) null);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        egp egpVar = b;
        if (egpVar != null) {
            return egpVar;
        }
        synchronized (dgq.class) {
            eevVar = b;
            if (eevVar == null) {
                eevVar = new eev(a);
                b = eevVar;
            }
        }
        return eevVar;
    }
}
