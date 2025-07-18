package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class axo extends efb implements egj {
    public static final axo a;
    private static volatile egp g;
    public int b;
    public int c;
    public int d;
    public axl e;
    public int f;
    private int h;

    static {
        axo axoVar = new axo();
        a = axoVar;
        efb.registerDefaultInstance(axo.class, axoVar);
    }

    private axo() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001ϩϭ\u0005\u0000\u0000\u0000ϩ\fϪ\fϫ\fϬဉ\u0000ϭ\f", new Object[]{"h", "b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new axo();
        }
        if (iOrdinal == 4) {
            return new asr((byte[]) null, (byte[]) null, (char[]) null);
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
        synchronized (axo.class) {
            eevVar = g;
            if (eevVar == null) {
                eevVar = new eev(a);
                g = eevVar;
            }
        }
        return eevVar;
    }
}
