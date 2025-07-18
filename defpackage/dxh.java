package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dxh extends efb implements egj {
    public static final dxh a;
    private static volatile egp f;
    public int c;
    public boolean e;
    public String b = "";
    public efm d = emptyProtobufList();

    static {
        dxh dxhVar = new dxh();
        a = dxhVar;
        efb.registerDefaultInstance(dxh.class, dxhVar);
    }

    private dxh() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002\f\u0003\u001b\u0004\u0007", new Object[]{"b", "c", "d", dxf.class, "e"});
        }
        if (iOrdinal == 3) {
            return new dxh();
        }
        if (iOrdinal == 4) {
            return new asr((short[][][]) null, (byte[]) null, (char[]) null, (byte[]) null);
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
        synchronized (dxh.class) {
            eevVar = f;
            if (eevVar == null) {
                eevVar = new eev(a);
                f = eevVar;
            }
        }
        return eevVar;
    }
}
