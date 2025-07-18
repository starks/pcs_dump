package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dua extends efb implements egj {
    public static final dua a;
    private static volatile egp d;
    public int b;
    public int c;

    static {
        dua duaVar = new dua();
        a = duaVar;
        efb.registerDefaultInstance(dua.class, duaVar);
    }

    private dua() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new dua();
        }
        if (iOrdinal == 4) {
            return new asr((char[]) null, (byte[]) null, (byte[]) null, (short[]) null);
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
        synchronized (dua.class) {
            eevVar = d;
            if (eevVar == null) {
                eevVar = new eev(a);
                d = eevVar;
            }
        }
        return eevVar;
    }
}
