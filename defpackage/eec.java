package defpackage;

import java.nio.ByteBuffer;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eec extends eee {
    private final Iterable g;
    private final Iterator h;
    private ByteBuffer i;
    private int j;
    private int k;
    private int m;
    private long o;
    private long p;
    private long q;
    private long r;
    private int l = Integer.MAX_VALUE;
    private int n = 0;

    public eec(Iterable iterable, int i) {
        this.j = i;
        this.g = iterable;
        this.h = iterable.iterator();
        if (i != 0) {
            T();
            return;
        }
        this.i = efn.c;
        this.o = 0L;
        this.p = 0L;
        this.r = 0L;
        this.q = 0L;
    }

    private final int G() {
        return (int) (((this.j - this.n) - this.o) + this.p);
    }

    private final long Q() {
        return this.r - this.o;
    }

    private final void R() throws efp {
        if (!this.h.hasNext()) {
            throw new efp("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        T();
    }

    private final void S() {
        int i = this.j + this.k;
        this.j = i;
        int i2 = this.l;
        if (i <= i2) {
            this.k = 0;
            return;
        }
        int i3 = i - i2;
        this.k = i3;
        this.j = i - i3;
    }

    private final void T() {
        ByteBuffer byteBuffer = (ByteBuffer) this.h.next();
        this.i = byteBuffer;
        this.n += (int) (this.o - this.p);
        long jPosition = byteBuffer.position();
        this.o = jPosition;
        this.p = jPosition;
        this.r = this.i.limit();
        long jG = ehn.g(this.i);
        this.q = jG;
        this.o += jG;
        this.p += jG;
        this.r += jG;
    }

    private final void U(byte[] bArr, int i) throws efp {
        if (i > G()) {
            if (i > 0) {
                throw new efp("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            return;
        }
        int i2 = i;
        while (i2 > 0) {
            if (Q() == 0) {
                R();
            }
            int iMin = Math.min(i2, (int) Q());
            long j = iMin;
            ehn.m(this.o, bArr, i - i2, j);
            i2 -= iMin;
            this.o += j;
        }
    }

    @Override // defpackage.eee
    public final void A(int i) {
        this.l = i;
        S();
    }

    public final void B(int i) throws efp {
        if (i >= 0) {
            if (i <= ((this.j - this.n) - this.o) + this.p) {
                while (i > 0) {
                    if (Q() == 0) {
                        R();
                    }
                    int iMin = Math.min(i, (int) Q());
                    i -= iMin;
                    this.o += iMin;
                }
                return;
            }
        }
        if (i >= 0) {
            throw new efp("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new efp("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    @Override // defpackage.eee
    public final boolean C() {
        return (((long) this.n) + this.o) - this.p == ((long) this.j);
    }

    @Override // defpackage.eee
    public final boolean D() {
        return r() != 0;
    }

    @Override // defpackage.eee
    public final boolean E(int i) throws efp {
        int iB = ehu.b(i);
        if (iB == 0) {
            for (int i2 = 0; i2 < 10; i2++) {
                if (a() >= 0) {
                    return true;
                }
            }
            throw new efp("CodedInputStream encountered a malformed varint.");
        }
        if (iB == 1) {
            B(8);
            return true;
        }
        if (iB == 2) {
            B(j());
            return true;
        }
        if (iB == 3) {
            O();
            z(ehu.c(ehu.a(i), 4));
            return true;
        }
        if (iB == 4) {
            N();
            return false;
        }
        if (iB != 5) {
            throw new efo();
        }
        B(4);
        return true;
    }

    @Override // defpackage.eee
    public final byte[] F() throws efp {
        int iJ = j();
        if (iJ >= 0) {
            long j = iJ;
            if (j <= Q()) {
                byte[] bArr = new byte[iJ];
                ehn.m(this.o, bArr, 0L, j);
                this.o += j;
                return bArr;
            }
        }
        if (iJ >= 0 && iJ <= G()) {
            byte[] bArr2 = new byte[iJ];
            U(bArr2, iJ);
            return bArr2;
        }
        if (iJ > 0) {
            throw new efp("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (iJ == 0) {
            return efn.b;
        }
        throw new efp("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public final byte a() throws efp {
        if (Q() == 0) {
            R();
        }
        long j = this.o;
        this.o = 1 + j;
        return ehn.a(j);
    }

    @Override // defpackage.eee
    public final double b() {
        return Double.longBitsToDouble(q());
    }

    @Override // defpackage.eee
    public final float c() {
        return Float.intBitsToFloat(i());
    }

    @Override // defpackage.eee
    public final int d() {
        return (int) ((this.n + this.o) - this.p);
    }

    @Override // defpackage.eee
    public final int e(int i) throws efp {
        if (i < 0) {
            throw new efp("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int iD = i + d();
        int i2 = this.l;
        if (iD > i2) {
            throw new efp("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.l = iD;
        S();
        return i2;
    }

    @Override // defpackage.eee
    public final int f() {
        return j();
    }

    @Override // defpackage.eee
    public final int g() {
        return i();
    }

    @Override // defpackage.eee
    public final int h() {
        return j();
    }

    public final int i() {
        if (Q() < 4) {
            int iA = a() & 255;
            int iA2 = (a() & 255) << 8;
            return ((a() & 255) << 24) | iA | iA2 | ((a() & 255) << 16);
        }
        long j = this.o;
        this.o = 4 + j;
        int iA3 = ehn.a(j) & 255;
        int iA4 = (ehn.a(1 + j) & 255) << 8;
        return iA3 | iA4 | ((ehn.a(2 + j) & 255) << 16) | ((ehn.a(j + 3) & 255) << 24);
    }

    @Override // defpackage.eee
    public final int j() {
        int i;
        long j = this.o;
        if (this.r != j) {
            long j2 = j + 1;
            byte bA = ehn.a(j);
            if (bA >= 0) {
                this.o++;
                return bA;
            }
            if (this.r - this.o >= 10) {
                long j3 = 2 + j;
                int iA = (ehn.a(j2) << 7) ^ bA;
                if (iA < 0) {
                    i = iA ^ (-128);
                } else {
                    long j4 = 3 + j;
                    int iA2 = (ehn.a(j3) << 14) ^ iA;
                    if (iA2 >= 0) {
                        i = iA2 ^ 16256;
                    } else {
                        long j5 = 4 + j;
                        int iA3 = iA2 ^ (ehn.a(j4) << 21);
                        if (iA3 < 0) {
                            i = (-2080896) ^ iA3;
                        } else {
                            j4 = 5 + j;
                            byte bA2 = ehn.a(j5);
                            int i2 = (iA3 ^ (bA2 << 28)) ^ 266354560;
                            if (bA2 < 0) {
                                j5 = 6 + j;
                                if (ehn.a(j4) < 0) {
                                    j4 = 7 + j;
                                    if (ehn.a(j5) < 0) {
                                        j5 = 8 + j;
                                        if (ehn.a(j4) < 0) {
                                            j4 = 9 + j;
                                            if (ehn.a(j5) < 0) {
                                                long j6 = j + 10;
                                                if (ehn.a(j4) >= 0) {
                                                    i = i2;
                                                    j3 = j6;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i2;
                            }
                            i = i2;
                        }
                        j3 = j5;
                    }
                    j3 = j4;
                }
                this.o = j3;
                return i;
            }
        }
        return (int) s();
    }

    @Override // defpackage.eee
    public final int k() {
        return i();
    }

    @Override // defpackage.eee
    public final int l() {
        return H(j());
    }

    @Override // defpackage.eee
    public final int m() throws efp {
        if (C()) {
            this.m = 0;
            return 0;
        }
        int iJ = j();
        this.m = iJ;
        if (ehu.a(iJ) != 0) {
            return iJ;
        }
        throw new efp("Protocol message contained an invalid tag (zero).");
    }

    @Override // defpackage.eee
    public final int n() {
        return j();
    }

    @Override // defpackage.eee
    public final long o() {
        return q();
    }

    @Override // defpackage.eee
    public final long p() {
        return r();
    }

    public final long q() {
        if (Q() < 8) {
            return ((a() & 255) << 56) | (a() & 255) | ((a() & 255) << 8) | ((a() & 255) << 16) | ((a() & 255) << 24) | ((a() & 255) << 32) | ((a() & 255) << 40) | ((a() & 255) << 48);
        }
        this.o = 8 + this.o;
        return (ehn.a(r13) & 255) | ((ehn.a(1 + r13) & 255) << 8) | ((ehn.a(2 + r13) & 255) << 16) | ((ehn.a(3 + r13) & 255) << 24) | ((ehn.a(r13 + 4) & 255) << 32) | ((ehn.a(5 + r13) & 255) << 40) | ((ehn.a(r13 + 6) & 255) << 48) | ((ehn.a(r13 + 7) & 255) << 56);
    }

    @Override // defpackage.eee
    public final long r() {
        long j;
        long j2;
        long j3 = this.o;
        if (this.r != j3) {
            long j4 = j3 + 1;
            byte bA = ehn.a(j3);
            if (bA >= 0) {
                this.o++;
                return bA;
            }
            if (this.r - this.o >= 10) {
                long j5 = 2 + j3;
                int iA = (ehn.a(j4) << 7) ^ bA;
                if (iA < 0) {
                    j = iA ^ (-128);
                } else {
                    long j6 = 3 + j3;
                    int iA2 = (ehn.a(j5) << 14) ^ iA;
                    if (iA2 >= 0) {
                        j = iA2 ^ 16256;
                    } else {
                        long j7 = 4 + j3;
                        int iA3 = iA2 ^ (ehn.a(j6) << 21);
                        if (iA3 < 0) {
                            j = (-2080896) ^ iA3;
                            j5 = j7;
                        } else {
                            j6 = 5 + j3;
                            long jA = (ehn.a(j7) << 28) ^ iA3;
                            if (jA >= 0) {
                                j = 266354560 ^ jA;
                            } else {
                                long j8 = 6 + j3;
                                long jA2 = jA ^ (ehn.a(j6) << 35);
                                if (jA2 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    long j9 = 7 + j3;
                                    long jA3 = jA2 ^ (ehn.a(j8) << 42);
                                    if (jA3 >= 0) {
                                        j = 4363953127296L ^ jA3;
                                    } else {
                                        j8 = 8 + j3;
                                        jA2 = jA3 ^ (ehn.a(j9) << 49);
                                        if (jA2 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            j9 = 9 + j3;
                                            long jA4 = (jA2 ^ (ehn.a(j8) << 56)) ^ 71499008037633920L;
                                            if (jA4 < 0) {
                                                long j10 = j3 + 10;
                                                if (ehn.a(j9) >= 0) {
                                                    j5 = j10;
                                                    j = jA4;
                                                }
                                            } else {
                                                j = jA4;
                                            }
                                        }
                                    }
                                    j5 = j9;
                                }
                                j = j2 ^ jA2;
                                j5 = j8;
                            }
                        }
                    }
                    j5 = j6;
                }
                this.o = j5;
                return j;
            }
        }
        return s();
    }

    final long s() throws efp {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            j |= (r3 & Byte.MAX_VALUE) << i;
            if ((a() & 128) == 0) {
                return j;
            }
        }
        throw new efp("CodedInputStream encountered a malformed varint.");
    }

    @Override // defpackage.eee
    public final long t() {
        return q();
    }

    @Override // defpackage.eee
    public final long u() {
        return I(r());
    }

    @Override // defpackage.eee
    public final long v() {
        return r();
    }

    @Override // defpackage.eee
    public final eea w() throws efp {
        int iJ = j();
        if (iJ > 0) {
            long j = this.r;
            long j2 = this.o;
            long j3 = iJ;
            if (j3 <= j - j2) {
                byte[] bArr = new byte[iJ];
                ehn.m(j2, bArr, 0L, j3);
                this.o += j3;
                eea eeaVar = eea.b;
                return new edy(bArr);
            }
        }
        if (iJ > 0 && iJ <= G()) {
            byte[] bArr2 = new byte[iJ];
            U(bArr2, iJ);
            eea eeaVar2 = eea.b;
            return new edy(bArr2);
        }
        if (iJ == 0) {
            return eea.b;
        }
        if (iJ < 0) {
            throw new efp("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new efp("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // defpackage.eee
    public final String x() throws efp {
        int iJ = j();
        if (iJ > 0) {
            long j = this.r;
            long j2 = this.o;
            long j3 = iJ;
            if (j3 <= j - j2) {
                byte[] bArr = new byte[iJ];
                ehn.m(j2, bArr, 0L, j3);
                String str = new String(bArr, efn.a);
                this.o += j3;
                return str;
            }
        }
        if (iJ > 0 && iJ <= G()) {
            byte[] bArr2 = new byte[iJ];
            U(bArr2, iJ);
            return new String(bArr2, efn.a);
        }
        if (iJ == 0) {
            return "";
        }
        if (iJ < 0) {
            throw new efp("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new efp("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // defpackage.eee
    public final String y() throws efp {
        int iJ = j();
        if (iJ > 0) {
            long j = this.r;
            long j2 = this.o;
            long j3 = iJ;
            if (j3 <= j - j2) {
                long j4 = j2 - this.p;
                ByteBuffer byteBuffer = this.i;
                eho ehoVar = ehr.a;
                int i = (int) j4;
                String strB = byteBuffer.hasArray() ? ehoVar.b(byteBuffer.array(), byteBuffer.arrayOffset() + i, iJ) : byteBuffer.isDirect() ? ehoVar.c(byteBuffer, i, iJ) : eho.d(byteBuffer, i, iJ);
                this.o += j3;
                return strB;
            }
        }
        if (iJ >= 0 && iJ <= G()) {
            byte[] bArr = new byte[iJ];
            U(bArr, iJ);
            return ehr.g(bArr, 0, iJ);
        }
        if (iJ == 0) {
            return "";
        }
        if (iJ <= 0) {
            throw new efp("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new efp("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // defpackage.eee
    public final void z(int i) throws efp {
        if (this.m != i) {
            throw new efp("Protocol message end-group tag did not match expected tag.");
        }
    }
}
