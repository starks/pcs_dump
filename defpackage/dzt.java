package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dzt extends efb implements egj {
    public static final dzt a;
    private static volatile egp f;
    public String b = "";
    public efm c = emptyProtobufList();
    public String d = "";
    public String e = "";

    static {
        dzt dztVar = new dzt();
        a = dztVar;
        efb.registerDefaultInstance(dzt.class, dztVar);
    }

    private dzt() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002\u001b\u0003Ȉ\u0004Ȉ", new Object[]{"b", "c", dzo.class, "d", "e"});
        }
        if (iOrdinal == 3) {
            return new dzt();
        }
        if (iOrdinal == 4) {
            return new asr((char[][]) null, (byte[]) null, (byte[]) null, (char[]) null);
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
        synchronized (dzt.class) {
            eevVar = f;
            if (eevVar == null) {
                eevVar = new eev(a);
                f = eevVar;
            }
        }
        return eevVar;
    }
}
