package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class baw extends efb implements egj {
    public static final baw a;
    private static volatile egp f;
    public int b;
    public String c = "";
    public efm d = emptyProtobufList();
    public bap e;

    static {
        baw bawVar = new baw();
        a = bawVar;
        efb.registerDefaultInstance(baw.class, bawVar);
    }

    private baw() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u001b\u0003ဉ\u0000", new Object[]{"b", "c", "d", bav.class, "e"});
        }
        if (iOrdinal == 3) {
            return new baw();
        }
        if (iOrdinal == 4) {
            return new asr((byte[]) null, (short[]) null, (byte[]) null);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        egp egpVar = f;
        if (egpVar != null) {
            return egpVar;
        }
        synchronized (baw.class) {
            eevVar = f;
            if (eevVar == null) {
                eevVar = new eev(a);
                f = eevVar;
            }
        }
        return eevVar;
    }
}
