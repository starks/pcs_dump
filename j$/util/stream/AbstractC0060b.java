package j$.util.stream;

import j$.util.Spliterator;

/* renamed from: j$.util.stream.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC0060b implements InterfaceC0062d {
    private final AbstractC0060b a;
    private final L b;
    protected final int c;
    private L d;
    private int e;
    private int f;
    private Spliterator g;
    private boolean h;
    private boolean i;
    private Runnable j;
    private boolean k;

    AbstractC0060b(Spliterator spliterator, int i, boolean z) {
        this.b = null;
        this.g = spliterator;
        this.a = this;
        int i2 = W.g & i;
        this.c = i2;
        this.f = (~(i2 << 1)) & W.l;
        this.e = 0;
        this.k = z;
    }

    private Spliterator n(int i) {
        int i2;
        int i3;
        AbstractC0060b abstractC0060b = this.a;
        Spliterator spliterator = abstractC0060b.g;
        if (spliterator == null) {
            throw new IllegalStateException("source already consumed or closed");
        }
        abstractC0060b.g = null;
        if (abstractC0060b.k && abstractC0060b.i) {
            L l = abstractC0060b.d;
            int i4 = 1;
            while (abstractC0060b != this) {
                int i5 = l.c;
                if (l.l()) {
                    if (W.SHORT_CIRCUIT.t(i5)) {
                        i5 &= ~W.s;
                    }
                    spliterator = l.k(abstractC0060b, spliterator, new C0063e(3)).spliterator();
                    if (spliterator.hasCharacteristics(64)) {
                        i2 = (~W.r) & i5;
                        i3 = W.q;
                    } else {
                        i2 = (~W.q) & i5;
                        i3 = W.r;
                    }
                    i5 = i2 | i3;
                    i4 = 0;
                }
                int i6 = i4 + 1;
                l.e = i4;
                l.f = W.g(i5, abstractC0060b.f);
                L l2 = l;
                l = l.d;
                abstractC0060b = l2;
                i4 = i6;
            }
        }
        if (i != 0) {
            this.f = W.g(i, this.f);
        }
        return spliterator;
    }

    @Override // j$.util.stream.InterfaceC0062d
    public final InterfaceC0062d a() {
        this.a.k = false;
        return this;
    }

    @Override // j$.util.stream.InterfaceC0062d
    public final boolean b() {
        return this.a.k;
    }

    final void c(N n, Spliterator spliterator) {
        n.getClass();
        if (!W.SHORT_CIRCUIT.t(this.f)) {
            n.c(spliterator.getExactSizeIfKnown());
            spliterator.forEachRemaining(n);
            n.b();
            return;
        }
        for (AbstractC0060b abstractC0060b = this; abstractC0060b.e > 0; abstractC0060b = abstractC0060b.b) {
        }
        n.c(spliterator.getExactSizeIfKnown());
        while (!n.f() && spliterator.tryAdvance(n)) {
        }
        n.b();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.h = true;
        this.g = null;
        AbstractC0060b abstractC0060b = this.a;
        Runnable runnable = abstractC0060b.j;
        if (runnable != null) {
            abstractC0060b.j = null;
            runnable.run();
        }
    }

    final InterfaceC0073o d(Spliterator spliterator, C0063e c0063e) {
        if (!this.a.k) {
            InterfaceC0072n interfaceC0072nB = A.b(f(spliterator), c0063e);
            c(q(interfaceC0072nB), spliterator);
            return interfaceC0072nB.j();
        }
        long jF = f(spliterator);
        if (jF >= 0 && spliterator.hasCharacteristics(16384)) {
            if (jF >= 2147483639) {
                throw new IllegalArgumentException("Stream size exceeds max array size");
            }
            Object[] objArr = (Object[]) c0063e.apply((int) jF);
            new C0079v(spliterator, this, objArr).invoke();
            return new C0074p(objArr);
        }
        InterfaceC0073o interfaceC0073o = (InterfaceC0073o) new C0075q(this, spliterator, new C0059a(2, c0063e), new C0063e(2)).invoke();
        if (interfaceC0073o.i() <= 0) {
            return interfaceC0073o;
        }
        long jA = interfaceC0073o.a();
        if (jA >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr2 = (Object[]) c0063e.apply((int) jA);
        new C0082y(interfaceC0073o, objArr2).invoke();
        return new C0074p(objArr2);
    }

    final Object e(d0 d0Var) {
        if (this.h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.h = true;
        return this.a.k ? d0Var.d(this, n(d0Var.g())) : d0Var.a(this, n(d0Var.g()));
    }

    final long f(Spliterator spliterator) {
        if (W.SIZED.t(this.f)) {
            return spliterator.getExactSizeIfKnown();
        }
        return -1L;
    }

    final int g() {
        return this.f;
    }

    final boolean h() {
        return W.ORDERED.t(this.f);
    }

    final /* synthetic */ Spliterator i() {
        return n(0);
    }

    public final InterfaceC0062d j(Runnable runnable) {
        if (this.h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        AbstractC0060b abstractC0060b = this.a;
        Runnable runnable2 = abstractC0060b.j;
        if (runnable2 != null) {
            runnable = new a0(0, runnable2, runnable);
        }
        abstractC0060b.j = runnable;
        return this;
    }

    InterfaceC0073o k(AbstractC0060b abstractC0060b, Spliterator spliterator, C0063e c0063e) {
        throw new UnsupportedOperationException("Parallel evaluation is not supported");
    }

    abstract boolean l();

    abstract N m(int i, N n);

    final Spliterator o() {
        AbstractC0060b abstractC0060b = this.a;
        if (this != abstractC0060b) {
            throw new IllegalStateException();
        }
        if (this.h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.h = true;
        Spliterator spliterator = abstractC0060b.g;
        if (spliterator == null) {
            throw new IllegalStateException("source already consumed or closed");
        }
        abstractC0060b.g = null;
        return spliterator;
    }

    final N p(N n, Spliterator spliterator) {
        n.getClass();
        c(q(n), spliterator);
        return n;
    }

    final N q(N n) {
        AbstractC0060b abstractC0060b = this;
        while (abstractC0060b.e > 0) {
            L l = abstractC0060b.b;
            n = abstractC0060b.m(l.f, n);
            abstractC0060b = l;
        }
        return n;
    }

    @Override // j$.util.stream.InterfaceC0062d
    public final Spliterator spliterator() {
        if (this.h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.h = true;
        AbstractC0060b abstractC0060b = this.a;
        if (this != abstractC0060b) {
            return new Y(this, new C0059a(0, this), abstractC0060b.k);
        }
        Spliterator spliterator = abstractC0060b.g;
        if (spliterator == null) {
            throw new IllegalStateException("source already consumed or closed");
        }
        abstractC0060b.g = null;
        return spliterator;
    }

    AbstractC0060b(L l, int i) {
        if (!l.h) {
            l.h = true;
            l.d = (L) this;
            this.b = l;
            this.c = W.h & i;
            this.f = W.g(i, l.f);
            AbstractC0060b abstractC0060b = l.a;
            this.a = abstractC0060b;
            if (l()) {
                abstractC0060b.i = true;
            }
            this.e = l.e + 1;
            return;
        }
        throw new IllegalStateException("stream has already been operated upon or closed");
    }
}
