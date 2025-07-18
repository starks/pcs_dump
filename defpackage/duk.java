package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class duk extends efb implements egj {
    public static final duk a;
    private static volatile egp f;
    public int b;
    public dun c;
    public dui d;
    public int e;

    static {
        duk dukVar = new duk();
        a = dukVar;
        efb.registerDefaultInstance(duk.class, dukVar);
    }

    private duk() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\f", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new duk();
        }
        if (iOrdinal == 4) {
            return new asr((char[][]) null, (int[]) null);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        egp egpVar = f;
        if (egpVar != null) {
            return egpVar;
        }
        synchronized (duk.class) {
            eevVar = f;
            if (eevVar == null) {
                eevVar = new eev(a);
                f = eevVar;
            }
        }
        return eevVar;
    }
}
