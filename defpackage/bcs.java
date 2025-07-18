package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bcs extends efb implements egj {
    public static final bcs a;
    private static volatile egp d;
    public boolean b;
    public boolean c;

    static {
        bcs bcsVar = new bcs();
        a = bcsVar;
        efb.registerDefaultInstance(bcs.class, bcsVar);
    }

    private bcs() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\u0007", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new bcs();
        }
        if (iOrdinal == 4) {
            return new asr((float[][][]) null, (byte[]) null);
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
        synchronized (bcs.class) {
            eevVar = d;
            if (eevVar == null) {
                eevVar = new eev(a);
                d = eevVar;
            }
        }
        return eevVar;
    }
}
