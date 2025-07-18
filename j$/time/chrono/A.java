package j$.time.chrono;

import com.google.android.apps.aicore.aidl.AIFeature;
import j$.time.LocalDate;
import j$.time.temporal.Temporal;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class A implements o, Serializable {
    public static final A d;
    private static final A[] e;
    private static final long serialVersionUID = 1466499369062886794L;
    private final transient int a;
    private final transient LocalDate b;
    private final transient String c;

    static {
        A a = new A(-1, LocalDate.i0(1868, 1, 1), "Meiji");
        d = a;
        e = new A[]{a, new A(0, LocalDate.i0(1912, 7, 30), "Taisho"), new A(1, LocalDate.i0(1926, 12, 25), "Showa"), new A(2, LocalDate.i0(1989, 1, 8), "Heisei"), new A(3, LocalDate.i0(AIFeature.Id.PIXEL_AI_FEATURE_19, 5, 1), "Reiwa")};
    }

    private A(int i, LocalDate localDate, String str) {
        this.a = i;
        this.b = localDate;
        this.c = str;
    }

    static A k(LocalDate localDate) {
        if (localDate.e0(z.d)) {
            throw new j$.time.c("JapaneseDate before Meiji 6 are not supported");
        }
        A[] aArr = e;
        for (int length = aArr.length - 1; length >= 0; length--) {
            A a = aArr[length];
            if (localDate.compareTo(a.b) >= 0) {
                return a;
            }
        }
        return null;
    }

    static A l() {
        return e[r0.length - 1];
    }

    public static A q(int i) {
        int i2 = i + 1;
        if (i2 >= 0) {
            A[] aArr = e;
            if (i2 < aArr.length) {
                return aArr[i2];
            }
        }
        throw new j$.time.c("Invalid era: " + i);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    static long u() {
        long jF = j$.time.temporal.a.DAY_OF_YEAR.p().f();
        for (A a : e) {
            jF = Math.min(jF, (a.b.D() - a.b.a0()) + 1);
            if (a.o() != null) {
                jF = Math.min(jF, a.o().b.a0() - 1);
            }
        }
        return jF;
    }

    static long v() {
        int iD0 = 1000000000 - l().b.d0();
        A[] aArr = e;
        int iD02 = aArr[0].b.d0();
        for (int i = 1; i < aArr.length; i++) {
            A a = aArr[i];
            iD0 = Math.min(iD0, (a.b.d0() - iD02) + 1);
            iD02 = a.b.d0();
        }
        return iD0;
    }

    private Object writeReplace() {
        return new G((byte) 5, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ long I(j$.time.temporal.n nVar) {
        return AbstractC0033i.g(this, nVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ Object O(j$.time.temporal.p pVar) {
        return AbstractC0033i.m(this, pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ boolean e(j$.time.temporal.n nVar) {
        return AbstractC0033i.i(this, nVar);
    }

    @Override // j$.time.temporal.l
    public final Temporal g(Temporal temporal) {
        return temporal.d(getValue(), j$.time.temporal.a.ERA);
    }

    @Override // j$.time.chrono.o
    public final int getValue() {
        return this.a;
    }

    final LocalDate n() {
        return this.b;
    }

    final A o() {
        if (this == l()) {
            return null;
        }
        return q(this.a + 1);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int t(j$.time.temporal.n nVar) {
        return AbstractC0033i.f(this, (j$.time.temporal.a) nVar);
    }

    public final String toString() {
        return this.c;
    }

    final void w(DataOutput dataOutput) {
        dataOutput.writeByte(this.a);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.r z(j$.time.temporal.n nVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
        return nVar == aVar ? x.d.u(aVar) : j$.time.temporal.k.d(this, nVar);
    }
}
