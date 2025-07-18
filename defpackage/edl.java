package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class edl extends efb implements egj {
    public static final edl a;
    private static volatile egp d;
    public String b = "";
    public eea c = eea.b;

    static {
        edl edlVar = new edl();
        a = edlVar;
        efb.registerDefaultInstance(edl.class, edlVar);
    }

    private edl() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\n", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new edl();
        }
        if (iOrdinal == 4) {
            return new asr((byte[]) null, (byte[]) null, (char[]) null, (char[]) null);
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
        synchronized (edl.class) {
            eevVar = d;
            if (eevVar == null) {
                eevVar = new eev(a);
                d = eevVar;
            }
        }
        return eevVar;
    }
}
