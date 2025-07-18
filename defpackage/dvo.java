package defpackage;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public final class dvo extends efb implements egj {
    public static final dvo a;
    private static volatile egp b;

    static {
        dvo dvoVar = new dvo();
        a = dvoVar;
        efb.registerDefaultInstance(dvo.class, dvoVar);
    }

    private dvo() {
        emptyProtobufList();
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0000", null);
        }
        if (iOrdinal == 3) {
            return new dvo();
        }
        if (iOrdinal == 4) {
            return new asr((char[][]) null, (byte[]) null, (char[]) null, (byte[]) null);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        egp egpVar = b;
        if (egpVar != null) {
            return egpVar;
        }
        synchronized (dvo.class) {
            eevVar = b;
            if (eevVar == null) {
                eevVar = new eev(a);
                b = eevVar;
            }
        }
        return eevVar;
    }
}
