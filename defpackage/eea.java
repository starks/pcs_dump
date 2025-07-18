package defpackage;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class eea implements Iterable, Serializable {
    private static final long serialVersionUID = 1;
    public int c = 0;
    public static final eea b = new edy(efn.b);
    private static final edv a = new edz();

    static int o(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(a.E(i, "Beginning index: ", " < 0"));
        }
        if (i2 < i) {
            throw new IndexOutOfBoundsException(a.D(i2, i, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(a.D(i3, i2, "End index: ", " >= "));
    }

    public static eea q(Iterator it, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(i)));
        }
        if (i == 1) {
            return (eea) it.next();
        }
        int i2 = i >>> 1;
        eea eeaVarQ = q(it, i2);
        eea eeaVarQ2 = q(it, i - i2);
        if (Integer.MAX_VALUE - eeaVarQ.d() >= eeaVarQ2.d()) {
            return egw.g(eeaVarQ, eeaVarQ2);
        }
        throw new IllegalArgumentException("ByteString would be too long: " + eeaVarQ.d() + "+" + eeaVarQ2.d());
    }

    public static eea r(byte[] bArr) {
        return s(bArr, 0, bArr.length);
    }

    public static eea s(byte[] bArr, int i, int i2) {
        o(i, i + i2, bArr.length);
        return new edy(a.a(bArr, i, i2));
    }

    public static eea t(String str) {
        return new edy(str.getBytes(efn.a));
    }

    static void v(int i, int i2) {
        if (((i2 - (i + 1)) | i) < 0) {
            if (i >= 0) {
                throw new ArrayIndexOutOfBoundsException(a.D(i2, i, "Index > length: ", ", "));
            }
            throw new ArrayIndexOutOfBoundsException(a.x(i, "Index < 0: "));
        }
    }

    public abstract byte a(int i);

    public abstract byte b(int i);

    public abstract int d();

    protected abstract void e(byte[] bArr, int i, int i2, int i3);

    public abstract boolean equals(Object obj);

    protected abstract int f();

    public abstract boolean h();

    public final int hashCode() {
        int i = this.c;
        if (i == 0) {
            int iD = d();
            i = i(iD, 0, iD);
            if (i == 0) {
                i = 1;
            }
            this.c = i;
        }
        return i;
    }

    protected abstract int i(int i, int i2, int i3);

    public abstract eea j(int i, int i2);

    public abstract eee k();

    protected abstract String l(Charset charset);

    public abstract ByteBuffer m();

    public abstract void n(edr edrVar);

    @Override // java.lang.Iterable
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public edw iterator() {
        return new eds(this);
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(d()), d() <= 50 ? ebq.h(this) : String.valueOf(ebq.h(j(0, 47))).concat("..."));
    }

    public final String u() {
        return d() == 0 ? "" : l(efn.a);
    }

    public final boolean w() {
        return d() == 0;
    }

    public final byte[] x() {
        int iD = d();
        if (iD == 0) {
            return efn.b;
        }
        byte[] bArr = new byte[iD];
        e(bArr, 0, 0, iD);
        return bArr;
    }

    @Deprecated
    public final void y(byte[] bArr, int i, int i2) {
        o(0, i2, d());
        o(i, i + i2, bArr.length);
        if (i2 > 0) {
            e(bArr, 0, i, i2);
        }
    }
}
