package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bbx extends efb implements egj {
    public static final bbx a;
    private static volatile egp g;
    public int b;
    public String c = "";
    public efm d = emptyProtobufList();
    public String e = "";
    public bbz f;

    static {
        bbx bbxVar = new bbx();
        a = bbxVar;
        efb.registerDefaultInstance(bbx.class, bbxVar);
    }

    private bbx() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0002\u0006\u0004\u0000\u0001\u0000\u0002Ȉ\u0004\u001b\u0005Ȉ\u0006ဉ\u0000", new Object[]{"b", "c", "d", bcj.class, "e", "f"});
        }
        if (iOrdinal == 3) {
            return new bbx();
        }
        if (iOrdinal == 4) {
            return new asr((int[]) null, (char[]) null, (byte[]) null);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        egp egpVar = g;
        if (egpVar != null) {
            return egpVar;
        }
        synchronized (bbx.class) {
            eevVar = g;
            if (eevVar == null) {
                eevVar = new eev(a);
                g = eevVar;
            }
        }
        return eevVar;
    }
}
