package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dqz {
    public static final int[] a = {0, 3, 6, 9, 12, 16, 19, 22, 25, 28};
    public static final int[] b = {0, 2, 3, 5, 6, 0, 1, 3, 4, 6};
    public static final int[] c = {67108863, 33554431};
    private static final int[] d = {26, 25};

    public static void a(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[19];
        b(jArr4, jArr2, jArr3);
        c(jArr4, jArr);
    }

    public static void b(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr[0] = jArr2[0] * jArr3[0];
        long j = jArr2[0];
        long j2 = jArr3[1] * j;
        long j3 = jArr2[1];
        long j4 = jArr3[0];
        jArr[1] = j2 + (j3 * j4);
        long j5 = jArr2[1];
        long j6 = jArr3[1];
        jArr[2] = ((j5 + j5) * j6) + (jArr3[2] * j) + (jArr2[2] * j4);
        long j7 = jArr3[2];
        long j8 = jArr2[2];
        jArr[3] = (j5 * j7) + (j8 * j6) + (jArr3[3] * j) + (jArr2[3] * j4);
        long j9 = jArr3[3];
        long j10 = jArr2[3];
        long j11 = (j5 * j9) + (j10 * j6);
        jArr[4] = (j8 * j7) + j11 + j11 + (jArr3[4] * j) + (jArr2[4] * j4);
        long j12 = jArr3[4];
        long j13 = jArr2[4];
        jArr[5] = (j8 * j9) + (j10 * j7) + (j5 * j12) + (j13 * j6) + (jArr3[5] * j) + (jArr2[5] * j4);
        long j14 = jArr3[5];
        long j15 = jArr2[5];
        long j16 = (j10 * j9) + (j5 * j14) + (j15 * j6);
        jArr[6] = j16 + j16 + (j8 * j12) + (j13 * j7) + (jArr3[6] * j) + (jArr2[6] * j4);
        long j17 = jArr3[6];
        long j18 = jArr2[6];
        jArr[7] = (j10 * j12) + (j13 * j9) + (j8 * j14) + (j15 * j7) + (j5 * j17) + (j18 * j6) + (jArr3[7] * j) + (jArr2[7] * j4);
        long j19 = jArr3[7];
        long j20 = jArr2[7];
        long j21 = (j10 * j14) + (j15 * j9) + (j5 * j19) + (j20 * j6);
        jArr[8] = (j13 * j12) + j21 + j21 + (j8 * j17) + (j18 * j7) + (jArr3[8] * j) + (jArr2[8] * j4);
        long j22 = jArr3[8];
        long j23 = jArr2[8];
        jArr[9] = (j13 * j14) + (j15 * j12) + (j10 * j17) + (j18 * j9) + (j8 * j19) + (j20 * j7) + (j5 * j22) + (j23 * j6) + (j * jArr3[9]) + (jArr2[9] * j4);
        long j24 = jArr3[9];
        long j25 = jArr2[9];
        long j26 = (j15 * j14) + (j10 * j19) + (j20 * j9) + (j5 * j24) + (j6 * j25);
        jArr[10] = j26 + j26 + (j13 * j17) + (j18 * j12) + (j8 * j22) + (j23 * j7);
        jArr[11] = (j15 * j17) + (j18 * j14) + (j13 * j19) + (j20 * j12) + (j10 * j22) + (j23 * j9) + (j8 * j24) + (j7 * j25);
        long j27 = (j15 * j19) + (j20 * j14) + (j10 * j24) + (j9 * j25);
        jArr[12] = (j18 * j17) + j27 + j27 + (j13 * j22) + (j23 * j12);
        jArr[13] = (j18 * j19) + (j20 * j17) + (j15 * j22) + (j23 * j14) + (j13 * j24) + (j12 * j25);
        long j28 = (j20 * j19) + (j15 * j24) + (j14 * j25);
        jArr[14] = j28 + j28 + (j18 * j22) + (j23 * j17);
        jArr[15] = (j20 * j22) + (j23 * j19) + (j18 * j24) + (j17 * j25);
        long j29 = (j20 * j24) + (j19 * j25);
        jArr[16] = (j23 * j22) + j29 + j29;
        jArr[17] = (j23 * j24) + (j22 * j25);
        jArr[18] = (j25 + j25) * j24;
    }

    static void c(long[] jArr, long[] jArr2) {
        e(jArr);
        d(jArr);
        System.arraycopy(jArr, 0, jArr2, 0, 10);
    }

    public static void d(long[] jArr) {
        jArr[10] = 0;
        int i = 0;
        while (i < 10) {
            long j = jArr[i];
            long j2 = j / 67108864;
            jArr[i] = j - (j2 << 26);
            int i2 = i + 1;
            long j3 = jArr[i2] + j2;
            jArr[i2] = j3;
            long j4 = j3 / 33554432;
            jArr[i2] = j3 - (j4 << 25);
            i += 2;
            jArr[i] = jArr[i] + j4;
        }
        long j5 = jArr[0];
        long j6 = jArr[10];
        long j7 = j5 + (j6 << 4);
        jArr[0] = j7;
        long j8 = j7 + j6 + j6;
        jArr[0] = j8;
        long j9 = j8 + j6;
        jArr[0] = j9;
        jArr[10] = 0;
        long j10 = j9 / 67108864;
        jArr[0] = j9 - (j10 << 26);
        jArr[1] = jArr[1] + j10;
    }

    public static void e(long[] jArr) {
        long j = jArr[8];
        long j2 = jArr[18];
        long j3 = j + (j2 << 4);
        jArr[8] = j3;
        long j4 = j3 + j2 + j2;
        jArr[8] = j4;
        jArr[8] = j4 + j2;
        long j5 = jArr[7];
        long j6 = jArr[17];
        long j7 = j5 + (j6 << 4);
        jArr[7] = j7;
        long j8 = j7 + j6 + j6;
        jArr[7] = j8;
        jArr[7] = j8 + j6;
        long j9 = jArr[6];
        long j10 = jArr[16];
        long j11 = j9 + (j10 << 4);
        jArr[6] = j11;
        long j12 = j11 + j10 + j10;
        jArr[6] = j12;
        jArr[6] = j12 + j10;
        long j13 = jArr[5];
        long j14 = jArr[15];
        long j15 = j13 + (j14 << 4);
        jArr[5] = j15;
        long j16 = j15 + j14 + j14;
        jArr[5] = j16;
        jArr[5] = j16 + j14;
        long j17 = jArr[4];
        long j18 = jArr[14];
        long j19 = j17 + (j18 << 4);
        jArr[4] = j19;
        long j20 = j19 + j18 + j18;
        jArr[4] = j20;
        jArr[4] = j20 + j18;
        long j21 = jArr[3];
        long j22 = jArr[13];
        long j23 = j21 + (j22 << 4);
        jArr[3] = j23;
        long j24 = j23 + j22 + j22;
        jArr[3] = j24;
        jArr[3] = j24 + j22;
        long j25 = jArr[2];
        long j26 = jArr[12];
        long j27 = j25 + (j26 << 4);
        jArr[2] = j27;
        long j28 = j27 + j26 + j26;
        jArr[2] = j28;
        jArr[2] = j28 + j26;
        long j29 = jArr[1];
        long j30 = jArr[11];
        long j31 = j29 + (j30 << 4);
        jArr[1] = j31;
        long j32 = j31 + j30 + j30;
        jArr[1] = j32;
        jArr[1] = j32 + j30;
        long j33 = jArr[0];
        long j34 = jArr[10];
        long j35 = j33 + (j34 << 4);
        jArr[0] = j35;
        long j36 = j35 + j34 + j34;
        jArr[0] = j36;
        jArr[0] = j36 + j34;
    }

    public static void f(long[] jArr, long[] jArr2, long j) {
        for (int i = 0; i < 10; i++) {
            jArr[i] = jArr2[i] * j;
        }
    }

    public static void g(long[] jArr, long[] jArr2) {
        long j = jArr2[0];
        long j2 = j * j;
        long j3 = jArr2[1];
        long j4 = (j + j) * j3;
        long j5 = jArr2[2];
        long j6 = (j3 * j3) + (j * j5);
        long j7 = jArr2[3];
        long j8 = (j3 * j5) + (j * j7);
        long j9 = jArr2[4];
        long j10 = (j5 * j5) + (j3 * 4 * j7) + ((j + j) * j9);
        long j11 = jArr2[5];
        long j12 = (j5 * j7) + (j3 * j9) + (j * j11);
        long j13 = jArr2[6];
        long j14 = (j7 * j7) + (j5 * j9) + (j * j13) + ((j3 + j3) * j11);
        long j15 = jArr2[7];
        long j16 = (j7 * j9) + (j5 * j11) + (j3 * j13) + (j * j15);
        long j17 = jArr2[8];
        long j18 = (j3 * j15) + (j7 * j11);
        long j19 = (j5 * j13) + (j * j17) + j18 + j18;
        long j20 = (j9 * j9) + j19 + j19;
        long j21 = jArr2[9];
        long j22 = (j9 * j11) + (j7 * j13) + (j5 * j15) + (j3 * j17) + (j * j21);
        long j23 = (j7 * j15) + (j3 * j21);
        long j24 = (j11 * j11) + (j9 * j13) + (j5 * j17) + j23 + j23;
        long j25 = (j11 * j13) + (j9 * j15) + (j7 * j17) + (j5 * j21);
        long j26 = (j11 * j15) + (j7 * j21);
        long j27 = (j9 * j17) + j26 + j26;
        long j28 = (j13 * j15) + (j11 * j17) + (j9 * j21);
        long j29 = (j15 * j15) + (j13 * j17) + ((j11 + j11) * j21);
        long j30 = (j15 * j17) + (j13 * j21);
        c(new long[]{j2, j4, j6 + j6, j8 + j8, j10, j12 + j12, j14 + j14, j16 + j16, j20, j22 + j22, j24 + j24, j25 + j25, (j13 * j13) + j27 + j27, j28 + j28, j29 + j29, j30 + j30, (j17 * j17) + (j15 * 4 * j21), (j17 + j17) * j21, (j21 + j21) * j21}, jArr);
    }

    public static void h(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 10; i++) {
            jArr[i] = jArr2[i] - jArr3[i];
        }
    }

    public static void i(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 10; i++) {
            jArr[i] = jArr2[i] + jArr3[i];
        }
    }

    public static byte[] j(long[] jArr) {
        int i;
        long[] jArrCopyOf = Arrays.copyOf(jArr, 10);
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= 2) {
                break;
            }
            int i4 = 0;
            while (i4 < 9) {
                long j = jArrCopyOf[i4];
                int i5 = -((int) (((j >> 31) & j) >> d[i4 & 1]));
                jArrCopyOf[i4] = j + (i5 << r14);
                i4++;
                jArrCopyOf[i4] = jArrCopyOf[i4] - i5;
            }
            long j2 = jArrCopyOf[9];
            jArrCopyOf[9] = j2 + (r6 << 25);
            jArrCopyOf[0] = jArrCopyOf[0] - ((-((int) (((j2 >> 31) & j2) >> 25))) * 19);
            i3++;
        }
        long j3 = jArrCopyOf[0];
        jArrCopyOf[0] = j3 + (r3 << 26);
        jArrCopyOf[1] = jArrCopyOf[1] - (-((int) (((j3 >> 31) & j3) >> 26)));
        int i6 = 0;
        while (i6 < 2) {
            int i7 = i2;
            while (i7 < 9) {
                long j4 = jArrCopyOf[i7];
                int i8 = i2;
                long j5 = j4 >> d[i7 & 1];
                jArrCopyOf[i7] = j4 & c[r14];
                i7++;
                jArrCopyOf[i7] = jArrCopyOf[i7] + ((int) j5);
                i2 = i8;
                i6 = i6;
            }
            i6++;
        }
        int i9 = i2;
        jArrCopyOf[9] = jArrCopyOf[9] & 33554431;
        jArrCopyOf[i9] = jArrCopyOf[i9] + (((int) (r2 >> 25)) * 19);
        int i10 = ~((((int) r2) - 67108845) >> 31);
        for (int i11 = 1; i11 < 10; i11++) {
            int i12 = ~(((int) jArrCopyOf[i11]) ^ c[i11 & 1]);
            int i13 = i12 & (i12 << 16);
            int i14 = i13 & (i13 << 8);
            int i15 = i14 & (i14 << 4);
            int i16 = i15 & (i15 << 2);
            i10 &= (i16 & (i16 + i16)) >> 31;
        }
        jArrCopyOf[i9] = jArrCopyOf[i9] - (67108845 & i10);
        long j6 = 33554431 & i10;
        jArrCopyOf[1] = jArrCopyOf[1] - j6;
        for (i = 2; i < 10; i += 2) {
            jArrCopyOf[i] = jArrCopyOf[i] - (67108863 & i10);
            int i17 = i + 1;
            jArrCopyOf[i17] = jArrCopyOf[i17] - j6;
        }
        for (int i18 = i9; i18 < 10; i18++) {
            jArrCopyOf[i18] = jArrCopyOf[i18] << b[i18];
        }
        byte[] bArr = new byte[32];
        for (int i19 = i9; i19 < 10; i19++) {
            int i20 = a[i19];
            long j7 = bArr[i20];
            long j8 = jArrCopyOf[i19];
            bArr[i20] = (byte) (j7 | (j8 & 255));
            bArr[i20 + 1] = (byte) (bArr[r5] | ((j8 >> 8) & 255));
            bArr[i20 + 2] = (byte) (bArr[r5] | ((j8 >> 16) & 255));
            bArr[i20 + 3] = (byte) (bArr[r4] | ((j8 >> 24) & 255));
        }
        return bArr;
    }
}
