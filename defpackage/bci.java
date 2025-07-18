package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bci extends efb implements egj {
    public static final bci a;
    private static volatile egp d;
    public eea b = eea.b;
    public int c;

    static {
        bci bciVar = new bci();
        a = bciVar;
        efb.registerDefaultInstance(bci.class, bciVar);
    }

    private bci() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003\f", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new bci();
        }
        if (iOrdinal == 4) {
            return new asr((boolean[][]) null, (byte[]) null);
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
        synchronized (bci.class) {
            eevVar = d;
            if (eevVar == null) {
                eevVar = new eev(a);
                d = eevVar;
            }
        }
        return eevVar;
    }
}
