package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: PG */
/* loaded from: classes.dex */
public class edy extends edx {
    private static final long serialVersionUID = 1;
    protected final byte[] a;

    public edy(byte[] bArr) {
        bArr.getClass();
        this.a = bArr;
    }

    @Override // defpackage.eea
    public byte a(int i) {
        return this.a[i];
    }

    @Override // defpackage.eea
    public byte b(int i) {
        return this.a[i];
    }

    protected int c() {
        return 0;
    }

    @Override // defpackage.eea
    public int d() {
        return this.a.length;
    }

    @Override // defpackage.eea
    protected void e(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.a, i, bArr, i2, i3);
    }

    @Override // defpackage.eea
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof eea) || d() != ((eea) obj).d()) {
            return false;
        }
        if (d() == 0) {
            return true;
        }
        if (!(obj instanceof edy)) {
            return obj.equals(this);
        }
        edy edyVar = (edy) obj;
        int i = this.c;
        int i2 = edyVar.c;
        if (i == 0 || i2 == 0 || i == i2) {
            return g(edyVar, 0, d());
        }
        return false;
    }

    @Override // defpackage.edx
    public final boolean g(eea eeaVar, int i, int i2) {
        if (i2 > eeaVar.d()) {
            throw new IllegalArgumentException("Length too large: " + i2 + d());
        }
        int i3 = i + i2;
        if (i3 > eeaVar.d()) {
            throw new IllegalArgumentException("Ran off end of other: " + i + ", " + i2 + ", " + eeaVar.d());
        }
        if (!(eeaVar instanceof edy)) {
            return eeaVar.j(i, i3).equals(j(0, i2));
        }
        edy edyVar = (edy) eeaVar;
        byte[] bArr = this.a;
        byte[] bArr2 = edyVar.a;
        int iC = c() + i2;
        int iC2 = c();
        int iC3 = edyVar.c() + i;
        while (iC2 < iC) {
            if (bArr[iC2] != bArr2[iC3]) {
                return false;
            }
            iC2++;
            iC3++;
        }
        return true;
    }

    @Override // defpackage.eea
    protected final int i(int i, int i2, int i3) {
        return efn.b(i, this.a, c() + i2, i3);
    }

    @Override // defpackage.eea
    public final eea j(int i, int i2) {
        int iO = o(i, i2, d());
        return iO == 0 ? eea.b : new edu(this.a, c() + i, iO);
    }

    @Override // defpackage.eea
    public final eee k() {
        return eee.L(this.a, c(), d(), true);
    }

    @Override // defpackage.eea
    protected final String l(Charset charset) {
        return new String(this.a, c(), d(), charset);
    }

    @Override // defpackage.eea
    public final ByteBuffer m() {
        return ByteBuffer.wrap(this.a, c(), d()).asReadOnlyBuffer();
    }

    @Override // defpackage.eea
    public final void n(edr edrVar) {
        edrVar.a(this.a, c(), d());
    }
}
