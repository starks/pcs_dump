package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ehz {
    public static final /* synthetic */ int a = 0;

    static {
        asr asrVar = (asr) ehf.a.createBuilder();
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        ((ehf) asrVar.a).b = -62135596800L;
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        ((ehf) asrVar.a).c = 0;
        asr asrVar2 = (asr) ehf.a.createBuilder();
        if (!asrVar2.a.isMutable()) {
            asrVar2.B();
        }
        ((ehf) asrVar2.a).b = 253402300799L;
        if (!asrVar2.a.isMutable()) {
            asrVar2.B();
        }
        ((ehf) asrVar2.a).c = 999999999;
        asr asrVar3 = (asr) ehf.a.createBuilder();
        if (!asrVar3.a.isMutable()) {
            asrVar3.B();
        }
        ((ehf) asrVar3.a).b = 0L;
        if (!asrVar3.a.isMutable()) {
            asrVar3.B();
        }
        ((ehf) asrVar3.a).c = 0;
        new ehy();
        h("now");
        h("getEpochSecond");
        h("getNano");
    }

    public static long a(ehf ehfVar) {
        f(ehfVar);
        return dhi.a(dhi.b(ehfVar.b), ehfVar.c / 1000000);
    }

    public static ehf b(long j) {
        return c(j / 1000, (int) ((j % 1000) * 1000000));
    }

    public static ehf c(long j, int i) {
        if (!g(j)) {
            throw new IllegalArgumentException(clq.u("Timestamp is not valid. Input seconds is too large. Seconds (%s) must be in range [-62,135,596,800, +253,402,300,799]. ", Long.valueOf(j)));
        }
        if (i <= -1000000000 || i >= 1000000000) {
            j = dhi.a(j, i / 1000000000);
            i %= 1000000000;
        }
        long j2 = j;
        if (i < 0) {
            i += 1000000000;
            long j3 = (-1) + j2;
            cnx.R(((j2 ^ j3) >= 0) | ((1 ^ j2) >= 0), "checkedSubtract", j2, 1L);
            j2 = j3;
        }
        asr asrVar = (asr) ehf.a.createBuilder();
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        ((ehf) asrVar.a).b = j2;
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        ((ehf) asrVar.a).c = i;
        ehf ehfVar = (ehf) asrVar.z();
        f(ehfVar);
        return ehfVar;
    }

    public static boolean d(ehf ehfVar) {
        return e(ehfVar.b, ehfVar.c);
    }

    public static boolean e(long j, int i) {
        return g(j) && i >= 0 && i < 1000000000;
    }

    public static void f(ehf ehfVar) {
        long j = ehfVar.b;
        int i = ehfVar.c;
        if (!e(j, i)) {
            throw new IllegalArgumentException(clq.u("Timestamp is not valid. See proto definition for valid values. Seconds (%s) must be in range [-62,135,596,800, +253,402,300,799]. Nanos (%s) must be in range [0, +999,999,999].", Long.valueOf(j), Integer.valueOf(i)));
        }
    }

    private static boolean g(long j) {
        return j >= -62135596800L && j <= 253402300799L;
    }

    private static void h(String str) throws NoSuchMethodException, SecurityException {
        try {
            Class.forName("java.time.Instant").getMethod(str, null);
        } catch (Exception unused) {
        }
    }
}
