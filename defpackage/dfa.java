package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dfa extends efb implements egj {
    public static final dfa a;
    private static volatile egp i;
    public int b;
    public dfb c;
    public dfv d;
    public dfd e;
    public dfw f;
    public dfc g;
    public dfo h;

    static {
        dfa dfaVar = new dfa();
        a = dfaVar;
        efb.registerDefaultInstance(dfa.class, dfaVar);
    }

    private dfa() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u000f\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဉ\u0002\u0007ဉ\u0006\u000bဉ\n\u000eဉ\f\u000fဉ\r", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (iOrdinal == 3) {
            return new dfa();
        }
        if (iOrdinal == 4) {
            return new asr((boolean[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
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
        synchronized (dfa.class) {
            eevVar = i;
            if (eevVar == null) {
                eevVar = new eev(a);
                i = eevVar;
            }
        }
        return eevVar;
    }
}
