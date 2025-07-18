package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atc extends efb implements egj {
    public static final atc a;
    private static volatile egp d;
    public int b;
    public int c;

    static {
        atc atcVar = new atc();
        a = atcVar;
        efb.registerDefaultInstance(atc.class, atcVar);
    }

    private atc() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"b", "c", aoz.h});
        }
        if (iOrdinal == 3) {
            return new atc();
        }
        if (iOrdinal == 4) {
            return new asr((boolean[]) null, (char[]) null);
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
        synchronized (atc.class) {
            eevVar = d;
            if (eevVar == null) {
                eevVar = new eev(a);
                d = eevVar;
            }
        }
        return eevVar;
    }
}
