package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bes extends efb implements egj {
    public static final bes a;
    private static volatile egp i;
    public String b = "";
    public efm c = emptyProtobufList();
    public int d;
    public boolean e;
    public int f;
    public int g;
    public int h;
    private int j;

    static {
        bes besVar = new bes();
        a = besVar;
        efb.registerDefaultInstance(bes.class, besVar);
    }

    private bes() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ለ\u0000\u0002\u001b\u0003ဌ\u0001\u0004ဇ\u0002\u0005င\u0003\u0006င\u0004\u0007ဌ\u0005", new Object[]{"j", "b", "c", ben.class, "d", "e", "f", "g", "h"});
        }
        if (iOrdinal == 3) {
            return new bes();
        }
        if (iOrdinal == 4) {
            return new asr((int[]) null, (int[]) null);
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
        synchronized (bes.class) {
            eevVar = i;
            if (eevVar == null) {
                eevVar = new eev(a);
                i = eevVar;
            }
        }
        return eevVar;
    }
}
