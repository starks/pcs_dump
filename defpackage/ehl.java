package defpackage;

import libcore.io.Memory;
import sun.misc.Unsafe;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ehl extends ehm {
    public ehl(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // defpackage.ehm
    public final byte a(long j) {
        return Memory.peekByte(j);
    }

    @Override // defpackage.ehm
    public final double b(Object obj, long j) {
        return Double.longBitsToDouble(k(obj, j));
    }

    @Override // defpackage.ehm
    public final float c(Object obj, long j) {
        return Float.intBitsToFloat(j(obj, j));
    }

    @Override // defpackage.ehm
    public final void d(long j, byte[] bArr, long j2, long j3) {
        Memory.peekByteArray(j, bArr, (int) j2, (int) j3);
    }

    @Override // defpackage.ehm
    public final void e(Object obj, long j, boolean z) {
        if (ehn.d) {
            ehn.q(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            ehn.r(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // defpackage.ehm
    public final void f(Object obj, long j, byte b) {
        if (ehn.d) {
            ehn.q(obj, j, b);
        } else {
            ehn.r(obj, j, b);
        }
    }

    @Override // defpackage.ehm
    public final void g(Object obj, long j, double d) {
        n(obj, j, Double.doubleToLongBits(d));
    }

    @Override // defpackage.ehm
    public final void h(Object obj, long j, float f) {
        m(obj, j, Float.floatToIntBits(f));
    }

    @Override // defpackage.ehm
    public final boolean i(Object obj, long j) {
        return ehn.d ? ehn.z(obj, j) : ehn.A(obj, j);
    }
}
