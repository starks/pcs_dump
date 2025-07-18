package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dha extends efb implements egj {
    public static final dha a;
    private static volatile egp b;

    static {
        dha dhaVar = new dha();
        a = dhaVar;
        efb.registerDefaultInstance(dha.class, dhaVar);
    }

    private dha() {
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
            return new dha();
        }
        if (iOrdinal == 4) {
            return new asr((char[]) null, (char[]) null, (short[]) null);
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
        synchronized (dha.class) {
            eevVar = b;
            if (eevVar == null) {
                eevVar = new eev(a);
                b = eevVar;
            }
        }
        return eevVar;
    }
}
