package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dzk extends efb implements egj {
    public static final dzk a;
    private static volatile egp e;
    public String b = "";
    public edl c;
    public int d;
    private int f;

    static {
        dzk dzkVar = new dzk();
        a = dzkVar;
        efb.registerDefaultInstance(dzk.class, dzkVar);
    }

    private dzk() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003\u0004", new Object[]{"f", "b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new dzk();
        }
        if (iOrdinal == 4) {
            return new asr((byte[]) null, (char[]) null, (byte[]) null, (char[]) null);
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
        synchronized (dzk.class) {
            eevVar = e;
            if (eevVar == null) {
                eevVar = new eev(a);
                e = eevVar;
            }
        }
        return eevVar;
    }
}
