package defpackage;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fme {
    public static final String a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final String b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final Throwable c(Throwable th, Throwable th2) {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        ffh.a(runtimeException, th);
        return runtimeException;
    }

    public static final void d(fhq fhqVar, Throwable th) {
        try {
            if (((CoroutineExceptionHandler) fhqVar.get(CoroutineExceptionHandler.a)) != null) {
                return;
            }
            fjs.q(fhqVar, th);
        } catch (Throwable th2) {
            fjs.q(fhqVar, c(th, th2));
        }
    }

    public static final void e(fhq fhqVar, CancellationException cancellationException) {
        fna fnaVar = (fna) fhqVar.get(fna.c);
        if (fnaVar != null) {
            fnaVar.o(cancellationException);
        }
    }

    public static final flx f(Executor executor) {
        if ((executor instanceof fmk ? (fmk) executor : null) == null) {
            return new fmu(executor);
        }
        throw null;
    }

    public static final fqd i(String str) {
        fqd fqdVar = new fqd(str);
        fqd.b.put(str, fqdVar);
        return fqdVar;
    }

    public static final fvn k(X509Certificate x509Certificate) {
        fvn fvnVar = fvn.a;
        byte[] encoded = x509Certificate.getPublicKey().getEncoded();
        encoded.getClass();
        return fwv.i(encoded).f("SHA-256");
    }

    public static final int l(String str, String str2, int i) {
        int length = str.length();
        while (i < length) {
            if (fjz.n(str2, str.charAt(i))) {
                return i;
            }
            i++;
        }
        return str.length();
    }

    private static final int m(String str, int i, int i2, boolean z) {
        boolean z2;
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= ' ') {
                z2 = cCharAt < 127 || (cCharAt >= '0' && cCharAt < ':') || ((cCharAt >= 'a' && cCharAt < '{') || ((cCharAt >= 'A' && cCharAt < '[') || cCharAt == ':'));
            } else {
                if (cCharAt == '\t') {
                    cCharAt = '\t';
                    if (cCharAt < 127) {
                    }
                }
            }
            if (z2 == (!z)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:179:0x0382, code lost:
    
        if (r0 != null) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01fb, code lost:
    
        throw new java.lang.IllegalArgumentException("Failed requirement.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0201, code lost:
    
        throw new java.lang.IllegalArgumentException("Failed requirement.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0207, code lost:
    
        throw new java.lang.IllegalArgumentException("Failed requirement.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x020d, code lost:
    
        throw new java.lang.IllegalArgumentException("Failed requirement.");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v27 */
    /* JADX WARN: Type inference failed for: r11v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v20 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.fqg g(defpackage.fqq r40, java.lang.String r41) throws java.lang.NumberFormatException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 968
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fme.g(fqq, java.lang.String):fqg");
    }

    public final synchronized fqd h(String str) {
        fqd fqdVar;
        String strConcat;
        str.getClass();
        fqdVar = (fqd) fqd.b.get(str);
        if (fqdVar == null) {
            Map map = fqd.b;
            if (fjz.E(str, "TLS_")) {
                String strSubstring = str.substring(4);
                strSubstring.getClass();
                strConcat = "SSL_".concat(strSubstring);
            } else if (fjz.E(str, "SSL_")) {
                String strSubstring2 = str.substring(4);
                strSubstring2.getClass();
                strConcat = "TLS_".concat(strSubstring2);
            } else {
                strConcat = str;
            }
            fqdVar = (fqd) map.get(strConcat);
            if (fqdVar == null) {
                fqdVar = new fqd(str);
            }
            fqd.b.put(str, fqdVar);
        }
        return fqdVar;
    }

    public final String j(Certificate certificate) {
        certificate.getClass();
        return "sha256/".concat(k((X509Certificate) certificate).c());
    }
}
