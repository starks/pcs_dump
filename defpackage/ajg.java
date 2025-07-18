package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajg extends efb implements egj {
    public static final ajg a;
    private static volatile egp d;
    public int b;
    public int c;

    static {
        ajg ajgVar = new ajg();
        a = ajgVar;
        efb.registerDefaultInstance(ajg.class, ajgVar);
    }

    private ajg() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new ajg();
        }
        if (iOrdinal == 4) {
            return new asr((short[][]) null, (byte[]) null, (byte[]) null);
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
        synchronized (ajg.class) {
            eevVar = d;
            if (eevVar == null) {
                eevVar = new eev(a);
                d = eevVar;
            }
        }
        return eevVar;
    }
}
