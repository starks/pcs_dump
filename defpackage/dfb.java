package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dfb extends efb implements egj {
    public static final dfb a;
    private static volatile egp d;
    public int b;
    public String c = "";
    private boolean e;

    static {
        dfb dfbVar = new dfb();
        a = dfbVar;
        efb.registerDefaultInstance(dfb.class, dfbVar);
    }

    private dfb() {
    }

    public static /* synthetic */ void a(dfb dfbVar) {
        dfbVar.b |= 2;
        dfbVar.e = true;
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001", new Object[]{"b", "c", "e"});
        }
        if (iOrdinal == 3) {
            return new dfb();
        }
        if (iOrdinal == 4) {
            return new asr((float[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
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
        synchronized (dfb.class) {
            eevVar = d;
            if (eevVar == null) {
                eevVar = new eev(a);
                d = eevVar;
            }
        }
        return eevVar;
    }
}
