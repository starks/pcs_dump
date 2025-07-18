package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class asi extends efb implements egj {
    public static final asi a;
    private static volatile egp d;
    public String b = "";
    public efm c = emptyProtobufList();
    private int e;

    static {
        asi asiVar = new asi();
        a = asiVar;
        efb.registerDefaultInstance(asi.class, asiVar);
    }

    private asi() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"e", "b", "c", ask.class});
        }
        if (iOrdinal == 3) {
            return new asi();
        }
        if (iOrdinal == 4) {
            return new asr((byte[]) null, (short[]) null);
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
        synchronized (asi.class) {
            eevVar = d;
            if (eevVar == null) {
                eevVar = new eev(a);
                d = eevVar;
            }
        }
        return eevVar;
    }
}
