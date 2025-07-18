package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dub extends efb implements egj {
    public static final dub a;
    private static volatile egp d;
    public int b;
    public eea c = eea.b;

    static {
        dub dubVar = new dub();
        a = dubVar;
        efb.registerDefaultInstance(dub.class, dubVar);
    }

    private dub() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new dub();
        }
        if (iOrdinal == 4) {
            return new asr((byte[]) null, (boolean[]) null);
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
        synchronized (dub.class) {
            eevVar = d;
            if (eevVar == null) {
                eevVar = new eev(a);
                d = eevVar;
            }
        }
        return eevVar;
    }
}
