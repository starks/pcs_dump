package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;

/* loaded from: classes2.dex */
public final class s extends AbstractC0028d {
    private static final long serialVersionUID = -5207853542612002020L;
    private final transient q a;
    private final transient int b;
    private final transient int c;
    private final transient int d;

    private s(q qVar, int i, int i2, int i3) {
        qVar.U(i, i2, i3);
        this.a = qVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    private int b0() {
        return this.a.O(this.b, this.c) + this.d;
    }

    static s c0(q qVar, int i, int i2, int i3) {
        return new s(qVar, i, i2, i3);
    }

    static s d0(q qVar, long j) {
        return new s(qVar, j);
    }

    private s g0(int i, int i2, int i3) {
        q qVar = this.a;
        int iW = qVar.W(i, i2);
        if (i3 > iW) {
            i3 = iW;
        }
        return new s(qVar, i, i2, i3);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new G((byte) 6, this);
    }

    @Override // j$.time.chrono.AbstractC0028d, j$.time.chrono.InterfaceC0026b
    /* renamed from: B */
    public final InterfaceC0026b p(long j, TemporalUnit temporalUnit) {
        return (s) super.p(j, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC0028d, j$.time.chrono.InterfaceC0026b
    public final int D() {
        return this.a.X(this.b);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long I(j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar.g(this);
        }
        int i = r.a[((j$.time.temporal.a) nVar).ordinal()];
        int i2 = this.c;
        int i3 = this.d;
        int i4 = this.b;
        switch (i) {
            case 1:
                return i3;
            case 2:
                return b0();
            case 3:
                return ((i3 - 1) / 7) + 1;
            case 4:
                return ((int) j$.nio.file.attribute.p.g(J() + 3, 7)) + 1;
            case 5:
                return ((i3 - 1) % 7) + 1;
            case 6:
                return ((b0() - 1) % 7) + 1;
            case 7:
                return J();
            case 8:
                return ((b0() - 1) / 7) + 1;
            case 9:
                return i2;
            case 10:
                return ((i4 * 12) + i2) - 1;
            case 11:
                return i4;
            case 12:
                return i4;
            case 13:
                return i4 <= 1 ? 0 : 1;
            default:
                throw new j$.time.temporal.q("Unsupported field: ".concat(String.valueOf(nVar)));
        }
    }

    @Override // j$.time.chrono.AbstractC0028d, j$.time.chrono.InterfaceC0026b
    public final long J() {
        return this.a.U(this.b, this.c, this.d);
    }

    @Override // j$.time.chrono.AbstractC0028d, j$.time.chrono.InterfaceC0026b
    public final InterfaceC0029e M(LocalTime localTime) {
        return C0031g.V(this, localTime);
    }

    @Override // j$.time.chrono.AbstractC0028d
    public final o V() {
        return t.AH;
    }

    @Override // j$.time.chrono.AbstractC0028d
    final InterfaceC0026b Z(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = this.b + ((int) j);
        int i = (int) j2;
        if (j2 == i) {
            return g0(i, this.c, this.d);
        }
        throw new ArithmeticException();
    }

    @Override // j$.time.chrono.InterfaceC0026b
    public final n a() {
        return this.a;
    }

    @Override // j$.time.chrono.AbstractC0028d
    /* renamed from: a0 */
    public final InterfaceC0026b y(j$.time.temporal.l lVar) {
        return (s) super.y(lVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.chrono.AbstractC0028d
    /* renamed from: e0, reason: merged with bridge method [inline-methods] */
    public final s X(long j) {
        return new s(this.a, J() + j);
    }

    @Override // j$.time.chrono.AbstractC0028d
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s) {
            s sVar = (s) obj;
            if (this.b == sVar.b && this.c == sVar.c && this.d == sVar.d && this.a.equals(sVar.a)) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.chrono.AbstractC0028d, j$.time.chrono.InterfaceC0026b, j$.time.temporal.Temporal
    public final InterfaceC0026b f(long j, TemporalUnit temporalUnit) {
        return (s) super.f(j, temporalUnit);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.chrono.AbstractC0028d
    /* renamed from: f0, reason: merged with bridge method [inline-methods] */
    public final s Y(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (this.b * 12) + (this.c - 1) + j;
        return g0(this.a.y(j$.nio.file.attribute.p.f(j2, 12L)), ((int) j$.nio.file.attribute.p.g(j2, 12L)) + 1, this.d);
    }

    @Override // j$.time.chrono.AbstractC0028d, j$.time.temporal.Temporal
    /* renamed from: h0, reason: merged with bridge method [inline-methods] */
    public final s d(long j, j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return (s) super.d(j, nVar);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) nVar;
        q qVar = this.a;
        qVar.u(aVar).b(j, aVar);
        int i = (int) j;
        int i2 = r.a[aVar.ordinal()];
        int i3 = this.d;
        int i4 = this.c;
        int i5 = this.b;
        switch (i2) {
            case 1:
                return g0(i5, i4, i);
            case 2:
                return X(Math.min(i, D()) - b0());
            case 3:
                return X((j - I(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH)) * 7);
            case 4:
                return X(j - (((int) j$.nio.file.attribute.p.g(J() + 3, 7)) + 1));
            case 5:
                return X(j - I(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 6:
                return X(j - I(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 7:
                return new s(qVar, j);
            case 8:
                return X((j - I(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR)) * 7);
            case 9:
                return g0(i5, i, i3);
            case 10:
                return Y(j - (((i5 * 12) + i4) - 1));
            case 11:
                if (i5 < 1) {
                    i = 1 - i;
                }
                return g0(i, i4, i3);
            case 12:
                return g0(i, i4, i3);
            case 13:
                return g0(1 - i5, i4, i3);
            default:
                throw new j$.time.temporal.q("Unsupported field: ".concat(String.valueOf(nVar)));
        }
    }

    @Override // j$.time.chrono.AbstractC0028d, j$.time.chrono.InterfaceC0026b
    public final int hashCode() {
        this.a.getClass();
        int i = this.b;
        return (((i << 11) + (this.c << 6)) + this.d) ^ ((i & (-2048)) ^ 2100100019);
    }

    @Override // j$.time.chrono.AbstractC0028d, j$.time.temporal.Temporal
    public final Temporal p(long j, ChronoUnit chronoUnit) {
        return (s) super.p(j, chronoUnit);
    }

    @Override // j$.time.chrono.AbstractC0028d, j$.time.chrono.InterfaceC0026b
    public final boolean s() {
        return this.a.L(this.b);
    }

    final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeObject(this.a);
        objectOutput.writeInt(j$.time.temporal.k.a(this, j$.time.temporal.a.YEAR));
        objectOutput.writeByte(j$.time.temporal.k.a(this, j$.time.temporal.a.MONTH_OF_YEAR));
        objectOutput.writeByte(j$.time.temporal.k.a(this, j$.time.temporal.a.DAY_OF_MONTH));
    }

    @Override // j$.time.chrono.AbstractC0028d, j$.time.temporal.Temporal
    public final Temporal y(LocalDate localDate) {
        return (s) super.y(localDate);
    }

    @Override // j$.time.chrono.AbstractC0028d, j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.r z(j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar.z(this);
        }
        if (!AbstractC0033i.h(this, nVar)) {
            throw new j$.time.temporal.q("Unsupported field: ".concat(String.valueOf(nVar)));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) nVar;
        int i = r.a[aVar.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? this.a.u(aVar) : j$.time.temporal.r.j(1L, 5L) : j$.time.temporal.r.j(1L, D()) : j$.time.temporal.r.j(1L, r2.W(this.b, this.c));
    }

    @Override // j$.time.chrono.AbstractC0028d, j$.time.temporal.Temporal
    public final Temporal f(long j, TemporalUnit temporalUnit) {
        return (s) super.f(j, temporalUnit);
    }

    private s(q qVar, long j) {
        int[] iArrV = qVar.V((int) j);
        this.a = qVar;
        this.b = iArrV[0];
        this.c = iArrV[1];
        this.d = iArrV[2];
    }
}
