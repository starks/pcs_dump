package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aiw extends efb implements egj {
    public static final aiw a;
    private static volatile egp c;
    public efm b;

    static {
        aiw aiwVar = new aiw();
        a = aiwVar;
        efb.registerDefaultInstance(aiw.class, aiwVar);
    }

    private aiw() {
        emptyProtobufList();
        emptyProtobufList();
        this.b = emptyProtobufList();
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0003\u0003\u0001\u0000\u0001\u0000\u0003\u001b", new Object[]{"b", ajc.class});
        }
        if (iOrdinal == 3) {
            return new aiw();
        }
        if (iOrdinal == 4) {
            return new asr((char[]) null, (char[]) null, (byte[]) null);
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
        synchronized (aiw.class) {
            eevVar = c;
            if (eevVar == null) {
                eevVar = new eev(a);
                c = eevVar;
            }
        }
        return eevVar;
    }
}
