package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bcf extends efb implements egj {
    public static final bcf a;
    private static volatile egp h;
    public eea b = eea.b;
    public eea c;
    public eea d;
    public bcr e;
    public efm f;
    public int g;
    private int i;

    static {
        bcf bcfVar = new bcf();
        a = bcfVar;
        efb.registerDefaultInstance(bcf.class, bcfVar);
    }

    private bcf() {
        eea eeaVar = eea.b;
        this.c = eeaVar;
        this.d = eeaVar;
        this.f = emptyProtobufList();
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u000e\u0006\u0000\u0001\u0000\u0001\n\u0002\n\u0006\n\fဉ\u0000\r\u001b\u000e\f", new Object[]{"i", "b", "c", "d", "e", "f", bcq.class, "g"});
        }
        if (iOrdinal == 3) {
            return new bcf();
        }
        if (iOrdinal == 4) {
            return new asr((short[][]) null, (byte[]) null);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        egp egpVar = h;
        if (egpVar != null) {
            return egpVar;
        }
        synchronized (bcf.class) {
            eevVar = h;
            if (eevVar == null) {
                eevVar = new eev(a);
                h = eevVar;
            }
        }
        return eevVar;
    }
}
