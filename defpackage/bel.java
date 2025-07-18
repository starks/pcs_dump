package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bel extends efb implements egj {
    public static final bel a;
    private static volatile egp b;

    static {
        bel belVar = new bel();
        a = belVar;
        efb.registerDefaultInstance(bel.class, belVar);
    }

    private bel() {
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
            return new bel();
        }
        if (iOrdinal == 4) {
            return new asr((byte[]) null, (byte[]) null, (byte[]) null, (char[]) null);
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
        synchronized (bel.class) {
            eevVar = b;
            if (eevVar == null) {
                eevVar = new eev(a);
                b = eevVar;
            }
        }
        return eevVar;
    }
}
