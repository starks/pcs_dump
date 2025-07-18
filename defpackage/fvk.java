package defpackage;

import com.google.android.apps.aicore.aidl.AIFeature;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fvk implements Cloneable, ByteChannel, fvm, fvl {
    public fwa a;
    public long b;

    public final short A() throws EOFException {
        short sZ = z();
        int i = sZ >>> 8;
        return (short) (((sZ & 255) << 8) | (i & AIFeature.Id.ROSIE_ROBOT_TRANSLATE));
    }

    public final void B() throws EOFException {
        D(this.b);
    }

    @Override // defpackage.fvm
    public final void C(long j) {
        throw null;
    }

    @Override // defpackage.fvm
    public final void D(long j) throws EOFException {
        while (j > 0) {
            fwa fwaVar = this.a;
            if (fwaVar == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j, fwaVar.c - fwaVar.b);
            long j2 = iMin;
            this.b -= j2;
            j -= j2;
            int i = fwaVar.b + iMin;
            fwaVar.b = i;
            if (i == fwaVar.c) {
                this.a = fwaVar.a();
                fwb.b(fwaVar);
            }
        }
    }

    @Override // defpackage.fvm
    public final boolean E() {
        return this.b == 0;
    }

    @Override // defpackage.fvm
    public final byte[] F() {
        return G(this.b);
    }

    @Override // defpackage.fvm
    public final byte[] G(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(a.C(j, "byteCount: "));
        }
        if (this.b < j) {
            throw new EOFException();
        }
        int i = (int) j;
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int iE = e(bArr, i2, i - i2);
            if (iE == -1) {
                throw new EOFException();
            }
            i2 += iE;
        }
        return bArr;
    }

    public final void H(fvk fvkVar, long j, long j2) {
        fwv.m(this.b, 0L, j2);
        if (j2 == 0) {
            return;
        }
        fvkVar.b += j2;
        fwa fwaVar = this.a;
        long j3 = 0;
        while (true) {
            fwaVar.getClass();
            long j4 = fwaVar.c - fwaVar.b;
            if (j3 < j4) {
                break;
            }
            fwaVar = fwaVar.f;
            j3 -= j4;
        }
        long j5 = j3;
        long j6 = j2;
        while (j6 > 0) {
            fwaVar.getClass();
            fwa fwaVarB = fwaVar.b();
            int i = fwaVarB.b + ((int) j5);
            fwaVarB.b = i;
            fwaVarB.c = Math.min(i + ((int) j6), fwaVarB.c);
            fwa fwaVar2 = fvkVar.a;
            if (fwaVar2 == null) {
                fwaVarB.g = fwaVarB;
                fwaVarB.f = fwaVarB.g;
                fvkVar.a = fwaVarB.f;
            } else {
                fwa fwaVar3 = fwaVar2.g;
                fwaVar3.getClass();
                fwaVar3.d(fwaVarB);
            }
            j6 -= fwaVarB.c - fwaVarB.b;
            fwaVar = fwaVar.f;
            j5 = 0;
        }
    }

    @Override // defpackage.fvl
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public final void J(fvn fvnVar) {
        fvnVar.getClass();
        fvnVar.o(this, fvnVar.b());
    }

    @Override // defpackage.fvl
    public final /* bridge */ /* synthetic */ void K(byte[] bArr) {
        throw null;
    }

    public final void L(byte[] bArr, int i, int i2) {
        bArr.getClass();
        long j = i2;
        fwv.m(bArr.length, i, j);
        int i3 = i;
        while (true) {
            int i4 = i + i2;
            if (i3 >= i4) {
                this.b += j;
                return;
            }
            fwa fwaVarY = y(1);
            int i5 = 8192 - fwaVarY.c;
            byte[] bArr2 = fwaVarY.a;
            int iMin = Math.min(i4 - i3, i5);
            int i6 = i3 + iMin;
            ffh.ae(bArr, bArr2, fwaVarY.c, i3, i6);
            fwaVarY.c += iMin;
            i3 = i6;
        }
    }

    @Override // defpackage.fvl
    public final /* bridge */ /* synthetic */ void M(byte[] bArr, int i) {
        throw null;
    }

    public final void N(fwf fwfVar) {
        while (fwfVar.b(this, 8192L) != -1) {
        }
    }

    @Override // defpackage.fvl
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public final void P(int i) {
        fwa fwaVarY = y(1);
        byte[] bArr = fwaVarY.a;
        int i2 = fwaVarY.c;
        fwaVarY.c = i2 + 1;
        bArr[i2] = (byte) i;
        this.b++;
    }

    @Override // defpackage.fvl
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public final void S(int i) {
        fwa fwaVarY = y(4);
        byte[] bArr = fwaVarY.a;
        int i2 = fwaVarY.c;
        bArr[i2] = (byte) (i >> 24);
        bArr[i2 + 1] = (byte) ((i >>> 16) & AIFeature.Id.ROSIE_ROBOT_TRANSLATE);
        bArr[i2 + 2] = (byte) ((i >>> 8) & AIFeature.Id.ROSIE_ROBOT_TRANSLATE);
        bArr[i2 + 3] = (byte) (i & AIFeature.Id.ROSIE_ROBOT_TRANSLATE);
        fwaVarY.c = i2 + 4;
        this.b += 4;
    }

    @Override // defpackage.fvl
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public final void U(int i) {
        fwa fwaVarY = y(2);
        byte[] bArr = fwaVarY.a;
        int i2 = fwaVarY.c;
        bArr[i2] = (byte) ((i >>> 8) & AIFeature.Id.ROSIE_ROBOT_TRANSLATE);
        bArr[i2 + 1] = (byte) (i & AIFeature.Id.ROSIE_ROBOT_TRANSLATE);
        fwaVarY.c = i2 + 2;
        this.b += 2;
    }

    public final void V(String str, int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException(a.x(i, "beginIndex < 0: "));
        }
        if (i2 < i) {
            throw new IllegalArgumentException(a.D(i, i2, "endIndex < beginIndex: ", " < "));
        }
        if (i2 > str.length()) {
            throw new IllegalArgumentException("endIndex > string.length: " + i2 + " > " + str.length());
        }
        while (i < i2) {
            int i3 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt < 128) {
                fwa fwaVarY = y(1);
                byte[] bArr = fwaVarY.a;
                int i4 = fwaVarY.c - i;
                int iMin = Math.min(i2, 8192 - i4);
                bArr[i + i4] = (byte) cCharAt;
                i = i3;
                while (i < iMin) {
                    char cCharAt2 = str.charAt(i);
                    if (cCharAt2 >= 128) {
                        break;
                    }
                    bArr[i + i4] = (byte) cCharAt2;
                    i++;
                }
                int i5 = fwaVarY.c;
                int i6 = (i4 + i) - i5;
                fwaVarY.c = i5 + i6;
                this.b += i6;
            } else {
                if (cCharAt < 2048) {
                    fwa fwaVarY2 = y(2);
                    byte[] bArr2 = fwaVarY2.a;
                    int i7 = fwaVarY2.c;
                    bArr2[i7] = (byte) ((cCharAt >> 6) | 192);
                    bArr2[i7 + 1] = (byte) ((cCharAt & '?') | 128);
                    fwaVarY2.c = i7 + 2;
                    this.b += 2;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    fwa fwaVarY3 = y(3);
                    byte[] bArr3 = fwaVarY3.a;
                    int i8 = fwaVarY3.c;
                    bArr3[i8] = (byte) ((cCharAt >> '\f') | AIFeature.Id.ASTROBOY_V1);
                    bArr3[i8 + 1] = (byte) ((63 & (cCharAt >> 6)) | 128);
                    bArr3[i8 + 2] = (byte) ((cCharAt & '?') | 128);
                    fwaVarY3.c = i8 + 3;
                    this.b += 3;
                } else {
                    char cCharAt3 = i3 < i2 ? str.charAt(i3) : (char) 0;
                    if (cCharAt > 56319 || cCharAt3 < 56320 || cCharAt3 >= 57344) {
                        P(63);
                    } else {
                        fwa fwaVarY4 = y(4);
                        byte[] bArr4 = fwaVarY4.a;
                        int i9 = fwaVarY4.c;
                        int i10 = (((cCharAt & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        bArr4[i9] = (byte) ((i10 >> 18) | AIFeature.Id.R2D2);
                        bArr4[i9 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                        bArr4[i9 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                        bArr4[i9 + 3] = (byte) ((i10 & 63) | 128);
                        fwaVarY4.c = i9 + 4;
                        this.b += 4;
                        i += 2;
                    }
                }
                i = i3;
            }
        }
    }

    public final void W(int i) {
        if (i < 128) {
            P(i);
            return;
        }
        if (i < 2048) {
            fwa fwaVarY = y(2);
            byte[] bArr = fwaVarY.a;
            int i2 = fwaVarY.c;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            fwaVarY.c = i2 + 2;
            this.b += 2;
            return;
        }
        if (i >= 55296 && i < 57344) {
            P(63);
            return;
        }
        if (i < 65536) {
            fwa fwaVarY2 = y(3);
            byte[] bArr2 = fwaVarY2.a;
            int i3 = fwaVarY2.c;
            bArr2[i3] = (byte) ((i >> 12) | AIFeature.Id.ASTROBOY_V1);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i3 + 2] = (byte) ((i & 63) | 128);
            fwaVarY2.c = i3 + 3;
            this.b += 3;
            return;
        }
        if (i > 1114111) {
            throw new IllegalArgumentException("Unexpected code point: 0x".concat(fwv.l(i)));
        }
        fwa fwaVarY3 = y(4);
        byte[] bArr3 = fwaVarY3.a;
        int i4 = fwaVarY3.c;
        bArr3[i4] = (byte) ((i >> 18) | AIFeature.Id.R2D2);
        bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
        bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
        bArr3[i4 + 3] = (byte) ((i & 63) | 128);
        fwaVarY3.c = i4 + 4;
        this.b += 4;
    }

    @Override // defpackage.fwf
    public final fwh a() {
        return fwh.k;
    }

    @Override // defpackage.fwf
    public final long b(fvk fvkVar, long j) {
        if (j < 0) {
            throw new IllegalArgumentException(a.C(j, "byteCount < 0: "));
        }
        long j2 = this.b;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        fvkVar.bi(this, j);
        return j;
    }

    @Override // defpackage.fwd
    public final void bi(fvk fvkVar, long j) {
        fwa fwaVarB;
        fvkVar.getClass();
        if (fvkVar == this) {
            throw new IllegalArgumentException("source == this");
        }
        fwv.m(fvkVar.b, 0L, j);
        while (j > 0) {
            fwa fwaVar = fvkVar.a;
            fwaVar.getClass();
            int i = fwaVar.c;
            fwaVar.getClass();
            int i2 = i - fwaVar.b;
            int i3 = 0;
            if (j < i2) {
                fwa fwaVar2 = this.a;
                fwa fwaVar3 = fwaVar2 != null ? fwaVar2.g : null;
                int i4 = (int) j;
                if (fwaVar3 != null && fwaVar3.e) {
                    if ((fwaVar3.c + j) - (fwaVar3.d ? 0 : fwaVar3.b) <= 8192) {
                        fwaVar.getClass();
                        fwaVar.c(fwaVar3, i4);
                        fvkVar.b -= j;
                        this.b += j;
                        return;
                    }
                }
                fwaVar.getClass();
                if (i4 > i2) {
                    throw new IllegalArgumentException("byteCount out of range");
                }
                if (i4 >= 1024) {
                    fwaVarB = fwaVar.b();
                } else {
                    byte[] bArr = fwaVar.a;
                    fwa fwaVarA = fwb.a();
                    byte[] bArr2 = fwaVarA.a;
                    int i5 = fwaVar.b;
                    ffh.ae(bArr, bArr2, 0, i5, i5 + i4);
                    fwaVarB = fwaVarA;
                }
                fwaVarB.c = fwaVarB.b + i4;
                fwaVar.b += i4;
                fwa fwaVar4 = fwaVar.g;
                fwaVar4.getClass();
                fwaVar4.d(fwaVarB);
                fvkVar.a = fwaVarB;
            }
            fwa fwaVar5 = fvkVar.a;
            fwaVar5.getClass();
            int i6 = fwaVar5.c - fwaVar5.b;
            fvkVar.a = fwaVar5.a();
            fwa fwaVar6 = this.a;
            if (fwaVar6 == null) {
                this.a = fwaVar5;
                fwaVar5.g = fwaVar5;
                fwaVar5.f = fwaVar5.g;
            } else {
                fwa fwaVar7 = fwaVar6.g;
                fwaVar7.getClass();
                fwaVar7.d(fwaVar5);
                fwa fwaVar8 = fwaVar5.g;
                if (fwaVar8 == fwaVar5) {
                    throw new IllegalStateException("cannot compact");
                }
                fwaVar8.getClass();
                if (fwaVar8.e) {
                    int i7 = fwaVar5.c - fwaVar5.b;
                    fwaVar8.getClass();
                    int i8 = 8192 - fwaVar8.c;
                    fwaVar8.getClass();
                    if (!fwaVar8.d) {
                        fwaVar8.getClass();
                        i3 = fwaVar8.b;
                    }
                    if (i7 <= i8 + i3) {
                        fwaVar8.getClass();
                        fwaVar5.c(fwaVar8, i7);
                        fwaVar5.a();
                        fwb.b(fwaVar5);
                    }
                }
            }
            long j2 = i6;
            fvkVar.b -= j2;
            this.b += j2;
            j -= j2;
        }
    }

    public final byte c(long j) {
        fwv.m(this.b, j, 1L);
        fwa fwaVar = this.a;
        fwaVar.getClass();
        long j2 = this.b;
        if (j2 - j < j) {
            while (j2 > j) {
                fwaVar = fwaVar.g;
                fwaVar.getClass();
                j2 -= fwaVar.c - fwaVar.b;
            }
            fwaVar.getClass();
            return fwaVar.a[(int) ((fwaVar.b + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            int i = fwaVar.c;
            int i2 = fwaVar.b;
            long j4 = (i - i2) + j3;
            if (j4 > j) {
                fwaVar.getClass();
                return fwaVar.a[(int) ((i2 + j) - j3)];
            }
            fwaVar = fwaVar.f;
            fwaVar.getClass();
            j3 = j4;
        }
    }

    public final /* synthetic */ Object clone() {
        fvk fvkVar = new fvk();
        if (this.b == 0) {
            return fvkVar;
        }
        fwa fwaVar = this.a;
        fwaVar.getClass();
        fwa fwaVarB = fwaVar.b();
        fvkVar.a = fwaVarB;
        fwaVarB.g = fwaVarB;
        fwaVarB.f = fwaVarB.g;
        for (fwa fwaVar2 = fwaVar.f; fwaVar2 != fwaVar; fwaVar2 = fwaVar2.f) {
            fwa fwaVar3 = fwaVarB.g;
            fwaVar3.getClass();
            fwaVar2.getClass();
            fwaVar3.d(fwaVar2.b());
        }
        fvkVar.b = this.b;
        return fvkVar;
    }

    @Override // defpackage.fvm
    public final byte d() throws EOFException {
        long j = this.b;
        if (j == 0) {
            throw new EOFException();
        }
        fwa fwaVar = this.a;
        fwaVar.getClass();
        int i = fwaVar.b;
        int i2 = i + 1;
        byte[] bArr = fwaVar.a;
        int i3 = fwaVar.c;
        byte b = bArr[i];
        this.b = j - 1;
        if (i2 != i3) {
            fwaVar.b = i2;
            return b;
        }
        this.a = fwaVar.a();
        fwb.b(fwaVar);
        return b;
    }

    public final int e(byte[] bArr, int i, int i2) {
        bArr.getClass();
        fwv.m(bArr.length, i, i2);
        fwa fwaVar = this.a;
        if (fwaVar == null) {
            return -1;
        }
        int iMin = Math.min(i2, fwaVar.c - fwaVar.b);
        int i3 = fwaVar.b;
        ffh.ae(fwaVar.a, bArr, i, i3, i3 + iMin);
        int i4 = fwaVar.b + iMin;
        fwaVar.b = i4;
        this.b -= iMin;
        if (i4 != fwaVar.c) {
            return iMin;
        }
        this.a = fwaVar.a();
        fwb.b(fwaVar);
        return iMin;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fvk)) {
            return false;
        }
        long j = this.b;
        fvk fvkVar = (fvk) obj;
        if (j != fvkVar.b) {
            return false;
        }
        if (j == 0) {
            return true;
        }
        fwa fwaVar = this.a;
        fwaVar.getClass();
        fwa fwaVar2 = fvkVar.a;
        fwaVar2.getClass();
        int i = fwaVar.b;
        int i2 = fwaVar2.b;
        long j2 = 0;
        while (j2 < this.b) {
            long jMin = Math.min(fwaVar.c - i, fwaVar2.c - i2);
            long j3 = 0;
            while (j3 < jMin) {
                int i3 = i + 1;
                int i4 = i2 + 1;
                if (fwaVar.a[i] != fwaVar2.a[i2]) {
                    return false;
                }
                j3++;
                i = i3;
                i2 = i4;
            }
            if (i == fwaVar.c) {
                fwaVar = fwaVar.f;
                fwaVar.getClass();
                i = fwaVar.b;
            }
            if (i2 == fwaVar2.c) {
                fwaVar2 = fwaVar2.f;
                fwaVar2.getClass();
                i2 = fwaVar2.b;
            }
            j2 += jMin;
        }
        return true;
    }

    @Override // defpackage.fvm
    public final int f() throws EOFException {
        long j = this.b;
        if (j < 4) {
            throw new EOFException();
        }
        fwa fwaVar = this.a;
        fwaVar.getClass();
        int i = fwaVar.b;
        int i2 = fwaVar.c;
        if (i2 - i < 4) {
            return (d() & 255) | ((d() & 255) << 24) | ((d() & 255) << 16) | ((d() & 255) << 8);
        }
        byte[] bArr = fwaVar.a;
        int i3 = (bArr[i] & 255) << 24;
        int i4 = (bArr[i + 1] & 255) << 16;
        int i5 = (bArr[i + 2] & 255) << 8;
        int i6 = bArr[i + 3] & 255;
        this.b = j - 4;
        int i7 = i3 | i4 | i5 | i6;
        int i8 = i + 4;
        if (i8 != i2) {
            fwaVar.b = i8;
            return i7;
        }
        this.a = fwaVar.a();
        fwb.b(fwaVar);
        return i7;
    }

    public final long g() {
        long j = this.b;
        if (j == 0) {
            return 0L;
        }
        fwa fwaVar = this.a;
        fwaVar.getClass();
        fwa fwaVar2 = fwaVar.g;
        fwaVar2.getClass();
        return (fwaVar2.c >= 8192 || !fwaVar2.e) ? j : j - (r2 - fwaVar2.b);
    }

    public final long h(byte b, long j, long j2) {
        fwa fwaVar;
        long j3 = j;
        long j4 = j2;
        long j5 = 0;
        if (j3 < 0 || j3 > j4) {
            throw new IllegalArgumentException("size=" + this.b + " fromIndex=" + j3 + " toIndex=" + j4);
        }
        long j6 = this.b;
        if (j4 > j6) {
            j4 = j6;
        }
        long j7 = -1;
        if (j3 == j4 || (fwaVar = this.a) == null) {
            return -1L;
        }
        if (j6 - j3 < j3) {
            while (j6 > j3) {
                fwaVar = fwaVar.g;
                fwaVar.getClass();
                j6 -= fwaVar.c - fwaVar.b;
            }
            if (fwaVar == null) {
                return -1L;
            }
            while (j6 < j4) {
                byte[] bArr = fwaVar.a;
                long j8 = j7;
                int iMin = (int) Math.min(fwaVar.c, (fwaVar.b + j4) - j6);
                for (int i = (int) ((fwaVar.b + j3) - j6); i < iMin; i++) {
                    if (bArr[i] == b) {
                        return (i - fwaVar.b) + j6;
                    }
                }
                j6 += fwaVar.c - fwaVar.b;
                fwaVar = fwaVar.f;
                fwaVar.getClass();
                j7 = j8;
                j3 = j6;
            }
            return j7;
        }
        while (true) {
            long j9 = (fwaVar.c - fwaVar.b) + j5;
            if (j9 > j3) {
                break;
            }
            fwaVar = fwaVar.f;
            fwaVar.getClass();
            j5 = j9;
        }
        if (fwaVar == null) {
            return -1L;
        }
        while (j5 < j4) {
            byte[] bArr2 = fwaVar.a;
            int iMin2 = (int) Math.min(fwaVar.c, (fwaVar.b + j4) - j5);
            for (int i2 = (int) ((fwaVar.b + j3) - j5); i2 < iMin2; i2++) {
                if (bArr2[i2] == b) {
                    return (i2 - fwaVar.b) + j5;
                }
            }
            j5 += fwaVar.c - fwaVar.b;
            fwaVar = fwaVar.f;
            fwaVar.getClass();
            j3 = j5;
        }
        return -1L;
    }

    public final int hashCode() {
        fwa fwaVar = this.a;
        if (fwaVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = fwaVar.c;
            for (int i3 = fwaVar.b; i3 < i2; i3++) {
                i = (i * 31) + fwaVar.a[i3];
            }
            fwaVar = fwaVar.f;
            fwaVar.getClass();
        } while (fwaVar != this.a);
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a7 A[EDGE_INSN: B:45:0x00a7->B:39:0x00a7 BREAK  A[LOOP:0: B:5:0x000c->B:47:?], SYNTHETIC] */
    @Override // defpackage.fvm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long i() throws java.io.EOFException {
        /*
            r14 = this;
            long r0 = r14.b
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lae
            r0 = 0
            r1 = r0
            r6 = r1
            r4 = r2
        Lc:
            fwa r7 = r14.a
            r7.getClass()
            int r8 = r7.b
            int r9 = r7.c
        L15:
            if (r8 >= r9) goto L91
            byte[] r10 = r7.a
            r10 = r10[r8]
            r11 = 48
            if (r10 < r11) goto L26
            r11 = 57
            if (r10 > r11) goto L26
            int r11 = r10 + (-48)
            goto L3b
        L26:
            r11 = 97
            if (r10 < r11) goto L31
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L31
            int r11 = r10 + (-87)
            goto L3b
        L31:
            r11 = 65
            if (r10 < r11) goto L67
            r11 = 70
            if (r10 > r11) goto L67
            int r11 = r10 + (-55)
        L3b:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L4b
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r1 = r1 + 1
            int r8 = r8 + 1
            goto L15
        L4b:
            fvk r14 = new fvk
            r14.<init>()
            fvk r14 = r14.Q(r4)
            r14.P(r10)
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r14 = r14.l()
            java.lang.String r1 = "Number too large: "
            java.lang.String r14 = r1.concat(r14)
            r0.<init>(r14)
            throw r0
        L67:
            r6 = 1
            if (r1 == 0) goto L6b
            goto L91
        L6b:
            int r14 = r10 >> 4
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            char[] r2 = defpackage.fwj.a
            r14 = r14 & 15
            char r14 = r2[r14]
            r2 = r10 & 15
            char[] r3 = defpackage.fwj.a
            char r2 = r3[r2]
            r3 = 2
            char[] r3 = new char[r3]
            r3[r0] = r14
            r3[r6] = r2
            java.lang.String r14 = new java.lang.String
            r14.<init>(r3)
            java.lang.String r0 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.String r14 = r0.concat(r14)
            r1.<init>(r14)
            throw r1
        L91:
            if (r8 != r9) goto L9d
            fwa r8 = r7.a()
            r14.a = r8
            defpackage.fwb.b(r7)
            goto L9f
        L9d:
            r7.b = r8
        L9f:
            if (r6 != 0) goto La7
            fwa r7 = r14.a
            if (r7 == 0) goto La7
            goto Lc
        La7:
            long r2 = r14.b
            long r0 = (long) r1
            long r2 = r2 - r0
            r14.b = r2
            return r4
        Lae:
            java.io.EOFException r14 = new java.io.EOFException
            r14.<init>()
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fvk.i():long");
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // defpackage.fvm
    public final InputStream j() {
        return new fvy(this, 1);
    }

    public final String k(long j, Charset charset) throws EOFException {
        charset.getClass();
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(a.C(j, "byteCount: "));
        }
        long j2 = this.b;
        if (j2 < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return "";
        }
        fwa fwaVar = this.a;
        fwaVar.getClass();
        int i = fwaVar.b;
        int i2 = fwaVar.c;
        if (i + j > i2) {
            return new String(G(j), charset);
        }
        int i3 = (int) j;
        String str = new String(fwaVar.a, i, i3, charset);
        int i4 = i + i3;
        fwaVar.b = i4;
        this.b = j2 - j;
        if (i4 == i2) {
            this.a = fwaVar.a();
            fwb.b(fwaVar);
        }
        return str;
    }

    public final String l() {
        return k(this.b, fla.a);
    }

    public final String m(long j) {
        return k(j, fla.a);
    }

    @Override // defpackage.fvm
    public final String n() {
        return o(Long.MAX_VALUE);
    }

    @Override // defpackage.fvm
    public final String o(long j) throws EOFException {
        if (j < 0) {
            throw new IllegalArgumentException(a.C(j, "limit < 0: "));
        }
        long j2 = j != Long.MAX_VALUE ? 1 + j : Long.MAX_VALUE;
        long jH = h((byte) 10, 0L, j2);
        if (jH != -1) {
            return fwi.a(this, jH);
        }
        if (j2 < this.b && c(j2 - 1) == 13 && c(j2) == 10) {
            return fwi.a(this, j2);
        }
        fvk fvkVar = new fvk();
        H(fvkVar, 0L, Math.min(32L, this.b));
        throw new EOFException("\\n not found: limit=" + Math.min(this.b, j) + " content=" + fvkVar.u().d() + "…");
    }

    @Override // defpackage.fvm, defpackage.fvl
    public final fvk p() {
        throw null;
    }

    public final fvk q(byte[] bArr) {
        L(bArr, 0, bArr.length);
        return this;
    }

    @Override // defpackage.fvl
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final fvk Q(long j) {
        if (j == 0) {
            P(48);
            return this;
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + 3) >> 2);
        fwa fwaVarY = y(i);
        byte[] bArr = fwaVarY.a;
        int i2 = fwaVarY.c;
        int i3 = i2 + i;
        while (true) {
            i3--;
            if (i3 < i2) {
                fwaVarY.c += i;
                this.b += i;
                return this;
            }
            bArr[i3] = fwi.a[(int) (15 & j)];
            j >>>= 4;
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        fwa fwaVar = this.a;
        if (fwaVar == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), fwaVar.c - fwaVar.b);
        byteBuffer.put(fwaVar.a, fwaVar.b, iMin);
        int i = fwaVar.b + iMin;
        fwaVar.b = i;
        this.b -= iMin;
        if (i == fwaVar.c) {
            this.a = fwaVar.a();
            fwb.b(fwaVar);
        }
        return iMin;
    }

    @Override // defpackage.fvl
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final fvk t(String str) {
        str.getClass();
        V(str, 0, str.length());
        return this;
    }

    public final String toString() {
        return w().toString();
    }

    public final fvn u() {
        return v(this.b);
    }

    @Override // defpackage.fvm
    public final fvn v(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(a.C(j, "byteCount: "));
        }
        if (this.b < j) {
            throw new EOFException();
        }
        if (j < 4096) {
            return new fvn(G(j));
        }
        fvn fvnVarX = x((int) j);
        D(j);
        return fvnVarX;
    }

    public final fvn w() {
        long j = this.b;
        if (j <= 2147483647L) {
            return x((int) j);
        }
        throw new IllegalStateException(a.C(j, "size > Int.MAX_VALUE: "));
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining;
        while (i > 0) {
            fwa fwaVarY = y(1);
            int i2 = 8192 - fwaVarY.c;
            byte[] bArr = fwaVarY.a;
            int iMin = Math.min(i, i2);
            byteBuffer.get(bArr, fwaVarY.c, iMin);
            i -= iMin;
            fwaVarY.c += iMin;
        }
        this.b += iRemaining;
        return iRemaining;
    }

    public final fvn x(int i) {
        if (i == 0) {
            return fvn.a;
        }
        fwv.m(this.b, 0L, i);
        fwa fwaVar = this.a;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            fwaVar.getClass();
            int i5 = fwaVar.c;
            int i6 = fwaVar.b;
            if (i5 == i6) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += i5 - i6;
            i4++;
            fwaVar = fwaVar.f;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 + i4];
        fwa fwaVar2 = this.a;
        int i7 = 0;
        while (i2 < i) {
            fwaVar2.getClass();
            bArr[i7] = fwaVar2.a;
            i2 += fwaVar2.c - fwaVar2.b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = fwaVar2.b;
            fwaVar2.d = true;
            i7++;
            fwaVar2 = fwaVar2.f;
        }
        return new fwc(bArr, iArr);
    }

    public final fwa y(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        fwa fwaVar = this.a;
        if (fwaVar == null) {
            fwa fwaVarA = fwb.a();
            this.a = fwaVarA;
            fwaVarA.g = fwaVarA;
            fwaVarA.f = fwaVarA;
            return fwaVarA;
        }
        fwa fwaVar2 = fwaVar.g;
        fwaVar2.getClass();
        if (fwaVar2.c + i <= 8192 && fwaVar2.e) {
            return fwaVar2;
        }
        fwa fwaVarA2 = fwb.a();
        fwaVar2.d(fwaVarA2);
        return fwaVarA2;
    }

    @Override // defpackage.fvm
    public final short z() throws EOFException {
        int iD;
        long j = this.b;
        if (j < 2) {
            throw new EOFException();
        }
        fwa fwaVar = this.a;
        fwaVar.getClass();
        int i = fwaVar.b;
        int i2 = fwaVar.c;
        if (i2 - i < 2) {
            iD = (d() & 255) | ((d() & 255) << 8);
        } else {
            byte[] bArr = fwaVar.a;
            int i3 = (bArr[i] & 255) << 8;
            int i4 = bArr[i + 1] & 255;
            this.b = j - 2;
            int i5 = i + 2;
            if (i5 == i2) {
                this.a = fwaVar.a();
                fwb.b(fwaVar);
            } else {
                fwaVar.b = i5;
            }
            iD = i3 | i4;
        }
        return (short) iD;
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable, defpackage.fwf
    public final void close() {
    }

    @Override // defpackage.fvl, defpackage.fwd, java.io.Flushable
    public final void flush() {
    }
}
