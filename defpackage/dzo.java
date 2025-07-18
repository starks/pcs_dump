package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dzo extends efb implements egj {
    public static final dzo a;
    private static volatile egp d;
    public String b = "";
    public int c;

    static {
        dzo dzoVar = new dzo();
        a = dzoVar;
        efb.registerDefaultInstance(dzo.class, dzoVar);
    }

    private dzo() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\f", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new dzo();
        }
        if (iOrdinal == 4) {
            return new asr((int[]) null, (byte[]) null, (byte[]) null, (char[]) null);
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
        synchronized (dzo.class) {
            eevVar = d;
            if (eevVar == null) {
                eevVar = new eev(a);
                d = eevVar;
            }
        }
        return eevVar;
    }
}
