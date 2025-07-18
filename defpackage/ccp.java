package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ccp extends efb implements egj {
    public static final ccp a;
    private static volatile egp c;
    public efm b = emptyProtobufList();

    static {
        ccp ccpVar = new ccp();
        a = ccpVar;
        efb.registerDefaultInstance(ccp.class, ccpVar);
    }

    private ccp() {
    }

    public final void a() {
        efm efmVar = this.b;
        if (efmVar.c()) {
            return;
        }
        this.b = efb.mutableCopy(efmVar);
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", cco.class});
        }
        if (iOrdinal == 3) {
            return new ccp();
        }
        if (iOrdinal == 4) {
            return new asr((char[]) null, (int[]) null, (byte[]) null);
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
        synchronized (ccp.class) {
            eevVar = c;
            if (eevVar == null) {
                eevVar = new eev(a);
                c = eevVar;
            }
        }
        return eevVar;
    }
}
