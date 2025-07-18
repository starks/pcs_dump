package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class epc {
    public static final Logger a = Logger.getLogger(epc.class.getName());
    public static final eot b = new evs(1);
    static final det c;
    public Object[] d;
    public int e;

    static {
        det detVarB = det.e;
        des desVar = (des) detVarB;
        if (desVar.c != null) {
            detVarB = desVar.b(desVar.b, null);
        }
        c = detVarB;
    }

    public epc() {
    }

    public static byte[] i(InputStream inputStream) {
        try {
            return dev.a(inputStream);
        } catch (IOException e) {
            throw new RuntimeException("failure reading serialized stream", e);
        }
    }

    private final int k() {
        Object[] objArr = this.d;
        if (objArr != null) {
            return objArr.length;
        }
        return 0;
    }

    private final void l(int i) {
        Object[] objArr = new Object[i];
        if (!o()) {
            System.arraycopy(this.d, 0, objArr, 0, a());
        }
        this.d = objArr;
    }

    private final void m(int i, byte[] bArr) {
        this.d[i + i] = bArr;
    }

    private final void n(int i, Object obj) {
        if (this.d instanceof byte[][]) {
            l(k());
        }
        this.d[i + i + 1] = obj;
    }

    private final boolean o() {
        return this.e == 0;
    }

    public final int a() {
        int i = this.e;
        return i + i;
    }

    public final Object b(eox eoxVar) {
        eow eowVarA;
        int i = this.e;
        do {
            i--;
            if (i < 0) {
                return null;
            }
        } while (!Arrays.equals(eoxVar.b, h(i)));
        Object objC = c(i);
        if (objC instanceof byte[]) {
            return eoxVar.a((byte[]) objC);
        }
        eoz eozVar = (eoz) objC;
        return (!eoxVar.d() || (eowVarA = eoz.a(eoxVar)) == null) ? eoxVar.a(eozVar.c()) : eowVarA.b(eozVar.b());
    }

    public final Object c(int i) {
        return this.d[i + i + 1];
    }

    public final void d(eox eoxVar) {
        if (o()) {
            return;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.e; i2++) {
            if (!Arrays.equals(eoxVar.b, h(i2))) {
                m(i, h(i2));
                n(i, c(i2));
                i++;
            }
        }
        Arrays.fill(this.d, i + i, a(), (Object) null);
        this.e = i;
    }

    public final void e(epc epcVar) {
        if (epcVar.o()) {
            return;
        }
        int iK = k() - a();
        if (o() || iK < epcVar.a()) {
            l(a() + epcVar.a());
        }
        System.arraycopy(epcVar.d, 0, this.d, a(), epcVar.a());
        this.e += epcVar.e;
    }

    public final void f(eox eoxVar, Object obj) {
        eoxVar.getClass();
        obj.getClass();
        if (a() == 0 || a() == k()) {
            int iA = a();
            l(Math.max(iA + iA, 8));
        }
        m(this.e, eoxVar.b);
        if (eoxVar.d()) {
            int i = this.e;
            eow eowVarA = eoz.a(eoxVar);
            eowVarA.getClass();
            n(i, new eoz(eowVarA, obj));
        } else {
            int i2 = this.e;
            this.d[i2 + i2 + 1] = eoxVar.b(obj);
        }
        this.e++;
    }

    public final boolean g(eox eoxVar) {
        for (int i = 0; i < this.e; i++) {
            if (Arrays.equals(eoxVar.b, h(i))) {
                return true;
            }
        }
        return false;
    }

    public final byte[] h(int i) {
        return (byte[]) this.d[i + i];
    }

    public final byte[] j(int i) {
        Object objC = c(i);
        return objC instanceof byte[] ? (byte[]) objC : ((eoz) objC).c();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Metadata(");
        for (int i = 0; i < this.e; i++) {
            if (i != 0) {
                sb.append(',');
            }
            String str = new String(h(i), StandardCharsets.US_ASCII);
            sb.append(str);
            sb.append('=');
            if (str.endsWith("-bin")) {
                sb.append(c.h(j(i)));
            } else {
                sb.append(new String(j(i), StandardCharsets.US_ASCII));
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public epc(int i, Object[] objArr) {
        this.e = i;
        this.d = objArr;
    }

    public epc(byte[]... bArr) {
        this(bArr.length >> 1, bArr);
    }
}
