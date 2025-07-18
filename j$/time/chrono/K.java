package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* loaded from: classes2.dex */
public final class K extends AbstractC0028d {
    private static final long serialVersionUID = -8722293800195731463L;
    private final transient LocalDate a;

    K(LocalDate localDate) {
        Objects.a(localDate, "isoDate");
        this.a = localDate;
    }

    private int b0() {
        return this.a.d0() + 543;
    }

    private K d0(LocalDate localDate) {
        return localDate.equals(this.a) ? this : new K(localDate);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new G((byte) 8, this);
    }

    @Override // j$.time.chrono.AbstractC0028d, j$.time.chrono.InterfaceC0026b
    /* renamed from: B */
    public final InterfaceC0026b p(long j, TemporalUnit temporalUnit) {
        return (K) super.p(j, temporalUnit);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long I(j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar.g(this);
        }
        int i = J.a[((j$.time.temporal.a) nVar).ordinal()];
        if (i == 4) {
            int iB0 = b0();
            if (iB0 < 1) {
                iB0 = 1 - iB0;
            }
            return iB0;
        }
        LocalDate localDate = this.a;
        if (i == 5) {
            return ((b0() * 12) + localDate.b0()) - 1;
        }
        if (i == 6) {
            return b0();
        }
        if (i != 7) {
            return localDate.I(nVar);
        }
        return b0() < 1 ? 0 : 1;
    }

    @Override // j$.time.chrono.AbstractC0028d, j$.time.chrono.InterfaceC0026b
    public final long J() {
        return this.a.J();
    }

    @Override // j$.time.chrono.AbstractC0028d, j$.time.chrono.InterfaceC0026b
    public final InterfaceC0029e M(LocalTime localTime) {
        return C0031g.V(this, localTime);
    }

    @Override // j$.time.chrono.AbstractC0028d
    public final o V() {
        return b0() >= 1 ? L.BE : L.BEFORE_BE;
    }

    @Override // j$.time.chrono.AbstractC0028d
    final InterfaceC0026b X(long j) {
        return d0(this.a.m0(j));
    }

    @Override // j$.time.chrono.AbstractC0028d
    final InterfaceC0026b Y(long j) {
        return d0(this.a.n0(j));
    }

    @Override // j$.time.chrono.AbstractC0028d
    final InterfaceC0026b Z(long j) {
        return d0(this.a.o0(j));
    }

    @Override // j$.time.chrono.InterfaceC0026b
    public final n a() {
        return I.d;
    }

    @Override // j$.time.chrono.AbstractC0028d
    /* renamed from: a0 */
    public final InterfaceC0026b y(j$.time.temporal.l lVar) {
        return (K) super.y(lVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    @Override // j$.time.chrono.AbstractC0028d, j$.time.temporal.Temporal
    /* renamed from: c0, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final j$.time.chrono.K d(long r9, j$.time.temporal.n r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof j$.time.temporal.a
            if (r0 == 0) goto L9a
            r0 = r11
            j$.time.temporal.a r0 = (j$.time.temporal.a) r0
            long r1 = r8.I(r0)
            int r3 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r3 != 0) goto L10
            return r8
        L10:
            int[] r1 = j$.time.chrono.J.a
            int r2 = r0.ordinal()
            r2 = r1[r2]
            j$.time.LocalDate r3 = r8.a
            r4 = 7
            r5 = 6
            r6 = 4
            if (r2 == r6) goto L4c
            r7 = 5
            if (r2 == r7) goto L27
            if (r2 == r5) goto L4c
            if (r2 == r4) goto L4c
            goto L62
        L27:
            j$.time.chrono.I r11 = j$.time.chrono.I.d
            j$.time.temporal.r r11 = r11.u(r0)
            r11.b(r9, r0)
            int r11 = r8.b0()
            long r0 = (long) r11
            r4 = 12
            long r0 = r0 * r4
            int r11 = r3.b0()
            long r4 = (long) r11
            long r0 = r0 + r4
            r4 = 1
            long r0 = r0 - r4
            long r9 = r9 - r0
            j$.time.LocalDate r9 = r3.n0(r9)
            j$.time.chrono.K r9 = r8.d0(r9)
            return r9
        L4c:
            j$.time.chrono.I r2 = j$.time.chrono.I.d
            j$.time.temporal.r r2 = r2.u(r0)
            int r2 = r2.a(r9, r0)
            int r0 = r0.ordinal()
            r0 = r1[r0]
            if (r0 == r6) goto L85
            if (r0 == r5) goto L7a
            if (r0 == r4) goto L6b
        L62:
            j$.time.LocalDate r9 = r3.d(r9, r11)
            j$.time.chrono.K r9 = r8.d0(r9)
            return r9
        L6b:
            int r9 = r8.b0()
            int r9 = (-542) - r9
            j$.time.LocalDate r9 = r3.s0(r9)
            j$.time.chrono.K r9 = r8.d0(r9)
            return r9
        L7a:
            int r2 = r2 + (-543)
            j$.time.LocalDate r9 = r3.s0(r2)
            j$.time.chrono.K r9 = r8.d0(r9)
            return r9
        L85:
            int r9 = r8.b0()
            r10 = 1
            if (r9 < r10) goto L8d
            goto L8f
        L8d:
            int r2 = 1 - r2
        L8f:
            int r2 = r2 + (-543)
            j$.time.LocalDate r9 = r3.s0(r2)
            j$.time.chrono.K r9 = r8.d0(r9)
            return r9
        L9a:
            j$.time.chrono.b r9 = super.d(r9, r11)
            j$.time.chrono.K r9 = (j$.time.chrono.K) r9
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.chrono.K.d(long, j$.time.temporal.n):j$.time.chrono.K");
    }

    @Override // j$.time.chrono.AbstractC0028d
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof K) {
            return this.a.equals(((K) obj).a);
        }
        return false;
    }

    @Override // j$.time.chrono.AbstractC0028d, j$.time.chrono.InterfaceC0026b, j$.time.temporal.Temporal
    public final InterfaceC0026b f(long j, TemporalUnit temporalUnit) {
        return (K) super.f(j, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC0028d, j$.time.chrono.InterfaceC0026b
    public final int hashCode() {
        I.d.getClass();
        return this.a.hashCode() ^ 146118545;
    }

    @Override // j$.time.chrono.AbstractC0028d, j$.time.temporal.Temporal
    public final Temporal p(long j, ChronoUnit chronoUnit) {
        return (K) super.p(j, chronoUnit);
    }

    @Override // j$.time.chrono.AbstractC0028d, j$.time.temporal.Temporal
    public final Temporal y(LocalDate localDate) {
        return (K) super.y(localDate);
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
        int i = J.a[aVar.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return this.a.z(nVar);
        }
        if (i != 4) {
            return I.d.u(aVar);
        }
        j$.time.temporal.r rVarP = j$.time.temporal.a.YEAR.p();
        return j$.time.temporal.r.j(1L, b0() <= 0 ? (-(rVarP.e() + 543)) + 1 : 543 + rVarP.d());
    }

    @Override // j$.time.chrono.AbstractC0028d, j$.time.temporal.Temporal
    public final Temporal f(long j, TemporalUnit temporalUnit) {
        return (K) super.f(j, temporalUnit);
    }
}
