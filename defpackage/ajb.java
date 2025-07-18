package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajb extends efb implements egj {
    public static final ajb a;
    private static volatile egp f;
    public String b = "";
    public efm c = emptyProtobufList();
    public efm d = emptyProtobufList();
    public efm e = emptyProtobufList();

    static {
        ajb ajbVar = new ajb();
        a = ajbVar;
        efb.registerDefaultInstance(ajb.class, ajbVar);
    }

    private ajb() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0000\u0001\u0005\u0004\u0000\u0003\u0000\u0001Ȉ\u0002\u001b\u0004\u001b\u0005\u001b", new Object[]{"b", "c", aiz.class, "d", ajb.class, "e", aiv.class});
        }
        if (iOrdinal == 3) {
            return new ajb();
        }
        if (iOrdinal == 4) {
            return new asr((boolean[]) null, (byte[]) null, (byte[]) null);
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
        synchronized (ajb.class) {
            eevVar = f;
            if (eevVar == null) {
                eevVar = new eev(a);
                f = eevVar;
            }
        }
        return eevVar;
    }
}
