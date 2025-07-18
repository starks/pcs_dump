package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
final class epu implements epx {
    private final Object[] a;
    private final Object[] b;

    public epu(Object[] objArr, Object[] objArr2) {
        this.a = objArr;
        this.b = objArr2;
    }

    @Override // defpackage.epx
    public final int a() {
        return this.b.length;
    }

    @Override // defpackage.epx
    public final epx b(Object obj, Object obj2, int i, int i2) {
        Object[] objArr;
        int length;
        int i3 = 0;
        int iHashCode = this.a[0].hashCode();
        if (iHashCode != i) {
            return epv.d(new epw(obj, obj2), i, this, iHashCode, i2);
        }
        while (true) {
            objArr = this.a;
            length = objArr.length;
            if (i3 >= length) {
                i3 = -1;
                break;
            }
            if (objArr[i3] == obj) {
                break;
            }
            i3++;
        }
        if (i3 != -1) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, length);
            Object[] objArrCopyOf2 = Arrays.copyOf(this.b, this.a.length);
            objArrCopyOf[i3] = obj;
            objArrCopyOf2[i3] = obj2;
            return new epu(objArrCopyOf, objArrCopyOf2);
        }
        int i4 = length + 1;
        Object[] objArr2 = this.b;
        Object[] objArrCopyOf3 = Arrays.copyOf(objArr, i4);
        Object[] objArr3 = this.a;
        Object[] objArrCopyOf4 = Arrays.copyOf(objArr2, i4);
        objArrCopyOf3[objArr3.length] = obj;
        objArrCopyOf4[this.a.length] = obj2;
        return new epu(objArrCopyOf3, objArrCopyOf4);
    }

    @Override // defpackage.epx
    public final Object c(Object obj, int i, int i2) {
        int i3 = 0;
        while (true) {
            Object[] objArr = this.a;
            if (i3 >= objArr.length) {
                return null;
            }
            if (objArr[i3] == obj) {
                return this.b[i3];
            }
            i3++;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CollisionLeaf(");
        for (int i = 0; i < this.b.length; i++) {
            sb.append("(key=");
            sb.append(this.a[i]);
            sb.append(" value=");
            sb.append(this.b[i]);
            sb.append(") ");
        }
        sb.append(")");
        return sb.toString();
    }
}
