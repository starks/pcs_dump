package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eid extends efb implements egj {
    public static final eid a;
    private static volatile egp c;
    public efm b = efb.emptyProtobufList();

    static {
        eid eidVar = new eid();
        a = eidVar;
        efb.registerDefaultInstance(eid.class, eidVar);
    }

    private eid() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"b"});
        }
        if (iOrdinal == 3) {
            return new eid();
        }
        if (iOrdinal == 4) {
            return new asr((boolean[]) null, (float[]) null);
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
        synchronized (eid.class) {
            eevVar = c;
            if (eevVar == null) {
                eevVar = new eev(a);
                c = eevVar;
            }
        }
        return eevVar;
    }
}
