package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bfj extends efb implements egj {
    public static final bfj a;
    private static volatile egp e;
    public String b = "";
    public efm c = efb.emptyProtobufList();
    public boolean d;

    static {
        bfj bfjVar = new bfj();
        a = bfjVar;
        efb.registerDefaultInstance(bfj.class, bfjVar);
    }

    private bfj() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002Ț\u0003\u0007", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new bfj();
        }
        if (iOrdinal == 4) {
            return new asr((char[][][]) null, (short[]) null);
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
        synchronized (bfj.class) {
            eevVar = e;
            if (eevVar == null) {
                eevVar = new eev(a);
                e = eevVar;
            }
        }
        return eevVar;
    }
}
