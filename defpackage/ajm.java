package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajm extends efb implements egj {
    public static final ajm a;
    private static volatile egp e;
    public int b;
    public int c;
    public String d = "";

    static {
        ajm ajmVar = new ajm();
        a = ajmVar;
        efb.registerDefaultInstance(ajm.class, ajmVar);
    }

    private ajm() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"b", "c", aoz.b, "d"});
        }
        if (iOrdinal == 3) {
            return new ajm();
        }
        if (iOrdinal == 4) {
            return new asr((char[][][]) null, (byte[]) null, (byte[]) null);
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
        synchronized (ajm.class) {
            eevVar = e;
            if (eevVar == null) {
                eevVar = new eev(a);
                e = eevVar;
            }
        }
        return eevVar;
    }
}
