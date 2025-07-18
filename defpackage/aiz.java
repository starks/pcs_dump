package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aiz extends efb implements egj {
    public static final aiz a;
    private static volatile egp d;
    public int b;
    public String c = "";

    static {
        aiz aizVar = new aiz();
        a = aizVar;
        efb.registerDefaultInstance(aiz.class, aizVar);
    }

    private aiz() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new aiz();
        }
        if (iOrdinal == 4) {
            return new asr((int[]) null, (byte[]) null, (byte[]) null);
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
        synchronized (aiz.class) {
            eevVar = d;
            if (eevVar == null) {
                eevVar = new eev(a);
                d = eevVar;
            }
        }
        return eevVar;
    }
}
