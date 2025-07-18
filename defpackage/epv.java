package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
final class epv implements epx {
    final int a;
    final epx[] b;
    private final int c;

    private epv(int i, epx[] epxVarArr, int i2) {
        this.a = i;
        this.b = epxVarArr;
        this.c = i2;
    }

    static epx d(epx epxVar, int i, epx epxVar2, int i2, int i3) {
        int iF = f(i, i3);
        int iF2 = f(i2, i3);
        if (iF == iF2) {
            epx epxVarD = d(epxVar, i, epxVar2, i2, i3 + 5);
            return new epv(iF, new epx[]{epxVarD}, ((epv) epxVarD).c);
        }
        int iG = g(i, i3);
        int iG2 = g(i2, i3);
        epx epxVar3 = iG > iG2 ? epxVar : epxVar2;
        if (iG > iG2) {
            epxVar = epxVar2;
        }
        return new epv(iF | iF2, new epx[]{epxVar, epxVar3}, epxVar.a() + epxVar3.a());
    }

    private final int e(int i) {
        return Integer.bitCount(this.a & (i - 1));
    }

    private static int f(int i, int i2) {
        return 1 << g(i, i2);
    }

    private static int g(int i, int i2) {
        return (i >>> i2) & 31;
    }

    @Override // defpackage.epx
    public final int a() {
        return this.c;
    }

    @Override // defpackage.epx
    public final epx b(Object obj, Object obj2, int i, int i2) {
        int i3 = this.a;
        int iF = f(i, i2);
        int iE = e(iF);
        if ((i3 & iF) != 0) {
            epx[] epxVarArr = this.b;
            epx[] epxVarArr2 = (epx[]) Arrays.copyOf(epxVarArr, epxVarArr.length);
            epx epxVarB = this.b[iE].b(obj, obj2, i, i2 + 5);
            epxVarArr2[iE] = epxVarB;
            return new epv(this.a, epxVarArr2, (this.c + epxVarB.a()) - this.b[iE].a());
        }
        int i4 = i3 | iF;
        epx[] epxVarArr3 = this.b;
        epx[] epxVarArr4 = new epx[epxVarArr3.length + 1];
        System.arraycopy(epxVarArr3, 0, epxVarArr4, 0, iE);
        epxVarArr4[iE] = new epw(obj, obj2);
        epx[] epxVarArr5 = this.b;
        System.arraycopy(epxVarArr5, iE, epxVarArr4, iE + 1, epxVarArr5.length - iE);
        return new epv(i4, epxVarArr4, this.c + 1);
    }

    @Override // defpackage.epx
    public final Object c(Object obj, int i, int i2) {
        int i3 = this.a;
        int iF = f(i, i2);
        if ((i3 & iF) == 0) {
            return null;
        }
        return this.b[e(iF)].c(obj, i, i2 + 5);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CompressedIndex(");
        sb.append(String.format("bitmap=%s ", Integer.toBinaryString(this.a)));
        for (epx epxVar : this.b) {
            sb.append(epxVar);
            sb.append(" ");
        }
        sb.append(")");
        return sb.toString();
    }
}
