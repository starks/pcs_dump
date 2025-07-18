package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eug extends est {
    private static final eue b = new euc(1);
    private static final eue c = new euc(0);
    private static final eue d = new euc(2);
    private static final eue e = new euc(3);
    private static final euf f = new eud();
    public int a;
    private final Deque g;
    private Deque h;
    private boolean i;

    public eug() {
        new ArrayDeque(2);
        this.g = new ArrayDeque();
    }

    private final int m(euf eufVar, int i, Object obj, int i2) {
        a(i);
        if (!this.g.isEmpty()) {
            p();
        }
        while (i > 0 && !this.g.isEmpty()) {
            eyx eyxVar = (eyx) this.g.peek();
            int iMin = Math.min(i, eyxVar.f());
            i2 = eufVar.a(eyxVar, iMin, obj, i2);
            i -= iMin;
            this.a -= iMin;
            p();
        }
        if (i <= 0) {
            return i2;
        }
        throw new AssertionError("Failed executing read operation");
    }

    private final int n(eue eueVar, int i, Object obj, int i2) {
        try {
            return m(eueVar, i, obj, i2);
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    private final void o() {
        if (!this.i) {
            ((eyx) this.g.remove()).close();
            return;
        }
        this.h.add((eyx) this.g.remove());
        eyx eyxVar = (eyx) this.g.peek();
        if (eyxVar != null) {
            eyxVar.b();
        }
    }

    private final void p() {
        if (((eyx) this.g.peek()).f() == 0) {
            o();
        }
    }

    @Override // defpackage.est, defpackage.eyx
    public final void b() {
        if (this.h == null) {
            this.h = new ArrayDeque(Math.min(this.g.size(), 16));
        }
        while (!this.h.isEmpty()) {
            ((eyx) this.h.remove()).close();
        }
        this.i = true;
        eyx eyxVar = (eyx) this.g.peek();
        if (eyxVar != null) {
            eyxVar.b();
        }
    }

    @Override // defpackage.est, defpackage.eyx
    public final void c() {
        if (!this.i) {
            throw new InvalidMarkException();
        }
        eyx eyxVar = (eyx) this.g.peek();
        if (eyxVar != null) {
            int iF = eyxVar.f();
            eyxVar.c();
            this.a += eyxVar.f() - iF;
        }
        while (true) {
            eyx eyxVar2 = (eyx) this.h.pollLast();
            if (eyxVar2 == null) {
                return;
            }
            eyxVar2.c();
            this.g.addFirst(eyxVar2);
            this.a += eyxVar2.f();
        }
    }

    @Override // defpackage.est, defpackage.eyx, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        while (!this.g.isEmpty()) {
            ((eyx) this.g.remove()).close();
        }
        if (this.h != null) {
            while (!this.h.isEmpty()) {
                ((eyx) this.h.remove()).close();
            }
        }
    }

    @Override // defpackage.est, defpackage.eyx
    public final boolean d() {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            if (!((eyx) it.next()).d()) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.eyx
    public final int e() {
        return n(b, 1, null, 0);
    }

    @Override // defpackage.eyx
    public final int f() {
        return this.a;
    }

    @Override // defpackage.eyx
    public final eyx g(int i) {
        eyx eyxVarG;
        int i2;
        eyx eyxVarG2;
        if (i <= 0) {
            return eza.a;
        }
        a(i);
        this.a -= i;
        eyx eyxVar = null;
        eug eugVar = null;
        while (true) {
            eyx eyxVar2 = (eyx) this.g.peek();
            int iF = eyxVar2.f();
            if (iF > i) {
                eyxVarG2 = eyxVar2.g(i);
                i2 = 0;
            } else {
                if (this.i) {
                    eyxVarG = eyxVar2.g(iF);
                    o();
                } else {
                    eyxVarG = (eyx) this.g.poll();
                }
                eyx eyxVar3 = eyxVarG;
                i2 = i - iF;
                eyxVarG2 = eyxVar3;
            }
            if (eyxVar == null) {
                eyxVar = eyxVarG2;
            } else {
                if (eugVar == null) {
                    eugVar = new eug(i2 != 0 ? Math.min(this.g.size() + 2, 16) : 2);
                    eugVar.h(eyxVar);
                    eyxVar = eugVar;
                }
                eugVar.h(eyxVarG2);
            }
            if (i2 <= 0) {
                return eyxVar;
            }
            i = i2;
        }
    }

    public final void h(eyx eyxVar) {
        boolean z = this.i && this.g.isEmpty();
        if (eyxVar instanceof eug) {
            eug eugVar = (eug) eyxVar;
            while (!eugVar.g.isEmpty()) {
                this.g.add((eyx) eugVar.g.remove());
            }
            this.a += eugVar.a;
            eugVar.a = 0;
            eugVar.close();
        } else {
            this.g.add(eyxVar);
            this.a += eyxVar.f();
        }
        if (z) {
            ((eyx) this.g.peek()).b();
        }
    }

    @Override // defpackage.eyx
    public final void i(ByteBuffer byteBuffer) {
        n(e, byteBuffer.remaining(), byteBuffer, 0);
    }

    @Override // defpackage.eyx
    public final void j(OutputStream outputStream, int i) {
        m(f, i, outputStream, 0);
    }

    @Override // defpackage.eyx
    public final void k(byte[] bArr, int i, int i2) {
        n(d, i2, bArr, i);
    }

    @Override // defpackage.eyx
    public final void l(int i) {
        n(c, i, null, 0);
    }

    public eug(int i) {
        new ArrayDeque(2);
        this.g = new ArrayDeque(i);
    }
}
