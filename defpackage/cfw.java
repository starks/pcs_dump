package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cfw extends efb implements egj {
    public static final cfw a;
    private static volatile egp e;
    public int b;
    public efm c = efb.emptyProtobufList();
    public String d = "";

    static {
        cfw cfwVar = new cfw();
        a = cfwVar;
        efb.registerDefaultInstance(cfw.class, cfwVar);
    }

    private cfw() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002ဈ\u0000", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new cfw();
        }
        if (iOrdinal == 4) {
            return new asr((byte[]) null, (int[]) null, (byte[]) null);
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
        synchronized (cfw.class) {
            eevVar = e;
            if (eevVar == null) {
                eevVar = new eev(a);
                e = eevVar;
            }
        }
        return eevVar;
    }
}
