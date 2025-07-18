package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eel extends efb implements egj {
    public static final eel a;
    private static volatile egp b;

    static {
        eel eelVar = new eel();
        a = eelVar;
        efb.registerDefaultInstance(eel.class, eelVar);
    }

    private eel() {
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
            return new eel();
        }
        if (iOrdinal == 4) {
            return new asr((byte[]) null, (byte[]) null, (boolean[]) null);
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
        synchronized (eel.class) {
            eevVar = b;
            if (eevVar == null) {
                eevVar = new eev(a);
                b = eevVar;
            }
        }
        return eevVar;
    }
}
