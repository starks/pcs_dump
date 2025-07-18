package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akl extends efb implements egj {
    public static final akl a;
    private static volatile egp f;
    public long b;
    public efm c = emptyProtobufList();
    public eek d;
    public float e;
    private int g;

    static {
        akl aklVar = new akl();
        a = aklVar;
        efb.registerDefaultInstance(akl.class, aklVar);
    }

    private akl() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဃ\u0000\u0002\u001b\u0003ဉ\u0001\u0004ခ\u0002", new Object[]{"g", "b", "c", akk.class, "d", "e"});
        }
        if (iOrdinal == 3) {
            return new akl();
        }
        if (iOrdinal == 4) {
            return new asr((boolean[][][]) null, (byte[]) null, (byte[]) null);
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
        synchronized (akl.class) {
            eevVar = f;
            if (eevVar == null) {
                eevVar = new eev(a);
                f = eevVar;
            }
        }
        return eevVar;
    }
}
