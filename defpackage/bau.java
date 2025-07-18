package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bau extends efb implements egj {
    public static final bau a;
    private static volatile egp d;
    public eea b = eea.b;
    public int c;

    static {
        bau bauVar = new bau();
        a = bauVar;
        efb.registerDefaultInstance(bau.class, bauVar);
    }

    private bau() {
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
            return new bau();
        }
        if (iOrdinal == 4) {
            return new asr((byte[]) null, (char[]) null);
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
        synchronized (bau.class) {
            eevVar = d;
            if (eevVar == null) {
                eevVar = new eev(a);
                d = eevVar;
            }
        }
        return eevVar;
    }
}
