package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dez extends efb implements egj {
    public static final dez a;
    private static volatile egp g;
    public int b;
    public float c;
    public long d;
    public int e;
    public int f;

    static {
        dez dezVar = new dez();
        a = dezVar;
        efb.registerDefaultInstance(dez.class, dezVar);
    }

    private dez() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ခ\u0000\u0002ဂ\u0001\u0003᠌\u0002\u0004᠌\u0003", new Object[]{"b", "c", "d", "e", aoz.t, "f", aoz.s});
        }
        if (iOrdinal == 3) {
            return new dez();
        }
        if (iOrdinal == 4) {
            return new asr((int[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
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
        synchronized (dez.class) {
            eevVar = g;
            if (eevVar == null) {
                eevVar = new eev(a);
                g = eevVar;
            }
        }
        return eevVar;
    }
}
