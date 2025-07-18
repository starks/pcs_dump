package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fcu {
    public static final fcu a;
    private static final fct[] f;
    public final boolean b;
    public final String[] c;
    public final String[] d;
    public final boolean e;

    static {
        fct[] fctVarArr = {fct.TLS_AES_128_GCM_SHA256, fct.TLS_AES_256_GCM_SHA384, fct.TLS_CHACHA20_POLY1305_SHA256, fct.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, fct.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, fct.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, fct.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, fct.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, fct.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256, fct.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, fct.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, fct.TLS_RSA_WITH_AES_128_GCM_SHA256, fct.TLS_RSA_WITH_AES_256_GCM_SHA384, fct.TLS_RSA_WITH_AES_128_CBC_SHA, fct.TLS_RSA_WITH_AES_256_CBC_SHA, fct.TLS_RSA_WITH_3DES_EDE_CBC_SHA};
        f = fctVarArr;
        fqe fqeVar = new fqe(true);
        fqeVar.g(fctVarArr);
        fqeVar.i(fdg.TLS_1_3, fdg.TLS_1_2);
        fqeVar.h();
        fcu fcuVar = new fcu(fqeVar);
        a = fcuVar;
        fqe fqeVar2 = new fqe(fcuVar);
        fqeVar2.i(fdg.TLS_1_3, fdg.TLS_1_2, fdg.TLS_1_1, fdg.TLS_1_0);
        fqeVar2.h();
    }

    public fcu(fqe fqeVar) {
        this.b = fqeVar.a;
        this.c = fqeVar.b;
        this.d = fqeVar.c;
        this.e = fqeVar.d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fcu)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        fcu fcuVar = (fcu) obj;
        boolean z = this.b;
        if (z != fcuVar.b) {
            return false;
        }
        return !z || (Arrays.equals(this.c, fcuVar.c) && Arrays.equals(this.d, fcuVar.d) && this.e == fcuVar.e);
    }

    public final int hashCode() {
        if (!this.b) {
            return 17;
        }
        return ((((Arrays.hashCode(this.c) + 527) * 31) + Arrays.hashCode(this.d)) * 31) + (!this.e ? 1 : 0);
    }

    public final String toString() {
        List listA;
        fdg fdgVar;
        if (!this.b) {
            return "ConnectionSpec()";
        }
        String[] strArr = this.c;
        int i = 0;
        if (strArr == null) {
            listA = null;
        } else {
            fct[] fctVarArr = new fct[strArr.length];
            int i2 = 0;
            while (true) {
                String[] strArr2 = this.c;
                if (i2 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i2];
                fct fctVar = fct.TLS_RSA_WITH_NULL_MD5;
                fctVarArr[i2] = str.startsWith("SSL_") ? fct.a("TLS_".concat(String.valueOf(str.substring(4)))) : fct.a(str);
                i2++;
            }
            listA = fdh.a(fctVarArr);
        }
        String string = listA == null ? "[use default]" : listA.toString();
        fdg[] fdgVarArr = new fdg[this.d.length];
        while (true) {
            String[] strArr3 = this.d;
            if (i >= strArr3.length) {
                return "ConnectionSpec(cipherSuites=" + string + ", tlsVersions=" + String.valueOf(fdh.a(fdgVarArr)) + ", supportsTlsExtensions=" + this.e + ")";
            }
            String str2 = strArr3[i];
            fdg fdgVar2 = fdg.TLS_1_3;
            if ("TLSv1.3".equals(str2)) {
                fdgVar = fdg.TLS_1_3;
            } else if ("TLSv1.2".equals(str2)) {
                fdgVar = fdg.TLS_1_2;
            } else if ("TLSv1.1".equals(str2)) {
                fdgVar = fdg.TLS_1_1;
            } else if ("TLSv1".equals(str2)) {
                fdgVar = fdg.TLS_1_0;
            } else {
                if (!"SSLv3".equals(str2)) {
                    throw new IllegalArgumentException("Unexpected TLS version: ".concat(String.valueOf(str2)));
                }
                fdgVar = fdg.SSL_3_0;
            }
            fdgVarArr[i] = fdgVar;
            i++;
        }
    }
}
