package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fww extends efb implements egj {
    public static final fww a;
    private static volatile egp c;
    public efm b = emptyProtobufList();

    static {
        fww fwwVar = new fww();
        a = fwwVar;
        efb.registerDefaultInstance(fww.class, fwwVar);
    }

    private fww() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001c", new Object[]{"b"});
        }
        if (iOrdinal == 3) {
            return new fww();
        }
        if (iOrdinal == 4) {
            return new asr((byte[]) null, (float[]) null);
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
        synchronized (fww.class) {
            eevVar = c;
            if (eevVar == null) {
                eevVar = new eev(a);
                c = eevVar;
            }
        }
        return eevVar;
    }
}
