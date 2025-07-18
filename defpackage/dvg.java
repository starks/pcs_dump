package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dvg extends efb implements egj {
    public static final dvg a;
    private static volatile egp d;
    public int b;
    public efm c = emptyProtobufList();

    static {
        dvg dvgVar = new dvg();
        a = dvgVar;
        efb.registerDefaultInstance(dvg.class, dvgVar);
    }

    private dvg() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"b", "c", dvf.class});
        }
        if (iOrdinal == 3) {
            return new dvg();
        }
        if (iOrdinal == 4) {
            return new asr((short[]) null, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
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
        synchronized (dvg.class) {
            eevVar = d;
            if (eevVar == null) {
                eevVar = new eev(a);
                d = eevVar;
            }
        }
        return eevVar;
    }
}
