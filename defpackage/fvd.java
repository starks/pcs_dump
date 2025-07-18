package defpackage;

import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fvd implements HostnameVerifier {
    public static final fvd a = new fvd();

    private fvd() {
    }

    public static final List b(X509Certificate x509Certificate, int i) throws CertificateParsingException {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return fgm.a;
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && fjs.c(list.get(0), Integer.valueOf(i)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return fgm.a;
        }
    }

    private final String c(String str) {
        if (!d(str)) {
            return str;
        }
        Locale locale = Locale.US;
        locale.getClass();
        String lowerCase = str.toLowerCase(locale);
        lowerCase.getClass();
        return lowerCase;
    }

    private static final boolean d(String str) {
        long j;
        int length = str.length();
        int length2 = str.length();
        if (length2 < 0) {
            throw new IllegalArgumentException(a.D(0, length2, "endIndex < beginIndex: ", " < "));
        }
        if (length2 > str.length()) {
            throw new IllegalArgumentException("endIndex > string.length: " + length2 + " > " + str.length());
        }
        long j2 = 0;
        int i = 0;
        while (i < length2) {
            int i2 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt >= 128) {
                if (cCharAt < 2048) {
                    j = 2;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    j = 3;
                } else {
                    char cCharAt2 = i2 < length2 ? str.charAt(i2) : (char) 0;
                    if (cCharAt <= 56319 && cCharAt2 >= 56320 && cCharAt2 <= 57343) {
                        j2 += 4;
                        i += 2;
                    }
                }
                j2 += j;
                i = i2;
            }
            j2++;
            i = i2;
        }
        return length == ((int) j2);
    }

    public final boolean a(String str, X509Certificate x509Certificate) throws CertificateParsingException {
        int length;
        if (frh.t(str)) {
            String strZ = fwv.z(str);
            List listB = b(x509Certificate, 7);
            if (listB.isEmpty()) {
                return false;
            }
            Iterator it = listB.iterator();
            while (it.hasNext()) {
                if (fjs.c(strZ, fwv.z((String) it.next()))) {
                    return true;
                }
            }
            return false;
        }
        String strC = c(str);
        List<String> listB2 = b(x509Certificate, 2);
        if (listB2.isEmpty()) {
            return false;
        }
        for (String strConcat : listB2) {
            fvd fvdVar = a;
            if (strC.length() != 0 && !fjz.E(strC, ".") && !strC.endsWith("..") && strConcat != null && strConcat.length() != 0 && !fjz.E(strConcat, ".") && !strConcat.endsWith("..")) {
                String strConcat2 = !strC.endsWith(".") ? String.valueOf(strC).concat(".") : strC;
                if (!strConcat.endsWith(".")) {
                    strConcat = String.valueOf(strConcat).concat(".");
                }
                String strC2 = fvdVar.c(strConcat);
                if (!fjz.o(strC2, "*")) {
                    if (fjs.c(strConcat2, strC2)) {
                        return true;
                    }
                } else if (fjz.E(strC2, "*.") && fjz.u(strC2, '*', 1, 4) == -1 && strConcat2.length() >= strC2.length() && !fjs.c("*.", strC2)) {
                    String strSubstring = strC2.substring(1);
                    strSubstring.getClass();
                    if (strConcat2.endsWith(strSubstring) && ((length = strConcat2.length() - strSubstring.length()) <= 0 || fjz.w(strConcat2, '.', length - 1, 4) == -1)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        str.getClass();
        sSLSession.getClass();
        if (!d(str)) {
            return false;
        }
        try {
            Certificate certificate = sSLSession.getPeerCertificates()[0];
            certificate.getClass();
            return a(str, (X509Certificate) certificate);
        } catch (SSLException unused) {
            return false;
        }
    }
}
