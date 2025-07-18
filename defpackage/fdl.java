package defpackage;

import com.google.android.apps.aicore.aidl.AIFeature;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fdl {
    public final fvm b;
    int f;
    public final List a = new ArrayList();
    fdk[] e = new fdk[8];
    int g = 0;
    int h = 0;
    public int c = 4096;
    public int d = 4096;

    public fdl(fwf fwfVar) {
        this.f = r0.length - 1;
        this.b = new fvz(fwfVar);
    }

    public static final boolean g(int i) {
        if (i < 0) {
            return false;
        }
        int length = fdn.b.length;
        return i <= 60;
    }

    private final int h() {
        return this.b.d() & 255;
    }

    private final void i() {
        Arrays.fill(this.e, (Object) null);
        this.f = this.e.length - 1;
        this.g = 0;
        this.h = 0;
    }

    private final void j(int i) {
        int i2;
        if (i > 0) {
            int length = this.e.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.f;
                if (length < i2 || i <= 0) {
                    break;
                }
                int i4 = this.e[length].h;
                i -= i4;
                this.h -= i4;
                this.g--;
                i3++;
                length--;
            }
            fdk[] fdkVarArr = this.e;
            int i5 = i2 + 1;
            System.arraycopy(fdkVarArr, i5, fdkVarArr, i5 + i3, this.g);
            this.f += i3;
        }
    }

    public final int a(int i) {
        return this.f + 1 + i;
    }

    final int b(int i, int i2) {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        int i4 = 0;
        while (true) {
            int iH = h();
            if ((iH & 128) == 0) {
                return i2 + (iH << i4);
            }
            i2 += (iH & 127) << i4;
            i4 += 7;
        }
    }

    public final fvn c(int i) throws IOException {
        if (g(i)) {
            return fdn.b[i].f;
        }
        int length = fdn.b.length;
        int iA = a(i - 61);
        if (iA >= 0) {
            fdk[] fdkVarArr = this.e;
            if (iA < fdkVarArr.length) {
                return fdkVarArr[iA].f;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }

    final fvn d() {
        int i;
        int iH = h();
        int i2 = iH & 128;
        long jB = b(iH, 127);
        if (i2 != 128) {
            return this.b.v(jB);
        }
        fvm fvmVar = this.b;
        fdt fdtVar = fdt.a;
        byte[] bArrG = fvmVar.G(jB);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Object obj = fdtVar.b;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i3 < bArrG.length) {
            int i6 = bArrG[i3] & 255;
            int i7 = i4 << 8;
            i5 += 8;
            while (true) {
                i = i7 | i6;
                if (i5 >= 8) {
                    int i8 = i5 - 8;
                    obj = ((fue) obj).c[(i >>> i8) & AIFeature.Id.ROSIE_ROBOT_TRANSLATE];
                    fue fueVar = (fue) obj;
                    if (fueVar.c == null) {
                        byteArrayOutputStream.write(fueVar.a);
                        i5 -= fueVar.b;
                        obj = fdtVar.b;
                    } else {
                        i5 = i8;
                    }
                }
            }
            i3++;
            i4 = i;
        }
        while (i5 > 0) {
            fue fueVar2 = (fue) ((fue) obj).c[(i4 << (8 - i5)) & AIFeature.Id.ROSIE_ROBOT_TRANSLATE];
            if (fueVar2.c != null || fueVar2.b > i5) {
                break;
            }
            byteArrayOutputStream.write(fueVar2.a);
            i5 -= fueVar2.b;
            obj = fdtVar.b;
        }
        return fvn.h(byteArrayOutputStream.toByteArray());
    }

    public final void e() {
        int i = this.d;
        int i2 = this.h;
        if (i < i2) {
            if (i == 0) {
                i();
            } else {
                j(i2 - i);
            }
        }
    }

    public final void f(fdk fdkVar) {
        this.a.add(fdkVar);
        int i = fdkVar.h;
        int i2 = this.d;
        if (i > i2) {
            i();
            return;
        }
        j((this.h + i) - i2);
        int i3 = this.g + 1;
        fdk[] fdkVarArr = this.e;
        int length = fdkVarArr.length;
        if (i3 > length) {
            fdk[] fdkVarArr2 = new fdk[length + length];
            System.arraycopy(fdkVarArr, 0, fdkVarArr2, length, length);
            this.f = this.e.length - 1;
            this.e = fdkVarArr2;
        }
        int i4 = this.f;
        this.f = i4 - 1;
        this.e[i4] = fdkVar;
        this.g++;
        this.h += i;
    }
}
