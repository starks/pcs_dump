package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dxs extends efb implements egj {
    public static final dxs a;
    private static volatile egp h;
    public int b;
    public dzq c;
    public edl d;
    public dxo e;
    public dzs f;
    public egd g = egd.a;

    static {
        dxs dxsVar = new dxs();
        a = dxsVar;
        efb.registerDefaultInstance(dxs.class, dxsVar);
    }

    private dxs() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0006\u0005\u0001\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0004ဉ\u0002\u0005ဉ\u0003\u00062", new Object[]{"b", "c", "d", "e", "f", "g", dxr.a});
        }
        if (iOrdinal == 3) {
            return new dxs();
        }
        if (iOrdinal == 4) {
            return new asr((byte[]) null, (char[]) null, (char[]) null, (byte[]) null);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        egp egpVar = h;
        if (egpVar != null) {
            return egpVar;
        }
        synchronized (dxs.class) {
            eevVar = h;
            if (eevVar == null) {
                eevVar = new eev(a);
                h = eevVar;
            }
        }
        return eevVar;
    }
}
