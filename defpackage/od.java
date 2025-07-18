package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class od implements Cloneable {
    public /* synthetic */ boolean a;
    public /* synthetic */ int[] b;
    public /* synthetic */ Object[] c;
    public /* synthetic */ int d;

    public od() {
        int iD = of.d(10);
        this.b = new int[iD];
        this.c = new Object[iD];
    }

    public final int a(int i) {
        if (this.a) {
            oe.b(this);
        }
        return this.b[i];
    }

    public final int b() {
        if (this.a) {
            oe.b(this);
        }
        return this.d;
    }

    public final Object c(int i) {
        if (this.a) {
            oe.b(this);
        }
        Object[] objArr = this.c;
        if (i < objArr.length) {
            return objArr[i];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        objClone.getClass();
        od odVar = (od) objClone;
        odVar.b = (int[]) this.b.clone();
        odVar.c = (Object[]) this.c.clone();
        return odVar;
    }

    public final void d(int i, Object obj) {
        int i2 = this.d;
        if (i2 != 0 && i <= this.b[i2 - 1]) {
            e(i, obj);
            return;
        }
        if (this.a && i2 >= this.b.length) {
            oe.b(this);
        }
        int i3 = this.d;
        int[] iArr = this.b;
        if (i3 >= iArr.length) {
            int iD = of.d(i3 + 1);
            int[] iArrCopyOf = Arrays.copyOf(iArr, iD);
            iArrCopyOf.getClass();
            this.b = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.c, iD);
            objArrCopyOf.getClass();
            this.c = objArrCopyOf;
        }
        this.b[i3] = i;
        this.c[i3] = obj;
        this.d = i3 + 1;
    }

    public final void e(int i, Object obj) {
        int iA = of.a(this.b, this.d, i);
        if (iA >= 0) {
            this.c[iA] = obj;
            return;
        }
        int i2 = ~iA;
        int i3 = this.d;
        if (i2 < i3) {
            Object[] objArr = this.c;
            if (objArr[i2] == oe.a) {
                this.b[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (this.a && i3 >= this.b.length) {
            oe.b(this);
            i2 = ~of.a(this.b, this.d, i);
        }
        int i4 = this.d;
        int[] iArr = this.b;
        if (i4 >= iArr.length) {
            int iD = of.d(i4 + 1);
            int[] iArrCopyOf = Arrays.copyOf(iArr, iD);
            iArrCopyOf.getClass();
            this.b = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.c, iD);
            objArrCopyOf.getClass();
            this.c = objArrCopyOf;
        }
        int i5 = this.d;
        if (i5 - i2 != 0) {
            int[] iArr2 = this.b;
            int i6 = i2 + 1;
            ffh.af(iArr2, iArr2, i6, i2, i5);
            Object[] objArr2 = this.c;
            ffh.ag(objArr2, objArr2, i6, i2, this.d);
        }
        this.b[i2] = i;
        this.c[i2] = obj;
        this.d++;
    }

    public final String toString() {
        if (b() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.d * 28);
        sb.append('{');
        int i = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(a(i2));
            sb.append('=');
            Object objC = c(i2);
            if (objC != this) {
                sb.append(objC);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
