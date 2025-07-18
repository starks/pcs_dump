package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ehf extends efb implements egj {
    public static final ehf a;
    private static volatile egp d;
    public long b;
    public int c;

    static {
        ehf ehfVar = new ehf();
        a = ehfVar;
        efb.registerDefaultInstance(ehf.class, ehfVar);
    }

    private ehf() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new ehf();
        }
        if (iOrdinal == 4) {
            return new asr((char[]) null, (byte[]) null, (boolean[]) null);
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
        synchronized (ehf.class) {
            eevVar = d;
            if (eevVar == null) {
                eevVar = new eev(a);
                d = eevVar;
            }
        }
        return eevVar;
    }
}
