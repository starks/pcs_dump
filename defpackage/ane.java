package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ane extends efb implements egj {
    public static final ane a;
    private static volatile egp h;
    public int b;
    public efm c = emptyProtobufList();
    public String d = "";
    public eea e = eea.b;
    public eea f = eea.b;
    public boolean g;

    static {
        ane aneVar = new ane();
        a = aneVar;
        efb.registerDefaultInstance(ane.class, aneVar);
    }

    private ane() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001c\u0002ဈ\u0000\u0003ည\u0001\u0004ည\u0002\u0005ဇ\u0003", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new ane();
        }
        if (iOrdinal == 4) {
            return new asr((float[][][]) null, (byte[]) null, (byte[]) null);
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
        synchronized (ane.class) {
            eevVar = h;
            if (eevVar == null) {
                eevVar = new eev(a);
                h = eevVar;
            }
        }
        return eevVar;
    }
}
