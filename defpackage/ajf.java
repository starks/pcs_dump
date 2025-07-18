package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajf extends efb implements egj {
    public static final ajf a;
    private static volatile egp g;
    public long c;
    public String b = "";
    public efm d = emptyProtobufList();
    public efm e = emptyProtobufList();
    public efm f = emptyProtobufList();

    static {
        ajf ajfVar = new ajf();
        a = ajfVar;
        efb.registerDefaultInstance(ajf.class, ajfVar);
    }

    private ajf() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0003\u0000\u0001Ȉ\u0002\u0002\u0003\u001b\u0004\u001b\u0005\u001b", new Object[]{"b", "c", "d", aje.class, "e", ajb.class, "f", aiv.class});
        }
        if (iOrdinal == 3) {
            return new ajf();
        }
        if (iOrdinal == 4) {
            return new asr((char[][]) null, (byte[]) null, (byte[]) null);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        egp egpVar = g;
        if (egpVar != null) {
            return egpVar;
        }
        synchronized (ajf.class) {
            eevVar = g;
            if (eevVar == null) {
                eevVar = new eev(a);
                g = eevVar;
            }
        }
        return eevVar;
    }
}
