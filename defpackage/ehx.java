package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ehx {
    static {
        asr asrVar = (asr) eek.a.createBuilder();
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        ((eek) asrVar.a).b = -315576000000L;
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        ((eek) asrVar.a).c = -999999999;
        asr asrVar2 = (asr) eek.a.createBuilder();
        if (!asrVar2.a.isMutable()) {
            asrVar2.B();
        }
        ((eek) asrVar2.a).b = 315576000000L;
        if (!asrVar2.a.isMutable()) {
            asrVar2.B();
        }
        ((eek) asrVar2.a).c = 999999999;
        asr asrVar3 = (asr) eek.a.createBuilder();
        if (!asrVar3.a.isMutable()) {
            asrVar3.B();
        }
        ((eek) asrVar3.a).b = 0L;
        if (!asrVar3.a.isMutable()) {
            asrVar3.B();
        }
        ((eek) asrVar3.a).c = 0;
    }

    public static long a(eek eekVar) {
        d(eekVar);
        return dhi.a(dhi.b(eekVar.b), eekVar.c / 1000000);
    }

    public static eek b(long j) {
        return c(j / 1000, (int) ((j % 1000) * 1000000));
    }

    public static eek c(long j, int i) {
        if (i <= -1000000000 || i >= 1000000000) {
            j = dhi.a(j, i / 1000000000);
            i %= 1000000000;
        }
        if (j > 0 && i < 0) {
            i += 1000000000;
            j--;
        }
        if (j < 0 && i > 0) {
            i -= 1000000000;
            j++;
        }
        asr asrVar = (asr) eek.a.createBuilder();
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        ((eek) asrVar.a).b = j;
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        ((eek) asrVar.a).c = i;
        eek eekVar = (eek) asrVar.z();
        d(eekVar);
        return eekVar;
    }

    public static void d(eek eekVar) {
        long j = eekVar.b;
        int i = eekVar.c;
        if (j >= -315576000000L && j <= 315576000000L && i >= -999999999 && i < 1000000000) {
            if (j >= 0 && i >= 0) {
                return;
            }
            if (j <= 0 && i <= 0) {
                return;
            }
        }
        throw new IllegalArgumentException(clq.u("Duration is not valid. See proto definition for valid values. Seconds (%s) must be in range [-315,576,000,000, +315,576,000,000]. Nanos (%s) must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds", Long.valueOf(j), Integer.valueOf(i)));
    }
}
