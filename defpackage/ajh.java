package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajh extends efb implements egj {
    public static final ajh a;
    private static volatile egp d;
    public int b;
    public int c;

    static {
        ajh ajhVar = new ajh();
        a = ajhVar;
        efb.registerDefaultInstance(ajh.class, ajhVar);
    }

    private ajh() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"b", "c", eim.c});
        }
        if (iOrdinal == 3) {
            return new ajh();
        }
        if (iOrdinal == 4) {
            return new asr((int[][]) null, (byte[]) null, (byte[]) null);
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
        synchronized (ajh.class) {
            eevVar = d;
            if (eevVar == null) {
                eevVar = new eev(a);
                d = eevVar;
            }
        }
        return eevVar;
    }
}
