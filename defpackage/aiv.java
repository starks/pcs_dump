package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aiv extends efb implements egj {
    public static final aiv a;
    private static volatile egp d;
    public String b = "";
    public efm c = emptyProtobufList();

    static {
        aiv aivVar = new aiv();
        a = aivVar;
        efb.registerDefaultInstance(aiv.class, aivVar);
    }

    private aiv() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"b", "c", aiu.class});
        }
        if (iOrdinal == 3) {
            return new aiv();
        }
        if (iOrdinal == 4) {
            return new asr((short[]) null, (byte[]) null, (byte[]) null);
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
        synchronized (aiv.class) {
            eevVar = d;
            if (eevVar == null) {
                eevVar = new eev(a);
                d = eevVar;
            }
        }
        return eevVar;
    }
}
