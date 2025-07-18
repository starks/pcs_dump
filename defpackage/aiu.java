package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aiu extends efb implements egj {
    public static final aiu a;
    private static volatile egp e;
    public Object c;
    public int b = 0;
    public String d = "";

    static {
        aiu aiuVar = new aiu();
        a = aiuVar;
        efb.registerDefaultInstance(aiu.class, aiuVar);
    }

    private aiu() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȼ\u0000\u00037\u0000\u0004:\u0000", new Object[]{"c", "b", "d"});
        }
        if (iOrdinal == 3) {
            return new aiu();
        }
        if (iOrdinal == 4) {
            return new asr((byte[]) null, (char[]) null, (byte[]) null);
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
        synchronized (aiu.class) {
            eevVar = e;
            if (eevVar == null) {
                eevVar = new eev(a);
                e = eevVar;
            }
        }
        return eevVar;
    }
}
