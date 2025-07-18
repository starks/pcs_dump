package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dhi {
    public static long a(long j, long j2) {
        long j3 = j + j2;
        cnx.R(((j ^ j2) < 0) | ((j ^ j3) >= 0), "checkedAdd", j, j2);
        return j3;
    }

    public static long b(long j) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(j) + Long.numberOfLeadingZeros(~j) + Long.numberOfLeadingZeros(1000L) + Long.numberOfLeadingZeros(-1001L);
        long j2 = j * 1000;
        if (iNumberOfLeadingZeros > 65) {
            return j2;
        }
        cnx.R(iNumberOfLeadingZeros >= 64, "checkedMultiply", j, 1000L);
        cnx.R(true, "checkedMultiply", j, 1000L);
        cnx.R(j == 0 || j2 / j == 1000, "checkedMultiply", j, 1000L);
        return j2;
    }
}
