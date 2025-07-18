package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dzd extends efb implements egj {
    private static volatile egp R;
    public static final dzd a;
    public boolean A;
    public long B;
    public boolean C;
    public int D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public edb I;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public int b;
    public long c;
    public long d;
    public long e;
    public boolean f;
    public boolean g;
    public long h;
    public boolean i;
    public boolean j;
    public long k;
    public long l;
    public long m;
    public float n;
    public long o;
    public float p;
    public boolean r;
    public boolean s;
    public boolean t;
    public int u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public int z;
    public efi q = emptyIntList();
    public efm J = efb.emptyProtobufList();

    static {
        dzd dzdVar = new dzd();
        a = dzdVar;
        efb.registerDefaultInstance(dzd.class, dzdVar);
    }

    private dzd() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004)\u0000\u0001\u0001e)\u0000\u0002\u0000\u0001\u0002\u0002\u0002\u0003\u0002\u0004\u0007\u0005\u0007\b\u0002\f\u0007\u0012\u0007\u0014\u0002\u0015\u0002\u0019\u0002\u001a\u0001\u001b\u0002\u001c\u0001\u001d''\u0007*\u0007,\u0007-\u0004/\u00070\u00071\u00072\u00073\u00046\u00078\u00029\u0004:\u0007=\u0007D\u0007K\u0007Rဉ\u0000SȚT\u0007X\u0007\\\u0007]\u0007a\u0007b\u0007c\u0007e\u0007", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "D", "E", "C", "G", "H", "I", "J", "F", "K", "L", "M", "N", "O", "P", "Q"});
        }
        if (iOrdinal == 3) {
            return new dzd();
        }
        if (iOrdinal == 4) {
            return new asr((short[][][]) null, (char[]) null, (char[]) null);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        egp egpVar = R;
        if (egpVar != null) {
            return egpVar;
        }
        synchronized (dzd.class) {
            eevVar = R;
            if (eevVar == null) {
                eevVar = new eev(a);
                R = eevVar;
            }
        }
        return eevVar;
    }
}
