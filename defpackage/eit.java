package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eit extends efb implements egj {
    public static final eit a;
    private static volatile egp e;
    public int b;
    public String c = "";
    public efm d = emptyProtobufList();

    static {
        eit eitVar = new eit();
        a = eitVar;
        efb.registerDefaultInstance(eit.class, eitVar);
    }

    private eit() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0004\u0002Ȉ\u0003\u001b", new Object[]{"b", "c", "d", edl.class});
        }
        if (iOrdinal == 3) {
            return new eit();
        }
        if (iOrdinal == 4) {
            return new asr((char[]) null, (float[]) null);
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
        synchronized (eit.class) {
            eevVar = e;
            if (eevVar == null) {
                eevVar = new eev(a);
                e = eevVar;
            }
        }
        return eevVar;
    }
}
