package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cci extends efb implements egj {
    public static final cci a;
    private static volatile egp i;
    public int b;
    public ccm f;
    public String c = "";
    public String d = "";
    public String e = "";
    public String g = "";
    public efm h = emptyProtobufList();

    static {
        cci cciVar = new cci();
        a = cciVar;
        efb.registerDefaultInstance(cci.class, cciVar);
    }

    private cci() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0004Ȉ\u0005ဉ\u0000\u0006Ȉ\u0007\u001b", new Object[]{"b", "c", "d", "e", "f", "g", "h", cch.class});
        }
        if (iOrdinal == 3) {
            return new cci();
        }
        if (iOrdinal == 4) {
            return new asr((char[]) null, (byte[]) null, (short[]) null, (byte[]) null);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        egp egpVar = i;
        if (egpVar != null) {
            return egpVar;
        }
        synchronized (cci.class) {
            eevVar = i;
            if (eevVar == null) {
                eevVar = new eev(a);
                i = eevVar;
            }
        }
        return eevVar;
    }
}
