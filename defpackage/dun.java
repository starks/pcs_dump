package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dun extends efb implements egj {
    public static final dun a;
    private static volatile egp e;
    public int b;
    public int c;
    public eea d = eea.b;

    static {
        dun dunVar = new dun();
        a = dunVar;
        efb.registerDefaultInstance(dun.class, dunVar);
    }

    private dun() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new dun();
        }
        if (iOrdinal == 4) {
            return new asr((boolean[][]) null, (int[]) null);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        egp egpVar = e;
        if (egpVar != null) {
            return egpVar;
        }
        synchronized (dun.class) {
            eevVar = e;
            if (eevVar == null) {
                eevVar = new eev(a);
                e = eevVar;
            }
        }
        return eevVar;
    }
}
