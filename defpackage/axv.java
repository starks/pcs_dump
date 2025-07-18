package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class axv extends efb implements egj {
    public static final axv a;
    private static volatile egp e;
    public axo b;
    public String c = "";
    public ayc d;
    private int f;

    static {
        axv axvVar = new axv();
        a = axvVar;
        efb.registerDefaultInstance(axv.class, axvVar);
    }

    private axv() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001ϩ\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001ϩȈ", new Object[]{"f", "b", "d", "c"});
        }
        if (iOrdinal == 3) {
            return new axv();
        }
        if (iOrdinal == 4) {
            return new asr((float[]) null);
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
        synchronized (axv.class) {
            eevVar = e;
            if (eevVar == null) {
                eevVar = new eev(a);
                e = eevVar;
            }
        }
        return eevVar;
    }
}
