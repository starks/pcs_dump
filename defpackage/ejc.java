package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ejc extends efb implements egj {
    public static final ejc a;
    private static volatile egp e;
    public Object c;
    public int b = 0;
    public efm d = emptyProtobufList();

    static {
        ejc ejcVar = new ejc();
        a = ejcVar;
        efb.registerDefaultInstance(ejc.class, ejcVar);
    }

    private ejc() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0001\u0000\u0001\u0004\u0003\u0000\u0001\u0000\u00018\u0000\u0003\u001b\u00045\u0000", new Object[]{"c", "b", "d", ejb.class});
        }
        if (iOrdinal == 3) {
            return new ejc();
        }
        if (iOrdinal == 4) {
            return new asr((boolean[][]) null, (boolean[]) null);
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
        synchronized (ejc.class) {
            eevVar = e;
            if (eevVar == null) {
                eevVar = new eev(a);
                e = eevVar;
            }
        }
        return eevVar;
    }
}
