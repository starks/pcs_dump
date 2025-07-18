package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dzq extends efb implements egj {
    public static final dzq a;
    private static volatile egp e;
    public dzp b;
    public String c = "";
    public efm d = emptyProtobufList();
    private int f;

    static {
        dzq dzqVar = new dzq();
        a = dzqVar;
        efb.registerDefaultInstance(dzq.class, dzqVar);
    }

    private dzq() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0001\u0000\u0002ဉ\u0000\u0003Ȉ\u0004\u001b", new Object[]{"f", "b", "c", "d", dzo.class});
        }
        if (iOrdinal == 3) {
            return new dzq();
        }
        if (iOrdinal == 4) {
            return new asr((float[]) null, (byte[]) null, (byte[]) null, (char[]) null);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        egp egpVar = e;
        if (egpVar != null) {
            return egpVar;
        }
        synchronized (dzq.class) {
            eevVar = e;
            if (eevVar == null) {
                eevVar = new eev(a);
                e = eevVar;
            }
        }
        return eevVar;
    }
}
