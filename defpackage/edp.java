package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class edp extends efb implements egj {
    public static final edp a;
    private static volatile egp c;
    public boolean b;

    static {
        edp edpVar = new edp();
        a = edpVar;
        efb.registerDefaultInstance(edp.class, edpVar);
    }

    private edp() {
    }

    public static edp a(boolean z) {
        asr asrVar = (asr) a.createBuilder();
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        ((edp) asrVar.a).b = z;
        return (edp) asrVar.z();
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"b"});
        }
        if (iOrdinal == 3) {
            return new edp();
        }
        if (iOrdinal == 4) {
            return new asr((char[]) null, (byte[]) null, (byte[]) null, (int[]) null);
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
        synchronized (edp.class) {
            eevVar = c;
            if (eevVar == null) {
                eevVar = new eev(a);
                c = eevVar;
            }
        }
        return eevVar;
    }
}
