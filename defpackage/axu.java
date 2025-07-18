package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class axu extends efb implements egj {
    public static final axu a;
    private static volatile egp i;
    public int b;
    public eea c = eea.b;
    public eea d;
    public eea e;
    public ayi f;
    public efm g;
    public int h;

    static {
        axu axuVar = new axu();
        a = axuVar;
        efb.registerDefaultInstance(axu.class, axuVar);
    }

    private axu() {
        eea eeaVar = eea.b;
        this.d = eeaVar;
        this.e = eeaVar;
        this.g = emptyProtobufList();
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u000e\u0006\u0000\u0001\u0000\u0001\n\u0002\n\u0006\n\fဉ\u0000\r\u001b\u000e\f", new Object[]{"b", "c", "d", "e", "f", "g", ayh.class, "h"});
        }
        if (iOrdinal == 3) {
            return new axu();
        }
        if (iOrdinal == 4) {
            return new asr((boolean[]) null);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        egp egpVar = i;
        if (egpVar != null) {
            return egpVar;
        }
        synchronized (axu.class) {
            eevVar = i;
            if (eevVar == null) {
                eevVar = new eev(a);
                i = eevVar;
            }
        }
        return eevVar;
    }
}
