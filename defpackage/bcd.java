package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bcd extends efb implements egj {
    public static final bcd a;
    private static volatile egp h;
    public int b;
    public bcm c;
    public bci d;
    public eea e = eea.b;
    public bcs f;
    public int g;

    static {
        bcd bcdVar = new bcd();
        a = bcdVar;
        efb.registerDefaultInstance(bcd.class, bcdVar);
    }

    private bcd() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\b\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဉ\u0001\u0004\n\u0007ဉ\u0002\b\f", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new bcd();
        }
        if (iOrdinal == 4) {
            return new asr((char[][]) null, (byte[]) null);
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
        synchronized (bcd.class) {
            eevVar = h;
            if (eevVar == null) {
                eevVar = new eev(a);
                h = eevVar;
            }
        }
        return eevVar;
    }
}
