package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bdn extends efb implements egj {
    public static final bdn a;
    private static volatile egp h;
    public int b;
    public ajc d;
    public edl f;
    public int g;
    public String c = "";
    public String e = "";

    static {
        bdn bdnVar = new bdn();
        a = bdnVar;
        efb.registerDefaultInstance(bdn.class, bdnVar);
    }

    private bdn() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003Ȉ\u0004ဉ\u0001\u0005\f", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new bdn();
        }
        if (iOrdinal == 4) {
            return new asr((short[]) null, (char[]) null, (char[]) null);
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
        synchronized (bdn.class) {
            eevVar = h;
            if (eevVar == null) {
                eevVar = new eev(a);
                h = eevVar;
            }
        }
        return eevVar;
    }
}
