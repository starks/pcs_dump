package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aku implements akp {
    private static final double a = Math.log(1.1d);

    @Override // defpackage.akp
    public final long a(int i) {
        if (i != 0) {
            return Math.round(Math.pow(Math.exp((i - 1) + 23.0d), a) - 10.0d);
        }
        throw null;
    }

    @Override // defpackage.akp
    public final int b(long j) {
        if (j < 0) {
            return akz.a;
        }
        int iRound = (int) Math.round((Math.log(j + 10.0d) / a) - 23.0d);
        if (iRound > 200) {
            iRound = 200;
        }
        return akz.a(iRound);
    }
}
