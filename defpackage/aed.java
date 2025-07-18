package defpackage;

import android.database.Cursor;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aed extends aef {
    public int[] a;
    public long[] b;
    public double[] c;
    public String[] d;
    public byte[][] e;
    private Cursor j;

    public aed(afb afbVar, String str) {
        super(afbVar, str);
        this.a = new int[0];
        this.b = new long[0];
        this.c = new double[0];
        this.d = new String[0];
        this.e = new byte[0][];
    }

    private final Cursor p() {
        Cursor cursor = this.j;
        if (cursor != null) {
            return cursor;
        }
        uq.l(21, "no row");
        throw new ffn();
    }

    private final void q(int i, int i2) {
        int[] iArr = this.a;
        int i3 = i2 + 1;
        if (iArr.length < i3) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, i3);
            iArrCopyOf.getClass();
            this.a = iArrCopyOf;
        }
        if (i == 1) {
            long[] jArr = this.b;
            if (jArr.length < i3) {
                long[] jArrCopyOf = Arrays.copyOf(jArr, i3);
                jArrCopyOf.getClass();
                this.b = jArrCopyOf;
                return;
            }
            return;
        }
        if (i == 2) {
            double[] dArr = this.c;
            if (dArr.length < i3) {
                double[] dArrCopyOf = Arrays.copyOf(dArr, i3);
                dArrCopyOf.getClass();
                this.c = dArrCopyOf;
                return;
            }
            return;
        }
        if (i == 3) {
            String[] strArr = this.d;
            if (strArr.length < i3) {
                Object[] objArrCopyOf = Arrays.copyOf(strArr, i3);
                objArrCopyOf.getClass();
                this.d = (String[]) objArrCopyOf;
                return;
            }
            return;
        }
        if (i != 4) {
            return;
        }
        byte[][] bArr = this.e;
        if (bArr.length < i3) {
            Object[] objArrCopyOf2 = Arrays.copyOf(bArr, i3);
            objArrCopyOf2.getClass();
            this.e = (byte[][]) objArrCopyOf2;
        }
    }

    private final void r() {
        if (this.j == null) {
            this.j = this.f.k(new fuu(this, null));
        }
    }

    private static final void s(Cursor cursor, int i) {
        if (i < 0 || i >= cursor.getColumnCount()) {
            uq.l(25, "column index out of range");
            throw new ffn();
        }
    }

    @Override // defpackage.afa
    public final int a() {
        m();
        r();
        Cursor cursor = this.j;
        if (cursor != null) {
            return cursor.getColumnCount();
        }
        return 0;
    }

    @Override // defpackage.afa
    public final long b(int i) {
        m();
        Cursor cursorP = p();
        s(cursorP, i);
        return cursorP.getLong(i);
    }

    @Override // defpackage.afa
    public final String c(int i) {
        m();
        r();
        Cursor cursor = this.j;
        if (cursor == null) {
            throw new IllegalStateException("Required value was null.");
        }
        s(cursor, i);
        String columnName = cursor.getColumnName(i);
        columnName.getClass();
        return columnName;
    }

    @Override // defpackage.afa, java.lang.AutoCloseable
    public final void close() {
        if (!this.h) {
            m();
            this.a = new int[0];
            this.b = new long[0];
            this.c = new double[0];
            this.d = new String[0];
            this.e = new byte[0][];
            i();
        }
        o();
    }

    @Override // defpackage.afa
    public final String d(int i) {
        m();
        Cursor cursorP = p();
        s(cursorP, i);
        String string = cursorP.getString(i);
        string.getClass();
        return string;
    }

    @Override // defpackage.afa
    public final void e(int i, byte[] bArr) {
        m();
        q(4, i);
        this.a[i] = 4;
        this.e[i] = bArr;
    }

    @Override // defpackage.afa
    public final void f(int i, long j) {
        m();
        q(1, i);
        this.a[i] = 1;
        this.b[i] = j;
    }

    @Override // defpackage.afa
    public final void g(int i) {
        m();
        q(5, 10);
        this.a[10] = 5;
    }

    @Override // defpackage.afa
    public final void h(int i, String str) {
        m();
        q(3, i);
        this.a[i] = 3;
        this.d[i] = str;
    }

    @Override // defpackage.afa
    public final void i() {
        m();
        Cursor cursor = this.j;
        if (cursor != null) {
            cursor.close();
        }
        this.j = null;
    }

    @Override // defpackage.afa
    public final boolean j(int i) {
        m();
        Cursor cursorP = p();
        s(cursorP, i);
        return cursorP.isNull(i);
    }

    @Override // defpackage.afa
    public final boolean k() {
        m();
        r();
        Cursor cursor = this.j;
        if (cursor != null) {
            return cursor.moveToNext();
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // defpackage.afa
    public final byte[] l(int i) {
        m();
        Cursor cursorP = p();
        s(cursorP, i);
        byte[] blob = cursorP.getBlob(i);
        blob.getClass();
        return blob;
    }
}
