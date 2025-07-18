package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ejd extends efb implements egj {
    public static final ejd a;
    private static volatile egp f;
    public int b;
    public long c;
    public efm d = emptyProtobufList();
    public eea e = eea.b;

    static {
        ejd ejdVar = new ejd();
        a = ejdVar;
        efb.registerDefaultInstance(ejd.class, ejdVar);
    }

    private ejd() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဂ\u0000\u0002\u001b\u0003ည\u0002", new Object[]{"b", "c", "d", ejc.class, "e"});
        }
        if (iOrdinal == 3) {
            return new ejd();
        }
        if (iOrdinal == 4) {
            return new asr((float[][]) null, (boolean[]) null);
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
        synchronized (ejd.class) {
            eevVar = f;
            if (eevVar == null) {
                eevVar = new eev(a);
                f = eevVar;
            }
        }
        return eevVar;
    }
}
