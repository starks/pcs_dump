package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajc extends efb implements egj {
    public static final ajc a;
    private static volatile egp h;
    public String b = "";
    public efm c = emptyProtobufList();
    public efm d = emptyProtobufList();
    public String e = "";
    public String f = "";
    public efm g = emptyProtobufList();

    static {
        ajc ajcVar = new ajc();
        a = ajcVar;
        efb.registerDefaultInstance(ajc.class, ajcVar);
    }

    private ajc() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0000\u0001\u0007\u0006\u0000\u0003\u0000\u0001Ȉ\u0002\u001b\u0003\u001b\u0004Ȉ\u0006\u001b\u0007Ȉ", new Object[]{"b", "c", ajf.class, "d", aiy.class, "e", "g", aiv.class, "f"});
        }
        if (iOrdinal == 3) {
            return new ajc();
        }
        if (iOrdinal == 4) {
            return new asr((float[]) null, (byte[]) null, (byte[]) null);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        egp egpVar = h;
        if (egpVar != null) {
            return egpVar;
        }
        synchronized (ajc.class) {
            eevVar = h;
            if (eevVar == null) {
                eevVar = new eev(a);
                h = eevVar;
            }
        }
        return eevVar;
    }
}
