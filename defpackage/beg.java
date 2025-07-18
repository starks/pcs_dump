package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class beg extends efb implements egj {
    public static final beg a;
    private static volatile egp c;
    public String b = "";

    static {
        beg begVar = new beg();
        a = begVar;
        efb.registerDefaultInstance(beg.class, begVar);
    }

    private beg() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0003\u0003\u0001\u0000\u0000\u0000\u0003Ȉ", new Object[]{"b"});
        }
        if (iOrdinal == 3) {
            return new beg();
        }
        if (iOrdinal == 4) {
            return new asr((short[][][]) null, (byte[]) null, (char[]) null);
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
        synchronized (beg.class) {
            eevVar = c;
            if (eevVar == null) {
                eevVar = new eev(a);
                c = eevVar;
            }
        }
        return eevVar;
    }
}
