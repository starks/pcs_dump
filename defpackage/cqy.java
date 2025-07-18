package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cqy extends efb implements egj {
    public static final cqy a;
    private static volatile egp c;
    public efm b = emptyProtobufList();

    static {
        cqy cqyVar = new cqy();
        a = cqyVar;
        efb.registerDefaultInstance(cqy.class, cqyVar);
    }

    private cqy() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", cqx.class});
        }
        if (iOrdinal == 3) {
            return new cqy();
        }
        if (iOrdinal == 4) {
            return new asr((char[]) null, (byte[]) null, (byte[]) null, (char[]) null, (byte[]) null);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        egp egpVar = c;
        if (egpVar != null) {
            return egpVar;
        }
        synchronized (cqy.class) {
            eevVar = c;
            if (eevVar == null) {
                eevVar = new eev(a);
                c = eevVar;
            }
        }
        return eevVar;
    }
}
