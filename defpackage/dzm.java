package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dzm extends efb implements egj {
    public static final dzm a;
    private static volatile egp e;
    public String b = "";
    public long c;
    public long d;

    static {
        dzm dzmVar = new dzm();
        a = dzmVar;
        efb.registerDefaultInstance(dzm.class, dzmVar);
    }

    private dzm() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003\u0002", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new dzm();
        }
        if (iOrdinal == 4) {
            return new asr((char[]) null, (char[]) null, (byte[]) null, (char[]) null);
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
        synchronized (dzm.class) {
            eevVar = e;
            if (eevVar == null) {
                eevVar = new eev(a);
                e = eevVar;
            }
        }
        return eevVar;
    }
}
