package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fqe {
    public final boolean a;
    public String[] b;
    public String[] c;
    public boolean d;

    public fqe(fqf fqfVar) {
        this.a = fqfVar.c;
        this.b = fqfVar.e;
        this.c = fqfVar.f;
        this.d = fqfVar.d;
    }

    public final fqe a(String... strArr) {
        strArr.getClass();
        if (!this.a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one cipher suite is required");
        }
        this.b = (String[]) strArr.clone();
        return this;
    }

    public final fqe b(fqd... fqdVarArr) {
        fqdVarArr.getClass();
        if (!this.a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(fqdVarArr.length);
        for (fqd fqdVar : fqdVarArr) {
            arrayList.add(fqdVar.s);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        return a((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final fqe c(String... strArr) {
        strArr.getClass();
        if (!this.a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one TLS version is required");
        }
        this.c = (String[]) strArr.clone();
        return this;
    }

    public final fqe d(frf... frfVarArr) {
        if (!this.a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(frfVarArr.length);
        for (frf frfVar : frfVarArr) {
            arrayList.add(frfVar.f);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        return c((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final fqf e() {
        return new fqf(this.a, this.d, this.b, this.c);
    }

    public final fqe f() {
        if (!this.a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        this.d = true;
        return this;
    }

    public final void g(fct... fctVarArr) {
        if (!this.a) {
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }
        String[] strArr = new String[fctVarArr.length];
        for (int i = 0; i < fctVarArr.length; i++) {
            strArr[i] = fctVarArr[i].bb;
        }
        this.b = strArr;
    }

    public final void h() {
        if (!this.a) {
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }
        this.d = true;
    }

    public final void i(fdg... fdgVarArr) {
        if (!this.a) {
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }
        String[] strArr = new String[fdgVarArr.length];
        for (int i = 0; i < fdgVarArr.length; i++) {
            strArr[i] = fdgVarArr[i].f;
        }
        this.c = strArr;
    }

    public fqe(boolean z) {
        this.a = z;
    }

    public fqe(fcu fcuVar) {
        this.a = fcuVar.b;
        this.b = fcuVar.c;
        this.c = fcuVar.d;
        this.d = fcuVar.e;
    }
}
