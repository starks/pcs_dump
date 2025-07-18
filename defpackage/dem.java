package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dem extends ddu {
    private long a = 0;
    private long b = 0;
    private int c = 0;

    public dem(int i) {
    }

    private static long i(long j) {
        long j2 = (j ^ (j >>> 33)) * (-49064778989728563L);
        long j3 = (j2 ^ (j2 >>> 33)) * (-4265267296055464877L);
        return j3 ^ (j3 >>> 33);
    }

    private static long j(long j) {
        return Long.rotateLeft(j * (-8663945395140668459L), 31) * 5545529020109919103L;
    }

    private static long k(long j) {
        return Long.rotateLeft(j * 5545529020109919103L, 33) * (-8663945395140668459L);
    }

    @Override // defpackage.ddu
    protected final ddy f() {
        long j = this.a;
        long j2 = this.c;
        long j3 = j ^ j2;
        long j4 = j2 ^ this.b;
        long j5 = j3 + j4;
        this.a = j5;
        long j6 = j4 + j5;
        this.b = j6;
        long jI = i(j5);
        this.a = jI;
        long jI2 = i(j6);
        long j7 = jI + jI2;
        this.a = j7;
        this.b = jI2 + j7;
        byte[] bArrArray = ByteBuffer.wrap(new byte[16]).order(ByteOrder.LITTLE_ENDIAN).putLong(this.a).putLong(this.b).array();
        int i = ddy.b;
        return new ddw(bArrArray);
    }

    @Override // defpackage.ddu
    protected final void g(ByteBuffer byteBuffer) {
        long j = byteBuffer.getLong();
        long j2 = byteBuffer.getLong();
        long j3 = j(j) ^ this.a;
        this.a = j3;
        long jRotateLeft = Long.rotateLeft(j3, 27);
        long j4 = this.b;
        this.a = ((jRotateLeft + j4) * 5) + 1390208809;
        long jK = k(j2) ^ j4;
        this.b = jK;
        this.b = ((Long.rotateLeft(jK, 31) + this.a) * 5) + 944331445;
        this.c += 16;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.ddu
    protected final void h(ByteBuffer byteBuffer) {
        long jN;
        long jN2;
        long jN3;
        long jN4;
        long jN5;
        long jN6;
        long jN7;
        this.c += byteBuffer.remaining();
        long jN8 = 0;
        switch (byteBuffer.remaining()) {
            case 1:
                jN = 0;
                jN7 = jN ^ cnx.N(byteBuffer.get(0));
                this.a = j(jN7) ^ this.a;
                this.b ^= k(jN8);
                return;
            case 2:
                jN2 = 0;
                jN = jN2 ^ (cnx.N(byteBuffer.get(1)) << 8);
                jN7 = jN ^ cnx.N(byteBuffer.get(0));
                this.a = j(jN7) ^ this.a;
                this.b ^= k(jN8);
                return;
            case 3:
                jN3 = 0;
                jN2 = jN3 ^ (cnx.N(byteBuffer.get(2)) << 16);
                jN = jN2 ^ (cnx.N(byteBuffer.get(1)) << 8);
                jN7 = jN ^ cnx.N(byteBuffer.get(0));
                this.a = j(jN7) ^ this.a;
                this.b ^= k(jN8);
                return;
            case 4:
                jN4 = 0;
                jN3 = jN4 ^ (cnx.N(byteBuffer.get(3)) << 24);
                jN2 = jN3 ^ (cnx.N(byteBuffer.get(2)) << 16);
                jN = jN2 ^ (cnx.N(byteBuffer.get(1)) << 8);
                jN7 = jN ^ cnx.N(byteBuffer.get(0));
                this.a = j(jN7) ^ this.a;
                this.b ^= k(jN8);
                return;
            case 5:
                jN5 = 0;
                jN4 = jN5 ^ (cnx.N(byteBuffer.get(4)) << 32);
                jN3 = jN4 ^ (cnx.N(byteBuffer.get(3)) << 24);
                jN2 = jN3 ^ (cnx.N(byteBuffer.get(2)) << 16);
                jN = jN2 ^ (cnx.N(byteBuffer.get(1)) << 8);
                jN7 = jN ^ cnx.N(byteBuffer.get(0));
                this.a = j(jN7) ^ this.a;
                this.b ^= k(jN8);
                return;
            case 6:
                jN6 = 0;
                jN5 = (cnx.N(byteBuffer.get(5)) << 40) ^ jN6;
                jN4 = jN5 ^ (cnx.N(byteBuffer.get(4)) << 32);
                jN3 = jN4 ^ (cnx.N(byteBuffer.get(3)) << 24);
                jN2 = jN3 ^ (cnx.N(byteBuffer.get(2)) << 16);
                jN = jN2 ^ (cnx.N(byteBuffer.get(1)) << 8);
                jN7 = jN ^ cnx.N(byteBuffer.get(0));
                this.a = j(jN7) ^ this.a;
                this.b ^= k(jN8);
                return;
            case 7:
                jN6 = cnx.N(byteBuffer.get(6)) << 48;
                jN5 = (cnx.N(byteBuffer.get(5)) << 40) ^ jN6;
                jN4 = jN5 ^ (cnx.N(byteBuffer.get(4)) << 32);
                jN3 = jN4 ^ (cnx.N(byteBuffer.get(3)) << 24);
                jN2 = jN3 ^ (cnx.N(byteBuffer.get(2)) << 16);
                jN = jN2 ^ (cnx.N(byteBuffer.get(1)) << 8);
                jN7 = jN ^ cnx.N(byteBuffer.get(0));
                this.a = j(jN7) ^ this.a;
                this.b ^= k(jN8);
                return;
            case 8:
                jN7 = byteBuffer.getLong();
                this.a = j(jN7) ^ this.a;
                this.b ^= k(jN8);
                return;
            case 9:
                jN8 ^= cnx.N(byteBuffer.get(8));
                jN7 = byteBuffer.getLong();
                this.a = j(jN7) ^ this.a;
                this.b ^= k(jN8);
                return;
            case 10:
                jN8 ^= cnx.N(byteBuffer.get(9)) << 8;
                jN8 ^= cnx.N(byteBuffer.get(8));
                jN7 = byteBuffer.getLong();
                this.a = j(jN7) ^ this.a;
                this.b ^= k(jN8);
                return;
            case 11:
                jN8 ^= cnx.N(byteBuffer.get(10)) << 16;
                jN8 ^= cnx.N(byteBuffer.get(9)) << 8;
                jN8 ^= cnx.N(byteBuffer.get(8));
                jN7 = byteBuffer.getLong();
                this.a = j(jN7) ^ this.a;
                this.b ^= k(jN8);
                return;
            case 12:
                jN8 ^= cnx.N(byteBuffer.get(11)) << 24;
                jN8 ^= cnx.N(byteBuffer.get(10)) << 16;
                jN8 ^= cnx.N(byteBuffer.get(9)) << 8;
                jN8 ^= cnx.N(byteBuffer.get(8));
                jN7 = byteBuffer.getLong();
                this.a = j(jN7) ^ this.a;
                this.b ^= k(jN8);
                return;
            case 13:
                jN8 ^= cnx.N(byteBuffer.get(12)) << 32;
                jN8 ^= cnx.N(byteBuffer.get(11)) << 24;
                jN8 ^= cnx.N(byteBuffer.get(10)) << 16;
                jN8 ^= cnx.N(byteBuffer.get(9)) << 8;
                jN8 ^= cnx.N(byteBuffer.get(8));
                jN7 = byteBuffer.getLong();
                this.a = j(jN7) ^ this.a;
                this.b ^= k(jN8);
                return;
            case 14:
                jN8 ^= cnx.N(byteBuffer.get(13)) << 40;
                jN8 ^= cnx.N(byteBuffer.get(12)) << 32;
                jN8 ^= cnx.N(byteBuffer.get(11)) << 24;
                jN8 ^= cnx.N(byteBuffer.get(10)) << 16;
                jN8 ^= cnx.N(byteBuffer.get(9)) << 8;
                jN8 ^= cnx.N(byteBuffer.get(8));
                jN7 = byteBuffer.getLong();
                this.a = j(jN7) ^ this.a;
                this.b ^= k(jN8);
                return;
            case 15:
                jN8 = cnx.N(byteBuffer.get(14)) << 48;
                jN8 ^= cnx.N(byteBuffer.get(13)) << 40;
                jN8 ^= cnx.N(byteBuffer.get(12)) << 32;
                jN8 ^= cnx.N(byteBuffer.get(11)) << 24;
                jN8 ^= cnx.N(byteBuffer.get(10)) << 16;
                jN8 ^= cnx.N(byteBuffer.get(9)) << 8;
                jN8 ^= cnx.N(byteBuffer.get(8));
                jN7 = byteBuffer.getLong();
                this.a = j(jN7) ^ this.a;
                this.b ^= k(jN8);
                return;
            default:
                throw new AssertionError("Should never get here.");
        }
    }
}
