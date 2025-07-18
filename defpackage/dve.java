package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dve extends efb implements egj {
    public static final dve a;
    private static volatile egp e;
    public String b = "";
    public eea c = eea.b;
    public int d;

    static {
        dve dveVar = new dve();
        a = dveVar;
        efb.registerDefaultInstance(dve.class, dveVar);
    }

    private dve() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new dve();
        }
        if (iOrdinal == 4) {
            return new asr((byte[]) null, (char[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
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
        synchronized (dve.class) {
            eevVar = e;
            if (eevVar == null) {
                eevVar = new eev(a);
                e = eevVar;
            }
        }
        return eevVar;
    }
}
