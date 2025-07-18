package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eix extends eex implements egj {
    public static final eix b;
    private static volatile egp l;
    public int c;
    public long d;
    public long e;
    public int f;
    public eea g;
    public long h;
    public boolean i;
    public double j;
    public eja k;
    private eiv m;
    private byte n = 2;

    static {
        eix eixVar = new eix();
        b = eixVar;
        efb.registerDefaultInstance(eix.class, eixVar);
    }

    private eix() {
        emptyProtobufList();
        eea eeaVar = eea.b;
        this.g = eea.b;
        this.h = 180000L;
        emptyIntList();
        emptyIntList();
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        switch (efaVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.n);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.n = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(b, "\u0001\b\u0000\u0001\u0001!\b\u0000\u0000\u0001\u0001ဂ\u0000\u0006ည\u000b\u000bင\u0005\u000fတ\u0011\u0011ဂ\u0001\u0019ဇ\u0017 က\u001a!ᐉ\u001c", new Object[]{"c", "d", "g", "f", "h", "e", "i", "j", "k"});
            case NEW_MUTABLE_INSTANCE:
                return new eix();
            case NEW_BUILDER:
                return new eiw();
            case GET_DEFAULT_INSTANCE:
                return b;
            case GET_PARSER:
                egp egpVar = l;
                if (egpVar != null) {
                    return egpVar;
                }
                synchronized (eix.class) {
                    eevVar = l;
                    if (eevVar == null) {
                        eevVar = new eev(b);
                        l = eevVar;
                    }
                }
                return eevVar;
            default:
                throw null;
        }
    }
}
