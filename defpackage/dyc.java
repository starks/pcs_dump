package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dyc extends efb implements egj {
    public static final dyc a;
    private static volatile egp b;

    static {
        dyc dycVar = new dyc();
        a = dycVar;
        efb.registerDefaultInstance(dyc.class, dycVar);
    }

    private dyc() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0000", null);
        }
        if (iOrdinal == 3) {
            return new dyc();
        }
        if (iOrdinal == 4) {
            return new asr((char[]) null, (byte[]) null, (char[]) null, (char[]) null);
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
        synchronized (dyc.class) {
            eevVar = b;
            if (eevVar == null) {
                eevVar = new eev(a);
                b = eevVar;
            }
        }
        return eevVar;
    }
}
