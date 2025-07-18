package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eeg extends eei {
    private final byte[] a;
    private final int b;
    private int c;

    public eeg(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new NullPointerException("buffer");
        }
        int i3 = i + i2;
        int length = bArr.length;
        if ((i | i2 | (length - i3)) < 0) {
            throw new IllegalArgumentException(String.format(Locale.US, "Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        this.a = bArr;
        this.c = i;
        this.b = i3;
    }

    @Override // defpackage.eei
    public final void A(int i, int i2) throws eeh {
        C(ehu.c(i, i2));
    }

    @Override // defpackage.eei
    public final void B(int i, int i2) throws eeh {
        A(i, 0);
        C(i2);
    }

    @Override // defpackage.eei
    public final void C(int i) throws eeh {
        int i2;
        int i3 = this.c;
        while ((i & (-128)) != 0) {
            try {
                i2 = i3 + 1;
                try {
                    this.a[i3] = (byte) (i | 128);
                    i >>>= 7;
                    i3 = i2;
                } catch (IndexOutOfBoundsException e) {
                    e = e;
                    i3 = i2;
                    throw new eeh(i3, this.b, 1, e);
                }
            } catch (IndexOutOfBoundsException e2) {
                e = e2;
                throw new eeh(i3, this.b, 1, e);
            }
        }
        i2 = i3 + 1;
        this.a[i3] = (byte) i;
        this.c = i2;
    }

    @Override // defpackage.eei
    public final void D(int i, long j) throws eeh {
        A(i, 0);
        E(j);
    }

    @Override // defpackage.eei
    public final void E(long j) throws eeh {
        int i;
        int i2;
        int i3 = this.c;
        if (!eei.e || b() < 10) {
            while ((j & (-128)) != 0) {
                try {
                    i2 = i3 + 1;
                } catch (IndexOutOfBoundsException e) {
                    e = e;
                }
                try {
                    this.a[i3] = (byte) (((int) j) | 128);
                    j >>>= 7;
                    i3 = i2;
                } catch (IndexOutOfBoundsException e2) {
                    e = e2;
                    i3 = i2;
                    throw new eeh(i3, this.b, 1, e);
                }
            }
            i = i3 + 1;
            try {
                this.a[i3] = (byte) j;
            } catch (IndexOutOfBoundsException e3) {
                e = e3;
                i3 = i;
                throw new eeh(i3, this.b, 1, e);
            }
        } else {
            while ((j & (-128)) != 0) {
                ehn.p(this.a, i3, (byte) (((int) j) | 128));
                j >>>= 7;
                i3++;
            }
            i = i3 + 1;
            ehn.p(this.a, i3, (byte) j);
        }
        this.c = i;
    }

    @Override // defpackage.eei
    public final void F(byte[] bArr, int i) throws eeh {
        C(i);
        c(bArr, 0, i);
    }

    @Override // defpackage.eei, defpackage.edr
    public final void a(byte[] bArr, int i, int i2) throws eeh {
        c(bArr, i, i2);
    }

    @Override // defpackage.eei
    public final int b() {
        return this.b - this.c;
    }

    public final void c(byte[] bArr, int i, int i2) throws eeh {
        try {
            System.arraycopy(bArr, i, this.a, this.c, i2);
            this.c += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new eeh(this.c, this.b, i2, e);
        }
    }

    @Override // defpackage.eei
    public final void j(byte b) throws eeh {
        int i;
        int i2 = this.c;
        try {
            i = i2 + 1;
        } catch (IndexOutOfBoundsException e) {
            e = e;
        }
        try {
            this.a[i2] = b;
            this.c = i;
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
            i2 = i;
            throw new eeh(i2, this.b, 1, e);
        }
    }

    @Override // defpackage.eei
    public final void l(int i, boolean z) throws eeh {
        A(i, 0);
        j(z ? (byte) 1 : (byte) 0);
    }

    @Override // defpackage.eei
    public final void m(int i, eea eeaVar) throws eeh {
        A(i, 2);
        n(eeaVar);
    }

    @Override // defpackage.eei
    public final void n(eea eeaVar) throws eeh {
        C(eeaVar.d());
        eeaVar.n(this);
    }

    @Override // defpackage.eei
    public final void o(int i, int i2) throws eeh {
        A(i, 5);
        p(i2);
    }

    @Override // defpackage.eei
    public final void p(int i) throws eeh {
        int i2 = this.c;
        try {
            byte[] bArr = this.a;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = (byte) (i >> 24);
            this.c = i2 + 4;
        } catch (IndexOutOfBoundsException e) {
            throw new eeh(i2, this.b, 4, e);
        }
    }

    @Override // defpackage.eei
    public final void q(int i, long j) throws eeh {
        A(i, 1);
        r(j);
    }

    @Override // defpackage.eei
    public final void r(long j) throws eeh {
        int i = this.c;
        try {
            byte[] bArr = this.a;
            bArr[i] = (byte) j;
            bArr[i + 1] = (byte) (j >> 8);
            bArr[i + 2] = (byte) (j >> 16);
            bArr[i + 3] = (byte) (j >> 24);
            bArr[i + 4] = (byte) (j >> 32);
            bArr[i + 5] = (byte) (j >> 40);
            bArr[i + 6] = (byte) (j >> 48);
            bArr[i + 7] = (byte) (j >> 56);
            this.c = i + 8;
        } catch (IndexOutOfBoundsException e) {
            throw new eeh(i, this.b, 8, e);
        }
    }

    @Override // defpackage.eei
    public final void s(int i, int i2) throws eeh {
        A(i, 0);
        t(i2);
    }

    @Override // defpackage.eei
    public final void t(int i) throws eeh {
        if (i >= 0) {
            C(i);
        } else {
            E(i);
        }
    }

    @Override // defpackage.eei
    public final void u(int i, egi egiVar, egx egxVar) throws eeh {
        A(i, 2);
        C(((edg) egiVar).getSerializedSize(egxVar));
        egxVar.m(egiVar, this.f);
    }

    @Override // defpackage.eei
    public final void v(egi egiVar) throws eeh {
        C(egiVar.getSerializedSize());
        egiVar.writeTo(this);
    }

    @Override // defpackage.eei
    public final void w(int i, egi egiVar) throws eeh {
        A(1, 3);
        B(2, i);
        A(3, 2);
        v(egiVar);
        A(1, 4);
    }

    @Override // defpackage.eei
    public final void x(int i, eea eeaVar) throws eeh {
        A(1, 3);
        B(2, i);
        m(3, eeaVar);
        A(1, 4);
    }

    @Override // defpackage.eei
    public final void y(int i, String str) throws eeh {
        A(i, 2);
        z(str);
    }

    @Override // defpackage.eei
    public final void z(String str) throws eeh {
        int i = this.c;
        try {
            int iAa = aa(str.length() * 3);
            int iAa2 = aa(str.length());
            if (iAa2 != iAa) {
                C(ehr.b(str));
                this.c = ehr.a(str, this.a, this.c, b());
                return;
            }
            int i2 = i + iAa2;
            this.c = i2;
            int iA = ehr.a(str, this.a, i2, b());
            this.c = i;
            C((iA - i) - iAa2);
            this.c = iA;
        } catch (ehq e) {
            this.c = i;
            ah(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new eeh(e2);
        }
    }
}
