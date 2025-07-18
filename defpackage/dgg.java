package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dgg extends efb implements egj {
    public static final dgg a;
    private static volatile egp b;

    static {
        dgg dggVar = new dgg();
        a = dggVar;
        efb.registerDefaultInstance(dgg.class, dggVar);
    }

    private dgg() {
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
            return new dgg();
        }
        if (iOrdinal == 4) {
            return new asr((byte[][]) null, (char[]) null, (byte[]) null);
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
        synchronized (dgg.class) {
            eevVar = b;
            if (eevVar == null) {
                eevVar = new eev(a);
                b = eevVar;
            }
        }
        return eevVar;
    }
}
