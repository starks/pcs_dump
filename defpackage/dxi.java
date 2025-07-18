package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dxi extends efb implements egj {
    public static final dxi a;
    private static volatile egp d;
    public int b;
    public efm c = emptyProtobufList();

    static {
        dxi dxiVar = new dxi();
        a = dxiVar;
        efb.registerDefaultInstance(dxi.class, dxiVar);
    }

    private dxi() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0004\u0002\u001b", new Object[]{"b", "c", dxf.class});
        }
        if (iOrdinal == 3) {
            return new dxi();
        }
        if (iOrdinal == 4) {
            return new asr((int[][][]) null, (byte[]) null, (char[]) null, (byte[]) null);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        egp egpVar = d;
        if (egpVar != null) {
            return egpVar;
        }
        synchronized (dxi.class) {
            eevVar = d;
            if (eevVar == null) {
                eevVar = new eev(a);
                d = eevVar;
            }
        }
        return eevVar;
    }
}
