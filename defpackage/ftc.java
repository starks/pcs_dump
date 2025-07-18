package defpackage;

import com.google.android.apps.aicore.aidl.AIFeature;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ftc {
    public final fvm c;
    public int e;
    public int f;
    private int g;
    public int a = 4096;
    public final List b = new ArrayList();
    public ftb[] d = new ftb[8];

    public ftc(fwf fwfVar) {
        this.c = new fvz(fwfVar);
        this.g = r2.length - 1;
    }

    public static final boolean h(int i) {
        if (i < 0) {
            return false;
        }
        fte fteVar = fte.a;
        int length = fte.b.length;
        return i <= 60;
    }

    private final int i() {
        return frh.A(this.c.d());
    }

    public final int a(int i) {
        return this.g + 1 + i;
    }

    public final int b(int i, int i2) {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        int i4 = 0;
        while (true) {
            int i5 = i();
            if ((i5 & 128) == 0) {
                return i2 + (i5 << i4);
            }
            i2 += (i5 & 127) << i4;
            i4 += 7;
        }
    }

    public final fvn c(int i) {
        if (h(i)) {
            fte fteVar = fte.a;
            return fte.b[i].g;
        }
        fte fteVar2 = fte.a;
        int length = fte.b.length;
        int iA = a(i - 61);
        if (iA >= 0) {
            ftb[] ftbVarArr = this.d;
            if (iA < ftbVarArr.length) {
                ftb ftbVar = ftbVarArr[iA];
                ftbVar.getClass();
                return ftbVar.g;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }

    public final fvn d() {
        int i;
        int i2 = i();
        int i3 = i2 & 128;
        long jB = b(i2, 127);
        if (i3 != 128) {
            return this.c.v(jB);
        }
        fvk fvkVar = new fvk();
        fuf fufVar = fuf.a;
        fvm fvmVar = this.c;
        Object obj = fuf.d;
        int i4 = 0;
        long j = 0;
        int i5 = 0;
        while (j < jB) {
            int iA = frh.A(fvmVar.d());
            int i6 = i4 << 8;
            i5 += 8;
            while (true) {
                i = i6 | iA;
                if (i5 >= 8) {
                    int i7 = i5 - 8;
                    int i8 = (i >>> i7) & AIFeature.Id.ROSIE_ROBOT_TRANSLATE;
                    Object[] objArr = ((fue) obj).c;
                    objArr.getClass();
                    obj = objArr[i8];
                    obj.getClass();
                    fue fueVar = (fue) obj;
                    if (fueVar.c == null) {
                        fvkVar.P(fueVar.a);
                        i5 -= fueVar.b;
                        obj = fuf.d;
                    } else {
                        i5 = i7;
                    }
                }
            }
            j++;
            i4 = i;
        }
        while (i5 > 0) {
            int i9 = (i4 << (8 - i5)) & AIFeature.Id.ROSIE_ROBOT_TRANSLATE;
            Object[] objArr2 = ((fue) obj).c;
            objArr2.getClass();
            Object obj2 = objArr2[i9];
            obj2.getClass();
            fue fueVar2 = (fue) obj2;
            if (fueVar2.c != null || fueVar2.b > i5) {
                break;
            }
            fvkVar.P(fueVar2.a);
            i5 -= fueVar2.b;
            obj = fuf.d;
        }
        return fvkVar.u();
    }

    public final void e() {
        ftb[] ftbVarArr = this.d;
        ffh.X(ftbVarArr, null, 0, ftbVarArr.length);
        this.g = this.d.length - 1;
        this.e = 0;
        this.f = 0;
    }

    public final void f(int i) {
        int i2;
        if (i > 0) {
            int length = this.d.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.g;
                if (length < i2 || i <= 0) {
                    break;
                }
                ftb ftbVar = this.d[length];
                ftbVar.getClass();
                int i4 = this.f;
                int i5 = ftbVar.i;
                this.f = i4 - i5;
                this.e--;
                i3++;
                i -= i5;
                length--;
            }
            ftb[] ftbVarArr = this.d;
            int i6 = i2 + 1;
            System.arraycopy(ftbVarArr, i6, ftbVarArr, i6 + i3, this.e);
            this.g += i3;
        }
    }

    public final void g(ftb ftbVar) {
        this.b.add(ftbVar);
        int i = ftbVar.i;
        int i2 = this.a;
        if (i > i2) {
            e();
            return;
        }
        f((this.f + i) - i2);
        int i3 = this.e + 1;
        ftb[] ftbVarArr = this.d;
        int length = ftbVarArr.length;
        if (i3 > length) {
            ftb[] ftbVarArr2 = new ftb[length + length];
            System.arraycopy(ftbVarArr, 0, ftbVarArr2, length, length);
            this.g = this.d.length - 1;
            this.d = ftbVarArr2;
        }
        int i4 = this.g;
        this.g = i4 - 1;
        this.d[i4] = ftbVar;
        this.e++;
        this.f += i;
    }
}
