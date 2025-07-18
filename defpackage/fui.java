package defpackage;

import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fui {
    public int a;
    public final Object b;

    public fui() {
        this.b = new int[10];
    }

    private final boolean o(Object obj, Object obj2) {
        int i;
        synchronized (this) {
            Object obj3 = ((fli) this.b).a;
            if (obj != null && !fjs.c(obj3, obj)) {
                return false;
            }
            if (fjs.c(obj3, obj2)) {
                return true;
            }
            ((fli) this.b).c(obj2);
            int i2 = this.a;
            if ((i2 & 1) != 0) {
                this.a = i2 + 2;
                return true;
            }
            int i3 = i2 + 1;
            this.a = i3;
            while (true) {
                synchronized (this) {
                    i = this.a;
                    if (i == i3) {
                        this.a = i3 + 1;
                        return true;
                    }
                }
                i3 = i;
            }
        }
    }

    public final int a(int i) {
        return ((int[]) this.b)[i];
    }

    public final int b() {
        if ((this.a & 2) != 0) {
            return ((int[]) this.b)[1];
        }
        return -1;
    }

    public final int c() {
        if ((this.a & 128) != 0) {
            return ((int[]) this.b)[7];
        }
        return 65535;
    }

    public final int d() {
        if ((this.a & 16) != 0) {
            return ((int[]) this.b)[4];
        }
        return Integer.MAX_VALUE;
    }

    public final void e(fui fuiVar) {
        fuiVar.getClass();
        for (int i = 0; i < 10; i++) {
            if (fuiVar.f(i)) {
                g(i, fuiVar.a(i));
            }
        }
    }

    public final boolean f(int i) {
        return (this.a & (1 << i)) != 0;
    }

    public final void g(int i, int i2) {
        if (i < 0 || i >= 10) {
            return;
        }
        this.a = (1 << i) | this.a;
        ((int[]) this.b)[i] = i2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final fre h() {
        if (!i()) {
            throw new NoSuchElementException();
        }
        ?? r0 = this.b;
        int i = this.a;
        this.a = i + 1;
        return (fre) r0.get(i);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final boolean i() {
        return this.a < this.b.size();
    }

    public final Object j() {
        fpc fpcVar = fnz.a;
        Object obj = ((fli) this.b).a;
        if (obj == fpcVar) {
            return null;
        }
        return obj;
    }

    public final void k(Object obj) {
        if (obj == null) {
            obj = fnz.a;
        }
        o(null, obj);
    }

    public final boolean l(Object obj, Object obj2) {
        if (obj == null) {
            obj = fnz.a;
        }
        return o(obj, obj2);
    }

    public final Object m() {
        int i = this.a;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = (Object[]) this.b;
        Object obj = objArr[i2];
        objArr[i2] = null;
        this.a = i2;
        return obj;
    }

    public final void n(Object obj) {
        int i = this.a;
        if (i < 256) {
            ((Object[]) this.b)[i] = obj;
            this.a = i + 1;
        }
    }

    public fui(List list) {
        this.b = list;
    }

    public fui(byte[] bArr) {
    }

    public fui(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.b = new Object[256];
    }

    public fui(Object obj) {
        this((byte[]) null);
        this.b = fjp.v(obj);
    }
}
