package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eja extends eex implements egj {
    public static final eja b;
    private static volatile egp g;
    public int c;
    public eir d;
    public int e;
    public dxn f;
    private byte h = 2;

    static {
        eja ejaVar = new eja();
        b = ejaVar;
        efb.registerDefaultInstance(eja.class, ejaVar);
    }

    private eja() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        switch (efaVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.h);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(b, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003ဉ\u0002", new Object[]{"c", "d", "e", eim.e, "f"});
            case NEW_MUTABLE_INSTANCE:
                return new eja();
            case NEW_BUILDER:
                return new eiw(null);
            case GET_DEFAULT_INSTANCE:
                return b;
            case GET_PARSER:
                egp egpVar = g;
                if (egpVar != null) {
                    return egpVar;
                }
                synchronized (eja.class) {
                    eevVar = g;
                    if (eevVar == null) {
                        eevVar = new eev(b);
                        g = eevVar;
                    }
                }
                return eevVar;
            default:
                throw null;
        }
    }
}
