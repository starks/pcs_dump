package defpackage;

import com.google.android.apps.aicore.aidl.AIFeature;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class egw extends eea {
    public static final int[] a = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, AIFeature.Id.AIAI_ZERO_STATE_12, 377, AIFeature.Id.SAPI_REWRITE_DE, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    private static final long serialVersionUID = 1;
    public final int d;
    public final eea e;
    public final eea f;
    public final int g;
    private final int h;

    public egw(eea eeaVar, eea eeaVar2) {
        this.e = eeaVar;
        this.f = eeaVar2;
        int iD = eeaVar.d();
        this.h = iD;
        this.d = iD + eeaVar2.d();
        this.g = Math.max(eeaVar.f(), eeaVar2.f()) + 1;
    }

    public static int c(int i) {
        int[] iArr = a;
        int length = iArr.length;
        if (i >= 47) {
            return Integer.MAX_VALUE;
        }
        return iArr[i];
    }

    static eea g(eea eeaVar, eea eeaVar2) {
        if (eeaVar2.d() == 0) {
            return eeaVar;
        }
        if (eeaVar.d() == 0) {
            return eeaVar2;
        }
        int iD = eeaVar.d() + eeaVar2.d();
        if (iD < 128) {
            return z(eeaVar, eeaVar2);
        }
        if (eeaVar instanceof egw) {
            egw egwVar = (egw) eeaVar;
            if (egwVar.f.d() + eeaVar2.d() < 128) {
                return new egw(egwVar.e, z(egwVar.f, eeaVar2));
            }
            if (egwVar.e.f() > egwVar.f.f() && egwVar.g > eeaVar2.f()) {
                return new egw(egwVar.e, new egw(egwVar.f, eeaVar2));
            }
        }
        if (iD >= c(Math.max(eeaVar.f(), eeaVar2.f()) + 1)) {
            return new egw(eeaVar, eeaVar2);
        }
        fsc fscVar = new fsc((short[]) null);
        fscVar.t(eeaVar);
        fscVar.t(eeaVar2);
        eea egwVar2 = (eea) ((ArrayDeque) fscVar.a).pop();
        while (!((ArrayDeque) fscVar.a).isEmpty()) {
            egwVar2 = new egw((eea) ((ArrayDeque) fscVar.a).pop(), egwVar2);
        }
        return egwVar2;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("RopeByteStream instances are not to be serialized directly");
    }

    private static eea z(eea eeaVar, eea eeaVar2) {
        int iD = eeaVar.d();
        int iD2 = eeaVar2.d();
        byte[] bArr = new byte[iD + iD2];
        eeaVar.y(bArr, 0, iD);
        eeaVar2.y(bArr, iD, iD2);
        return new edy(bArr);
    }

    @Override // defpackage.eea
    public final byte a(int i) {
        v(i, this.d);
        return b(i);
    }

    @Override // defpackage.eea
    public final byte b(int i) {
        int i2 = this.h;
        return i < i2 ? this.e.b(i) : this.f.b(i - i2);
    }

    @Override // defpackage.eea
    public final int d() {
        return this.d;
    }

    @Override // defpackage.eea
    protected final void e(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i3;
        int i5 = this.h;
        if (i4 <= i5) {
            this.e.e(bArr, i, i2, i3);
        } else {
            if (i >= i5) {
                this.f.e(bArr, i - i5, i2, i3);
                return;
            }
            int i6 = i5 - i;
            this.e.e(bArr, i, i2, i6);
            this.f.e(bArr, 0, i2 + i6, i3 - i6);
        }
    }

    @Override // defpackage.eea
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof eea)) {
            return false;
        }
        eea eeaVar = (eea) obj;
        if (this.d != eeaVar.d()) {
            return false;
        }
        if (this.d == 0) {
            return true;
        }
        int i = this.c;
        int i2 = eeaVar.c;
        if (i != 0 && i2 != 0 && i != i2) {
            return false;
        }
        egv egvVar = new egv(this);
        edx edxVarA = egvVar.next();
        egv egvVar2 = new egv(eeaVar);
        edx edxVarA2 = egvVar2.next();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int iD = edxVarA.d() - i3;
            int iD2 = edxVarA2.d() - i4;
            int iMin = Math.min(iD, iD2);
            if (!(i3 == 0 ? edxVarA.g(edxVarA2, i4, iMin) : edxVarA2.g(edxVarA, i3, iMin))) {
                return false;
            }
            i5 += iMin;
            int i6 = this.d;
            if (i5 >= i6) {
                if (i5 == i6) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == iD) {
                i3 = 0;
                edxVarA = egvVar.next();
            } else {
                i3 += iMin;
                edxVarA = edxVarA;
            }
            if (iMin == iD2) {
                edxVarA2 = egvVar2.next();
                i4 = 0;
            } else {
                i4 += iMin;
            }
        }
    }

    @Override // defpackage.eea
    protected final int f() {
        return this.g;
    }

    @Override // defpackage.eea
    public final boolean h() {
        return this.d >= c(this.g);
    }

    @Override // defpackage.eea
    protected final int i(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.h;
        if (i4 <= i5) {
            return this.e.i(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.f.i(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.f.i(this.e.i(i, i2, i6), 0, i3 - i6);
    }

    @Override // defpackage.eea, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new egu(this);
    }

    @Override // defpackage.eea
    public final eea j(int i, int i2) {
        int iO = o(i, i2, this.d);
        if (iO == 0) {
            return eea.b;
        }
        if (iO == this.d) {
            return this;
        }
        int i3 = this.h;
        if (i2 <= i3) {
            return this.e.j(i, i2);
        }
        if (i >= i3) {
            return this.f.j(i - i3, i2 - i3);
        }
        eea eeaVar = this.e;
        return new egw(eeaVar.j(i, eeaVar.d()), this.f.j(0, i2 - this.h));
    }

    @Override // defpackage.eea
    public final eee k() {
        ArrayList<ByteBuffer> arrayList = new ArrayList();
        egv egvVar = new egv(this);
        while (egvVar.hasNext()) {
            arrayList.add(egvVar.next().m());
        }
        int i = eee.f;
        int i2 = 0;
        int iRemaining = 0;
        for (ByteBuffer byteBuffer : arrayList) {
            iRemaining += byteBuffer.remaining();
            i2 = byteBuffer.hasArray() ? i2 | 1 : byteBuffer.isDirect() ? i2 | 2 : i2 | 4;
        }
        return i2 == 2 ? new eec(arrayList, iRemaining) : eee.J(new efq(arrayList));
    }

    @Override // defpackage.eea
    protected final String l(Charset charset) {
        return new String(x(), charset);
    }

    @Override // defpackage.eea
    public final ByteBuffer m() {
        throw null;
    }

    @Override // defpackage.eea
    public final void n(edr edrVar) {
        this.e.n(edrVar);
        this.f.n(edrVar);
    }

    @Override // defpackage.eea
    /* renamed from: p */
    public final edw iterator() {
        return new egu(this);
    }

    Object writeReplace() {
        return new edy(x());
    }
}
