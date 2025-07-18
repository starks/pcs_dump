package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dup extends efb implements egj {
    public static final dup a;
    private static volatile egp e;
    public int b;
    public eea c = eea.b;
    public dvi d;

    static {
        dup dupVar = new dup();
        a = dupVar;
        efb.registerDefaultInstance(dup.class, dupVar);
    }

    private dup() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003ဉ\u0000", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new dup();
        }
        if (iOrdinal == 4) {
            return new asr((float[][]) null, (int[]) null);
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
        synchronized (dup.class) {
            eevVar = e;
            if (eevVar == null) {
                eevVar = new eev(a);
                e = eevVar;
            }
        }
        return eevVar;
    }
}
