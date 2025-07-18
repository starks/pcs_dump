package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dfk extends efb implements egj {
    public static final dfk a;
    private static volatile egp g;
    public int b;
    public long c;
    public long d;
    public long e;
    public int f;

    static {
        dfk dfkVar = new dfk();
        a = dfkVar;
        efb.registerDefaultInstance(dfk.class, dfkVar);
    }

    private dfk() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဃ\u0000\u0002ဃ\u0001\u0003ဃ\u0002\u0005᠌\u0004", new Object[]{"b", "c", "d", "e", "f", dfm.a});
        }
        if (iOrdinal == 3) {
            return new dfk();
        }
        if (iOrdinal == 4) {
            return new asr((char[][][]) null, (byte[]) null, (byte[]) null, (byte[]) null);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        egp egpVar = g;
        if (egpVar != null) {
            return egpVar;
        }
        synchronized (dfk.class) {
            eevVar = g;
            if (eevVar == null) {
                eevVar = new eev(a);
                g = eevVar;
            }
        }
        return eevVar;
    }
}
