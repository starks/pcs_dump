package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eia extends efb implements egj {
    public static final eia a;
    private static volatile egp e;
    public int b;
    public String c = "";
    public String d = "";

    static {
        eia eiaVar = new eia();
        a = eiaVar;
        efb.registerDefaultInstance(eia.class, eiaVar);
    }

    private eia() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new eia();
        }
        if (iOrdinal == 4) {
            return new asr((short[]) null, (float[]) null);
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
        synchronized (eia.class) {
            eevVar = e;
            if (eevVar == null) {
                eevVar = new eev(a);
                e = eevVar;
            }
        }
        return eevVar;
    }
}
