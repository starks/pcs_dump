package defpackage;

import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fqf {
    public static final fqf a;
    public static final fqf b;
    private static final fqd[] g;
    private static final fqd[] h;
    public final boolean c;
    public final boolean d;
    public final String[] e;
    public final String[] f;

    static {
        fqd fqdVar = fqd.q;
        fqd fqdVar2 = fqd.r;
        fqd fqdVar3 = fqd.j;
        fqd fqdVar4 = fqd.l;
        fqd fqdVar5 = fqd.k;
        fqd fqdVar6 = fqd.m;
        fqd fqdVar7 = fqd.o;
        fqd fqdVar8 = fqd.n;
        fqd[] fqdVarArr = {fqd.p, fqdVar, fqdVar2, fqdVar3, fqdVar4, fqdVar5, fqdVar6, fqdVar7, fqdVar8};
        g = fqdVarArr;
        fqd[] fqdVarArr2 = {fqd.p, fqdVar, fqdVar2, fqdVar3, fqdVar4, fqdVar5, fqdVar6, fqdVar7, fqdVar8, fqd.h, fqd.i, fqd.f, fqd.g, fqd.d, fqd.e, fqd.c};
        h = fqdVarArr2;
        new fqe(true).b((fqd[]) Arrays.copyOf(fqdVarArr, 9)).d(frf.a, frf.b).f().e();
        a = new fqe(true).b((fqd[]) Arrays.copyOf(fqdVarArr2, 16)).d(frf.a, frf.b).f().e();
        new fqe(true).b((fqd[]) Arrays.copyOf(fqdVarArr2, 16)).d(frf.a, frf.b, frf.c, frf.d).f().e();
        b = new fqe(false).e();
    }

    public fqf(boolean z, boolean z2, String[] strArr, String[] strArr2) {
        this.c = z;
        this.d = z2;
        this.e = strArr;
        this.f = strArr2;
    }

    public final List a() {
        String[] strArr = this.e;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(fqd.t.h(str));
        }
        return ffh.L(arrayList);
    }

    public final List b() {
        String[] strArr = this.f;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            frf frfVar = frf.a;
            arrayList.add(fwv.A(str));
        }
        return ffh.L(arrayList);
    }

    public final boolean c(SSLSocket sSLSocket) {
        if (!this.c) {
            return false;
        }
        String[] strArr = this.f;
        if (strArr != null && !frh.v(strArr, sSLSocket.getEnabledProtocols(), fhe.b)) {
            return false;
        }
        String[] strArr2 = this.e;
        return strArr2 == null || frh.v(strArr2, sSLSocket.getEnabledCipherSuites(), fqd.a);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fqf)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        boolean z = this.c;
        fqf fqfVar = (fqf) obj;
        if (z != fqfVar.c) {
            return false;
        }
        return !z || (Arrays.equals(this.e, fqfVar.e) && Arrays.equals(this.f, fqfVar.f) && this.d == fqfVar.d);
    }

    public final int hashCode() {
        if (!this.c) {
            return 17;
        }
        String[] strArr = this.e;
        int iHashCode = strArr != null ? Arrays.hashCode(strArr) : 0;
        String[] strArr2 = this.f;
        return ((((iHashCode + 527) * 31) + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.d ? 1 : 0);
    }

    public final String toString() {
        if (!this.c) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(a(), "[all enabled]") + ", tlsVersions=" + Objects.toString(b(), "[all enabled]") + ", supportsTlsExtensions=" + this.d + ")";
    }
}
